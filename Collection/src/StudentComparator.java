public class StudentComparator {
    int rollNumber;
    String name;
    double marks;

    public StudentComparator(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    
    @Override
    public String toString() {
        return "Roll number - " + this.rollNumber + " Name - " + this.name + "Marks - " + this.marks;
    }

}
