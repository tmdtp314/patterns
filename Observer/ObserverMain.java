package Observer;
public class ObserverMain {
    public static void main(String[] args){
        PlayController playController = new PlayController();
        Observer ob1 = new ObserverA(playController);
        Observer ob2 = new ObserverB(playController);

        playController.setFlag(true);
        playController.deleteObserver(ob1);
        playController.setFlag(false);
    }
}
