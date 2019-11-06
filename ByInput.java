import java.util.ArrayList;

public class ByInput implements SortInter {
    private double standard;
    public ByInput(double standard){
        this.standard=standard;
    }

    @Override
    public ArrayList<Student> sortInter(ArrayList<Student> students) {
        ArrayList<Student> pass1 = new ArrayList<>() ;
        for(Student k : students){
            if(k.getScore()>=standard){
                pass1.add(k);
            }
        }
        return pass1 ;
    }
}
