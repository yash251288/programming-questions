public class ConsecutiveCountInBinary {

    public static void main(String[] s){
        StringBuilder binary= new StringBuilder();
        binary = convertToBinary(binary,777);
        System.out.println(binary);
        System.out.println(countConsecutives(binary));
        //110001110001111000000
        //printBinaryform(13);
    }

    public static StringBuilder convertToBinary(StringBuilder temp, int n){

        if(n<=1){
           temp.append(1) ;
        }
        else {
            int reminder = n % 2;
            convertToBinary(temp, n >> 1);
            temp.append(reminder);
        }
        return temp;
    }

    public static int countConsecutives(StringBuilder s){
        int count=0;
        int maxValue=0;
        for(int i=0;i<s.length();i++){
                if (Character.getNumericValue(s.charAt(i)) == 1) {
                    count += 1;
                    maxValue = Math.max(maxValue,count);
            }
                else count =0;
        }
        return maxValue;
    }
}
