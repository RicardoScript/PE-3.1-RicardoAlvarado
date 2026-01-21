// import java.util.Scanner;
public class CalcularBase {    
    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTOR_RURAL = 1.15;

    public static double calculo(int dependientes, boolean esRural){
    double monto = MONTO_BASE;

    for (int i = 0; i < dependientes; i++) {
        monto += MONTO_DEPENDIENTE;
    }

    if (esRural) {
        monto = monto * FACTOR_RURAL;
    }

    return monto;
}

    // return esRural ? monto * FACTOR_RURAL : monto;

    public static void main(String [] args){
        System.out.println("Cso 1: Zona urbana"+calculo(0, false));
        System.out.println("Cso 2: Alddrin: Zona urbana"+calculo(3, false));
        System.out.println("Cso 2: Alddrin: Zona urbana"+calculo(7, false));
    }
   
}