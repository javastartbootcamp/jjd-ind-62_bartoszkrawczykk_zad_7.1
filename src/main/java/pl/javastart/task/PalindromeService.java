package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        boolean palindrom = false;
        if ((array == null) && ((array.length % 2) == 0)) {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (array.length - 1) / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}