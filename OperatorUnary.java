package belajar.coding;

public class OperatorUnary {
    public static void main(String[] args){
        System.out.println("OpeatorUnary Plus");

        int value1 = 2;
        int result = +value1;
        System.out.println("Hasil +2 = " + result);
        System.out.println();

        System.out.println("OperatorUnary Minus");
        int value2 = 2;
        value2 = -value2;
        System.out.println("Hasil -2 = " + value2);
        System.out.println();

        System.out.println("Operator peningkatan 1");
        int value3 = 2;
        value3++;
        System.out.println("Hasil 2++ = " + value3);
        System.out.println();

        System.out.println("Operator Pengurangan 1");
        int value4 = 2;
        value4--;
        System.out.println("Hasil 2-- = " + value4);
        System.out.println();

        System.out.println("Operator komlemen logika");
        //nilai a adalah false
        boolean a = false;
        System.out.println("Hasil !false = " + !a);
        System.out.println();
    }
}
