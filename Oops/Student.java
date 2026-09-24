public class Student {
    String name;
    int age;
    int energy;
    String mood;
    float attendance;
    Student(String name, int age, int energy, String mood, float attendance) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;
        this.attendance = attendance;
    }
    void skipClass() {
        if (energy < 4) {
            System.out.println("Skip the class");
        } else {
            System.out.println("Don't skip the class");   
        }
    }
    void sleep() {
        if (energy < 2) {
            System.out.println("Sleep");
        } else {
            System.out.println("Don't sleep");
        }
    }
    void study() {
        if (mood.equals("happy") && attendance > 75) {
            System.out.println("Study");
        } else {
            System.out.println("Don't study");
        }
    }
    void takeTest() {
        if (attendance > 85.0f) {
            System.out.println("Take the test");
        } else {
            System.out.println("Don't take the test");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Navya", 20, 3, "happy", 80.0f);
        s1.skipClass();
        s1.sleep();
        s1.study();
        s1.takeTest();
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Energy: " + s1.energy);
        System.out.println("Mood: " + s1.mood);
        System.out.println("Attendance: " + s1.attendance);
    }
}


