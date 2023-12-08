package refatorado;

import refatorado.moeda.EMoeda;

import javax.swing.*;

public class ConversorGrafico extends JFrame {
    private JPanel painel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcao1;
    private JMenuItem opcao2;
    private JMenuItem opcao3;
    private JLabel labelOpcaoSelecionada;

    public ConversorGrafico() {
        setSize(400, 300);
        setTitle("Conversor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // configurando painel
        painel = new JPanel();
        painel.setLayout(null);

        labelOpcaoSelecionada = new JLabel("");
        labelOpcaoSelecionada.setBounds(20, 50, 200, 20);
        labelOpcaoSelecionada.setVisible(false);

        painel.add(labelOpcaoSelecionada);

        // criando a barra do menu
        menuBar = new JMenuBar();
        menuBar.setBounds(10, 20, 200, 20);

        // criando opções do menu
        opcao1 = new JMenuItem("Conversor de moedas");
        opcao2 = new JMenuItem("Conversor de peso");
        opcao3 = new JMenuItem("Sair");


        // definindo ação da opção 1
        opcao1.addActionListener(e -> {

            String opcaoSelecionada;
            opcaoSelecionada = JOptionPane.showInputDialog(" Escolha a opção de conversão de moeda desejada:"
                    + "\n1-Euro conversão para Real"
                    + "\n2-Dólar conversão para Real"
                    + "\n3-Real conversão para Dólar"
                    + "\n4-Real conversão para Euro");

            int opcao;
            opcao = Integer.parseInt(opcaoSelecionada);
//            ------------------------------------------------------------------
            EMoeda moeda = EMoeda.getByIdentificador(opcao);
            moeda.pegarCalculadora().calcula();
//            ------------------------------------------------------------------
            labelOpcaoSelecionada.setText("CONVERSOR DE MOEDAS:");
            labelOpcaoSelecionada.setVisible(true);
        });

        // definindo ação da opção 2
        opcao2.addActionListener(e -> {

            String peso;
            peso = JOptionPane.showInputDialog(" Escolha a opção desejada:"
                    + "\n1-Quilos converter para Gramas"
                    + "\n2-Gramas converter para Quilos"
                    + "\n3-Quilos converter para Libras"
                    + "\n4-Libras converter para Quilos"
                    + "\n5-Quilos converter para Tonelada"
                    + "\n6-Tonelada converter para Quilos"
            );

            int opcao;
            opcao = Integer.parseInt(peso);

            if (opcao == 1) {
                double valorPeso = 0;

                boolean conseguiuConverter;
                do {

                    String peso1;
                    peso1 = JOptionPane.showInputDialog("Digite o peso em Quilos que deseja converter para Gramas:");

                    try {
                        valorPeso = Double.parseDouble(peso1);
                        conseguiuConverter = true;
                    } catch (Exception ex) {
                        conseguiuConverter = false;
                    }
                } while (!conseguiuConverter);

                final double gramas = 0.001;
                double pesoConvertido = valorPeso * gramas;
                String msg;
                msg = "O peso em Gramas é:" + pesoConvertido;
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

            if (opcao == 2) {
                double valorPeso = 0;

                boolean conseguiuConverter;
                do {

                    String peso1;
                    peso1 = JOptionPane.showInputDialog("Digite o peso em Gramas que deseja converter para Quilos:");

                    try {
                        valorPeso = Double.parseDouble(peso1);
                        conseguiuConverter = true;
                    } catch (Exception ex) {
                        conseguiuConverter = false;
                    }
                } while (!conseguiuConverter);

                final double gramas = 0.001;
                double pesoConvertido = gramas / valorPeso;
                String msg;
                msg = "O peso em Quilos é:" + pesoConvertido;
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

            if (opcao == 3) {
                double valorPeso = 0;

                boolean conseguiuConverter;
                do {

                    String peso1;
                    peso1 = JOptionPane.showInputDialog("Digite o peso em Quilos que deseja converter para Libras:");

                    try {
                        valorPeso = Double.parseDouble(peso1);
                        conseguiuConverter = true;
                    } catch (Exception ex) {
                        conseguiuConverter = false;
                    }
                } while (!conseguiuConverter);

                final double libras = 2.2046;
                double pesoConvertido = valorPeso * libras;
                String msg;
                msg = "O peso em Libras é:" + pesoConvertido;
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

            if (opcao == 4) {
                double valorPeso = 0;

                boolean conseguiuConverter;
                do {

                    String peso1;
                    peso1 = JOptionPane.showInputDialog("Digite o peso em Quilos que deseja converter para Gramas:");

                    try {
                        valorPeso = Double.parseDouble(peso1);
                        conseguiuConverter = true;
                    } catch (Exception ex) {
                        conseguiuConverter = false;
                    }
                } while (!conseguiuConverter);

                final double libras = 2.2046;
                double pesoConvertido = libras / valorPeso;
                String msg;
                msg = "O peso em Gramas é:" + pesoConvertido;
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

            if (opcao == 5) {
                double valorPeso = 0;

                boolean conseguiuConverter;
                do {

                    String peso1;
                    peso1 = JOptionPane.showInputDialog("Digite o peso em Quilos que deseja converter para Toneladas:");

                    try {
                        valorPeso = Double.parseDouble(peso1);
                        conseguiuConverter = true;
                    } catch (Exception ex) {
                        conseguiuConverter = false;
                    }
                } while (!conseguiuConverter);

                final double tonelada = 1000;
                double pesoConvertido = valorPeso * tonelada;
                String msg;
                msg = "O peso em Toneladas é:" + pesoConvertido;
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


            if (opcao == 6) {
                double valorPeso = 0;

                boolean conseguiuConverter;
                do {

                    String peso1;
                    peso1 = JOptionPane.showInputDialog("Digite o peso em Toneladas que deseja converter para Quilos:");

                    try {
                        valorPeso = Double.parseDouble(peso1);
                        conseguiuConverter = true;
                    } catch (Exception ex) {
                        conseguiuConverter = false;
                    }
                } while (!conseguiuConverter);

                final double tonelada = 1000;
                double pesoConvertido = tonelada / valorPeso;
                String msg;
                msg = "O peso em Gramas é:" + pesoConvertido;
                JOptionPane.showMessageDialog(null, msg);


            }
        });
        labelOpcaoSelecionada.setText("CONVERSOR DE PESO:");
        labelOpcaoSelecionada.setVisible(true);


        // definindo ação da opção 3
        opcao3.addActionListener(e -> {
            labelOpcaoSelecionada.setVisible(false);
            JOptionPane.showMessageDialog(null, "Saindo do programa");
            System.exit(0);
        });

        // criando o menu
        menu = new JMenu("Escolha uma opção válida!");
        menu.add(opcao1);
        menu.add(opcao2);
        menu.add(opcao3);

        // adicionando o menu à barra de menu
        menuBar.add(menu);

        // adicionando a barra de menu ao painel
        painel.add(menuBar);

        add(painel);
    }
}
