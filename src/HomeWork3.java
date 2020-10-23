import java.util.Scanner;
import java.lang.Math;

public class HomeWork3 {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        //1. Написать программу, которая загадывает случайное число от 0 до 9,и пользователю дается 3 попытки угадать это число.
        //При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,или меньше.
        //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        Scanner thisNumber = new Scanner(System.in);
        int a, b = (int) (Math.random() * 10);
        System.out.println("Угадайте число от 0 до 9, у Вас всего 3 попыти: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Попытка " + (i + 1) + ": ");
            a = thisNumber.nextInt();
            if (a < b) System.out.println("Бери больше!");
            if (a > b) System.out.println("Меньше,чем ты думал!");
            if (a == b) {
            System.out.println("Не может быть! Угадал )");
            System.out.println("Еще разок? 1 – да / 0 – нет");
            a = thisNumber.nextInt();
            if (a == 1) findNumber();
            else {
                System.out.println("Еще увидимся, пока!");
            break;
                }
            }
        }
            System.out.println("Вы не угадали :( ");
            System.out.println("Еще разок? 1 – да / 0 – нет");
            a = thisNumber.nextInt();
            if (a == 1) findNumber();
            else {
                System.out.println("Спасибо за игру!");
            }
    }
        //2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        //"carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
        //"pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
        //компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы









}










