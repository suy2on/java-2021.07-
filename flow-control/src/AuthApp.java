public class AuthApp {

    public static void main(String[] args){

        String id = "suy2on";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

        // inputId == id
        if(inputId.equals(id) && inputPass.equals(pass)){
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }

    }
}
