public class Motos extends Veiculo {
    private Integer cilindrada;

    public Motos() {
    }

    public Motos(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
     public void salvar() {
        System.out.println("Moto salva com sucesso!");
    
    }

    @Override
    public void excluir() {
        System.out.println("Moto excluída com sucesso!");
    }

    @Override
    public void atualizar() {
        System.out.println("Moto atualizada com sucesso!");
    }

    @Override
    public void buscar() {
        System.out.println("Moto buscada com sucesso!");
    }
}
