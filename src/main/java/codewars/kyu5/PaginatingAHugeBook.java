package codewars.kyu5;

/**
 * Johnny is working as an intern for a publishing company, and was tasked with cleaning up old code.
 * He is working on a program that determines how many digits are in all of the page numbers in a book
 * with pages from 1 to n (inclusive).
 *
 * For example, a book with 4 pages has 4 digits (one for each page) while a 12-page book has 15
 * (9 for 1-9, plus 2 each for 10, 11, 12).
 *
 * Johnny's boss, looking to futureproof, demanded that the new program be able to handle books up
 * to 400,000,000,000,000,000 pages.
 */

public class PaginatingAHugeBook {

    public static void main(String[] args) {
        long pages = 100;
        System.out.println("Количество страниц: " + pages + " - Количество знаков: " + pageDigits(pages));
    }

    public static long pageDigits(long pages) {
        long len = String.valueOf(pages).length();
        if (len == 1) {
//            System.out.println("Количество страниц занимающих " + len + " знак: " + pages);
            return pages;
        }
        long a = (long) Math.pow(10, len - 1);
        long b = pages - (a - 1);
        long res = b * len;
//        System.out.println("Количество страниц занимающих " + len + " знака: " + res);
        return res + pageDigits(pages - b);
    }
}
