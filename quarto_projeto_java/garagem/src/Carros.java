public class Carros extends Veiculo {
    private Integer motorizacao_cv;
    private Integer qtde_marcha;
    private String opcionais;

    public Carros() {
    }

    public Carros(Integer motorizacao_cv, Integer qtde_marcha, String opcionais) {
        this.motorizacao_cv = motorizacao_cv;
        this.qtde_marcha = qtde_marcha;
        this.opcionais = opcionais;
    }

    public Integer getMotorizacao_cv() {
        return motorizacao_cv;
    }

    public void setMotorizacao_cv(Integer motorizacao_cv) {
        this.motorizacao_cv = motorizacao_cv;
    }

    public Integer getQtde_marcha() {
        return qtde_marcha;
    }

    public void setQtde_marcha(Integer qtde_marcha) {
        this.qtde_marcha = qtde_marcha;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    @Override
     public void salvar() {
        System.out.println("Carro salvo com sucesso!");
        super.salvar();
    }

    @Override
    public void excluir() {
        System.out.println("Carro excluído com sucesso!");
        super.excluir();
    }

    @Override
    public void atualizar() {
        System.out.println("Carro atualizado com sucesso!");
        super.atualizar();
    }

    @Override
    public void buscar() {
        System.out.println("Carro buscado com sucesso!");
        super.buscar();
    }
    
}
