package easy;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                oneCount++;
            } else {
                zeroCount++;
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < oneCount - 1; i++){
            builder.append("1");
        }
        for(int i = 0; i < zeroCount; i++){
            builder.append("0");
        }
        builder.append("1");
        return builder.toString();
    }
}
