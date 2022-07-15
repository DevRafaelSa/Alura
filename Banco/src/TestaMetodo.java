public class TestaMetodo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(50);
        System.out.println(conta.saldo);

        conta.saca(30);
        System.out.println(conta.saldo);

        Conta contaDaRafaela = new Conta();
        contaDaRafaela.deposita(1000);

        contaDaRafaela.transfere(300, conta);
        System.out.println(conta.saldo);
        System.out.println(contaDaRafaela.saldo);

        conta.titular = "Rafael Sá";
        System.out.println(conta.titular);

    }
}
