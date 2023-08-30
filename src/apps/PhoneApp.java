package apps;

import telefone.Contato;
import telefone.Discador;

public class PhoneApp {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Eliezer Moraes Silva", 19999999999L,false);
        Contato contato2 = new Contato("Ana Fiorentina", 1988888888L, false);
        Contato contato3 = new Contato("Snoopy Silva Sauro", 1977777777L, false);
        Contato contato4 = new Contato("Maria das Graças", 1966666666L, false);

        Discador discador = new Discador();
        discador.adicionarContato(contato1);
        discador.adicionarContato(contato2);
        discador.adicionarContato(contato3);
        discador.adicionarContato(contato4);
        discador.exibirContatos();
        discador.exibirQuantidadeContatos();
        discador.removerContato(contato3);
        discador.removerContato(contato3);
        discador.exibirContatos();
        discador.exibirQuantidadeContatos();
        discador.bloquearNumero(1988888888L);
        discador.bloquearNumero(19999999999L);
        discador.bloquearNumero(1977777777L);
        discador.exibirContatos();

        discador.atenderLigacao(contato3.getNumero());
        discador.cancelarLigacao(contato3.getNumero());
        discador.ligar(contato1.getNumero());
        discador.iniciarCorreioDeVoz();
    }
}
