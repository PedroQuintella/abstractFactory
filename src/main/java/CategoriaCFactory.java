public class CategoriaCFactory implements AbstractFactory {

    @Override
    public CarteiraHabilitacao createCarteiraHabilitacao() {
        return new CarteiraHabilitacaoC();
    }
}
