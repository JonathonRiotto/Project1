/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cybermissile;

/**
 *
 * @author csc190
 */
public class CyberMissile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FlightSystem flight = new FlightSystem();
	Warhead war = new Warhead();
	flight.setTarget("Moon");
	war.SelfDestruct();
        
    }
    
}
