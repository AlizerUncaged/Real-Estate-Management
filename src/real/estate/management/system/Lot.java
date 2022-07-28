/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real.estate.management.system;

/**
 *
 * @author floyd
 */
public class Lot implements EstateObject {

    private final int id;
    private final double area;
    private LotStatus lotStatus;

    public Lot(int id, double area) {
        this.id = id;
        this.area = area;
        this.lotStatus = LotStatus.Available;
    }

    @Override
    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public LotStatus getStatus() {
        return lotStatus;
    }
    
    public boolean buy(double budget){
        if (this.lotStatus == LotStatus.Sold) 
            return false;
        
        this.lotStatus = budget >= getPrice() ? 
                LotStatus.Sold : this.lotStatus;
        
        return budget >= getPrice();
    }
    
    public double getPrice() {
        // Based on: https://www.quora.com/What-is-the-price-per-square-meter-of-a-residential-lot-in-the-Philippines
        return area * 500;
    }

}
