public class FechaduraInteligente extends Dispositivo implements Conectavel, Agendavel {
    private boolean travada;

    public FechaduraInteligente(String id, String localizacao) {
        super(id, localizacao);
        this.travada = true;
    }

    @Override
    public void funcionar() {
        travada = !travada;
        System.out.println("[" + id + "] Fechadura " + (travada ? "travada." : "destravada."));
    }

    @Override
    public void conectarWifi() { System.out.println("[" + id + "] Conectada ao Wi-Fi."); }

    @Override
    public void desconectarWifi() { System.out.println("[" + id + "] Desconectada do Wi-Fi."); }

    @Override
    public void agendarAtividade() { System.out.println("[" + id + "] Agendamento configurado."); }

    @Override
    public void cancelarAgendamento() { System.out.println("[" + id + "] Agendamento cancelado."); }
}
