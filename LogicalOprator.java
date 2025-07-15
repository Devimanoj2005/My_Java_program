public class LogicalOprator{
    public static void main(String[]arg){
        String Username = "user1";
        String Password = "pass123";
        if(Username== "user1" && Password =="pass123")
         {
            System.out.println("Login Successful!");
         }
         else{
            if(Username == "user1" && Password != "pass123") {
                System.out.println("Incorrect Password!");
            }
            else{
                if (Username != "user1" && Password == "pass123") {
                    System.out.println("Incorrect Username !");
                }
                
            else{
                System.out.println(" Not registered Yet!.");
            }
                    
                
            }
            }
         }
         }
    
