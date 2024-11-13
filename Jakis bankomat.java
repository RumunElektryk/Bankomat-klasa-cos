abstract class BankTransaction {
    public void acceptWithdrawalRequest() {
        System.out.println("Bank: Przyjęto prośbę o wypłatę.");
    }
 
    public void checkAccountBalance() {
        System.out.println("Bank: Sprawdzanie stanu konta.");
    }
 
    public void confirmWithdrawal() {
        System.out.println("Bank: Potwierdzenie możliwości wypłaty.");
    }
 
    public abstract void executeTransaction();
}
 
class ATMTransaction extends BankTransaction {
    @Override
    public void executeTransaction() {
        insertCard();
        enterPIN();
        enterAmount();
        acceptWithdrawalRequest();
        checkAccountBalance();
        confirmWithdrawal();
        dispenseCash();
        thankUser();
    }
 
    private void insertCard() {
        System.out.println("Bankomat: Proszę włożyć kartę.");
    }
 
    private void enterPIN() {
        System.out.println("Bankomat: Proszę wprowadzić kod PIN.");
    }
 
    private void enterAmount() {
        System.out.println("Bankomat: Proszę wprowadzić kwotę do wypłaty.");
    }
 
    private void dispenseCash() {
        System.out.println("Bankomat: Wypłacanie gotówki.");
    }
 
    private void thankUser() {
        System.out.println("Bankomat: Dziękujemy za skorzystanie z usług Banku.");
    }
}
 
public class Main {
    public static void main(String[] args) {
        BankTransaction transaction = new ATMTransaction();
        transaction.executeTransaction();
    }
}
