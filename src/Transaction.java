package src;

class Transaction {
    private TransactionType transactionType;
    private double value;

    public Transaction(String type, double value) {
        this.transactionType = TransactionTypeFactory.getTransactionType(type);
        this.value = value;
    }

    public void execute() {
        System.out.println("Executando transação do tipo " + transactionType.getType() + " no valor " + value);
        // [finge que tem uma logica de transação real aq] [...]
    }
}
