package nl.example;

import systems.uom.ucum.UCUM;
import tech.units.indriya.quantity.Quantities;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.Angle;

public class App {


    public static final Unit<Angle> DEG = UCUM.DEGREE;

    public static final Quantity<Angle> DEGREES_360 = Quantities.getQuantity(360, DEG);

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            Quantities.getQuantity(i, DEG).subtract(DEGREES_360);
        }
    }
}