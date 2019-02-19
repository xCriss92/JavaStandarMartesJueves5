
package ejercicioiocarraylist;

import java.util.ArrayList;

class NoLegustaVolarTieneChoques implements CriterioFiltro {
    public boolean evaluar(Piloto p) {
        if ((p.getLesGustaVolar()==false) && (p.getCantidadDeChoques() > 0)) {
            return true;
        }
        return false;
    }
}


public class EjercicioIOCarraylist {
    public static ArrayList<Piloto> obtenerPilotosSegunCriterio(ArrayList <Piloto> pilotos, CriterioFiltro c) {
        ArrayList <Piloto> pilotosRet = new ArrayList<>();
        for (Piloto p: pilotos) {
            if (c.evaluar(p)) {
                pilotosRet.add(p);
            }
        }
        return pilotosRet;
    }
    
    public static void main(String[] args) {

       ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
        
        pilotos.add(new Piloto("Anibal", "Troilo", true, 0));
        pilotos.add(new Piloto("Agustin", "Rossi", true, 1));
        pilotos.add(new Piloto("Gabriel", "Burelli", false, 1));
        pilotos.add(new Piloto("Roberto", "Cordoba", false, 1));
        pilotos.add(new Piloto("Pablo", "Dante", false, 0));     
        pilotos.add(new Piloto("Manuel", "Rodriguez", false, 3));
        pilotos.add(new Piloto("Lucas", "Porchawska", true, 10));
        pilotos.add(new Piloto("Marina", "Bustamante", false, 4));
        pilotos.add(new Piloto("Noelia", "Carballo", true, 10));
        pilotos.add(new Piloto("Mariano", "MartinEz",false, 5));
        
        // les gusta volar y cantidad de choques
        // CriterioFiltro c1 = p -> (!p.getLesGustaVolar() && p.getCantidadDeChoques() == 0);
        
        /*
        for (Piloto p : obtenerPilotosSegunCriterio(pilotos, c1)) {
            p.imprimir();
        }
        */
        
        pilotos
            .stream()
            .filter(p -> !p.getLesGustaVolar())
            .filter(p -> (p.getCantidadDeChoques() > 0))
            .forEach(p -> p.imprimir());
    }
}
