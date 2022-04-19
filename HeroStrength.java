/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author raffi
 */
public class HeroStrength extends Hero{
    String type = "Strength";
    
    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }
    
    @Override
    void display(){
         super.display();
         System.out.print("type : " + this.type);
    }
    
    @Override
    void takeDamage(double damage){
        System.out.print(this.name + "receive half damage" + damage + "->" + 0.5*damage);
        this.health = this.health - 0.5*damage;
    }
}
