package Observer2;

public class Manager2 implements Crew {

    @Override
    public void update(String msg) {
        System.out.println("Manager2 수신 : "+msg);
        
    }
    
}
