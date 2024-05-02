package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,15);

        desafio1(numeros);
        desafio2(numeros);
        desafio3(numeros);
        desafio4(numeros);
        desafio5(numeros);
        desafio6(numeros);
        desafio7(numeros);
        desafio8(numeros);
        desafio9(numeros);
        desafio10(numeros);
        desafio11(numeros);
        desafio12(numeros);
        desafio13(numeros);
        desafio14(numeros);
        desafio15(numeros);
        desafio16(numeros);
        desafio17(numeros);
        desafio18(numeros);
        desafio19(numeros);

    }

    public static void desafio1(List<Integer> numeros) {
        System.out.println("Desafio 1 - Mostre a lista na ordem crescente");
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();
        System.out.println(numerosOrdenados);
        System.out.println("--------------------------------------------");
    }

    public static void desafio2(List<Integer> numeros) {
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista");
        int somaPares = numeros.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(somaPares);
        System.out.println("--------------------------------------------");
    }

    public static void desafio3(List<Integer> numeros) {
        System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos");
        boolean isPositivos = numeros.stream().allMatch(num -> num > 0);
        System.out.println(isPositivos);
        System.out.println("--------------------------------------------");
    }

    public static void desafio4(List<Integer> numeros) {
        System.out.println("Desafio 4 - Remova todos os valores ímpares:");
        List<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(numerosPares);
        System.out.println("--------------------------------------------");
    }

    public static void desafio5(List<Integer> numeros) {
        System.out.println("Desafio 5 - Calcule a média dos números maiores que 5:");
        List<Integer> numerosMaioresQue5 = numeros.stream().filter(num -> num > 5).toList();
        System.out.println(numerosMaioresQue5);
        int soma = numerosMaioresQue5.stream().mapToInt(Integer::intValue).sum();
        int qtd = numerosMaioresQue5.size();
        double media = (double) soma / qtd;
        System.out.println(media);
        System.out.println("--------------------------------------------");
    }

    public static void desafio6(List<Integer> numeros) {
        System.out.println("Desafio 6 - Verificar se a lista contém algum número maior que 10:");
        boolean isExiteValorMaiorQue10 = numeros.stream().anyMatch(num -> num > 10);
        System.out.println(isExiteValorMaiorQue10);
        System.out.println("--------------------------------------------");
    }

    public static void desafio7(List<Integer> numeros) {
        System.out.println("Desafio 7 - Encontrar o segundo número maior da lista:");
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();
        int indiceSegundoMaior = numerosOrdenados.size() - 2;
        System.out.println(numerosOrdenados.get(indiceSegundoMaior));
        System.out.println("--------------------------------------------");
    }

    public static void desafio8(List<Integer> numeros) {
        System.out.println("Desafio 8 - Somar os dígitos de todos os números da lista:");
        System.out.println(numeros.stream().mapToInt(Integer::intValue).sum());
        System.out.println("--------------------------------------------");
    }

    public static void desafio9(List<Integer> numeros) {
        System.out.println("Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):");
        int somaNumerosDistintos = numeros.stream().distinct().mapToInt(Integer::intValue).sum();
        int somaNumeros = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(somaNumerosDistintos == somaNumeros);
        System.out.println("--------------------------------------------");
    }

    public static void desafio10(List<Integer> numeros) {
        System.out.println("Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5");
        List<Integer> numerosMultiplos = numeros.stream().filter(n -> n % 2 != 0 && n % 3 == 0 || n % 5 == 0).toList();
        System.out.println(numerosMultiplos);
        System.out.println("--------------------------------------------");
    }

    public static void desafio11(List<Integer> numeros) {
        System.out.println("Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:");
        int soma = numeros.stream().map(n -> n * n).mapToInt(Integer::intValue).sum();
        System.out.println(soma);
        System.out.println("--------------------------------------------");
    }

    public static void desafio12(List<Integer> numeros) {
        System.out.println("Encontre o produto de todos os números da lista:");
        int produto = numeros.stream().reduce(1, (acc, num) -> acc * num);
        System.out.println(produto);
        System.out.println("--------------------------------------------");
    }

    public static void desafio13(List<Integer> numeros) {
        System.out.println("Desafio 13 - Filtrar os números que estão dentro de um intervalo:");
        List<Integer> numerosFiltrados = numeros.stream().filter(n -> n > 3 && n < 8).toList();
        System.out.println(numerosFiltrados);
        System.out.println("--------------------------------------------");
    }

    public static void desafio14(List<Integer> numeros) {
        System.out.println("Desafio 14 - Encontre o maior número primo da lista:");

        OptionalInt maiorNumeroPrimo = numeros.stream().filter(n -> {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }).mapToInt(Integer::intValue).max();
        System.out.println(maiorNumeroPrimo.isPresent() ? maiorNumeroPrimo.getAsInt() : "Nao tem numero primo");
        System.out.println("--------------------------------------------");
    }

    public static void desafio15(List<Integer> numeros) {
        System.out.println("Desafio 15 - Verifique se a lista contém pelo menos um número negativo:");
        System.out.println(numeros.stream().anyMatch(n -> n < 0));
        System.out.println("--------------------------------------------");
    }

    public static void desafio16(List<Integer> numeros) {
        System.out.println("Desafio 16 - Agrupe os números em pares e ímpares:");
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();

        System.out.println("Numeros pares:" + numerosPares);
        System.out.println("Numeros impares:" + numerosImpares);
        System.out.println("--------------------------------------------");
    }

    public static void desafio17(List<Integer> numeros) {
        System.out.println("Desafio 17 - Filtrar os números primos da lista:");

        List<Integer> numerosPrimo = numeros.stream().filter(n -> {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }).toList();
        System.out.println(numerosPrimo);
        System.out.println("--------------------------------------------");
    }

    public static void desafio18(List<Integer> numeros) {
        System.out.println("Desafio 18 - Verifique se todos os números da lista são iguais:");
        int n1 = numeros.get(0);
        System.out.println(numeros.stream().allMatch(n -> n1 == n));
        System.out.println("--------------------------------------------");
    }

    public static void desafio19(List<Integer> numeros) {
        System.out.println("Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:");
        int soma = numeros.stream().reduce(0,(acc,n)-> acc+= n%3==0 && n%5==0?n:acc );
        System.out.println(soma);
        System.out.println("--------------------------------------------");
    }
}
