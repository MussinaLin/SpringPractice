package moose.LambdaTest;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UseFoo {
   public static String add(String s, IFoo foo){
       return foo.method(s);
   }

   public static String add2(Integer s, Function<Integer, String> f){
       return f.apply(s);
   }

   public static String add3(String s, UnaryOperator<String> u){
       return u.apply(s);
   }
    public static void main(String[] args) {
        IFoo foo = p -> p + " from lambda";
        String r = UseFoo.add("mussina", foo);
        System.out.println(r);

        Function<Integer, String> f = p -> p + " from Java Function<T,R>";
        r = UseFoo.add2(5000, f);
        System.out.println(r);

        UnaryOperator<String> u = p -> p + " from Java UnaryOperator<T>";
        r = UseFoo.add3("mussina", u);
        System.out.println(r);

    }
}
