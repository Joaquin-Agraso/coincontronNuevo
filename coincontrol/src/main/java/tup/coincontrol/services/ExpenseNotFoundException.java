package tup.coincontrol.services;

public class ExpenseNotFoundException extends RuntimeException{
    public ExpenseNotFoundException(String message){
        super(message);
    }
}

