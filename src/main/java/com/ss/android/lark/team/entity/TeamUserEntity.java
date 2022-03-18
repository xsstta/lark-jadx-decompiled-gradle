package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class TeamUserEntity implements Serializable {
    private static final long serialVersionUID = 4939940387694822720L;
    private Role role = Role.UNKNOWN;

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role2) {
        this.role = role2;
    }

    public enum Role {
        UNKNOWN(0),
        MEMBER(1),
        OWNER(2);
        
        final int value;

        public static Role fromValue(int i) {
            if (i == 1) {
                return MEMBER;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return OWNER;
        }

        private Role(int i) {
            this.value = i;
        }
    }
}
