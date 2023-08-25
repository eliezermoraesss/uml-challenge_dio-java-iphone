package musicas;

import interfaces.ReprodutorMusical;
import musicas.Musica;

import java.util.HashSet;
import java.util.Set;

public class Spotify implements ReprodutorMusical {

    private Set<Musica> musicas = new HashSet<>();

    public Spotify() {
    }

    public Spotify(Set<Musica> musicas) {
        this.musicas = musicas;
    }

    public Set<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(Set<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String adicionarMusica(String nomeMusica) {
        musicas.add(new Musica(nomeMusica));
        return nomeMusica + " adicionada com sucesso pelo SPOTIFY!";
    }

    @Override
    public String removerMusica(String nomeMusica) {
        musicas.remove(nomeMusica);
        return nomeMusica + " removida com sucesso pelo SPOTIFY!";
    }

    @Override
    public String tocar(String nomeMusica) {
       for (Musica musica : musicas) {
           if(musica.getNomeMusica().equals(nomeMusica)) {
               return "Tocando " + musica.getNomeMusica() + " pelo SPOTIFY";
           }
       }
       return "Música não encontrada pelo SPOTIFY";
    }

    @Override
    public String pausar(String nomeMusica) {
        for (Musica musica : musicas) {
            if(musica.getNomeMusica().equals(nomeMusica)) {
                return "Música " + musica.getNomeMusica() + " pausada pelo SPOTIFY";
            }
        }
        return "Música não encontrada pelo SPOTIFY";
    }

    @Override
    public String selecionarMusica(String nomeMusica) {
        return "Selecionando música. " + tocar(nomeMusica);
    }
}
