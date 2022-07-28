/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package real.estate.management.system;

import java.awt.Dialog;

/**
 *
 * @author floyd
 */
public class RealEstateManagementSystem {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var control = new ControlPanel();
        control.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        control.setVisible(true);
    }
    
}
