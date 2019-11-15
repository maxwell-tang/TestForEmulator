// hi matt
package frc.robot;
import edu.wpi.first.wpilibj.XboxController;

/**
 * takes in input from the controller, essentially puts controller values as variables
 */
public class Input {
    //declaration of public variables
    public static double rotation;
    public static double acceleration;
    public static boolean turbo;
    //the actual controller
    private static XboxController controller;
    //initiation- opening ports and such
    public static void init(){
        //connects controller to port 0
        controller = new XboxController(0);
    }
    //update- does regular checks for controller values and processes them (if nessecary)
    public static void update(){
        //raw axis inputs: 
        //0 is horizontal on left stick
        //1 is vertical on left stick
        //2 is trigger buttons
        //3 is horizontal on right stick
        //4 is vertical on right stick


        //take in the rotation value
        rotation = controller.getRawAxis(3);
        //take in the thrust value
        acceleration = controller.getRawAxis(1);
        //check the turbo amount and see if turbo should be activated, threshold is 0.5
        turbo = controller.getRawAxis(2)>0.5;
    }
    //destroy?-i dont know if this will be nessecary but it might close ports if we want OPTIONAL
}
