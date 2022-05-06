public class Max_Min_inArray {
    public  int [] Func(int[] numbers) {

        if (numbers.length == 0) {
            throw new IllegalArgumentException("Your Array is empty");
        } else {

            int maxValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                }
            }

            int minValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
            }
            return new int[]{maxValue, minValue};
        }
    }

    }
