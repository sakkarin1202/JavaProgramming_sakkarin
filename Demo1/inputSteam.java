import java.io.*;

public class inputSteam {
        public static void main(String[] args) {
            
            try {
                InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader stdin = new BufferedReader(reader);
                System.out.println("Enter your text :");
                String input = stdin.readLine(); 
                System.out.println("-----------------");
                System.out.println("Your text is \"" + input + "\"");
            }catch (IOException e){
                e.printStackTrace();
            }
            
}
}