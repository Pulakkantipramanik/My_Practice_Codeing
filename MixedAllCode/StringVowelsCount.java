import java.util.Scanner;

public class StringVowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String str=sc.next();
        str=str.toLowerCase();
        char abc[] = str.toCharArray();
        int vowelcount=0;
        System.out.println("total vowel charecter in this above string ");
        for (int i = 0; i < str.length(); i++) {
            if (abc[i] == 'a' || abc[i] == 'e' || abc[i] == 'i' || abc[i] == 'o' || abc[i] == 'u') {
                System.out.println(abc[i]);
                vowelcount++;
            }
        }
        System.out.println("vowel present in this word "+ vowelcount);


    }

}
