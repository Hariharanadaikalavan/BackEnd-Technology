import java.util.*;
public class Asccendingorderfforname {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String str = sc.nextLine();
        int i, j;
        char ch[] = str.toCharArray();
        System.out.println("If you want to sort in Ascending type \"<\" otherwise type \">\"");
        String sw = sc.next();

        switch (sw) {
            case "<": {
                for (j = 0; j < ch.length; j++) {
                    for (i = j + 1; i < ch.length; i++) {
                        if (ch[i] < ch[j]) {
                            char temp = ch[i];
                            ch[i] = ch[j];
                            ch[j] = temp;
                        }
                    }
                }
                for (int k = 0; k < ch.length; k++) {  //This loop is responsible for printing the sorted values 
                    System.out.print(ch[k] + "->");
                }
                break;
            }
            case ">": {
                for (j = 0; j < ch.length; j++) {
                    for (i = j + 1; i < ch.length; i++) {
                        if (ch[i] > ch[j]) {
                            char temp = ch[i];
                            ch[i] = ch[j];
                            ch[j] = temp;
                        }
                    }
                }
                for (int k = 0; k < ch.length; k++) {
                    System.out.print(ch[k] + "<-");
                }
                break;
            }
            default: {
                System.out.println("Please enter \"<\" or \">\"");
            }
        }
    }
}
