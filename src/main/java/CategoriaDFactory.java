public class CategoriaDFactory implements AbstractFactory {

    @Override
    public CarteiraHabilitacao createCarteiraHabilitacao() {
        return new CarteiraHabilitacaoD();
    }
}
