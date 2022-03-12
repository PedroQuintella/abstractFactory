public class CategoriaAFactory implements AbstractFactory {

    @Override
    public CarteiraHabilitacao createCarteiraHabilitacao() {
        return new CarteiraHabilitacaoA();
    }
}
