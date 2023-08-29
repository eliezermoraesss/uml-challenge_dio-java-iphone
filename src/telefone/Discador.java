package telefone;

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

    @Override
    public void atenderLigacao() {

    }

    @Override
    public void cancelarLigacao() {

    }

    @Override
    public void bloquearNumero(Integer numero) {

    }

    @Override
    public void ligar(Integer numero) {

    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public String toString() {
        return "Discador{" +
                "contatos=" + contatos +
                '}';
    }
}
