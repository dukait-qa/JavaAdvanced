package exercise_9.enumerate;

public class JavaProgram1 {
    public static void main(String[] args) {

        Size size = Size.UNSPECIFIED;

try {
    size = Size.valueOf("SMAL");
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
        System.out.println(size);
        System.out.println(size.ordinal());

        for (int i = 0; i < Size.values().length; i++) {
            System.out.println(Size.values()[i].ordinal() + ": " + Size.values()[i] + " " + Size.values()[i].getCode());
        }


        //for(int i = 0; i < Size.values().length; i++) {
//        //System.out.println(Size.values()[i]);
//
//        if(size == Size.SMALL){
//            System.out.println("Your size is S");
//    } else if(size == Size.MEDIUM){
//            System.out.println("Your size is M");
//        } else if(size == Size.LARGE){
//            System.out.println("Your size is L");
//        } else {
//            System.out.println("Your size is XL");
//        }

   /* switch (size) {
        case SMALL -> System.out.println("Your size is S");
        case MEDIUM -> System.out.println("Your size is M");
        case LARGE -> System.out.println("Your size is L");
        case EXTRA_LARGE -> System.out.println("Your size is L");

    }*/

    }


}