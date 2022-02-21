package Observer;

import java.util.ArrayList;
import java.util.List;

class PlayController implements Publisher{ // Events Object
    private List<Observer> observers = new ArrayList<>();
    private boolean play;
    private Observer myOb;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);    // List type - add values
    
    }
    @Override
    public void deleteObserver(Observer o) {
       observers.remove(o);
        
    }

    @Override
    public void notifyObservers() {
       for(int i=0;i<observers.size();i++){
        observers.get(i).notify(play);
       }
        
    }

    public void setFlag(boolean play){
        this.play=play;
        notifyObservers();
    }
    public boolean getFlag(){
        return play;
    }


}