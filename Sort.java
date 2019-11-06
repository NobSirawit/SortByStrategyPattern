import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    private SortInter sortInter;

    public void setSortInter(SortInter sortInter){
        this.sortInter = sortInter;
    }

    public void sortNa(ArrayList<Student> students, String s){
       ArrayList<Student> s1 = sortInter.sortInter(students);
        if(s.equals("m")){
            Collections.sort(s1, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.getScore() > o2.getScore()){
                        return -1;
                    }
                    else if(o1.getScore() < o2.getScore()){
                        return 1;
                    }
                    return 0;
                }


            });
        }
        else if(s.equals("M")){
            Collections.sort(s1, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.getScore() > o2.getScore()){
                        return 1 ;
                    }
                    else if (o1.getScore() < o2.getScore()){
                        return -1;
                    }
                    return 0 ;
                }
            });
        }
        System.out.println("pass : "+ s1.size());
        for(Student k : s1){
            System.out.println(k.getId() + " "+ k.getScore());
        }
    }
}
