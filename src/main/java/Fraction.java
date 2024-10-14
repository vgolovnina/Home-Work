class Fraction extends Number {
    int num, denum;

    public Fraction(int num, int denum) {
        if (num == 0 || denum == 0) {
            throw new IllegalArgumentException("Числитель/знаменатель не может быть нулем");
        }
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public int intValue() {
        return num / denum; //Целая часть дроби
    }

    @Override
    public long longValue() {
        return num / denum; //Целая часть дроби в long
    }

    public static void main(String[] args) {
        Fraction fraction = new Fraction(1, 2);
        System.out.println("Fraction: " + fraction);
        System.out.println("Double value: " + fraction.doubleValue());
        System.out.println("Float value: " + fraction.floatValue());
        System.out.println("Int value: " + fraction.intValue());
        System.out.println("Long value: " + fraction.longValue());
    }
}