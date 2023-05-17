package Project_2_Toy_Store_Lottery;

public class Toy {
    private String uuid;
    private String toy_name;
    

    public Toy(String toy_name) {
        this.uuid = Generate_UUID.UUID_13();
        this.toy_name = toy_name;
    }

    public String getToyName(){
        return toy_name;
    }

    private String getInfo(){
        return String.format("uuid: %s; toy: %s", uuid, toy_name);
    }

    @Override
    public String toString(){
        return getInfo();
    }
}
