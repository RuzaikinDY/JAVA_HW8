package Radio;

public class Radio {
    private int currentStation;

    private int currentVolume;

    private int minStation = 0;

    private int maxStation = 9;

    private int minVolume = 0;

    private int maxVolume = 100;

    public Radio(int quantityStation) {

        this.maxStation = quantityStation - 1;
    }

    public Radio() {

    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;

    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getMaxStation() {

        return maxStation;
    }

    public void setMaxStation(int maxStation) {

        this.maxStation = maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return
                minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }
}

