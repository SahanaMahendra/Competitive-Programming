public class DecimalToBinary {
    public static void main(String[] args){
        int num=99;
        // method 1: use inbuilt function
        System.out.println(Integer.toBinaryString(num));
        // method 2: Custom Algorithm
        System.out.println(DecimalToBinary.decimalToBinary(num));
    }
        private static String decimalToBinary(int num){
        StringBuilder sb= new StringBuilder();
            if (num==0){
                return "0";
            }
            while(num>0){
            sb.insert(0,num%2);
            num= num/2;
            }
        return sb.toString();
        }
}
