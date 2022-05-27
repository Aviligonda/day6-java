public class ReverseNumber {
    public static void main(String[] args) {
        int n=253, reverse=0;
        System.out.println("Before Reversing Number is ="+n);
        for (; n!=0 ; n=n/10) {
            int remainder=n%10;
            reverse=(reverse*10)+remainder;
        }
        System.out.println("After Reverse Number is ="+reverse);
    }
}
