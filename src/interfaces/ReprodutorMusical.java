package interfaces;

public interface ReprodutorMusical {
    String tocar(String nomeMusica);
    String pausar(String nomeMusica);
    String selecionarMusica(String nomeMusica);
    String adicionarMusica(String nomeMusica);
    String removerMusica(String nomeMusica);
    void exibirMusicas();
    void exibirQuantidadeDeMusicas();
}
