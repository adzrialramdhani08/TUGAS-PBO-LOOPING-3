public class looping {
    public static void main(String[] args) {
        // 1. Saya semangat belajar java
        System.out.println("Saya semangat belajar Java");

        // 2. Looping deret angka: 2 4 6 8 10 10
        System.out.println("Deret angka 2 4 6 8 10 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
            if (i == 10) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 3. Looping deret angka: 9 6 3 0 -3 -6
        System.out.println("Deret angka 9 6 3 0 -3 -6:");
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Looping perkalian
        System.out.println("Perkalian:");
        int multiplier = 5;
        for (int i = 6; i <= 10; i++) {
            System.out.println(multiplier + " x " + i + " = " + (multiplier * i));
        }

        // 5. Looping deret angka: 1 3 6 10 15 21 28 36
        System.out.println("Deret angka 1 3 6 10 15 21 28 36:");
        int sum = 0;
        for (int i = 1; i <= 8; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}