package dashboard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sensor Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Simulando dados de sensores
        List<String> labels = new ArrayList<>();
        List<Integer> volumeCorrente = new ArrayList<>();
        List<Integer> razaoIE = new ArrayList<>();
        List<Integer> frequencia = new ArrayList<>();
        List<Integer> fluxoMedio = new ArrayList<>();

        // Adicione dados de exemplo aos ArrayLists
        for (int i = 1; i <= 10; i++) {
            labels.add("Sample " + i);
            volumeCorrente.add((int) (Math.random() * 100));
            razaoIE.add((int) (Math.random() * 100));
            frequencia.add((int) (Math.random() * 100));
            fluxoMedio.add((int) (Math.random() * 100));
        }

        // Crie gráficos para cada conjunto de dados
        JPanel chartPanel = new JPanel(new GridLayout(2, 2));

        chartPanel.add(createChart(labels, volumeCorrente, "Volume_corrente"));
        chartPanel.add(createChart(labels, razaoIE, "Razão_IE"));
        chartPanel.add(createChart(labels, frequencia, "Frequência"));
        chartPanel.add(createChart(labels, fluxoMedio, "Fluxo_médio"));

        frame.add(chartPanel);
        frame.setVisible(true);
    }

    private static JPanel createChart(List<String> labels, List<Integer> data, String title) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < labels.size(); i++) {
            dataset.setValue(data.get(i), title, labels.get(i));
        }

        JFreeChart chart = ChartFactory.createBarChart(
                title,
                "Samples",
                "Value",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        return new ChartPanel(chart);
    }
}

