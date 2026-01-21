public class CalcularRecursivoError {

    private static final double MONTO_BASE = 55.0;
    private static final double MONTO_DEPENDIENTE = 15.0;
    private static final double FACTOR_RURAL = 1.15;

    public static double calcularRecursivoConError(int dependientes, boolean esRural) {

        // CASO BASE MAL DEFINIDO (nunca se cumple)
        if (dependientes < -1) {
            return MONTO_BASE;
        }

        // ERROR: dependientes NO cambia → recursión infinita
        double montoAnterior = calcularRecursivoConError(dependientes, esRural);

        double adicional = esRural
                ? MONTO_DEPENDIENTE * FACTOR_RURAL
                : MONTO_DEPENDIENTE;

        return montoAnterior + adicional;
    }

    public static void main(String[] args) {
        System.out.println("Provocando StackOverflowError...");
        calcularRecursivoConError(3, false);
    }
}
