import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
      String input = "001011";
      System.out.println(Arrays.toString(minOperations(input)));
    }
  // Result: [11, 8, 5, 4, 3, 4]

    public static int[] minOperations(String input){
        String[] inputArray = input.split("");
        int[] result = new int[inputArray.length];
        for(int inputIndex = 0; inputIndex < inputArray.length; inputIndex++){
            if(Integer.valueOf(inputArray[inputIndex]) == 1){
                for(int i = 0; i < inputArray.length; i++){
                    if(inputIndex != i){
                        result[i] += Math.abs(inputIndex - i);
                    }
                }
            }
        }
        return result;
    }
}
