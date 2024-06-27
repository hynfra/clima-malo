public class BankAccount {

    private String num;
    private int saldoCtaCte;
    private int saldoCtaAhorro;

    // las variables estaticas estan aparte del objeto y se plantean cuando se desea saber un resultado en común
    static int numCtas = 0;
    static int totalDinero = 0;

    public BankAccount() {
        this.num = getNewNum();
        this.saldoCtaCte = 0;
        this.saldoCtaAhorro = 0;
        // no se pone this porque eso hace referencia a la clase, mientras que static
        // hace la variable publica
        numCtas++;

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSaldoCtaCte() {
        return saldoCtaCte;
    }

    public void setSaldoCtaCte(int saldoCtaCte) {
        this.saldoCtaCte = saldoCtaCte;
    }

    public int getSaldoCtaAhorro() {
        return saldoCtaAhorro;
    }

    public void setSaldoCtaAhorro(int saldoCtaAhorro) {
        this.saldoCtaAhorro = saldoCtaAhorro;
    }

    public static int getNumCtas() {
        return numCtas;
    }

    public static void setNumCtas(int numCtas) {
        BankAccount.numCtas = numCtas;
    }

    public static int getTotalDinero() {
        return totalDinero;
    }

    public static void setTotalDinero(int totalDinero) {
        BankAccount.totalDinero = totalDinero;
    }

    // este metodo debe ser static porque se crea antes de usar el objeto, sino es
    // static no va a funcionar en el constructor
    private static String getNewNum() {
        String num = (Math.random() * 100000) + "";
        return num;

    }

    public void addToCtaCte(int monto) {

        this.saldoCtaCte += monto;
        totalDinero += this.saldoCtaCte;

        System.out.println("El saldo de la cuenta  corriente " + this.getNum() + " es: " + this.saldoCtaCte);

    }

    public void addToCtaAhorro(int monto) {
        this.saldoCtaAhorro += monto;
        totalDinero += this.saldoCtaAhorro;

        System.out.println("El saldo de la cuenta de ahorro " + this.getNum() + " es: " + this.saldoCtaAhorro);

    }

    public void transferir(BankAccount receptor, int monto) {
        
        if (this.getSaldoCtaCte() <  monto) {
            System.out.println("El monto a transferir excede al saldo de la cuenta corriente");

        } else {
             this.saldoCtaCte -= monto;
            receptor.saldoCtaCte += monto;
            System.out.println("Se ha añadido a la cuenta : " + receptor.getNum() + " la suma de " + monto);
        }

    }

}
