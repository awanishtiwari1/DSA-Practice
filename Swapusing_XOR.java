//Swapping of two no's using XOR operator
//It is faster swapping than the normal swapping

public class Swapusing_XOR {
    public static void main(String[] args) {
        int a = 5 , b = 7;
        a = a^b ;// a  = 2
        b = a^b; //b = 5
        a = a^b; // a = 7
        System.out.println(a);
        System.out.println(b);


    }
}
