import com.cedriccarre.Hallowwen;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class HalloweenShould {

    @Test
    void todo() {
        //Arrange
        List<String[]> packets = new ArrayList<>();
        String[] p1 = {"candy", "candy"};
        packets.add(p1);
        //Act
        String actualResult = Hallowwen.givePacket(1 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Thank you, strange uncle!");
    }

    @Test
    void return_thx_when_given_2_children_2_packets_with_2_candies_in_each() {
        //Arrange
        List<String[]> packets = new ArrayList<>();
        String[] p1 = {"candy", "candy"};
        String[] p2 = {"candy", "candy"};
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
        List<String[]> packets = new ArrayList<>();
        String[] p1 = {"candy", "candy"};
        String[] p2 = {"candy", "candy"};
        packets.add(p1);
        packets.add(p2);
        //Act
        String actualResult = Hallowwen.givePacket(3 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");
    }

    @Test
    void todo3() {
        //Arrange
        List<String[]> packets = new ArrayList<>();
        String[] p = {"candy", "apple"};
        packets.add(p);
        packets.add(p);
        packets.add(p);
        //Act
        String actualResult = Hallowwen.givePacket(3 , packets);
        //Assert
        assertThat(actualResult).isEqualTo("Trick or treat!");
    }
}
