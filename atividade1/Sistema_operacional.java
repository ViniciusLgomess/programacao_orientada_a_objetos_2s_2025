public class Sistema_operacional {
    private Computador computador;

    public Sistema_operacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() { 
        return computador; 
    }

    public void setComputador(Computador computador) { 
        this.computador = computador; 
    }

    public Boolean executarPrograma(Programa p) {
        System.out.println("\nExecutando programa...");

        if (p.getSSD_Ocupado() > computador.getSSD()) {
            System.out.println("Erro: SSD insuficiente para instalar o programa.");
            return false;
        }

        if (p.getMemoriaRAM_Alocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: Memória RAM insuficiente para executar o programa.");
            return false;
        }

        double tempoExecucao = (double) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos");
        return true;
    }
}