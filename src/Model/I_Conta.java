package Model;

public interface I_Conta {
    
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor, Conta contaDestino);
    
    void imprimirExtrato();
}
