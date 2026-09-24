public class count_set_bit_in_num {
   
    public static int countSetBitInNum(int num){
        int count = 0;
        while (num > 0) {
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBitInNum(10));
    }
}