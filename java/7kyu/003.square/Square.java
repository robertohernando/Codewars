public class Square {

    public static void main(String[] args) {
        //pruebo algún caso
        System.out.println("Probando si 25 es cuadrado");
        if (isSquare(25)) 
            System.out.println("Sí");
        else
            System.out.println("No");
        
    }

    public static boolean isSquare(int n) {        
        if (n < 0 ) return false;

        int a = 0;
        do {
            if (a*a == n) return true;
            else a++;
        } while (a*a <= n);
        return false;
    }
}