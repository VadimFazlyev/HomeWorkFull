package Lesson5;

public class staffData {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int pay;
    public int age;

    public staffData(String name, String position, String email, String phoneNumber, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
        if (age >= 20) {
            this.age = age;
        } else {
            System.out.println("Еще нос не дорос!");
        }
    }

    public int oldAge() {
        return age;
    }

    public void print() {
        System.out.println(name + " " + position + " " + email + " " + phoneNumber + " " + pay + " " + age);
    }


    public class Main {
        public  void main(String[] args) {
            staffData[] staffArrey = new staffData[5];
            staffArrey[0] = new staffData("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312310", 30000, 30);
            staffArrey[1] = new staffData("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892312311", 30000, 35);
            staffArrey[2] = new staffData("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312312", 30000, 40);
            staffArrey[3] = new staffData("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "892312313", 30000, 45);
            staffArrey[4] = new staffData("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312314", 30000, 50);

            for (staffData item : staffArrey) {
                if (item.oldAge() > 40) item.print();
            }
        }
    }
}


