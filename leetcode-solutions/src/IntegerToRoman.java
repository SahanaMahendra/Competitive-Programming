public class IntegerToRoman {

    public static String intToRoman(int num) {
        int[]    val={1000, 900, 500, 400, 100,  90,   50, 40,  10,    9,   5,    4,   1};
        String[] str={"M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};
        String res="";
        for(int i=0; i<val.length; i++){
            while(num>=val[i]){
                num-=val[i];
                res+=str[i];
            }
        }
        return res;
   }

   public static void main(String[] args){
        String s="sahana";
        System.out.print(IntegerToRoman.intToRoman(58));
        String[] arr= s.split("a");
   }
}
