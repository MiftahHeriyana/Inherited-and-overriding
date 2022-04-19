/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author raffi
 */
public class MainPoly {
    public static void main(String[] args){
            HeroPoly hero1 = new HeroPoly("Miftah");
            HeroStrengthPoly hero2 = new HeroStrengthPoly("Bunga");   
            hero1.display();
            hero2.display();
            
            HeroPoly hero3 = new HeroStrengthPoly("Jun");
            hero3.display();
            
            HeroAgility hero4 = new HeroAgility ("Ones");
            hero4.display();
            hero4.showoff();
            
            HeroPoly[] kumpulanHero = new HeroPoly[4];
            kumpulanHero[0] = hero1;
            kumpulanHero[1] = hero2;
            kumpulanHero[2] = hero3;
            kumpulanHero[3] = hero4;
            
            kumpulanHero[0].display();
            kumpulanHero[1].display();
            kumpulanHero[2].display();
            
    }
}
