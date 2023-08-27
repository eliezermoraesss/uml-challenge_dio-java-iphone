package apps;

import interfaces.NavegadorInternet;
import navegadores.Chrome;
import navegadores.Safari;

public class BrowserApp {
    public static void main(String[] args) {

        NavegadorInternet chrome = new Chrome();
        NavegadorInternet safari = new Safari();

        System.out.println("Selecionando o navegador CHROME\n");
        chrome.adicionarNovaAba();
        chrome.exibirPágina();
        chrome.atualizarPagina();
        System.out.println();

        System.out.println("Selecionando o navegador SAFARI\n");
        safari.adicionarNovaAba();
        safari.exibirPágina();
        safari.atualizarPagina();
        System.out.println();
    }
}
