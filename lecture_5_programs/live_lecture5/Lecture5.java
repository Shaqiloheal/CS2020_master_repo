// Lecture 5 lives


public class Lecture5 {

    private String location = "St Mary's 105";
    private String day = "Monday";

    public Lecture5() {
        this.location = location;
        this.day = day;

    }

    public void sayHello() {
        System.out.println("my L5");
    }

    public static void main(String[] args) {
        Lecture5 l5 = new Lecture5();
        l5.sayHello();
        System.out.println(l5.location);
    }
}