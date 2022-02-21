import javax.swing.text.StyledEditorKit.BoldAction;

public class Builder{ // chaining method
    private int a;
    private String b;
    private double c;
    private boolean d;
    private char e;
    public static BuilderForBuilder builder(){

        return new BuilderForBuilder();
    }

    public int getA(){
        return a;
    }
    public String getB(){
        return b;
    }
    public Double getC(){
        return c;
    }
    public Boolean getD(){
        return d;
    }
    public char getE(){
        return e;
    }

    static class BuilderForBuilder{
        int a;
        String b;
        double c;
        boolean d;
        char e;

        BuilderForBuilder a(int a){ // create constructor with default access modifier. Replace 'setter' methods
            this.a=a;               // default access modifier can approach instances, variables, objects only within same package.
            return this;
        }
        BuilderForBuilder b(String b){
            this.b=b;
            return this;
        }
        BuilderForBuilder c(double c){
            this.c=c;
            return this;
        }
        BuilderForBuilder d(boolean d){
            this.d=d;
            return this;
        }
        BuilderForBuilder e(char e){
            this.e=e;
            return this;
        }
        //create an object of Build
        Builder build(){
        Builder bfb = new Builder();
        bfb.a=this.a;
        bfb.b=this.b;
        bfb.c=this.c;
        bfb.d=this.d;
        bfb.e=this.e;
        return bfb;
        }
    }
}
