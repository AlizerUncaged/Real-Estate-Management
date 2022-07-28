/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real.estate.management.system;

/**
 *
 * @author floyd
 */
public abstract class BlockBase implements EstateObject {

    private final int id;
    
    public BlockBase(int id){
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
    
    abstract Lot[] getLots();
    
    abstract void addLot(Lot lot);
}
