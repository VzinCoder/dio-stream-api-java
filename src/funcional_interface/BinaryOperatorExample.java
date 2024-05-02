package funcional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer num1, Integer num2) {
              return num1 + num2;
            }
          };

         System.out.println(numeros.stream().reduce(0,somar)); 
    }
}
