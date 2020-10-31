import Lesson5.staffData;

public class HomeWork5 {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int pay;
    public int age;

    public void staffData(String name, String position, String email, String phoneNumber, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
        if (age >= 20) {
        } else {
            System.out.println("Еще нос не дорос!");
        }
    }

    int oldAge() {
        return age;
    }

    void print() {
        System.out.println("Имя:" + name + " " + "Должность:" + position + " "
                + "Почта:" + email + " " + "Номер:" + phoneNumber + " " + "Зарпата:" + pay + " " + "Возраст:" + age);
    }

    public static class Main {
        public static  void main(String[] args) {
            staffData[] staffArray = new staffData[5];
            staffArray[0] = new staffData("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312310", 30000, 30);
            staffArray[1] = new staffData("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892312311", 30000, 35);
            staffArray[2] = new staffData("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312312", 30000, 40);
            staffArray[3] = new staffData("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "892312313", 30000, 45);
            staffArray[4] = new staffData("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312314", 30000, 50);

            for (staffData item : staffArray) {
                if (item.oldAge() > 40) item.print();
            }
        }
    }
}
//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//
//* Конструктор класса должен заполнять эти поля при создании объекта;
//
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//
//* Создать массив из 5 сотрудников
//
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//...
//    persArray[4] = new Person(...);
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;