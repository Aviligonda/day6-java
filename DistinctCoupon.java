public class DistinctCoupon {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 6, 4, 3,6,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if(i==j)
                        System.out.println(+arr[i]);
                    break;
                }
            }

        }
    }
}
