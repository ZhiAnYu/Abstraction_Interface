public class SimpleAccount extends Account {


    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
