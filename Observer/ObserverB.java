package Observer;


public class ObserverB implements Observer{
    private boolean bPlay;

    public ObserverB(Publisher publisher){
        publisher.addObserver(this);
    }
    @Override
    public void notify(boolean play) {
        this.bPlay=play;
        myActControl();        
    }
    public void myActControl(){
        if(bPlay) System.out.println("start");
        else System.out.println("Stop");
    }
}