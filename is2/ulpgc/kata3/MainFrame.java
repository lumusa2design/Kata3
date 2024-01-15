package is2.ulpgc.kata3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    HistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Histograma de Ventas");
        this.setSize(1500,900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreeChartHistogramDisplay display = new JFreeChartHistogramDisplay();
        this.histogramDisplay = display;
        return  display;
    }
    public HistogramDisplay histogramDisplay(){
        return histogramDisplay;
    }
}
