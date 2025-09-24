public class App {
    public static void main(String[] args) throws Exception {

        Fabricante volkswagen = new Fabricante();
        volkswagen.setId(1);
        volkswagen.setNome("Volkswagen");
        volkswagen.setCnpj("00.000.000/0001-00");
        volkswagen.setCidade("São Paulo");
        System.out.println("ID: " + volkswagen.getId());
        System.out.println("Nome: " + volkswagen.getNome());
        System.out.println("CNPJ: " + volkswagen.getCnpj());
        System.out.println("Cidade: " + volkswagen.getCidade());
        System.out.println("---------------------");


        Veiculo carro1 = new Veiculo();

        carro1.setId(1);
        carro1.setPlaca("ABC-1234");
        carro1.setNome("Fusca");
        carro1.setFabricante(volkswagen);
        carro1.setModelo(1967);
        carro1.setAno(1967);
        System.out.println("ID: " + carro1.getId());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Nome: " + carro1.getNome());
        System.out.println("Fabricante: " + carro1.getFabricante().getNome());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("---------------------");

        Veiculo carro2 = new Veiculo();
        carro2.setId(2);
        carro2.setPlaca("DEF-5678");
        carro2.setNome("Brasília");
        carro2.setModelo(1973);
        carro2.setAno(1973);
        System.out.println("ID: " + carro2.getId());
        System.out.println("Placa: " + carro2.getPlaca());
        System.out.println("Nome: " + carro2.getNome());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("---------------------");




    }
}
