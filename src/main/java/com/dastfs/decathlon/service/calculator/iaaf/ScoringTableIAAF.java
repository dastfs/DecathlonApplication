package com.dastfs.decathlon.service.calculator.iaaf;

import com.dastfs.decathlon.service.calculator.ScoringTable;
import com.dastfs.decathlon.service.calculator.iaaf.event.EventField;
import com.dastfs.decathlon.service.calculator.iaaf.event.EventTrack;

public enum ScoringTableIAAF implements ScoringTable {

    RUN_100M(25.4347, 18.0, 1.81){
        @Override
        public int calculate(double performance) {
            return new EventTrack().calculate(performance, this);
        }
    },
    LONG_JUMP( 0.14354, 220.0, 1.4) {
        @Override
        public int calculate(double performance) {
            return new EventField().calculate(performance, this);
        }
    },
    SHOT_PUT( 51.39, 1.5, 1.05) {
        @Override
        public int calculate(double performance) {
            return new EventField().calculate(performance, this);
        }
    },
    HIGH_JUMP( 0.8465, 75.0, 1.42) {
        @Override
        public int calculate(double performance) {
            return new EventField().calculate(performance, this);
        }
    },
    RUN_400M( 1.53775, 82.0, 1.81) {
        @Override
        public int calculate(double performance) {
            return new EventTrack().calculate(performance, this);
        }
    },
    RUN_100M_HURDLES( 5.74352, 28.5, 1.92) {
        @Override
        public int calculate(double performance) {
            return new EventTrack().calculate(performance, this);
        }
    },
    DISCUS_THROW( 12.91, 4.0, 1.1) {
        @Override
        public int calculate(double performance) {
            return new EventField().calculate(performance, this);
        }
    },
    POLE_VAULT( 0.2797, 100.0, 1.35) {
        @Override
        public int calculate(double performance) {
            return new EventField().calculate(performance, this);
        }
    },
    JAVELIN_THROW( 10.14, 7.0, 1.08) {
        @Override
        public int calculate(double performance) {
            return new EventField().calculate(performance, this);
        }
    },
    RUN_1500M( 0.03768, 480.0, 1.85) {
        @Override
        public int calculate(double performance) {
            return new EventTrack().calculate(performance, this);
        }
    };

    ScoringTableIAAF(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private final double a;
    private final double b;
    private final double c;

}
