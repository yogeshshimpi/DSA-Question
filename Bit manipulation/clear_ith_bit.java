public class clear_ith_bit {
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 2));
    }
}
