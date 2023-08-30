package telefone;

import exceptions.ResourceNotFoundException;
import interfaces.AparelhoTelefonico;

import java.util.HashSet;
import java.util.Set;

public class Discador implements AparelhoTelefonico {

    private Set<Contato> contatos = new HashSet<>();

    public Discador() {
    }

    public Discador(Set<Contato> contatos) {
        this.contatos = contatos;
    }

    public Set<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.printf("O contato %s foi adicionado com sucesso!%n", contato.getNome());
    }

    public void removerContato(Contato contato) {
        Contato contatoAserRemovido = null;
        if (!contatos.isEmpty()) {
            for (Contato obj : contatos) {
                if (obj.equals(contato)) {
                    contatoAserRemovido = obj;
                    contatos.remove(contato);
                    System.out.printf("O contato %s foi removido com sucesso!%n", contato.getNome());
                    break;
                }
            }
            if(contatoAserRemovido == null) {
                System.out.printf("O contato %s não foi encontrado %n", contato.getNome());
            }
        } else {
            throw new ResourceNotFoundException("A lista de contatos está vazia");
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public void exibirQuantidadeContatos() {
        System.out.println(contatos.size());
    }

    @Override
    public void atenderLigacao(Long numero) {
        System.out.printf("Chamada com o número %d em andamento...%n", numero);
    }

    @Override
    public void cancelarLigacao(Long numero) {
        System.out.printf("Chamada com o número %d cancelada.%n", numero);
    }

    @Override
    public void bloquearNumero(Long numero) {
        Contato contatoAserBloqueado = null;
        if (!contatos.isEmpty()) {
            for (Contato contato : contatos) {
                if (contato.getNumero().equals(numero) && !contato.isBloqueado()) {
                    contatoAserBloqueado = contato;
                    contato.setBloqueado(true);
                    System.out.printf("O número %d foi bloqueado %n", numero);
                }
            }
            if (contatoAserBloqueado == null) {
                System.out.printf("O número %d não foi encontrado %n", numero);
            }
        } else {
            throw new ResourceNotFoundException("A lista de contatos está vazia");
        }
    }

    @Override
    public void ligar(Long numero) {
        System.out.printf("Ligando para o número %d %n", numero);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public String toString() {
        return "Discador{" +
                "contatos=" + contatos +
                '}';
    }
}
