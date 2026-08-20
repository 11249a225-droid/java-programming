interface Sports {
    int sportsMark = 10;

    void displaySportsMark();
}

interface Academic {
    int academicMark = 90;

    void displayAcademicMark();
}

public class MultipleInheritance implements Sports, Academic {

    public void displaySportsMark() {
        System.out.println("Sports Mark: " + sportsMark);
    }

    public void displayAcademicMark() {
        System.out.println("Academic Mark: " + academicMark);
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();

        obj.displaySportsMark();
        obj.displayAcademicMark();

        int total = sportsMark + academicMark;
        System.out.println("Total Mark: " + total);
    }
}