package interfaces;

public interface AparelhoTelefonico {
    void atenderLigacao();
    void cancelarLigacao();
    void bloquearNumero(Integer numero);
    void ligar(Integer numero);
    void iniciarCorreioDeVoz();
}
