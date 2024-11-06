// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String ampm;
		if (hours >= 0 && hours <= 11) {
            ampm = "AM";
        }
		else if (hours == 12 ) {
		    ampm = "PM";
		}
		else {
			hours = hours - 12;
            ampm = "PM";
        }
		if (minutes<10) {
		 String formattedMinutes = String.valueOf(minutes);
		 formattedMinutes= "0" + minutes;
		 System.out.println(hours + ":" + formattedMinutes + ampm);
		}
		else {
		System.out.println(hours + ":" + minutes + ampm);
		}
    }
}
        
	
