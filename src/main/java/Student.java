import java.util.ArrayList;
import java.util.List;

public class Student {
    final String name;
    final List<Integer> grades;

    //Конструктор принимает имя и набор оценок
    public Student(String name, Integer... grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (Integer grade : grades) {
            addGrade(grade);
        }
    }

    //Метод для добавления оценки
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
        grades.add(grade);
    }

    //Метод для получения всех оценок
    public List<Integer> getGrades() {
        return new ArrayList<>(grades); //Копия списка оценок для инкапусляции
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + grades.toString();
    }
    public static void main(String[] args) {
        Student student = new Student("Иван", 3, 4);
        System.out.println(student);

        student.addGrade(5);
        System.out.println(student);

        //Проверка некорректной оценки (как то по моему не так работает, не понимаю в чем ошибка)
        try {
            student.addGrade(1); //Исключение
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //Все оценки
        List<Integer> allGrades = student.getGrades();
        System.out.println("Все оценки: " + allGrades);
    }
}