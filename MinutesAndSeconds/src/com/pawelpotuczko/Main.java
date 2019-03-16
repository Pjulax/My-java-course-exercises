package com.pawelpotuczko;

public class Main {

    public static void main(String[] args) {
        System.out.println(timeCalculate(1257,55));
        System.out.println(timeCalculate(1209734,40));
        System.out.println(timeCalculate(123,-5));
        System.out.println(timeCalculate(-1, 55));
        System.out.println(timeCalculate(-1, -5));
        System.out.println(timeCalculate(-5, 72));
        System.out.println(timeCalculate(60));
        System.out.println(timeCalculate(3600));
        System.out.println(timeCalculate(3857));
        System.out.println(timeCalculate(-50));
    }

    public static String timeCalculate(int minutes, int seconds){
        if( minutes >= 0 && seconds >= 0 && seconds <= 59){
            int hours = (int) minutes/60;
            minutes %= 60;

            String hoursStr = hours + "h";
            if(hours < 10){
                hoursStr = "0" + hoursStr;
            }
            String minutesStr = minutes + "m";
            if(minutes < 10){
                minutesStr = "0" + minutesStr;
            }
            String secondsStr = seconds + "s";
            if(seconds < 10){
                secondsStr = "0" + secondsStr;
            }

            return hoursStr + " " + minutesStr + " " + secondsStr;

//            String time;  BAD VERSION TOO LONG TO MANY IFs
//
//            if(hours < 10) {
//                if (minutes < 10) {
//                    if (seconds < 10) {
//                        time = "0" + hours + "h 0" + minutes + "m 0" + seconds + "s it is";
//                    } else {
//                        time = "0" + hours + "h 0" + minutes + "m " + seconds + "s it is";
//                    }
//                } else {
//                    if (seconds < 10) {
//                        time = "0" + hours + "h " + minutes + "m 0" + seconds + "s it is";
//                    } else {
//                        time = "0" + hours + "h " + minutes + "m " + seconds + "s it is";
//                    }
//                }
//            } else {
//                if (minutes < 10) {
//                    if (seconds < 10) {
//                        time =  hours + "h 0" + minutes + "m 0" + seconds + "s it is";
//                    } else {
//                        time =  + hours + "h 0" + minutes + "m " + seconds + "s it is";
//                    }
//                } else {
//                    if (seconds < 10) {
//                        time =  + hours + "h " + minutes + "m 0" + seconds + "s it is";
//                    } else {
//                        time =  + hours + "h " + minutes + "m " + seconds + "s it is";
//                    }
//                }
//            }
//            return time;
        }
        return "Invalid minutes or seconds value!";
    }

    public static String timeCalculate(int seconds) {
        if(seconds < 0){
            return "Invalid seconds value!";
        }
        int minutes = (int) seconds/60;
        seconds %= 60;
        return timeCalculate(minutes, seconds);
    }
}

