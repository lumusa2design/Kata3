package is2.ulpgc.kata3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Videogame> videogames = CSVFileVideogameLoader.with("is2/ulpgc/kata3/VideogamesDataset.csv").load();
        VideogameCalculator vc = new VideogameCalculator(videogames,0, 0, 0);
        vc.calculateValueVideogame();
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram(vc));
        mainFrame.setVisible(true);
    }

    private static Histogram histogram(VideogameCalculator vc) {
        return new Histogram() {
            @Override
            public int bins() {
                return 2;
            }

            @Override
            public double[] values() {
                return vc.mediumCalculator();
            }
        };
    }
}