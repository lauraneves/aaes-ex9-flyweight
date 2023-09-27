package src;

import java.util.HashMap;
import java.util.Map;

public class TransactionTypeFactory {
    private static Map<String, TransactionType> transactionTypes = new HashMap<>();

    public static TransactionType getTransactionType(String type) {
        TransactionType transactionType = transactionTypes.get(type);

        if (transactionType == null) {
            transactionType = new TransactionType(type);
            transactionTypes.put(type, transactionType);
        }

        return transactionType;
    }
}
