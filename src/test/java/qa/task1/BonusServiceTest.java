package qa.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        int amount = 2000;
        int expected = 10;

        BonusService bonusService = new BonusService();
        int actuall = bonusService.calculateBonus(amount);

        assertEquals(expected,actuall);
    }
}