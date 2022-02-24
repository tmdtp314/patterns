package Observer2;

public class Manager1 implements Crew {

    @Override
    public void update(String msg) {
        System.out.println("Manager1 수신 : "+msg);        
    }

    
}
