package Lesson9_Homework;

public class Student {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double rating;

    public Student(String firstName, String lastName, Integer age, Double rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Имя:'" + firstName + '\'' +
                ", Фамилия: " + lastName + '\'' +
                ", возраст: " + age +
                ", рейтинг: " + rating +
                '}';
    }
}
