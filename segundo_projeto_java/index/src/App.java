public class App {
    public static void main(String[] args) throws Exception {
        Veiculo carro = new Veiculo();

        carro.setId(1);
        carro.setPlaca("ABC-1234");
        carro.setNome("Fusca");
        carro.setModelo(1967);
        carro.setAno(1967);
        System.out.println("ID: " + carro.getId());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("---------------------");

        Fabricante volkswagen = new Fabricante();
        volkswagen.setId(1);
        volkswagen.setNome("Volkswagen");
        volkswagen.setCnpj("00.000.000/0001-00");
        volkswagen.setCidade("São Paulo");
        System.out.println("ID: " + volkswagen.getId());
        System.out.println("Nome: " + volkswagen.getNome());
        System.out.println("CNPJ: " + volkswagen.getCnpj());
        System.out.println("Cidade: " + volkswagen.getCidade());


    }
}
