package com.cedriccarre;

import java.util.List;
import java.util.Objects;

public class Hallowwen {
    public static String givePacket(int nbOfChildren, List<String[]> packets) {
        if(packets.size() < nbOfChildren) {
            return "Trick or treat!";
        }
        for (String [] packet: packets) {
            for (int i = 0; i < packet.length; i++) {
                if(!Objects.equals(packet[i], "candy")){
                    return "Trick or treat!";
                }
            }
        }
        return "Thank you, strange uncle!";
    }
}
