import java.util.Scanner;

public class Main {
    public static void main(String []args){

        System.out.println("Введите массив строк состоящий из 9 элементов");
        String[] strOne = new String[9];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<9; i++) {
            strOne[i] = in.next();
        }
        System.out.println("Массив получился таковым:");
        for (int i=0; i<9; i++){
            System.out.println("["+(i+1)+"]="+strOne[i]+";");
        }
        System.out.println("Введите строку которая будет содержать в себе элементы из 1-го массива (не больше 9) разделенные пробелом");
        String[] strTwo = new Scanner(System.in).nextLine().split(" +");
        in.close();

        String strOut = "";
        boolean cheсk;
        for (int i=0; i<9; i++){
            cheсk = false;
            for (int j=0; j<strTwo.length; j++){
                if (strOne[i].equals(strTwo[j])) {cheсk = true; j=strTwo.length;}
            }
            if (cheсk) strOut+="1";
            else strOut+="0";
        }
        System.out.println("Ответ:\n"+strOut);
    }
}