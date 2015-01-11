/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.firstrobotics1923.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Makarand
 */
public class Compressor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final Relay compressor; //Relay Init
    private boolean on = false; //compressor status
    
    /**
     *  Main Constructor for class.     
     * @param compressorSpike 
     *                  Spike relay that controls the actual compressor
     */
    public Compressor(Relay compressorSpike){         
        this.compressor = compressorSpike;
    }
    
    /**
     * Turns on the Compressor
     */
    public void start(){       
        compressor.set(Relay.Value.kOn);
        //Components.sfxDashboard.CompressorRelay = true;
        
    }
    
    /**
     * Toggles compressor state
     */
    public void toggle(){        
        on = !on;       
    }
    
    /**
     *  Stops the Compressor
     */
    public void stop(){      
        compressor.set(Relay.Value.kOff);  
        //Components.sfxDashboard.CompressorRelay = false;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
