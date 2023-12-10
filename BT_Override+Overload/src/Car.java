/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dienr
 */
public class Car extends Vehicle{
    
    @Override
    public void move(){
        System.out.println("run run run...");
    }
    
    public void move(int speed){
        System.out.println("run with :"+speed+"km/h");
    }
}
