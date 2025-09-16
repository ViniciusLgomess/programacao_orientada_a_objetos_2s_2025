public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(7500, 18000, 4, 2000);
        SistemaOperacional sistema_operacional = new SistemaOperacional(pc);

        Programa a = new Programa(2000, 500, 2, 10000);
        Programa b = new Programa(3000, 20000, 2, 20000);
        Programa c = new Programa(12000, 1000, 2, 30000);

        sistema_operacional.executarPrograma(a);
        sistema_operacional.executarPrograma(b);
        sistema_operacional.executarPrograma(c);
    }
}