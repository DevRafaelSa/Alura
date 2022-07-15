public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Gerente();

        Gerente g1 = new Gerente();

        g1.setNome("Rafael Sá");
        g1.setCpf("12365478988");
        g1.setSalario(10000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);

        boolean autenticacao = g1.autenticacao(2222);

        System.out.println(autenticacao);

        System.out.println(g1.getBonificacao());
    }
}
