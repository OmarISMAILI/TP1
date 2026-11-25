package net.ismaili.pres;

import net.ismaili.dao.DaoImpl;
import net.ismaili.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {

//        Instanciation statique
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
//        metier.setDao(d);
        System.out.println("RES= " + metier.calcul());
    }
}
