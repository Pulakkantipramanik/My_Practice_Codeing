public class covertzerotofive {

        int convertfive(int num) {
            // Your code here
            if (num == 0) {
                return 5;
            }
            int digit,result =0,place =1 ;
            while(num >  0){
                digit=num%10 ;
                if(digit==0){
                    digit =5;
                }
                result = digit*place +result;
                place*=10;
                num = num/10;

            }
            return result;
        }

    public static void main(String[] args) {
        covertzerotofive five = new covertzerotofive();
        int convert =five.convertfive(5);
        System.out.println(convert);
    }
}
