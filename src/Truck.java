public class Truck extends Vehicel{
    int maxGas=100;
    int curGas=0;
    int driveTime;
    int totalDriveTime;
    boolean isMovingForward;
    private String name;

    public Truck(String name) {
        this.name=name;
    }

    public void driveForward(){
        while(isMovingForward){
            if (curGas != 0)
            driveTime++;
            totalDriveTime+=driveTime;
            curGas-=1;
        }
        {
            System.out.println("Out of gas!!!");
        }

    }
    public int CheckAmount(){
        return curGas;
    }
    public void refuleMax(){
        curGas=maxGas;
        driveTime=0;

    }    
    public String getName(){
        return this.name;
    }
}