package is2.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

import javax.swing.*;

public class JFreeChartHistogramDisplay extends JPanel implements HistogramDisplay {

    @Override
    public void show(Histogram provider) {
        JFreeChart histogram = ChartFactory.createHistogram("Ventas","Paises", "Ventas Totales"
        , datasetWith(provider), PlotOrientation.VERTICAL, true, true, false);
        add(new ChartPanel(histogram));
    }

    private HistogramDataset datasetWith(Histogram provider) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("", provider.values(), provider.bins());
        return dataset;
    }
}
