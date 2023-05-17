package Project_2_Toy_Store_Lottery;

public class Storage {
    int storehouse;
    static double persCompl;
    
    

    public Storage(int storehouse){
        this.storehouse = storehouse;
    }

    public Storage(){
        this.storehouse = 0;
    }

    public int getStorehouse(){return storehouse;}

    public void setStorage(int storage){
        this.storehouse = storage;
    }    

}




