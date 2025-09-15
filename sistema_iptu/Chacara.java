package sistema_iptu;

public class Chacara extends Imovel{
    
    private Boolean possuiPocoartesiano;

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoartesiano) {
        super(municipio, areaM2, vagas);
        this.possuiPocoartesiano = possuiPocoartesiano;
    }

    public Boolean getPossuiPocoartesiano() {
        return this.possuiPocoartesiano;
    }

    public void setPossuiPocoartesiano(Boolean possuiPocoartesiano) {
        this.possuiPocoartesiano = possuiPocoartesiano;
    }

}
