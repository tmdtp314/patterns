package Observer2;

public class Main {
    public static void main(String[] args){
        SMFACTORY_SW sw = new SMFACTORY_SW();
        Crew manager1 = new Manager1();
        Crew manager2 = new Manager2();
        Crew manager3 = new Manager3();

        sw.subscribe(manager1);
        sw.subscribe(manager2);
        sw.subscribe(manager3);

        sw.createProject();

    }
}
