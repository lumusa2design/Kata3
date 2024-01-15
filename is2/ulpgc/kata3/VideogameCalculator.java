package is2.ulpgc.kata3;

import java.util.List;

public class VideogameCalculator {
    List<Videogame> videogames;
    float japan;
    float eeuu;
    float world;

    public VideogameCalculator(List<Videogame> videogames,float japan, float eeuu, float world) {
        this.videogames = videogames;
        this.japan = japan;
        this.eeuu = eeuu;
        this.world = world;
    }
    public void calculateValueVideogame(){
        this.japan = 0;
        this.eeuu = 0;
        this.world = 0;
        for(Videogame videogame : videogames){
            this.japan += videogame.getSalesJapan();
            this.eeuu += videogame.getSalesEEUU();
            this.world += videogame.getSalesWorld();
        }
    }

    public double[] mediumCalculator(){
        double[] mediums;
        mediums = new double[3];
        mediums[0] =this.japan / world*100;
        mediums[1] = this.eeuu/ world*100;
        mediums[2] = this.world / world*100;
        return mediums;
    }

    @Override
    public String toString() {
        return "VideogameCalculator{" +
                "japan=" + japan +
                ", eeuu=" + eeuu +
                ", world=" + world +
                '}';
    }
}
