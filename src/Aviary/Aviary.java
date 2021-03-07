package Aviary;

public class Aviary<T> {
    private AviarySize aviarySize;

    public Aviary() {
        aviarySize = AviarySize.MEDIUM;
    }

    public Aviary(AviarySize aviarySize) {
        this.aviarySize = aviarySize;
    }
}
