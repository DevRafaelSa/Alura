package br.com.rafael.bytebank;

import br.com.ByteBank.Banco.modelo.Conta;
import br.com.ByteBank.Banco.modelo.ContaCorrente;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Conta c = new ContaCorrente(123, 6546);

        c.deposita(500);

        System.out.println(c.getSaldo());
    }
}
