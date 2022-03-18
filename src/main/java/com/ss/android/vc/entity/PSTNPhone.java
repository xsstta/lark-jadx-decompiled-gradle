package com.ss.android.vc.entity;

import java.io.Serializable;

public class PSTNPhone implements Serializable {
    public String country;
    public String displayNumber;
    public String number;
    public Type type;

    public enum Type {
        UNKNOWN(0),
        FREE(1),
        CHARGE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FREE;
            }
            if (i != 2) {
                return null;
            }
            return CHARGE;
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
