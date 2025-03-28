package codewars.kyu5;

import java.math.BigInteger;


/**
 The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum
 of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
 https://www.codewars.com/kata/559a28007caad2ac4e000083
 */

public class PerimeterOfSquaresInARectangle {

    public static void main(String[] args) {
        BigInteger value = BigInteger.valueOf(30);
        System.out.println(perimeter(value));
    }


    public static BigInteger perimeter(BigInteger n) {


        BigInteger first = BigInteger.valueOf(1), second = BigInteger.valueOf(1);
        BigInteger next;
        BigInteger sum = BigInteger.valueOf(2);

        for (int i = 1; i < n.intValue(); i++) {
            next = first.add(second);
            sum = sum.add(next);

            first = second;
            second = next;
            System.out.println("step: " + i + ", first " + first + ", second " + second + ", sum " + sum);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

}
