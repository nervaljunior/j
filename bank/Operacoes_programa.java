
package banco;

public class Banco{
    public static void main(String[] args) {
        Account Conta = new Account();
        
        System.out.println("======= Nova Conta ==============");
        
        minhaConta.setName(" Patrick Moraes");
        minhaConta.setBalance(100.00);
        minhaConta.setLimit(10000.00);
        
        System.out.println("Conta: "  +  minhaConta.getName());
        System.out.println("Limite: " +  minhaConta.getLimit());
        System.out.println("Saldo: "  +  minhaConta.getBalance());
        
        
        System.out.println("\n======== sacando R$100,00 ==========");
        minhaConta.Withdraw(100.00);
        System.out.println("Novo saldo: "  +  minhaConta.getBalance());
        
        System.out.println("\n======== Depositando R$500,00 ==========");
        minhaConta.Deposit(500.00);
        System.out.println("Novo saldo: "  +  minhaConta.getBalance());
        
        System.out.println("\n======== sacando R$600,00 ==========");
        minhaConta.Withdraw(600.00);
        System.out.println("Novo saldo: "  +  minhaConta.getBalance());

        System.out.println("\n======== sacando R$1,00 ==========");
        minhaConta.Withdraw(1.00);
        System.out.println("Novo saldo: "  +  minhaConta.getBalance());
        
        System.out.println("\n======== Atualizando limite ==========");

        minhaConta.setLimit(5000.00);
        System.out.println("Novo limite: "  +  minhaConta.getLimit());         
    }   
}
