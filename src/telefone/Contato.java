package telefone;

public class Contato {

    private String nome;
    private Long numero;
    private boolean bloqueado;

    public Contato() {
    }

    public Contato(String nome, Long numero, boolean bloqueado) {
        this.nome = nome;
        this.numero = numero;
        this.bloqueado = bloqueado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", bloqueado=" + bloqueado +
                '}';
    }
}
