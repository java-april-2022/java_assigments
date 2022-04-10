import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put ("Mr. Roboto", "Domo arigato mr. roboto..");
        userMap.put ("We Didn't Start the Fire", "It was always burning since the world been turning..");
        userMap.put ("Bink's Sake", "Yohoho, yohoho ... Gather up all the crew, its time to ship out Bink's Brew..");
        userMap.put ("Dancin", "Get up on the floor Dancin..");
        
        String val = userMap.get("Bink's Sake");

        for (String key : userMap.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, userMap.get(key)));
        }

    }
}





