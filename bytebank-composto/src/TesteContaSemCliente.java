public class TesteContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaRafaela = new Conta();

        contaDaRafaela.titular = new Cliente();
        System.out.println(contaDaRafaela.titular);
    }
}
