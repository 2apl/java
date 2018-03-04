package Lesson18_HomeWork;

public enum PeriodicalActivity {

    Lections("Лекции"),
    Exercices("Упражнения"),
    Solutions("Решения"),
    Break("Перерыв"),
    Lunch("Обеденный перерыв");

    private String name;

    PeriodicalActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
