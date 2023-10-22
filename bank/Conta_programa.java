
package banco;

public class Account {
    private String nome;
    private double limite;
    private double saldo;
    
    public void setName(String nome){
        this.nome = nome; 
    }
    
    public String getName(){
        return nome;
    }
      
    public void setLimit(double limite){
        this.limite = limite;
    }
    
    public double getLimit(){
        return limite;
    }
    public void setBalance(double saldo){
        this.saldo = saldo;
    }
    
    public double getBalance(){
        return saldo;
    }
    public void Withdraw(double saque){
        if(this.saldo >= saque){
            this.saldo -= saque;
        }else{
            System.out.println(" Desculpe, infelizmente não conseguimos completar a operação. ");
        }
    }
    
    public void Deposit(double deposito){
        this.saldo += deposito;
    }   
}
