import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new LampadaInteligente("LAMP-01", "Sala", "Branco Quente", 80));
        dispositivos.add(new Termostato("TERM-01", "Quarto", 22.0, 18.5));
        dispositivos.add(new CameraSeguranca("CAM-01", "Entrada"));
        dispositivos.add(new FechaduraInteligente("FECH-01", "Porta Principal"));

        System.out.println("Sistema de Casa Inteligente \n");

        for (Dispositivo d : dispositivos) {
            System.out.println("--- " + d.id + " ---");
            d.ligar();
            d.funcionar();
            d.exibirStatus();
            System.out.println();
        }
    }
}
