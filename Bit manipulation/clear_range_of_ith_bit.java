public interface clear_range_of_ith_bit {
    public static int clearRangeOfIthBit(int num,int sIndex,int lLast){
        int a = (1<<sIndex) -1;
        int b = (~0)<<(lLast +1);
        int bitMask = a | b;

        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfIthBit(10, 2, 7));
    }
}
