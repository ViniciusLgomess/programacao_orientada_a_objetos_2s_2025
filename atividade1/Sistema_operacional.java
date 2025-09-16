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

        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: SSD insuficiente para instalar o programa.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: Memória RAM insuficiente para executar o programa.");
            return false;
        }

        Double tempoExecucao = (Double) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: segundos" + tempoExecucao);
        return true;
    }
}