package com.company;

public class Main {

    public static void main(String[] args) {

        Student students[] = new Student[10];
        students[0] = new Student("Garry", "Potter", "Grif-91");
        students[1] = new Student("Ronald", "Weasley", "Grif-91");
        students[2] = new Student("Hermione", "Granger", "Grif-91");
        students[3] = new Student( "Neville", "Longbottom", "Grif-91");
        students[4] = new Student("Percy", "Weasley", "Grif-91");
        students[5] = new Student("Jeanie", "Weasley", "Grif-91");
        students[6] = new Student("George", "Weasley", "Grif-91");
        students[7] = new Student("Fred", "Weasley", "Grif-91");
        students[8] = new Student("Oliver", "Wood", "Grif-91");
        students[9] = new Student("Katie", "Bell", "Grif-91");



        P.rintln("Best student is " + Utils.getTheBestStudent(students));
        P.rintln("Best subject is " + Utils.getTheBestSubject(students));

        for(int i=0;i < students.length;i++){
            P.rintln("Student " + students[i].getId() + " avgMark: " + students[i].avgMark());
            if(students[i].avgMark() == 5f)
                P.rintln("10 points to Gryffindor");
            else if(students[i].avgMark() >= 4f)
                P.rintln("5 points to Gryffindor");
            else if(students[i].avgMark() <= 4f && (students[i].getSurname()=="Bell" || students[i].getSurname()=="Granger" || students[i].getName()=="Jeanie") )
                P.rintln("Very bad Miss " + students[i].getSurname());
            else
                P.rintln("Very bad Mister " + students[i].getSurname());
        }

        for(int i = 0 ; i< students.length;i++){
            P.rintln(students[i].getName() + ' ' + students[i].getSurname() + ':');
            students[i].passedSub();
        }
    }
}
