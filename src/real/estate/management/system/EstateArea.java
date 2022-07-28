/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real.estate.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author floyd
 */
public class EstateArea {

    // Singleton pattern.
    public static EstateArea instance
            = new EstateArea();

    public EstateArea getInstance() {
        return instance;
    }

    // Hardcoded data.
    private final int maxBlocks = 5;
    private final int lotsPerBlock = 20;

    // Class context.
    public EstateArea() {

        Random rand = new Random();

        // Create blocks.
        for (int i = 0; i < maxBlocks; i++) {
            
            Block block = new Block(i + 1);
            
            for (int j = 0; j < lotsPerBlock; j++) {
                
                // Lots have random areas between 
                // 1000 ft^2 and 9000 ft^2.
                int lotArea = rand.nextInt(8000) + 1000;
                block.addLot(new Lot(j + 1, lotArea));
                
            }
            
            blocks.add(block);  
        }
    }

    private List<Block> blocks
            = new ArrayList<>();
    
    public Block[] getBlocks() {
        return blocks.toArray(new Block[0]);
    }
}
