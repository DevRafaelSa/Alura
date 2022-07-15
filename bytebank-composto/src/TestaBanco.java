public class TestaBanco {

    public static void main(String[] args) {
        Cliente rafael = new Cliente();
        rafael.nome = "Rafael Sá";
        rafael.CPF = "222.222.222-22";
        rafael.profissao = "programador";

        Conta contaDoRafael = new Conta();
        contaDoRafael.deposita(100);

        contaDoRafael.titular = rafael;

        System.out.println(contaDoRafael.titular.nome);

    }
}
