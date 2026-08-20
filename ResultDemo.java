class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Marks extends Student {
    int mark1, mark2, mark3;

    Marks(int rollNo, String name, int mark1, int mark2, int mark3) {
        super(rollNo, name);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}

class Result extends Marks {

    Result(int rollNo, String name, int mark1, int mark2, int mark3) {
        super(rollNo, name, mark1, mark2, mark3);
    }

    void displayResult() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else if (average >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}

public class ResultDemo {
    public static void main(String[] args) {
        Result student = new Result(101, "Arun", 85, 90, 80);

        student.displayResult();
    }
}