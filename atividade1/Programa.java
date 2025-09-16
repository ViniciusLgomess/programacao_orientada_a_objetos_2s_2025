public class Programa {
    private Integer memoriaRAM_Alocada;
    private Integer SSD_Ocupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRAM_Alocada, Integer SSD_Ocupado, Integer nucleos, Integer quantidadeOperacoes) {
        this.memoriaRAM_Alocada = memoriaRAM_Alocada;
        this.SSD_Ocupado = SSD_Ocupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAM_Alocada() {
        return this.memoriaRAM_Alocada;
    }

    public void setMemoriaRAM_Alocada(Integer memoriaRAM_Alocada) {
        this.memoriaRAM_Alocada = memoriaRAM_Alocada;
    }

    public Integer getSSD_Ocupado() {
        return this.SSD_Ocupado;
    }

    public void setSSD_Ocupado(Integer SSD_Ocupado) {
        this.SSD_Ocupado = SSD_Ocupado;
    }

    public Integer getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Integer getQuantidadeOperacoes() {
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }    
}