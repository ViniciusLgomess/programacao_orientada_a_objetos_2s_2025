package sistema_radar;

public class Simulacao {
    
    public static void main(String[] args) {
        Carro maverick = new Carro("QCY1295", 0, 82, "V8");
        // maverick.ano = 82;
        // maverick.modelo = "1982_V8";
        // maverick.placa = "VPG7183";
        // maverick.velocidade = 0;
        
        Radar radar = new Radar("Pistao Sul", 60);
        // radar.localizacao = "Pistao Sul";
        // radar.limiteVelocidade = 60;

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
