import java.util.Scanner;

class subject{
int subjectMarks, credits, grade;}
class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    subject subjects[];

Student()
{
int i;
subjects = new subject[9];
for(i=0;i<8;i++)
subjects[i] = new subject();
s = new Scanner(System.in);
}

public void getStudentDetails(){
System.out.println("Enter student name:");
name=s.nextLine();

System.out.println("Enter Student USN:");
usn=s.nextLine();}

public void getMarks(){
int i;
for(i=0;i<8;i++){
System.out.println("Enter marks of subject"+(i+1)+":");
subjects[i].subjectMarks= s.nextInt();
if(subjects[i].subjectMarks>=40&&subjects[i].subjectMarks<=100){
subjects[i].grade=calculateGrade(subjects[i].subjectMarks);}
else{
System.out.println("Invalid Marks. Marks should be between 40 and 100");}
System.out.println("enter credits:");
subjects[i].credits=s.nextInt();
}
}

public int calculateGrade(int marks){
if (marks>=90)
return 10;
else if(marks>=70&&marks<=80)
return 9;
else if(marks>=60&&marks<=70)
return 8;
else if(marks>=50&&marks<=60)
return 7;
else
return 6;
}

public void computeSGPA() {
        int totalscore = 0;
        int totalcred = 0;

        for (int i = 0; i < 8; i++) {
            totalscore += subjects[i].grade * subjects[i].credits;
            totalcred += subjects[i].credits;
        }
        SGPA = (double) totalscore / (double) totalcred;
    }
}

class Stud{
public static void main(String args[]){
Student s1=new Student();

s1.getStudentDetails();

s1.getMarks();
s1.computeSGPA();

System.out.println("Student name:"+s1.name);
System.out.println("Student usn:"+s1.usn);
System.out.println("Student sgpa:"+s1.SGPA);}
}
