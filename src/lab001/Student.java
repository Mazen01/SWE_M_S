//lab1



public abstract class Student {
    private int id;
    private double gpa;

    public Student (int id,double gpa){
        this.id =id;
        this.gpa =gpa;
    }


    public abstract String getStatus();
    public final String displayStudent(){
        String std = new String();
        //std = std + this.getClass().getName();
        std = std + " id>>" + String.valueOf(id);
        std = std + " gpa>> " + String.valueOf(gpa);
        std = std + " Status>> " + this.getStatus();

        return std;


    }

}

