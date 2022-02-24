package Observer2;

public interface TASK {
    void subscribe(Crew crew);
    void unsubscribe(Crew crew);
    void notifyCrew(String msg);
}
