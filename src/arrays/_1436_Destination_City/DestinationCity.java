package arrays._1436_Destination_City;

import java.util.HashMap;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> links = new HashMap<>();

        for (List<String> path : paths) {
            links.put(path.get(0), path.get(1));
        }

        String city = paths.get(0).get(0);

        while (links.containsKey(city)) {
            city = links.get(city);
        }

        return city;
    }
}