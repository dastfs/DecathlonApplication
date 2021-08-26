package com.dastfs.decathlon.model;

public class Athlete {
    private String name;
    private double run100m;
    private double longJump;
    private double shotJump;
    private double highJump;
    private double run400m;
    private double hurdles110m;
    private double throwDiscus;
    private double poleVault;
    private double throwJavelin;
    private double run1500m;

    public Athlete(AthleteBuilder athleteBuilder) {
        this.name = athleteBuilder.name;
        this.run100m = athleteBuilder.run100m;
        this.longJump = athleteBuilder.longJump;
        this.shotJump = athleteBuilder.shotJump;
        this.highJump = athleteBuilder.highJump;
        this.run400m = athleteBuilder.run400m;
        this.hurdles110m = athleteBuilder.hurdles110m;
        this.throwDiscus = athleteBuilder.throwDiscus;
        this.poleVault = athleteBuilder.poleVault;
        this.throwJavelin = athleteBuilder.throwJavelin;
        this.run1500m = athleteBuilder.run1500m;
    }

    public String getName() {
        return name;
    }

    public double getRun100m() {
        return run100m;
    }

    public double getLongJump() {
        return longJump;
    }

    public double getShotJump() {
        return shotJump;
    }

    public double getHighJump() {
        return highJump;
    }

    public double getRun400m() {
        return run400m;
    }

    public double getHurdles110m() {
        return hurdles110m;
    }

    public double getThrowDiscus() {
        return throwDiscus;
    }

    public double getPoleVault() {
        return poleVault;
    }

    public double getThrowJavelin() {
        return throwJavelin;
    }

    public double getRun1500m() {
        return run1500m;
    }

    public static class AthleteBuilder {
        private String name;
        private double run100m;
        private double longJump;
        private double shotJump;
        private double highJump;
        private double run400m;
        private double hurdles110m;
        private double throwDiscus;
        private double poleVault;
        private double throwJavelin;
        private double run1500m;

        public AthleteBuilder(String name) {
            this.name = name;
        }

        public AthleteBuilder run100m(double run100m) {
            this.run100m = run100m;
            return this;
        }

        public AthleteBuilder shotJump(double shotJump) {
            this.shotJump = shotJump;
            return this;
        }

        public AthleteBuilder longJump(double longJump) {
            this.longJump = longJump;
            return this;
        }
        public AthleteBuilder highJump(double highJump) {
            this.highJump = highJump;
            return this;
        }
        public AthleteBuilder run400m(double run400m) {
            this.run400m = run400m;
            return this;
        }
        public AthleteBuilder hurdles110m(double hurdles110m) {
            this.hurdles110m = hurdles110m;
            return this;
        }
        public AthleteBuilder throwDiscus(double throwDiscus) {
            this.throwDiscus = throwDiscus;
            return this;
        }
        public AthleteBuilder poleVault(double poleVault) {
            this.poleVault = poleVault;
            return this;
        }
        public AthleteBuilder throwJavelin(double throwJavelin) {
            this.throwJavelin = throwJavelin;
            return this;
        }
        public AthleteBuilder run1500m(double run1500m) {
            this.run1500m = run1500m;
            return this;
        }

        public Athlete build(){
            Athlete athlete = new Athlete(this);
            return athlete;
        }

    }


    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", run100m=" + run100m +
                ", longJump=" + longJump +
                ", shotJump=" + shotJump +
                ", highJump=" + highJump +
                ", run400m=" + run400m +
                ", hurdles110m=" + hurdles110m +
                ", throwDiscus=" + throwDiscus +
                ", poleVault=" + poleVault +
                ", throwJavelin=" + throwJavelin +
                ", run1500m=" + run1500m +
                '}';
    }
}

/*
*
100 m	10.395	10.827	11.278	11.756	Seconds
Long jump	7.76	7.36	6.94	6.51	Metres
Shot put	18.40	16.79	15.16	13.53	Metres
High jump	2.20	2.10	1.99	1.88	Metres
400 m	46.17	48.19	50.32	52.58	Seconds
110 m hurdles	13.80	14.59	15.419	16.29	Seconds
Discus throw	56.17	51.4	46.59	41.72	Metres
Pole vault	5.28	4.96	4.63	4.29	Metres
Javelin throw	77.19	70.67	64.09	57.45	Metres
1500 m	3:53.79	4:07.42	4:21.77	4:36.96	Minutes:Seconds
* */