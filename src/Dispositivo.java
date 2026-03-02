public abstract class Dispositivo {
    protected String id;
    protected String localizacao;
    protected boolean ligado;

    public Dispositivo(String id, String localizacao) {
        this.id = id;
        this.localizacao = localizacao;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("[" + id + "] Ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("[" + id + "] Desligado.");
    }

    public void exibirStatus() {
        System.out.println("[" + id + "] Local: " + localizacao + " | Ligado: " + ligado);
    }

    public boolean estaLigado() {
        return ligado;
    }

    public abstract void funcionar();
}
