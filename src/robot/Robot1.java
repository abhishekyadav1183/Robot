/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
/**
 *
 * @author Abhishek Yadav
 */
public class Robot1 {

    /**
     * @param args the command line arguments
     */
   
     
    public static void main(String[] args) {
         
        try {
             
            Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_P);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_M);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_N);   
robot.keyPress(KeyEvent.VK_O);
robot.keyPress(KeyEvent.VK_N);          
robot.keyPress(KeyEvent.VK_Y);
robot.keyPress(KeyEvent.VK_M);
robot.keyPress(KeyEvent.VK_O);
robot.keyPress(KeyEvent.VK_U);
robot.keyPress(KeyEvent.VK_S);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}