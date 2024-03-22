/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author eshi6
 */
public class Animal implements IEntity{
    private int id;
    private String name;
    private String species;
    private char gender;
    private int age;
    private int x;
    private int y;
    private int height;
    private int width;
    private int xShift;
    private int yShift;
    private int direction;
    private int hunger; //(0 - 100)
    private int fatigue; //(0 - 100)
    //image variable
    private String sound;   
    
    @Override
    public void makeSound(){
        System.out.print("Caw Caw");
    }
    @Override
    public void move(){
        System.out.print("");
    }
    @Override
    public void eat(){
        hunger = hunger + 50;
        System.out.print("Nom Nom");
    }
    @Override
    public void sleep(){
        fatigue = fatigue + 70;
    }
    @Override
    public void turn(double degree){
        
    }
}
