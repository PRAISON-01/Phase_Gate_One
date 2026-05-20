public class LikeSystem{

    public static void main(String[] args){
        
        String[] array = {"praise","sharon"};
        collectName(array);
        System.out.println(Array.toString(array));
    }
   

    public static String collectName(String[] names){
        String reply = ("no one likes this" );    
    
        if(names.length == 1){
            return  reply = names[0] + "%s likes this";
        }

        else if(names.length == 2){
            return reply = names[0] + "and" + names[1] +" likes this";
        }
            
        else if(names.length == 3){
            return reply = String.format("%s , %s and %s likes this" , names[0], names[1],names[2]);
        }

        else if(names.length == 4){
            return  reply = String.format("%s , %s and 2 others likes this" , names[0] , names[1], names[2]);

        }

       
            return reply;
    }
         
}
           

