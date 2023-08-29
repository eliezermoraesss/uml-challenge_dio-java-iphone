package interfaces;

public interface NavegadorInternet {
    String adicionarFavorito(String url);
    String removerFavorito(String url);
    void exibirFavoritos();
    void exibirQuantidadeFavoritos();
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina(String url);
}
