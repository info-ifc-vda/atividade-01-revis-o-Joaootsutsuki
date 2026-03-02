public class LampadaInteligente extends Dispositivo implements Conectavel, Agendavel {
    private String cor;
    private int intensidade;

    public LampadaInteligente(String id, String localizacao, String cor, int intensidade) {
        super(id, localizacao);
        this.cor = cor;
        this.intensidade = intensidade;
    }

    @Override
    public void funcionar() {
        System.out.println("[" + id + "] Lâmpada funcionando - Cor: " + cor + " | Intensidade: " + intensidade + "%");
    }

    @Override
    public void conectarWifi() { System.out.println("[" + id + "] Conectada ao Wi-Fi."); }

    @Override
    public void desconectarWifi() { System.out.println("[" + id + "] Desconectada do Wi-Fi."); }

    @Override
    public void agendarAtividade() { System.out.println("[" + id + "] Atividade agendada."); }

    @Override
    public void cancelarAgendamento() { System.out.println("[" + id + "] Agendamento cancelado."); }
}
