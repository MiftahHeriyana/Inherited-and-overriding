/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author raffi
 */
public class Main {
    public static void main(String[] args){
         Hero hero1 = new Hero("Miftah",50,100);
         HeroStrength hero2 = new HeroStrength("Bunga", 10, 100);
         hero1.display();
         hero2.display();
         
         hero1.attack(hero2);
         hero2.attack(hero1);
         
         hero1.display();
         hero2.display();
    }
}
