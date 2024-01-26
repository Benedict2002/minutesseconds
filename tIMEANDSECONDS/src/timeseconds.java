public class timeseconds {
    private static String getDurationString(int minutes, int seconds){
        if((minutes <0)||(seconds < 0)||(seconds > 59)){
            return "Invalid value";
        }

        int hours = minutes/60;
        int remainingMinutes = minutes % 60;

        return hours +"h :"+remainingMinutes+"m :"+seconds+"s";

    }
    private  static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds/60;
        int remainingseconds = seconds % 60;

        return getDurationString(minutes,remainingseconds);

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(60,0));
       String m = getDurationString(3600);
        System.out.println(m);
    }

}
