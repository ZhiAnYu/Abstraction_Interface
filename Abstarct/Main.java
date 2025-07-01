public class Main {

    public static void main(String[] args) {
        CreditAccount accountCr = new CreditAccount(-100_000);
        SimpleAccount accountSi = new SimpleAccount();


        accountCr.add(10_000);
        accountCr.pay(10_000);
        System.out.println(accountCr.getBalance());

        accountSi.add(10_000);
        accountSi.pay(10_000);
        System.out.println(accountSi.getBalance());

        accountCr.transfer(accountSi, 5_000);
        System.out.println(accountSi.getBalance());
        System.out.println(accountCr.getBalance());

        accountSi.transfer(accountCr, 10_000);
        System.out.println(accountSi.getBalance());
        System.out.println(accountCr.getBalance());
    }
}
