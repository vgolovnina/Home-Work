package ru.сourses.other;

public class Sauce {
     String name;
     Spicy spicy;

    public enum Spicy {
        very_spicy("очень острый"),
        midle_spicy("острый"),
        not_spicy("не острый");

        private final String name;

        Spicy(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public Sauce(String name, Spicy spicy) {
        this.name = name;
        this.spicy = spicy;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spicy;
    }

    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Табаско", Spicy.very_spicy);
        Sauce sauce2 = new Sauce("Шашлычный", Spicy.midle_spicy);
        Sauce sauce3 = new Sauce("Сырный", Spicy.not_spicy);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}

