package level2;

import java.util.Scanner;
class Check{
    public boolean palin(String  str){
        int i = 0, j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}

public class Palin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        boolean palin = check.palin(scanner.next());
        System.out.println(palin);

    }
}
