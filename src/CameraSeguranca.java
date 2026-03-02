public class CameraSeguranca extends Dispositivo implements Conectavel, Monitoravel, Atualizavel {
    private boolean gravando;

    public CameraSeguranca(String id, String localizacao) {
        super(id, localizacao);
        this.gravando = false;
    }

    @Override
    public void funcionar() {
        gravando = true;
        System.out.println("[" + id + "] Câmera gravando e monitorando em tempo real.");
    }

    @Override
    public void conectarWifi() { System.out.println("[" + id + "] Conectada ao Wi-Fi."); }

    @Override
    public void desconectarWifi() { System.out.println("[" + id + "] Desconectada do Wi-Fi."); }

    @Override
    public void gerarRelatorio() { System.out.println("[" + id + "] Relatório: Gravando = " + gravando); }

    @Override
    public void atualizarFirmware() { System.out.println("[" + id + "] Firmware atualizado com sucesso."); }
}
