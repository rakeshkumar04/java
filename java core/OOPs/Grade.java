package OOPs;

class Grade {

    public static void main(String[] args) {

        
        Student kumar = new Student("Kumar", 95);
        Student babu = new Student("Babu", 82);
        Student varun = new Student("Varun", 78);
        Student ranga = new Student("Ranga", 65);
        Student narang = new Student("Narang", 55);

        
        Student[] students = new Student[5];
        students[0] = kumar;
        students[1] = babu;
        students[2] = varun;
        students[3] = ranga;
        students[4] = narang;

        
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            String grade = student.calculateGrade();
            System.out.println(student.getName() + ": " + grade);
        }
    }
}

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
