import org.optional.House;
import org.optional.HouseService;
import org.optional.Person;

import java.util.ArrayList;
import java.util.List;

public class OptionalTest {
    public static void main(String[] args) {

        List<House> list = new ArrayList<>();
        House house1 = new House(new Person("donghun"), "신림동");
        House house2 = new House(new Person("bboombba"),"평택");
        House house3 = new House(new Person("dain"),"가좌동");
        House house4 = new House(new Person("know"),"원주");
        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);

        HouseService houseService = new HouseService(list);

        House house = houseService.getRandomHouse();
        System.out.println(house.getOwner().getName());
    }
}
