package com.cedriccarre;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Halloween {

    public static final String TRICK_OR_TREAT = "Trick or treat!";
    public static final String THANK_YOU_STRANGE_UNCLE = "Thank you, strange uncle!";
    public static final String BOMB = "bomb";
    public static final String CANDY = "candy";
    public static final int MIN_SIZE_FOR_VALID_PACKET = 2;

    public static String givePacket(int nbOfChildren, List<List<String>> bag) {
        List<List<String>> bagContainedOnlyPacketsWithCandies = new ArrayList<>();
        if(bag.size() < nbOfChildren) {
            return TRICK_OR_TREAT;
        }
        for (List<String> packet : bag) {
            List<String> packetsContainingOnlyCandies = new ArrayList<>();
            for (int i = 0; i < packet.size(); i++) {
                if (isNotValidPacket(packet, i)) {
                    return TRICK_OR_TREAT;
                }
                if (isCandyItem(packet, i)) {
                    packetsContainingOnlyCandies.add(packet.get(i));
                }
            }
            bagContainedOnlyPacketsWithCandies.add(packetsContainingOnlyCandies);
        }
        List<Integer> candiesPerPacket = bagContainedOnlyPacketsWithCandies
                .stream()
                .map(List::size)
                .toList();
        for (int i = 0; i < candiesPerPacket.size(); i++) {
            if (!Objects.equals(candiesPerPacket.get(0), candiesPerPacket.get(i)) || isNotEnough(candiesPerPacket, i)) {
                return TRICK_OR_TREAT;
            }
        }
        return THANK_YOU_STRANGE_UNCLE;
    }

    private static boolean isNotValidPacket(List<String> packet, int i) {
        return packet.size() < MIN_SIZE_FOR_VALID_PACKET || isThereAnyBomb(packet, i);
    }

    private static boolean isNotEnough(List<Integer> candiePerPacket, int i) {
        return candiePerPacket.get(i) < MIN_SIZE_FOR_VALID_PACKET;
    }

    private static boolean isCandyItem(List<String> packet, int i) {
        return Objects.equals(packet.get(i), CANDY);
    }

    private static boolean isThereAnyBomb(List<String> packet, int i) {
        return Objects.equals(packet.get(i), BOMB);
    }
}
