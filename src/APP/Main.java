package APP;

import Model.Cliente;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("User");
        
        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        
        Conta poupanca = new ContaPoupanca(cliente);
        
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
    
}
