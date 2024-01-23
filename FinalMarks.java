import CIE.Internals;

import SEE.External;

import java.util.Scanner;



public class FinalMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter the number of students: ");

        int n = scanner.nextInt();



        Internals[] cieStudents = new Internals[n];

        External[] seeStudents = new External[n];



        // Input CIE marks

        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for CIE of student " + (i + 1));

            System.out.print("USN: ");

            String usn = scanner.next();

            System.out.print("Name: ");

            String name = scanner.next();

            System.out.print("Semester: ");

            int sem = scanner.nextInt();



            int[] cieMarks = new int[5];

            System.out.print("Enter CIE marks for 5 courses: ");

            for (int j = 0; j < 5; j++) {

                cieMarks[j] = scanner.nextInt();

            }



            cieStudents[i] = new Internals(usn, name, sem, cieMarks);

        }



        // Input SEE marks

        for (int i = 0; i < n; i++) {

            System.out.println("Enter details for SEE of student " + (i + 1));

            System.out.print("USN: ");

            String usn = scanner.next();

            System.out.print("Name: ");

            String name = scanner.next();

            System.out.print("Semester: ");

            int sem = scanner.nextInt();



            int[] seeMarks = new int[5];

            System.out.print("Enter SEE marks for 5 courses: ");

            for (int j = 0; j < 5; j++) {

                seeMarks[j] = scanner.nextInt();

            }



            seeStudents[i] = new External(usn, name, sem, seeMarks);

        }



        // Displaying final marks

        System.out.println("\nFinal Marks of Students:");

        for (int i = 0; i < n; i++) {

            System.out.println("\nDetails of Student " + (i + 1));

            System.out.println("USN: " + cieStudents[i].usn);

            System.out.println("Name: " + cieStudents[i].name);

            System.out.println("Semester: " + cieStudents[i].sem);

            System.out.println("CIE Marks: ");

            for (int j = 0; j < 5; j++) {

                System.out.print(cieStudents[i].internalMarks[j] + " ");

            }

            System.out.println("\nSEE Marks: ");

            for (int j = 0; j < 5; j++) {

                System.out.print(seeStudents[i].seeMarks[j] + " ");

            }

        }

    }

}