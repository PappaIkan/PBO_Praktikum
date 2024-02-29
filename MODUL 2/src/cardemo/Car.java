/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardemo;

/**
 *
 * @author lenovo
 */
public class Car {
    int cadence;
    int speed;
    int gear;
    
    void changeCadence(int cadenceCar){
        cadence = cadenceCar;
    }
    
    void speedUp(int speedCar){
        speed = speedCar;
    }
    
    void changeGear(int gearCar){
        gear = gearCar;
    }
    
    void printInfo() {
        System.out.println(
            "Cadence : " + cadence + "\n" +
            "Speed : " + speed + "\n" +
            "Gear : " + gear + "\n"
        );
    }
}
