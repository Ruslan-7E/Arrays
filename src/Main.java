public class Main {
    public static void main(String[] args) {
        // 1st task
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        double[] fractions = {1.57, 7.654, 9.986};

        char[] letters ={'R', 'M', 'I'};

        // 2nd task
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int j = 0; j < fractions.length; j++) {
            System.out.print(fractions[j]);
            if (j < fractions.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int k = 0; k < letters.length; k++) {
            System.out.print(letters[k]);
            if (k < letters.length - 1) {
                System.out.print(", ");
            }
        }

        // 3rd task
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int j = 2; j >= 0; j--) {
            System.out.print(fractions[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int k = 2; k >= 0; k--) {
            System.out.print(letters[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }

        // 4th task
        // Кароче, так и не понял, как это всё правильно вывести
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + 1 + ", ");
            }
        }
    }
}