package apps;

import interfaces.ReprodutorMusical;
import musicas.Ipod;
import musicas.Spotify;

public class MusicApp {
    public static void main(String[] args) {

        String musica1 = "Maranata";
        String musica2 = "A Ele a glória";
        String musica3 = "Espírito enche a minha vida";
        String musica4 = "Amazing Grace";
        String musica5 = "Oceans";
        String musica6 = "Pensando bem";
        String musica7 = "Pensando bem";

        ReprodutorMusical ipod = new Ipod();
        ReprodutorMusical spotify = new Spotify();

        System.out.println("Selecionando o aplicativo IPOD...\n");
        System.out.println(ipod.adicionarMusica(musica1));
        System.out.println(ipod.adicionarMusica(musica2));
        System.out.println(ipod.adicionarMusica(musica3));

        ipod.exibirMusicas();
        System.out.println(ipod.removerMusica(musica3));
        ipod.exibirMusicas();
        ipod.exibirQuantidadeDeMusicas();

        System.out.println(ipod.tocar(musica1));
        System.out.println(ipod.pausar(musica1));
        System.out.println(ipod.selecionarMusica(musica2));
        System.out.println();

        System.out.println("Selecionando o aplicativo SPOTIFY...\n");
        System.out.println(spotify.adicionarMusica(musica4));
        System.out.println(spotify.adicionarMusica(musica5));
        System.out.println(spotify.adicionarMusica(musica6));
        System.out.println(spotify.adicionarMusica(musica7));

        spotify.exibirMusicas();
        System.out.println(spotify.removerMusica(musica6));
        spotify.exibirMusicas();
        spotify.exibirQuantidadeDeMusicas();

        System.out.println(spotify.tocar(musica4));
        System.out.println(spotify.pausar(musica4));
        System.out.println(spotify.selecionarMusica(musica5));

    }
}
