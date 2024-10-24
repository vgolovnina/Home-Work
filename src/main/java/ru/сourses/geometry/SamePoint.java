package ru.сourses.geometry;

class SamePoint {
    int x, y;

    public SamePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; //Проверка на уникальность
        if (obj == null || getClass() != obj.getClass())
            return false; //Проверка на тип
        SamePoint point = (SamePoint) obj;
        return x == point.x && y == point.y; //Сравнение координат
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new SamePoint(this.x, this.y); //Новый объект с теми же координатами
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        SamePoint p1 = new SamePoint(1, 2);
        SamePoint p2 = new SamePoint(1, 2);
        SamePoint p3 = new SamePoint(3, 4);

        //Сравнение точек
        System.out.println("Точка 1 равна точке 2: " + p1.equals(p2)); //true
        System.out.println("Точка 1 равна точке 3: " + p1.equals(p3)); //false

        //Клонирование точки
        try {
            SamePoint p4 = (SamePoint) p1.clone();
            System.out.println("Изначальная точка: " + p1);
            System.out.println("Копия: " + p4);
            System.out.println("Точка 1 равна точке 4: " + p1.equals(p4)); //true
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
