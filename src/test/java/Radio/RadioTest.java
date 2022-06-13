package Radio;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(15);
        assertEquals(14, radio.getMaxStation());
    }

    @Test
    public void shouldIncreaseWithNewMaxStation() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(11, radio.getCurrentStation());
    }

    @Test
    public void shouldSetRequiredStation() {
        radio.setCurrentStation(4);

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(3);
        radio.nextStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMaxLimit() {

        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationAboveMaxLimit() {
        radio.setCurrentStation(27);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        radio.setCurrentStation(7);
        radio.prevStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMinLimit() {
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationUnderLimit() {
        radio.setCurrentStation(-5);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(70);
        radio.increaseVolume();

        assertEquals(71, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        radio.setCurrentVolume(150);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        radio.setCurrentVolume(-100);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }


}

