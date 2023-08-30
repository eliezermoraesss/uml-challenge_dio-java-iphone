package interfaces;

public interface AparelhoTelefonico {
    void atenderLigacao(Long numero);
    void cancelarLigacao(Long numero);
    void bloquearNumero(Long numero);
    void ligar(Long numero);
    void iniciarCorreioDeVoz();
}
