public class LikeSystem{
   

    public static String collectName(String[] names){
       
        
        
        
            if(names.length == 1){
            
                return "%s likes this" + names[0];
            }
           else if(names.length == 2){
                return "%s and %s likes this"+ names[0]+ names[1];
            }
            
            else if(names.length == 3){
                return "%s , %s and %s likes this " + names[0]+ names[1]+names[2];

//            else if(count = 4){
//                return System.out.printf("% ")
//            }
            
            }

        }
            return null;
    }
}
