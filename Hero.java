/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;


public class Hero{
   // attribute
   String name;
   double attackPower, health;
   
   
   Hero(String nameInput, double attackInput, double healthInput){
   this.name = nameInput;
   this.attackPower = attackInput;
   this.health =  healthInput;
   }
   void attack(Hero enemy){
        System.out.print("/n" + this.name + "attack" + enemy.name);
        enemy.takeDamage(this.attackPower);
   }
   
   void takeDamage(double damage){
       System.out.print(this.name + "receive damage" + damage);
       this.health = this.health - damage;
   }
   
   void display(){
       System.out.print("/nName: " + this.name);
       System.out.print("Health: " + this.health);
       System.out.print("Power: " + this.attackPower);
   }
}
