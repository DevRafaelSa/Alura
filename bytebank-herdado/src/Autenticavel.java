
//contrato Autenticavel
    //quem assina esse contrato precisa implementar
         //metodo setSenha
         //metodo autenticou
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autenticacao(int senha);
}
