package ru.netology;

public class Radio {
    public int numberStation;

    int maxStation = 9;
    int minStation = 0;

    public int getNumberStation() {
        return numberStation;
    }

    public int setNumberStation(int newNumberStation) {
        if (newNumberStation<0) {
            return maxStation;
        }
        if (newNumberStation>9){
            return minStation;
        }
    }

    public int volume;
}
