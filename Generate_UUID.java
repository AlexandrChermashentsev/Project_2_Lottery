package Project_2_Toy_Store_Lottery;

// import java.util.UUID;

public class Generate_UUID {

    public static String UUID_13(){
        String suuid = java.util.UUID.randomUUID().toString();
        int n = 13;
        suuid = String.format("%."+ n +"s", suuid);
        return suuid;
    }
}
    
    


