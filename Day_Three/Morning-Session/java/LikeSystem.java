public class LikeSystem{
   

    public static String collectName(String[] names){
       
        
        
        for(int count = 1; count < names.length ;count++){
            if(names.length == 1){
            
                return "%s likes this" + names[count];
            }
           else if(names.length == 2){
                return String.format("%s and %s likes this"+ names[count]);
            }
            
            else if(names.length == 3){
                return "%s , %s and %s likes this " + names[count];

//            else if(count = 4){
//                return System.out.printf("% ")
//            }
            
            }

        }
            return null;
    }
}
