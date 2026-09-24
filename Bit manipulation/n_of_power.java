public class n_of_power{
    public static int powerOfN(int num,int pow){
        int ans = 1;
        while(pow > 0){
            if((pow&1)!=0){
                ans = num * ans;
            }
            num *=num;
            pow >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(powerOfN(5,5));
    }
}