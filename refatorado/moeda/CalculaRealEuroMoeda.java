package refatorado.moeda;

import javax.swing.*;

public class CalculaRealEuroMoeda implements ICalculaMoeda {
    @Override
    public void calcula() {
        double valorReal = 0;

        boolean conseguiuConverter;
        do {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Real que deseja converter para Euro:");

            try {
                valorReal = Double.parseDouble(valor);
                conseguiuConverter = true;
            } catch (Exception ex) {
                conseguiuConverter = false;
            }
        } while (!conseguiuConverter);

        final double valorEuro = 3.298;
        double valorConvertido = valorReal * valorEuro;
        String msg;
        msg = "O valor em Euro é:" + valorConvertido;
        JOptionPane.showMessageDialog(null, msg);

        int i = JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?"
        );
        if (i == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
            System.exit(0);
        } else if (i == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa concluído");
            System.exit(0);
        }
    }
}
