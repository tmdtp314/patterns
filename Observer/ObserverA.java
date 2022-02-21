package Observer;

public class ObserverA implements Observer{
    private boolean bPlay;
    private Publisher publisher; // interface Publisher

    public ObserverA(Publisher publisher){
        this.publisher=publisher;
        publisher.addObserver(this);
    }

    @Override
    public void notify(boolean play) {
        this.bPlay=play;
        myActionControl();
        
    }
    public void myActionControl(){
        if(bPlay){
            System.out.println("start");
        }
        else System.out.println("Stop");
    }

}