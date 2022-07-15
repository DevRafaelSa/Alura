public class Cliente implements Autenticavel{

    private Autenticador util;

    public Cliente () {
        this.util = new Autenticador();
    }
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autenticacao(int senha) {
        return this.util.autenticacao(senha);
    }
}
