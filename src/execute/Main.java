package execute;

import com.adam.world.speedConverter;
import com.classes.Car;
import com.classes.bankAccount;
import com.megabyte.converter.megabyte;
import com.megabyte.converter.minSecCon;
import com.adam.world.areaCalculator;
import com.control.Switch;
import com.loop.forLoops;
import com.loop.threeAndFive;
import com.loop.isODD;
import com.classes.SimpleCalculator;

public class Main {
    public static void main(String[] args) {

/*     //SPEED CONVERTER
    System.out.println("SPEED CONVERTER");
    speedConverter x = new speedConverter();
    System.out.println(x.toMilesPerHour(1.5));
    System.out.println(x.toMilesPerHour(10.5));
    speedConverter y = new speedConverter();
    y.printConversion(1.5);
    System.out.println("*************************************");*/
/*        //MEGABYTES
        megabyte val1 = new megabyte();
        val1.printMegaBytesAndKiloBytes(2500);*/
// Car x = new Car();
// x.setModel("Porshe");
//        System.out.println(x.getModel());
//
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
        bankAccount me = new bankAccount(12345, 0, "Adam", "G@gmail.com", "07");
        me.updateBalanceDeposit(300);
        me.updateBalanceWith(150);
        me.updateBalanceWith(300);

    }
}
