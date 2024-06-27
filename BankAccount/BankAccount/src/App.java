public class App {
    public static void main(String[] args) throws Exception {
        BankAccount cuenta1 = new BankAccount();
        BankAccount cuenta2 = new BankAccount();

        cuenta1.addToCtaCte(1000);
        cuenta2.addToCtaCte(2000);
        cuenta1.addToCtaAhorro(5000);
        cuenta2.addToCtaAhorro(10000);
        System.out.println("Total dinero: " + BankAccount.totalDinero);

        cuenta1.transferir(cuenta2, 3000);

        System.out.println(cuenta1.getSaldoCtaCte());

    }
}
