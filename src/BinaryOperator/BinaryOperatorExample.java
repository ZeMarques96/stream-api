package BinaryOperator;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        
        int resultado = numeros.stream().reduce(0, (x, y) -> x + y);

        System.out.println();
        System.out.println(resultado);
    }
}
