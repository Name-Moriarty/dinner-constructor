package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> listOfDishes;

    DinnerConstructor() {
        this.listOfDishes = new HashMap<>();
    }

    void addDishes(String type, String dishes) {
        if (listOfDishes.containsKey(type)){
            ArrayList<String> list = listOfDishes.get(type);
            list.add(dishes);
            listOfDishes.put(type, list);
            System.out.println("Блюдо добавлено!");
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(dishes);
            listOfDishes.put(type, list);
            System.out.println("Создан тип блюда и в него добавлено блюдо!");
        }
    }

    void randomDishes (int combo, ArrayList <String> menuOfRandom){
        HashMap <Integer,ArrayList<String>> menu = new HashMap<>();
        //
        for (int i =0; i < combo;i++){
            ArrayList <String> randomList = new ArrayList<>();
            for (String str:menuOfRandom){
            if (listOfDishes.containsKey(str)){
                int random = (int) (Math.random()*listOfDishes.get(str).size());
                randomList.add(listOfDishes.get(str).get(random));
            }
            else System.out.println("Блюда типа: "+ str+" не существует и не будет добавлено в комбо");
            }
                menu.put(i+1,randomList);
        }
        for (int i=0; i<menu.size();i++){
            System.out.println("Комбо "+(i+1));
            System.out.println(menu.get(i+1));
        }
    }
}




