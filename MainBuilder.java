public class MainBuilder {
 
  public static void main(String[] args){
      Builder builder = Builder.builder()
      .a(1)
      .b("hello")
      .c(2.3)
      .d(true)
      .e('c')
      .build();     

      System.out.println(
          builder.getA()+"  "+
          builder.getB()+"  "+
          builder.getC()+"  "+
          builder.getD()+"  "+
          builder.getE()
      );

  }

}
