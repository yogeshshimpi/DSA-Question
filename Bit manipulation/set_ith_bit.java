public class set_ith_bit {
    public static int setIthBith(int num,int i){
        int bitMask = 1<<i;
        return num|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBith(3,2));
    }
}
