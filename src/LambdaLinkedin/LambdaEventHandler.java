package LambdaLinkedin;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class LambdaEventHandler {
    public static void main(String[] args) {

        IntFunction<String> intToString=Integer::toString;

        System.out.println(  intToString.apply(2345).length());

        UnaryOperator<String> maker= "Hello, "::concat;
        System.out.println(   maker.apply("Esra"));

    }

    public void yazdir(){
        Consumer runnable = System.out::println;
runnable.accept("aer");

    }








}
