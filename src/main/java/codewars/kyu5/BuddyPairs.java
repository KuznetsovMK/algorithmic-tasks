package codewars.kyu5;

public class BuddyPairs {
    public static void main(String[] args) {
        System.out.println(buddy(381, 4318));
    }

    public static String buddy(long start, long limit) {

        long res1 = 0;
        long res2 = 0;

        for (long i = start; i <= limit; i++) {
            res1 = sum(i); // 76
            if (res1 > i ) {
                res2 = sum(res1 - 1); // 49
                System.out.println(i + " " + res1 + " " + res2);
            }
            if (i == res2 - 1) {
                return String.format("(%d %d)", i, res1 - 1);

            }
        }
        return "Nothing";
    }

    public static long sum(long a) {
        long sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}


//        String res = "Nothing";
//        long res1 = 1;
//        long res2 = 1;
//
//        for (long temp1 = start; temp1 <= limit; temp1++) {
//            long n = temp1;
//            while (n > 1) {
//                for (long j = 2; j < temp1 / 2; j++) {
//                    long p = j;
//                    while (n % j == 0) {
//                        n /= j;
//                        p *= j;
//                    }
//                    res1 *= (p - 1) / (j - 1);
//                    if (n == 1) break;
//                }
//            }
//            res1 -= temp1;
//            long temp2 = res1 - 1;
//            n = temp2;
//
//            while (n > 1) {
//                for (long j = 2; j < temp2 / 2; j++) {
//                    long p = j;
//                    while (n % j == 0) {
//                        n /= j;
//                        p *= j;
//                    }
//                    res2 *= (p - 1) / (j - 1);
//                    if (n == 1) break;
//                }
//            }
//            res2 -= temp2;
//            System.out.println(temp1 + " " + temp2);
//            if (temp1 == res2 - 1) return String.format("(%d %d)", temp1, temp2);
//        }
//
//        System.out.println(res1 + " " + res2);
//        return res;


//        String res = "Nothing";
//        for (long j = start; j <= limit; j++) {
//            System.out.println(" * * * " + j);
//            int sum = 0;
//            int sum2 = 0;
//            for (long i = 1; i < j; i++) {
//                if (j % i == 0) {
//                    sum += i;
//                    System.out.println(i + " " +sum);
//                }
//            }
//            if (start <= sum) {
//                for (int i = 1; i < sum - 1; i++) {
//                    if ((sum - 1) % i == 0) {
//                        sum2 += i;
//                        System.out.println(i + " " + sum2);
//                    }
//                }
//
//            }
//            if ((sum2 - 1) == j) return String.format("(%d %d)", j, sum - 1);
//        }
//
//        return res;
//    }
//}
