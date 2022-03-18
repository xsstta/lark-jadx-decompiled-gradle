package com.ss.android.vc.entity.follow;

import java.util.List;

public class FollowGrootCellPayload {
    private static final long serialVersionUID = 1;
    private List<FollowPatch> followPatches;
    private List<FollowState> followStates;
    private Type type;

    public enum Type {
        UNKNOWN(0),
        PATCHES(1),
        STATES(2);
        
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
                return PATCHES;
            }
            if (i != 2) {
                return null;
            }
            return STATES;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public List<FollowPatch> getFollowPatches() {
        return this.followPatches;
    }

    public List<FollowState> getFollowStates() {
        return this.followStates;
    }

    public Type getType() {
        return this.type;
    }

    public String toString() {
        return "FollowGrootCellPayload{type=" + this.type + ", followPatches=" + this.followPatches + ", followStates=" + this.followStates + '}';
    }

    public void setFollowPatches(List<FollowPatch> list) {
        this.followPatches = list;
    }

    public void setFollowStates(List<FollowState> list) {
        this.followStates = list;
    }

    public void setType(Type type2) {
        this.type = type2;
    }
}
