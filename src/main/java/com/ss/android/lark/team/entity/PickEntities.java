package com.ss.android.lark.team.entity;

import java.io.Serializable;
import java.util.List;

public class PickEntities implements Serializable {
    private static final long serialVersionUID = -3601418097418905974L;
    private List<String> pickIds;
    private PickType pickType = PickType.UNKNOWN;

    public enum PickType {
        UNKNOWN(0),
        USER(1),
        CHAT(2),
        DEPT(3);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static PickType fromValue(int i) {
            if (i == 1) {
                return USER;
            }
            if (i == 2) {
                return CHAT;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return DEPT;
        }

        private PickType(int i) {
            this.value = i;
        }
    }

    public List<String> getPickIds() {
        return this.pickIds;
    }

    public PickType getPickType() {
        return this.pickType;
    }

    public void setPickIds(List<String> list) {
        this.pickIds = list;
    }

    public void setPickType(PickType pickType2) {
        this.pickType = pickType2;
    }
}
