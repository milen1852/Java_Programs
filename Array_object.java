import java.util.Scanner;

class Student{  
    String name;
    int rollno;
    int marks;
}

public class Array_object{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        Student s1 = new Student();
        s1.name = "Harsh";
        s1.rollno = 12;
        s1.marks = 88;

        Student s2 = new Student();
        s2.name = "Aswin";
        s2.rollno = 21;
        s2.marks = 97;

        Student s3 = new Student();
        s3.name = "Samantha";
        s3.rollno = 69;
        s3.marks = 34;

        Student students[] = new Student[limit];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
        sc.close();
    }
}