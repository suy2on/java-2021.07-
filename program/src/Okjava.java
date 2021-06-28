import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import javax.swing.*;

public class Okjava {
    public static void main(String[] args){

        String id = JOptionPane.showInputDialog("Enter a path");
        String bright= JOptionPane.showInputDialog("Enter a Bright level");


        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Light on
        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();

    }
}
