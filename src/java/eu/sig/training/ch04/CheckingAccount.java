package eu.sig.training.ch04;

public class CheckingAccount {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;
    private SavingAccount savingacc = new SavingAccount();

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        // 2. Assuming result is 9-digit bank account number, validate 11-test:
        savingacc.validateAccount();
            return result;
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
