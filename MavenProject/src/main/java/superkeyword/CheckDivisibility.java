package superkeyword;

public class CheckDivisibility extends Addition {
    public void checkDivisibleBy10(int a, int b) {
        int sum = super.add(a, b);
        if (sum % 10 == 0) {
            System.out.println("The addition result " + sum + " is divisible by 10.");
        } else {
            System.out.println("The addition result " + sum + " is not divisible by 10.");
        }
    }

    public static void main(String[] args) {
        CheckDivisibility cd = new CheckDivisibility();
        int a = 10;
        int b = 20;
        cd.checkDivisibleBy10(a, b);
    }
}