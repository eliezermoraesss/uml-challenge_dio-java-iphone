package apps;

import interfaces.NavegadorInternet;
import navegadores.Chrome;
import navegadores.Safari;

public class BrowserApp {
    public static void main(String[] args) {

        String url1 = "https://www.linkedin.com/in/eliezer-moraes-silva-80b68010b/";
        String url2 = "https://github.com/eliezermoraesss";
        String url3 = "http://www.youtube.com.br";
        String url4 = "http://www.alura.com.br";
        String url5 = "http://dio.me";
        String url6 = "http://www.google.com.br";
        String url7 = "http://www.udemy.com.br";

        NavegadorInternet chrome = new Chrome();
        NavegadorInternet safari = new Safari();

        System.out.println("Selecionando o navegador CHROME\n");
        System.out.println(chrome.adicionarFavorito(url1));
        System.out.println(chrome.adicionarFavorito(url2));
        System.out.println(chrome.adicionarFavorito(url3));
        System.out.println();

        chrome.exibirFavoritos();
        chrome.removerFavorito(url4);
        chrome.removerFavorito(url3);
        chrome.exibirFavoritos();
        chrome.exibirQuantidadeFavoritos();
        System.out.println();

        chrome.adicionarNovaAba();
        chrome.exibirPágina(url4);
        chrome.atualizarPagina(url4);
        System.out.println();

        System.out.println("Selecionando o navegador SAFARI\n");
        safari.adicionarFavorito(url4);
        safari.adicionarFavorito(url5);
        safari.adicionarFavorito(url6);
        safari.adicionarFavorito(url7);
        System.out.println();

        safari.exibirFavoritos();
        safari.removerFavorito(url1);
        safari.removerFavorito(url5);
        safari.exibirFavoritos();
        safari.exibirQuantidadeFavoritos();
        System.out.println();

        safari.adicionarNovaAba();
        safari.exibirPágina(url7);
        safari.atualizarPagina(url7);
        System.out.println();
    }
}
