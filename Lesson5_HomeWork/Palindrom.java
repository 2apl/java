package Lesson5_HomeWork;

public class Palindrom {

    public static void main(String[] args) {
        String string = "тот кононок тот";
        if (palindrom(string)){
            System.out.println("Введенная строка является палиндромом");
        } else {
            System.out.println("Введенная строка не является палиндромом");
        }
    }

    private static boolean palindrom (String string){
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
        return string.equals(reverse);

    }
}
