public class Student {
    private String id;
    private double score;

    public Student(String id, double score){
        this.id=id;
        this.score=score;
    }
    public double getScore(){
        return  score ;
    }
    public String getId(){
        return  id ;
    }
}
