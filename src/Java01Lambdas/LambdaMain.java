package Java01Lambdas;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        //basic lambda
        SAM singleAbstractInterface = (a,b) -> a+b;
        SAM singleAbstractInterface1 = (a,b) -> a-b;
        System.out.println(singleAbstractInterface.addFunction(2,5));

        //method reference


        Function<Integer,Float> addFunctionLambda = (a) -> Float.valueOf(a+2);
        System.out.println(addFunctionLambda.apply(10));
        //Imperative way - java way

        //Declarative  using functional programming
        Predicate<Integer[]> isDuplicateContentAvailable = array -> Arrays.stream(array).collect(Collectors.toSet()).size() < array.length;
        Integer[] a = {1,2,3,4,5};
        System.out.println("duplicate check : " + isDuplicateContentAvailable.test(a));

        Predicate<Integer[]> isContainNumber2 = array -> Arrays.stream(array).anyMatch( element -> element == 2);
        System.out.println("is contain number 2 : " + isContainNumber2.test(a));

        System.out.println("Checking duplicate check , number check :");
        System.out.println("Both valid ? : "+isContainNumber2.and(isDuplicateContentAvailable).test(a));
        System.out.println("Anyone valid ? : "+isContainNumber2.or(isDuplicateContentAvailable).test(a));

    }


}
