package Lesson6;

public class Dog extends Animals {
    public double jump;
    public int swim;

    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = sweem;
        this.jump = jump;
    }
    public void dogData() {
        System.out.println("DogName: " + name + " /RunMax: " + run
                + "meters/" + " /Swim:" + swim + " /Jump: " + jump + " meters/");
    }
}

class Main {
    public static void main(String[] args) {

        Animals animal = new Animals("CatsCategory");
        Cat cat = new Cat("Boris", 200, false, 2);
        animal.animalsData();
        cat.animalsData();
        cat.catData();

        Animals danimal = new Animals("Dogs");
        Dog dog = new Dog("Sharik", 500, 10, 0.5);
        danimal.animalsData();
        dog.animalsData();
        dog.dogData();

    }
}

//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//
//        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//        В качестве параметра каждому методу передается величина,
//        означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//
//        3. У каждого животного есть ограничения на действия
//        (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//
//        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
//        (Например, dog1.run(150); -> результат: run: true)
//
//        5. * Добавить животным разброс в ограничениях.
//        То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
