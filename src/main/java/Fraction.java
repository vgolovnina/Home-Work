public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.denominator = Math.abs(denominator);
        this.numerator = denominator < 0 ? -numerator : numerator;
        reduce();
    }

    void reduce() {
        int gcd = gcd(Math.abs(numerator), denominator); //наибольший общий делитель
        numerator /= gcd;
        denominator /= gcd;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sum(int integer) {
        return this.sum(new Fraction(integer, 1));
    }

    public Fraction minus(Fraction other) {
        return this.sum(new Fraction(-other.numerator, other.denominator));
    }

    public Fraction minus(int integer) {
        return this.minus(new Fraction(integer, 1));
    }

    public static void main(String[] args) {  // Создание дробей

        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        Fraction result = f1.sum(f2).sum(f3).minus(5);
        System.out.println(result);
    }

}
