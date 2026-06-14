package Inheritance;

import Inharitance2.TwoWheelers;

public class InheritanceTest extends TwoWheelers {
    public static void main(String [] args){
        Vehicle v = new Vehicle();
        TwoWheelers t = new TwoWheelers();
        MoterCycle m = new MoterCycle();
        v.commute();
        t.balance();
        t.commute();
        m.balance();
        m.commute();
    }
}
