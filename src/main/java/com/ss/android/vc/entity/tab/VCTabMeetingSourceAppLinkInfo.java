package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VCTabMeetingSourceAppLinkInfo implements Serializable {
    private VCParamFromCalendar paramFromCalendar;
    private VCParamFromGroup paramFromGroup;
    private Type type;

    public enum Type {
        UNKNOWN(0),
        CALENDAR(1),
        GROUP(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CALENDAR;
            }
            if (i != 2) {
                return null;
            }
            return GROUP;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public VCParamFromCalendar getParamFromCalendar() {
        return this.paramFromCalendar;
    }

    public VCParamFromGroup getParamFromGroup() {
        return this.paramFromGroup;
    }

    public Type getType() {
        return this.type;
    }

    public void setParamFromCalendar(VCParamFromCalendar vCParamFromCalendar) {
        this.paramFromCalendar = vCParamFromCalendar;
    }

    public void setParamFromGroup(VCParamFromGroup vCParamFromGroup) {
        this.paramFromGroup = vCParamFromGroup;
    }

    public void setType(Type type2) {
        this.type = type2;
    }
}
