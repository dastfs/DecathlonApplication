package com.dastfs.decathlon.model;

public class AthletePerformance {
    private final String name;
    private final double run100m;
    private final double shotPut;
    private final double highJump;
    private final double run400m;
    private final double longJump;
    private final double run110mHurdles;
    private final double discusThrow;
    private final double poleVault;
    private final double javelinThrow;
    private final double run1500m;
    private int result;

    private AthletePerformance(AthleteBuilder athleteBuilder) {
        this.name = athleteBuilder.name;
        this.run100m = athleteBuilder.run100m;
        this.longJump = athleteBuilder.longJump;
        this.shotPut = athleteBuilder.shotPut;
        this.highJump = athleteBuilder.highJump;
        this.run400m = athleteBuilder.run400m;
        this.run110mHurdles = athleteBuilder.run110mHurdles;
        this.discusThrow = athleteBuilder.discusThrow;
        this.poleVault = athleteBuilder.poleVault;
        this.javelinThrow = athleteBuilder.javelinThrow;
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

    public double getShotPut() {
        return shotPut;
    }

    public double getHighJump() {
        return highJump;
    }

    public double getRun400m() {
        return run400m;
    }

    public double getRun110mHurdles() {
        return run110mHurdles;
    }

    public double getDiscusThrow() {
        return discusThrow;
    }

    public double getPoleVault() {
        return poleVault;
    }

    public double getJavelinThrow() {
        return javelinThrow;
    }

    public double getRun1500m() {
        return run1500m;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public static class AthleteBuilder {
        private final String name;
        private double run100m;
        private double longJump;
        private double shotPut;
        private double highJump;
        private double run400m;
        private double run110mHurdles;
        private double discusThrow;
        private double poleVault;
        private double javelinThrow;
        private double run1500m;

        public AthleteBuilder(String name) {
            this.name = name;
        }

        public AthleteBuilder run100m(double run100m) {
            this.run100m = run100m;
            return this;
        }
        public AthleteBuilder longJump(double longJump) {
            this.longJump = longJump;
            return this;
        }
        public AthleteBuilder shotPut(double shotPut) {
            this.shotPut = shotPut;
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
        public AthleteBuilder run110mHurdles(double run110mHurdles) {
            this.run110mHurdles = run110mHurdles;
            return this;
        }
        public AthleteBuilder discusThrow(double discusThrow) {
            this.discusThrow = discusThrow;
            return this;
        }
        public AthleteBuilder poleVault(double poleVault) {
            this.poleVault = poleVault;
            return this;
        }
        public AthleteBuilder javelinThrow(double javelinThrow) {
            this.javelinThrow = javelinThrow;
            return this;
        }
        public AthleteBuilder run1500m(double run1500m) {
            this.run1500m = run1500m;
            return this;
        }

        public AthletePerformance build(){
            return new AthletePerformance(this);
        }
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", run100m=" + run100m +
                ", longJump=" + longJump +
                ", shotJump=" + shotPut +
                ", highJump=" + highJump +
                ", run400m=" + run400m +
                ", hurdles110m=" + run110mHurdles +
                ", throwDiscus=" + discusThrow +
                ", poleVault=" + poleVault +
                ", throwJavelin=" + javelinThrow +
                ", run1500m=" + run1500m +
                '}';
    }
}