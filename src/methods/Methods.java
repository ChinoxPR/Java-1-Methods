/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;
import javax.swing.JOptionPane;
/**
 *
 * @author johnc
 */
public class Methods 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Declaring Variables
        double KE;
        double m;
        double v;
        String str;
        
        //Input 
        str = JOptionPane.showInputDialog("What is the mass of the object?");
        m = Double.parseDouble(str);
        
        str = JOptionPane.showInputDialog("What is the velocity of the object?");
        v = Double.parseDouble(str);
        
        // Varaiables are sent to method for calculations
        KE = kineticEnergy(m,v);
        
        //Output of the Method 
        JOptionPane.showMessageDialog(null, "The Kinetic energy equals " + KE);
        
    }
    
    //Method
    public static double kineticEnergy(double mass, double velocity)
    {
        double kineticEnergy;     // variable to return back to Main()
        
        kineticEnergy = ((double)1/2)*mass*(Math.pow(velocity, 2));
        
        return kineticEnergy;
    }
    
}      
