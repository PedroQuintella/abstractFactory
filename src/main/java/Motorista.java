public class Motorista {
    private CarteiraHabilitacao carteiraHabilitacao;

    public Motorista (AbstractFactory fabrica) {
        this.carteiraHabilitacao = fabrica.createCarteiraHabilitacao();
    }

    public String emitirCarteiraHabilitacao() {
        return this.carteiraHabilitacao.emitir();
    }
}