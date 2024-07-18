package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio17 {
    /* Desafio 17 - Filtrar os números primos da lista:
    Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console. */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> ehPrimo = numero -> {
            if (numero <= 1) return false;
            if (numero == 2) return true;
            if (numero % 2 == 0) return false;
            for (int i = 3; i * i <= numero; i += 2) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        };

        List<Integer> numerosPrimos = numeros.stream()
                .filter(ehPrimo)
                .toList();

        System.out.println(numerosPrimos);
    }
}
