package org.example;

public class Main {
   // ამოცანა 1 - ხმოვანი ასოების დათვლა
    /*
     public static void main(String[] args) {

        VowelCounterImpl vowelCounter = new VowelCounterImpl();

        vowelCounter.countVowel("Hello LeLa");     //  ამ სტრიქონში არის 4 ხმოვანი
        vowelCounter.countVowel("I love testing");  //  ამ სტრიქონში არის 5 ხმოვანი
    }
    */


    // ამოცანა 2 - ინტერფეისი
   /* public static void main(String[] args) {
        SymbolReplacer replacer = new SymbolReplacer();
        replacer.replaceSymbolA("Lela"); // Output: Replace A with Z: Lelz
        replacer.replaceSymbolB("Gabelaia"); // Output: Replace B with W: Gawelaia
    }
*/


    // ამოცანა 3- მასივის დალაგება ზრდადობით

        public static void main(String[] args) {
            int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};


            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.print("Sorted Array: ");
            for (int num : arr) {
                System.out.print(num + " ");

            }
        }


}
