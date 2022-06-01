package myapp.core;

public class Honda extends Car{

    public Honda(){
        this.setMake("Honda");
    }
    //@Override to tell if youre overriding correctly or not
    public void accelerate(){
        System.out.println("Accelarating..");
    }

    @Override
    public void stop(){
        System.out.print("Stopping..Stopped");}

    public void stop(Integer count){
        System.out.printf("Stopping in %d seconds\n");
    }
    
}
