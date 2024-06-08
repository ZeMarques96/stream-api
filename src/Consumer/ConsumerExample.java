package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimerNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);                
            }
        };

        numeros.stream().forEach(x -> { 
            if(x % 2 == 0){
                System.out.println(x);
            }}
        );

        numeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                if (t % 2 ==0){
                    System.out.println(t);
                }
            }
            
        });
    }
}
