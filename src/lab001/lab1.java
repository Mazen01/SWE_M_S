import java.util.Random;

public class lab1 {
    public static void main(String[] args){
        for(int i = 0;i<10;i++){
            Random x = new Random();
            int j = x.nextInt(2);
            double min = 100000;
            double max = 999999;
            int id = (int)Math.floor(Math.random()*(max-min+1)+min);
            double GPA = Math.random()*4;
            GPA = Math.round(GPA*100);
            GPA/=100;
            if(j==1){
                Graduate temp = new Graduate(id,GPA);
                System.out.println("Graduate"+temp.displayStudent());
            }else{
                Undergraduate temp = new Undergraduate(id,GPA);
                System.out.println("Undergraduate"+temp.displayStudent());
            }
        }
    }
}
