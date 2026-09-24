public class update_ith_bit {  
        public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num&bitMask;
    }
   public static int setIthBith(int num,int i){
        int bitMask = 1<<i;
        return num|bitMask;
    }
    public static int update_ith_bit(int num,int i,int bit){
        
        if(bit!=0){
            return setIthBith(num,i);
        }else{
            return clearIthBit(num,i);
        }
       
    }
    public static void main(String[] args) {
        System.out.println(update_ith_bit(12, 2, 1));
    }
}
