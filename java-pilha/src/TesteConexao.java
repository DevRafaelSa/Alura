public class TesteConexao {

    public static void main(String[] args) {


        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        }
        /*    con = new Conexao();
            con.leDados();
            con.fecha();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            if(con != null){
                con.close();
            }

        }*/

    }
}
