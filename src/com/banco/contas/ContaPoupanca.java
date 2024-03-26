package com.banco.contas;

import com.banco.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("=== Extrato Conta Poupança ===");
        super.ImprimirExtrarto();
    }
    
}
