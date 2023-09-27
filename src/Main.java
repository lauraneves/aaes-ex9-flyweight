package src;

public class Main {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("Depósito", 1000);
        Transaction transaction2 = new Transaction("Saque", 500);
        Transaction transaction3 = new Transaction("Depósito", 200);

        transaction1.execute();
        transaction2.execute();
        transaction3.execute();
    }
}
