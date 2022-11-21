public class Graduate extends Student{
    private String status;
    public Graduate(int id, double gpa){
        super(id,gpa);
        if (gpa>=3) {
            status = "good ";
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

