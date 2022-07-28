/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real.estate.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author floyd
 */
public class Block extends BlockBase {

    public Block(int blockId) {
        super(blockId);
    }
    
    private List<Lot> lots = 
            new ArrayList<>();
    
    @Override
    public Lot[] getLots(){
        return lots.toArray(Lot[]::new);
    }
    
    public void addLot(Lot lot) {
        lots.add(lot);
    }
}
