/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author raffi
 */
public class HeroStrengthPoly extends HeroPoly {
    String type = "Strength";
    
    
    HeroStrengthPoly(String nama){
           super(nama);
    }
    
    @Override
    void display(){
            super.display();
            System.out.print("Type /t:/t" + this.type);
    }
}
