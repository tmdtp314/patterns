package Observer;

interface Publisher { // Observer pattern is a sort of design pattern by 
                        // registering observers to the list of event object let observer know the changes of certain event when certain event is occured 
                        // and make them conducts proper perfomances predecisioned event object created
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();

}


