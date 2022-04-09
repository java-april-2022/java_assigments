import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. AlfredBot at your service.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        return String.format("The time is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return "Who is Alexis?, I dont think she can be of help.";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "How may I be at your service.";
        }
        return "If no more questions, I shall recharge my batteries.";
    }
}

