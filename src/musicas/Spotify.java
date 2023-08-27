package musicas;

import exceptions.ResourceNotFoundException;
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
        Musica musicaParaRemover = null;
        if (!musicas.isEmpty()) {
            for (Musica musica : musicas) {
                if(musica.getNomeMusica().equals(nomeMusica)){
                    musicaParaRemover = musica;
                    break;
                }
            }
            musicas.remove(musicaParaRemover);
        } else {
            throw new ResourceNotFoundException("A lista de músicas está vazia");
        }
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

    @Override
    public void exibirMusicas() {
        if(!musicas.isEmpty()) {
            System.out.println(musicas);
        } else {
            throw new ResourceNotFoundException("A lista de músicas do SPOTIFY está vazia");
        }
    }

    @Override
    public void exibirQuantidadeDeMusicas() {
        System.out.println("Você tem " + musicas.size() + " em sua playlist do SPOTIFY");
    }

    @Override
    public String toString() {
        return "Spotify{" +
                "musicas=" + musicas +
                '}';
    }
}
