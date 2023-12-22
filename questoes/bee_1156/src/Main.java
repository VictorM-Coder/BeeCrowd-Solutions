public class Main {
    static float sequenceS(int dividendo, int divisor){
        if (dividendo == 39) return (float) dividendo /divisor;
        return (float) dividendo /divisor + sequenceS(dividendo+2, divisor*2);
    }
    public static void main(String[] args) {
        System.out.printf("%.2f\n", sequenceS(1, 1));
    }
}