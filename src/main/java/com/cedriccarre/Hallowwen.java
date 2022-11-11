package com.cedriccarre;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hallowwen {
    public static String givePacket(int nbOfChildren, List<List<String>> bag) {
        List<List<String>> newBag = new ArrayList<>();
        if(bag.size() < nbOfChildren) {
            return "Trick or treat!";
        }
        for (List<String> packet: bag) {
            List<String> filteredPacked = new ArrayList<>();
            for (int i = 0; i < packet.size(); i++) {
                if(packet.size() < 2){
                    return "Trick or treat!";
                }
                if(packet.get(i).equals("bomb")){
                    return "Trick or treat!";
                }
                if(packet.get(i).equals("candy")){
                    filteredPacked.add(packet.get(i));
                }
            }
            newBag.add(filteredPacked);
        }
        List<Integer> candieNbPerPacket = new ArrayList<>();
        for (List<String> packet : newBag) {
            candieNbPerPacket.add(packet.size());
        }
        for (int i = 0; i < candieNbPerPacket.size(); i++) {
            if(candieNbPerPacket.get(0) != candieNbPerPacket.get(i)){
                return "Trick or treat!";
            }
        }
        return "Thank you, strange uncle!";
    }
}
