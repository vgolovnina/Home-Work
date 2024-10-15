class FractionSum extends Number {
    int num, denum;

    public FractionSum(int num, int denum) {
        if (num == 0 || denum == 0) {
            throw new IllegalArgumentException("Числитель/знаменатель не может быть нулем");
        }
        this.num = num;
        this.denum = denum;
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
        return num / denum; // Возвращает целую часть дроби
    }

    @Override
    public long longValue() {
        return num / denum; // Возвращает целую часть дроби
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }

    public static double sumAll(Number... values) {
        double sum = 0.0;
        for (Number value : values) {
            sum += value.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        double result1 = sumAll(2, new FractionSum(3, 5), 2.3);
        double result2 = sumAll(3.6, new FractionSum(49, 12), 3, new FractionSum(3, 2));
        double result3 = sumAll(new FractionSum(1, 3), 1);

        System.out.println("2 + 3/5 + 2.3 = " + result1);
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2);
        System.out.println("1/3 + 1 = " + result3);
    }
}
