public class CalcularRecursivo {
    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTOR_RURAL = 1.15;

    private static double calcularRecursivo(int dependientes, boolean esRural){
       
        //CASO EXITOSO NO HAY DEPENDIENTES NI ES RURAL
       if(dependientes == 0){
        return esRural ? MONTO_BASE * FACTOR_RURAL : MONTO_BASE;
       }
       // RECURSIVIDAD
       double montoAnterior = calcularRecursivo(dependientes - 1, esRural);
       double adicional = esRural ? MONTO_DEPENDIENTE *FACTOR_RURAL : MONTO_DEPENDIENTE;
        
       return montoAnterior + adicional;
    }

    public static void main(String[] args) {
        System.out.println("Cso 1: Zona urbana: "+calcularRecursivo(0, false));
        System.out.println("Cso 2: Alddrin: Zona urbana: "+calcularRecursivo(3, false));
        System.out.println("Cso 2: Alddrin: Zona urbana: "+calcularRecursivo(7, false));
    }
}
