package Radio;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetRequiredStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        int expected = 4;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationAboveMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(27);
        radio.nextStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        int expected = 6;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        radio.prevStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(72);
        radio.increaseVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);
        radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }


}

