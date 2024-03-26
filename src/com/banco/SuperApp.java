package com.banco;

import com.banco.contas.Conta;
import com.banco.contas.ContaCorrente;
import com.banco.contas.ContaPoupanca;

public class SuperApp {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(200);
        cp.depositar(10000);
        cp.transferir(5000, cc);

        cc.imprimirExtrato();
        System.out.println("--------------------------------");
        cp.imprimirExtrato();
    }
}
