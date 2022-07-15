public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("231654987-99");
        nico.setSalario(4500);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
