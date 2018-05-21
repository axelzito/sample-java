package noAbstrato;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.swing.plaf.synth.DefaultSynthStyle;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Alunoinf_2 on 12/05/2018.
 */
public class Lista implements Forma {

    LinkedList<Forma> forma;

    @Override
    public double calculaArea() {
        return 0;
    }

    @Override
    public double calculaVolume() {
        return 0;
    }

    public String toString() {
        return "";
    }

    public boolean add (Forma forma) {

        this.forma.add(forma);

        return true;
    }

    public int qtdeCirculo() {
        int num = 0;
        Iterator i = forma.iterator();
        Forma f;
        while (i.hasNext()) {
            f = (Forma) i.next();
            if (f instanceof Circulo) num++;
        }

        return num;
    }

    public int qtdeCilindro() {
        int num = 0;
        Iterator i = forma.iterator();
        Forma f;
        while (i.hasNext()) {
            f = (Forma) i.next();
            if (f instanceof Cilindro) num++;
        }

        return num;
    }

    public String mostraArea() {
        String areas = null;
        Iterator i = forma.iterator();
        Forma f;
        while (i.hasNext()) {
            f = (Forma) i.next();
            areas += "\n" + f.calculaArea();
        }

        return areas;
    }

    public String mostraVolume() {
        String volumes = null;
        Iterator i = forma.iterator();
        Forma f;
        while (i.hasNext()) {
            f = (Forma) i.next();
            volumes += "\n" + f.calculaVolume();
        }

        return volumes;
    }

    public int qtdeQuadrados() {
        int num = 0;
        Iterator i = forma.iterator();
        Forma f;
        while (i.hasNext()) {
            f = (Forma) i.next();
            if (f instanceof Quadrado) num++;
        }

        return num;
    }
}
