public class Termostato extends Dispositivo implements Conectavel, Monitoravel {
    private double temperaturaAlvo;
    private double temperaturaAtual;

    public Termostato(String id, String localizacao, double temperaturaAlvo, double temperaturaAtual) {
        super(id, localizacao);
        this.temperaturaAlvo = temperaturaAlvo;
        this.temperaturaAtual = temperaturaAtual;
    }

    @Override
    public void funcionar() {
        System.out.println("[" + id + "] Termostato ajustando temperatura. Atual: " + temperaturaAtual + "°C | Alvo: " + temperaturaAlvo + "°C");
    }

    @Override
    public void conectarWifi() { System.out.println("[" + id + "] Conectado ao Wi-Fi."); }

    @Override
    public void desconectarWifi() { System.out.println("[" + id + "] Desconectado do Wi-Fi."); }

    @Override
    public void gerarRelatorio() {
        System.out.println("[" + id + "] Relatório: Temp. atual " + temperaturaAtual + "°C, alvo " + temperaturaAlvo + "°C.");
    }
}
