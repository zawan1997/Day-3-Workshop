package myapp.core;

//class
public class Car implements Controllable;{

    //Properties, members
    // dont just let people change the properties. put private
    private String colour;
    protected String make;
    private Integer engineCapacity;
    private Boolean started = false;
    private long startedSince;

    public Car(){
         //Constructor to initialise objects
        System.out.println("Inistantiating Car Objects");}

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        if (!colour.equals("red"))
        this.colour = colour;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public Car(Integer capacity){
        this.engineCapacity=capacity;
    }
    public Integer getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public Boolean getStarted() {
        return started;
    }
    public void setStarted(Boolean started) {
        this.started = started;
    }
    
    
    public void stop(){
        if(!this.started){
            System.out.println("your car is not running");
        } else {
            System.out.println("Splutter splutter stop...");
            this.started=false;
        }
    }




