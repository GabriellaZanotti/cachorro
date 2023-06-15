/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author senai
 */

public class Car {
    String color;
    boolean isRunning;
    int velocity;
    
    public Car(String carColor, boolean carRunning, int milesPerHour)
    {
        color= carColor;
        isRunning= carRunning;
        velocity= milesPerHour;
    }
    
    public static void main(String[] args) {
        Car ferrari = new Car("red", true,27);
        Car renault = new Car ("blue", false, 70);
    
        System.out.println(renault.isRunning);
        System.out.println(ferrari.velocity); 
    }    
}
