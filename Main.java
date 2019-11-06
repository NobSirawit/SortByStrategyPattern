import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        ArrayList<Student> students = new ArrayList<>() ;
        Student s1 = new Student("6110406244",90.0);
        Student s2 = new Student("6156845664",50.0);
        Student s3 = new Student("6458412156",55.50);
        Student s4 = new Student("7045186556",60.85);
        Student s5 = new Student("4512456587",75.51);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.equals("A")){
            System.out.println("---Sort By Average---");
            Sort sort = new Sort();
            sort.setSortInter(new ByAvg());
            System.out.println("M for Max to Min , m for Min to Max");
            String ch = sc.next() ;
            sort.sortNa(students, ch);
        }
        else if ( a.equals("X")){
            System.out.println("---Sort By Standard Input---");
            System.out.println("Please Enter Standard");
            Double stand = sc.nextDouble();
            System.out.println("M for Max to Min , m for Min to Max");
            String ch = sc.next() ;
            Sort sort = new Sort();
            sort.setSortInter(new ByInput(stand));
            sort.sortNa(students,ch);

        }

    }
}
