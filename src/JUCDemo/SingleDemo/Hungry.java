package JUCDemo.SingleDemo;

public class Hungry {

    private Hungry(){

    }
    private final static Hungry HUNGRY=new Hungry();

    public static Hungry getInstance(){
        return  HUNGRY;
    }
}
