package com.epam.conditions;

import java.util.HashMap;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        HashMap<Integer, String> seasons = new HashMap<>();
        seasons.put(1, "Winter");
        seasons.put(2, "Winter");
        seasons.put(3, "Spring");
        seasons.put(4, "Spring");
        seasons.put(5, "Spring");
        seasons.put(6, "Summer");
        seasons.put(7, "Summer");
        seasons.put(8, "Summer");
        seasons.put(9, "Autumn");
        seasons.put(10, "Autumn");
        seasons.put(11, "Autumn");
        seasons.put(12, "Winter");

        String season = seasons.getOrDefault(monthNumber, "Wrong month number");
        System.out.println(season);
    }

}
