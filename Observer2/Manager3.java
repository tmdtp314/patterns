package Observer2;

public class Manager3 implements Crew{

    @Override
    public void update(String msg) {
       System.out.println("Manager3 수신 :" +msg);
        
    }
    
}
