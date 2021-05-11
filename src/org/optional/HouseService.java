package org.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HouseService {

    private List<House> list;

    public HouseService() {

    }

    public HouseService(List houseList){
        list = houseList;
    }
    public House getRandomHouse(){

        int a = (int)(Math.random()*list.size());
        return list.get(a);
    }
}
