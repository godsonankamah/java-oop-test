package exceptions;

public class ProductAlreadyRegisteredException extends RuntimeException{

   public ProductAlreadyRegisteredException(){
       super();
   }

   public ProductAlreadyRegisteredException(final String message){
       super(message);
   }
}
