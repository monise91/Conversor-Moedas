package refatorado.moeda;

import javax.swing.*;

public class CalculaDolarRealMoeda implements ICalculaMoeda {
    @Override
    public void calcula() {
        double valorReal = 0;

        boolean conseguiuConverter;
        do {
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em Dólar que deseja converter para Real:");

            try {
                valorReal = Double.parseDouble(valor);
                conseguiuConverter = true;
            } catch (Exception ex) {
                conseguiuConverter = false;
            }
        } while (!conseguiuConverter);

        final double dolar = 4.800;
        double valorConvertido = valorReal / dolar;
        String msg;
        msg = "O valor em Real é:" + valorConvertido;
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
