package sistema_radar;

public class Simulacao {
    
    public static void main(String[] args) {
        Carro maverick = new Carro();
        maverick.ano = 82;
        maverick.modelo = "1982_V8";
        maverick.placa = "VPG7183";
        maverick.velocidade = 0;
        
        Radar radar = new Radar();
        radar.localizacao = "Pistao Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(maverick);

        maverick.acelerar(); // 10
        maverick.acelerar();
        maverick.acelerar();
        maverick.acelerar();
        maverick.acelerar();
        maverick.acelerar();
        maverick.acelerar(); // 70
        
        radar.avaliarVelocidade(maverick);
    }
}
