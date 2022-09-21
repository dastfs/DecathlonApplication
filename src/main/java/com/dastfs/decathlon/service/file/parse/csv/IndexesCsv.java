package com.dastfs.decathlon.service.file.parse.csv;

public enum IndexesCsv {
    NAME(0),
    RUN100M(1),
    LONGJUMP(2),
    SHOTPUT(3),
    HIGHJUMP(4),
    RUN400M(5),
    RUN110MHURDLES(6),
    DISCUSTHROW(7),
    POLEVAULT(8),
    JAVELINTHROW(9),
    RUN1500M(10);

    private final int index;

    IndexesCsv(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
