public class Truck extends Vehicel{
    int maxGas=100;

    int driveTime;
    int totalDriveTime;
    boolean isMovingForward;
    private String name;

    public Truck(String name) {
        this.name=name;
    }

    public void driveForward(){
        while(isMovingForward){
            if (curGasAmount != 0){
            driveTime++;
            totalDriveTime+=driveTime;
            curGasAmount--;
            }
        }
        {
            System.out.println("Out of gas!!!");
        }

    }
    public int CheckAmount(){
        return curGasAmount;
    }
    public void refuleMax(){
        curGasAmount=maxGas;
        driveTime=0;

    }    
    public String getName(){
        return this.name;
    }
}