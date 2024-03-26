package com.banco.contas;
import com.banco.Cliente;
import com.banco.contas.interfaces.*;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;

    }

    public void sacar(){

    }

    public void transferir(){
        
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        // TODO Auto-generated method stub
        this.sacar(valor);
        contadestino.depositar(valor);
        
    }

    protected void ImprimirExtrarto() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
