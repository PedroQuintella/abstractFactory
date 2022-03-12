public class CategoriaBFactory implements AbstractFactory {

    @Override
    public CarteiraHabilitacao createCarteiraHabilitacao() {
        return new CarteiraHabilitacaoB();
    }
}
