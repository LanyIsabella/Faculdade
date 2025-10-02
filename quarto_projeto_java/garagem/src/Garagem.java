public class Garagem {
    private String nome;
    private String cidade;

    public Garagem() {
    }

    public Garagem(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void salvar() {
        System.out.println("Garagem salva com sucesso!");
    }

    public void excluir() {
        System.out.println("Garagem excluída com sucesso!");
    }

    public void atualizar() {
        System.out.println("Garagem atualizada com sucesso!");
    }

    public void buscar() {
        System.out.println("Garagem buscada com sucesso!");
    }
}
