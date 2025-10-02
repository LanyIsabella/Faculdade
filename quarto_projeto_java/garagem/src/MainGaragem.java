public class MainGaragem {
    public static void main(String[] args) throws Exception {
        Garagem garagem = new Garagem("Garagem Central", "São Paulo");
        garagem.salvar();

        Categoria categoria = new Categoria("Clássico");
        categoria.salvar();

        Veiculo veiculo = new Veiculo("Fusca", 1970, 1970, "Azul", "ABC-1234", true, garagem, categoria);
        veiculo.salvar();

        Carros carro = new Carros(50, 4, "Ar condicionado, Direção hidráulica");
        carro.salvar();

        Motos moto = new Motos(150);
        moto.salvar();
    }
}
