package com.dastfs.decathlon.model;

public enum Decathlon {
    NAME(0),
    RUN100M(1),
    LONGJUMP(2),
    SHOTJUMP(3),
    HIGHJUMP(4),
    RUN400M(5),
    HURDLES110M(6),
    THROWDISCUS(7),
    POLEVAULT(8),
    THROWJAVELIN(9),
    RUN1500M(10);

    private int index;

    Decathlon(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
