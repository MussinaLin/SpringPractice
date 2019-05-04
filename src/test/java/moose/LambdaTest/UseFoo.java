package moose.LambdaTest;

public class UseFoo {
   public static String add(String s, IFoo foo){
       return foo.method(s);
   }

    public static void main(String[] args) {
        IFoo foo = p -> p + " from lambda";
        String r = UseFoo.add("mussina", foo);
        System.out.println(r);
    }
}
