public class odd_even_using_bit {
    public static String oddEvenUsingBit(int num){
         if((num & 1) == 0){
            return "Even";
         }else{
            return  "odd";
         }
    }
    public static void main(String[] args) {
        System.out.println(oddEvenUsingBit(3));
    }
}
