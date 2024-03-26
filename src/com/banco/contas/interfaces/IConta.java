package com.banco.contas.interfaces;

import com.banco.contas.*;

public interface IConta {
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contadestino);
    void imprimirExtrato();
    
}
