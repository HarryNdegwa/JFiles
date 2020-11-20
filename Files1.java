
import java.io.File;
// import java.io.IOException;

public class Files1{

    public static void main(String[] args) {
        
        File file = new File("text.txt");

        // try {
        //     if (file.createNewFile()){
        //         System.out.println("Created file "+file.getName());
        //     }else{
        //         System.out.println("File already exists");
        //     }
        // } catch (IOException e) {
        //     System.out.println("Error creating file");
        // }

        if (file.exists()){
            System.out.println(file.getAbsolutePath());
        }
    }
}