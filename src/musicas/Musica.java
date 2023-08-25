package musicas;

public class Musica {

    private String nomeMusica;

    public Musica() {
    }

    public Musica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    @Override
    public String toString() {
        return "musicas.Musica{" +
                "nomeMusica='" + nomeMusica + '\'' +
                '}';
    }
}
