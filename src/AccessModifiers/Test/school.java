package AccessModifiers.Test;

public class school {

   private static school instance;

   private school(){   //Yaha pe constructor private h toh object sirf ekk hi baar create ho payega

   }

   public static school getInstance(){
       if(instance==null) {
           instance = new school();

       }
       return instance;
   }

}
