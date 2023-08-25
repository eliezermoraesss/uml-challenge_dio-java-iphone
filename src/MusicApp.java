import interfaces.ReprodutorMusical;
import musicas.Ipod;
import musicas.Musica;
import musicas.Spotify;

import java.util.HashSet;
import java.util.Set;

public class MusicApp {
    public static void main(String[] args) {

        String musica1 = "My heart will go on";
        String musica2 = "Stand by me";
        String musica3 = "Have you ever seen the rain";

        Set<Musica> musicas = new HashSet<>();
        musicas.add(new Musica(musica1));
        musicas.add(new Musica(musica2));
        musicas.add(new Musica(musica3));

        ReprodutorMusical ipod = new Ipod(musicas);
        ReprodutorMusical spotify = new Spotify(musicas);

        System.out.println(ipod.tocar(musica1));
        System.out.println(ipod.pausar(musica1));
        System.out.println(ipod.selecionarMusica(musica2));

        System.out.println(spotify.tocar(musica3));
        System.out.println(spotify.pausar(musica3));
        System.out.println(spotify.selecionarMusica(musica2));

    }
}