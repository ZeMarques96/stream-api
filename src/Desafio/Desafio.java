package Desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Desafio {

    public static void main(String[] args) {

        // Lista de desafios realizada durante o bootcamp do Santander https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // desafio 1
        List<Integer> desafio1 = numeros.stream().sorted().toList();

        // desafio 2
        Integer desafio2 = numeros.stream().filter(x -> x % 2 == 0).reduce(0, (x,y) -> x+y );

        //desafio 3
        boolean desafio3 = numeros.stream().allMatch( x-> x > 0);

        // desafio 4
        List<Integer> desafio4 = numeros.stream().filter( x -> x % 2 == 0).toList();

        // desafio 5
        OptionalDouble desafio5 = numeros.stream().filter( x -> x > 5).mapToInt(Integer::intValue).average();

        // desafio 6
        boolean desafio6 = numeros.stream().allMatch(x -> x > 10);

        // desafio 7
        Optional<Integer> desafio7 = numeros.stream().sorted((a, b) -> b - a).skip(1).findFirst();

        // desafio 8
        int desafio8 = numeros.stream().reduce(0, (x, y) -> x + y);

        //desafio 9
        boolean desafio9 = numeros.stream().distinct().toList().size() != numeros.size();

        // desafio 10
        List<Integer> desafio10 = numeros.stream().filter(x -> x % 2 != 0).filter(x -> x % 3 == 0 || x % 5 == 0).toList();

        // desafio 11
        int desafio11 = numeros.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);

        // desafio 12
        int desafio12 = numeros.stream().reduce(1, (x,y) -> x * y);

        //desafio 13
        List<Integer> desafio13 = numeros.stream().filter(x -> x > 5 && x < 10).toList();

        // desafio 14
        Optional<Integer> desafio14 = numeros.stream().filter(x -> x > 1).filter( x -> {
            for( int i = 2; i <= Math.sqrt(x); i++){
                if(x % i == 0){
                    return false;

                }
            }
            return true;
        }).sorted((a, b) -> b - a).findFirst();

        // desafio 15
        boolean desafio15 = numeros.stream().anyMatch(n -> n < 0);

        //desafio 16 
        List<Integer> desafio16Pares = new ArrayList<>();
        List<Integer> desafio16Impares = new ArrayList<>();

        numeros.forEach(x -> {
            if (x % 2 == 0) {
                desafio16Pares.add(x);
            } 
            else {
                desafio16Impares.add(x);
            }
        });

        //desafio 17
        List<Integer> desafio17 = numeros.stream().filter(x -> x > 1).filter( x -> {
            for( int i = 2; i <= Math.sqrt(x); i++){
                if(x % i == 0){
                    return false;

                }
            }
            return true;
        }).toList();

        // desafio 18
        boolean desafio18 = numeros.stream().distinct().count() == 1;

        // desafio 19
        int desafio19 = numeros.stream().filter(x -> x % 3 == 0 && x % 5 == 0 ).mapToInt(Integer::intValue).sum();



        System.out.println();
        System.out.println("Desafio 1: " + desafio1);

        System.out.println();
        System.out.println("Desafio 2:" + desafio2);
        
        System.out.println();
        System.out.println("Desafio 3:" + desafio3);

        System.out.println();
        System.out.println("Desafio 4:" + desafio4);

        System.out.println();
        System.out.println("Desafio 5:" + desafio5.getAsDouble());

        System.out.println();
        System.out.println("Desafio 6:" + desafio6);

        System.out.println();
        System.out.println("Desafio 7: " + desafio7);

        System.out.println();
        System.out.println("Desafio 8: " + desafio8);

        System.out.println();
        System.out.println("Desafio 9: " + desafio9);

        System.out.println();
        System.out.println("Desafio 10: " + desafio10);

        System.out.println();
        System.out.println("Desafio 11: " + desafio11);

        System.out.println();
        System.out.println("Desafio 12: " + desafio12);

        System.out.println();
        System.out.println("Desafio 13: " + desafio13);

        System.out.println();
        System.out.println("Desafio 14: " + desafio14.get());

        System.out.println();
        System.out.println("Desafio 15: " + desafio15);
        
        System.out.println();
        System.out.println("Desafio 16: " + desafio16Pares + desafio16Impares);
        
        System.out.println();
        System.out.println("Desafio 17: " + desafio17);

        System.out.println();
        System.out.println("Desafio 18: " + desafio18);

        System.out.println();
        System.out.println("Desafio 19: " + desafio19);
        




    }

}
