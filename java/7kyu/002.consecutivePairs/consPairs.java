public class consPairs {

    public static void main(String[] args) {
        System.out.println("hola");
        System.out.println("Hay " + solucion(new int[]{1,2,5,8,-4,-3,7,6,5}) + " parejas de números consecutivos");
        System.out.println("----");
        System.out.println("Hay " + solucion((new int[]{21, 20, 22, 40, 39, -56, 30, -55, 95, 94}))  + " parejas de números consecutivos");
        
    }

    public static int solucion (int [] listaNumeros) {
        int numParejasConsecutivas = 0;
        System.out.println("Longitud lista: " + listaNumeros.length);
        for (int i = 1; i <= listaNumeros.length - 1; i = i+2) {
            System.out.println("Números a tratar: " + listaNumeros[i-1] + ", " + listaNumeros[i]);
            if (Math.abs( listaNumeros[i] - listaNumeros[i-1]) == 1 )
                numParejasConsecutivas++;
        }
        return numParejasConsecutivas;
    }
}