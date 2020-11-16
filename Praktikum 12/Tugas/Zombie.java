/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Z1402
 */
public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    abstract public void heal();
    
    @Override
    abstract public void destroyed();
    

    String getZombieInfo() {
        return "Health = " + this.health + "\n"
                + "Level = "+this.level + "\n";
    }

    
}
