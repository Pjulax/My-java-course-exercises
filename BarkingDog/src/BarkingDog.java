public class BarkingDog {

    public static boolean shouldWakeUp( boolean barking, int hourOfDay ){
        if ( (hourOfDay >= 0 && hourOfDay < 24) // hour is real
                && (hourOfDay < 8 || hourOfDay > 22) // it is night
                && barking == true ){ // dog is barking
            return true;
        } else {
            return false;
        }
    }

}
