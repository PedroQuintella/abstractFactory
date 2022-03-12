import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoristaTest {

    @Test
    void deveEmitirCarteiraA() {
        AbstractFactory fabrica = new CategoriaAFactory();
        Motorista motorista = new Motorista(fabrica);
        assertEquals("Carteira de Habilitação de categoria A", motorista.emitirCarteiraHabilitacao());
    }

    @Test
    void deveEmitirCarteiraB() {
        AbstractFactory fabrica = new CategoriaBFactory();
        Motorista motorista = new Motorista(fabrica);
        assertEquals("Carteira de Habilitação de categoria B", motorista.emitirCarteiraHabilitacao());
    }

    @Test
    void deveEmitirCarteiraC() {
        AbstractFactory fabrica = new CategoriaCFactory();
        Motorista motorista = new Motorista(fabrica);
        assertEquals("Carteira de Habilitação de categoria C", motorista.emitirCarteiraHabilitacao());
    }

    @Test
    void deveEmitirCarteiraD() {
        AbstractFactory fabrica = new CategoriaDFactory();
        Motorista motorista = new Motorista(fabrica);
        assertEquals("Carteira de Habilitação de categoria D", motorista.emitirCarteiraHabilitacao());
    }
}