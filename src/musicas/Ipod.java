package musicas;

import interfaces.ReprodutorMusical;

import java.util.HashSet;
import java.util.Set;

public class Ipod implements ReprodutorMusical {

    private Set<Musica> musicas = new HashSet<>();

    public Ipod() {
    }

    public Ipod(Set<Musica> musicas) {
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
        return nomeMusica + " adicionada com sucesso pelo IPOD!";
    }

    @Override
    public String removerMusica(String nomeMusica) {
        musicas.remove(nomeMusica);
        return nomeMusica + " removida com sucesso pelo IPOD!";
    }

    @Override
    public String tocar(String nomeMusica) {
       for (Musica musica : musicas) {
           if(musica.getNomeMusica().equals(nomeMusica)) {
               return "Tocando " + musica.getNomeMusica() + " pelo IPOD";
           }
       }
       return "Música não encontrada pelo IPOD";
    }

    @Override
    public String pausar(String nomeMusica) {
        for (Musica musica : musicas) {
            if(musica.getNomeMusica().equals(nomeMusica)) {
                return "Música " + musica.getNomeMusica() + " pausada pelo IPOD";
            }
        }
        return "Música não encontrada pelo IPOD";
    }

    @Override
    public String selecionarMusica(String nomeMusica) {
        return "Selecionando música. " + tocar(nomeMusica);
    }

    @Override
    public String toString() {
        return "Ipod{" +
                "musicas=" + musicas +
                '}';
    }
}
