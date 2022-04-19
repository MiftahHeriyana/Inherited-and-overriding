/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author raffi
 */
public class HeroAgility extends HeroPoly{
    String type = "Agility";
    
    HeroAgility(String nama){
           super(nama);
        }
    
    @Override
    void display(){
            super.display();
            System.out.print("Type /t: " + this.type);
    }
    
    void showoff(){
            System.out.print("saya hero Agility!!");
    }
}
