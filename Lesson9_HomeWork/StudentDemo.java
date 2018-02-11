package Lesson9_Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ольга", "Борздыко", 21, 7.0));
        studentList.add(new Student("Виктория", "Васильева", 25, 8.7));
        studentList.add(new Student("Елена", "Гаврилова", 23, 8.3));
        studentList.add(new Student("Сергей", "Головач", 27, 9.0));
        studentList.add(new Student("Николай", "Ермола", 25, 8.0));
        studentList.add(new Student("Денис", "Иванов", 26, 8.3));
        studentList.add(new Student("Александра", "Жукова", 25, 8.0));
        studentList.add(new Student("Денис", "Жилин", 25, 7.0));
        System.out.println("Лучший " + maxRating(studentList).toString());

        System.out.println("============= Сортировка по имени ==============");
        studentList.sort(new StudentNameComparator());
        printList(studentList);

        System.out.println("============= Сортировка по возрасту ============");
        studentList.sort(new StudentAgeComparator());
        printList(studentList);

        System.out.println("============= Сортировка по рейтингу =============");
        studentList.sort(new StudentRatingComparator());
        printList(studentList);
    }

    private static Student maxRating(List<Student> list) {
        Student bestStudent = list.get(0);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student thisStudent = iterator.next();
            if (bestStudent.getRating() < thisStudent.getRating()) {
                bestStudent = thisStudent;
            }
        }
        return bestStudent;
    }

    public static <Student> void printList(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    static class StudentNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
            return result;
        }
    }

    static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }

    static class StudentRatingComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return (-1) * o1.getRating().compareTo(o2.getRating());
        }
    }
}
