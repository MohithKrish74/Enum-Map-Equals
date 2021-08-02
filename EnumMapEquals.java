package com.keyword;

import java.util.EnumMap;

enum Bikes{HONDA,BAJAJ,TVS,ROYAL_ENFIELD,YAMAHA}
public class EnumMapEquals
{
    public static void main(String[] args)
    {
        EnumMap<Bikes,String> map1 = new EnumMap<Bikes, String>(Bikes.class);
        EnumMap<Bikes,String> map2 = new EnumMap<Bikes, String>(Bikes.class);
        map1.put(Bikes.HONDA,"Honda CBR");
        map1.put(Bikes.BAJAJ,"Pulsar");
        map1.put(Bikes.TVS,"Apache");
        map1.put(Bikes.ROYAL_ENFIELD,"Bullet");
        map1.put(Bikes.YAMAHA,"Yamaha R15 V3");
        map2.put(Bikes.HONDA,"Honda CBR");
        map2.put(Bikes.BAJAJ,"Pulsar");
        map2.put(Bikes.TVS,"Apache");
        map2.put(Bikes.ROYAL_ENFIELD,"Bullet");
        map2.put(Bikes.YAMAHA,"Yamaha R15 V3");
        System.out.println("The Map 1 is :"+map1);
        System.out.println("The Map 2 is :"+map2);
        System.out.println("Does Map1 equals Map2 :"+map1.equals(map2));
    }
}
