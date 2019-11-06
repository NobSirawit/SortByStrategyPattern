import java.util.ArrayList;

public class ByAvg implements SortInter {
    @Override
    public ArrayList<Student> sortInter(ArrayList<Student> students) {
        ArrayList<Student> pass = new ArrayList<>();
        double total = 0 ;
        for(Student k: students){
            total += k.getScore();
        }
        double avg;
        avg = total/students.size();
        for(Student k: students){
            if(k.getScore()>=avg){
                pass.add(k) ;
            }
        }
        return pass;
    }
}
