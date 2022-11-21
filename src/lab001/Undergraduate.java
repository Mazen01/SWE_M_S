public class Undergraduate extends Student{
private String status;
    public Undergraduate(int id, double gpa){
        super(id,gpa);
        if (gpa>=3) {
            status = "honor ";
        }
        else if (gpa>=2){
            status = "good  ";
        }
        else {
            status = "probation ";
        }
    }
    @Override
    public String getStatus() {
        return status;
    }
}
