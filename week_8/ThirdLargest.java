
public class ThirdLargest {
    public static void main(String[] args) {
        int largest = 0;
        int thirdLargest = 0;
        int secondLargest = 0;
        int[] arr = {12, 45, 14, 21, 66, 34, 32};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] != largest && arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if (arr[i] != largest && arr[i] != secondLargest && arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);
    }
}