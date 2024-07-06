public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        int carry=0;
        int lenA=a.length()-1;
        int lenB=b.length()-1;
        while(lenA>=1 || lenB>=1 || carry==1){
            int intA = lenA>=1? a.charAt(lenA) -'0' : 0;
            int intB = lenB>=1? a.charAt(lenB) -'0' : 0;
            int sum= intA + intB + carry;
            sb.append(sum%2);
            carry= sum/2;
            lenA--;
            lenB--;

        }
        return sb.reverse().toString();
    }

}
