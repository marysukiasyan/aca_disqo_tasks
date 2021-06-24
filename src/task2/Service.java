package task2;

import java.util.*;


public class Service {


    public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        Cartoon car1 = new Cartoon("Spirited Away", 8.6);
        Cartoon car2 = new Cartoon("Your Name", 	8.4);
        Cartoon car3 = new Cartoon("The Lion King", 8.5);
        Cartoon car4 = new Cartoon("Grave of the Fireflies",8.5);
        Cartoon car5 = new Cartoon("A Silent Voice: The Movie", 8.2);
        Cartoon car6 = new Cartoon("Toy Story ", 8.3);

        Movie mov1 = new Movie(" The Shawshank Redemption", 9.2);
        Movie mov2 = new Movie("The Dark Knight ", 9.0);
        Movie mov3 = new Movie("The Godfather", 9.1);
        Movie mov4 = new Movie("Schindler's List ", 8.9);
        Movie mov5 = new Movie(" Fight Club", 8.2);

        HashMap<String, Double> imbdRating = new HashMap<String, Double>();
        imbdRating.put(car1.getTitle(), car1.getRating());
        imbdRating.put(car2.getTitle(), car2.getRating());
        imbdRating.put(car3.getTitle(), car3.getRating());
        imbdRating.put(car4.getTitle(), car4.getRating());
        imbdRating.put(car5.getTitle(), car5.getRating());
        imbdRating.put(car6.getTitle(), car6.getRating());

        imbdRating.put(mov1.getTitle(), mov1.getRating());
        imbdRating.put(mov2.getTitle(), mov2.getRating());
        imbdRating.put(mov3.getTitle(), mov3.getRating());
        imbdRating.put(mov4.getTitle(), mov4.getRating());
        imbdRating.put(mov5.getTitle(), mov5.getRating());


        Double minValue = Collections.min(imbdRating.values());

        Double maxValue = Collections.max(imbdRating.values());


        System.out.println(getKeys(imbdRating, minValue));

    }

}
