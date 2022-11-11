import com.cedriccarre.Hallowwen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class HalloweenShould {

    @Test
    void return_thx_when_given_2_children_2_packets_with_2_candies_in_each() {
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy", "candy");
        List<String> p2 = List.of("candy", "candy");
        packets.add(p1);
        packets.add(p2);
        //Act
        String actualResult = Hallowwen.givePacket(2 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Thank you, strange uncle!");
    }
    @Test
    void return_trick_when_given_3_children_only_2_packets() {
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy", "candy");
        List<String> p2 = List.of("candy", "candy");
        packets.add(p1);
        packets.add(p2);
        //Act
        String actualResult = Hallowwen.givePacket(3 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");
    }

    @Test
    void return_trick_when_given_packet_contains_only_one_item(){
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy");
        List<String> p2 = List.of("candy", "candy");
        packets.add(p1);
        packets.add(p2);
        //Act
        String actualResult = Hallowwen.givePacket(2 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");
    }
    @Test
    void return_trick_when_is_bomb_in_any_packets(){
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy", "candy", "bomb");
        List<String> p2 = List.of("candy", "candy");
        packets.add(p1);
        packets.add(p2);
        //Act
        String actualResult = Hallowwen.givePacket(2 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");

    }

    @Test
    void return_trick_when_at_least_one_child_has_only_got_1_candy(){
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy", "candy");
        List<String> p2 = List.of("candy", "candy");
        List<String> p3 = List.of("candy","apple");
        packets.add(p1);
        packets.add(p2);
        packets.add(p3);
        //Act
        String actualResult = Hallowwen.givePacket(3 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");
    }
    @Test
    void return_Thx_when_children_has_same_number_of_candy(){
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy", "candy", "candy", "banana");
        List<String> p2 = List.of("candy", "candy", "candy", "apple");
        List<String> p3 = List.of("candy","candy", "candy");
        packets.add(p1);
        packets.add(p2);
        packets.add(p3);
        //Act
        String actualResult = Hallowwen.givePacket(3 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Thank you, strange uncle!");
    }

    @Test
    void return_trick_when_each_child_has_only_got_1_candy(){
        //Arrange
        List<List<String>> packets = new ArrayList<>();
        List<String> p1 = List.of("candy", "apple");
        List<String> p2 = List.of("candy", "apple");
        List<String> p3 = List.of("candy","apple");
        packets.add(p1);
        packets.add(p2);
        packets.add(p3);
        //Act
        String actualResult = Hallowwen.givePacket(3 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");
    }







}
