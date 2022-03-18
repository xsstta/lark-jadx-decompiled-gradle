package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class TeamSetting implements Serializable {
    private static final long serialVersionUID = 8260886629718982206L;
    private AddMemberPermission addMemberPermission = AddMemberPermission.UNKNOWN;
    private BindTeamChatPermission bindTeamChatPermission = BindTeamChatPermission.UNKNOWN;
    private CreateTeamChatPermission createTeamChatPermission = CreateTeamChatPermission.UNKNOWN;

    public enum AddMemberPermission {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_OWNER(2);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static AddMemberPermission fromValue(int i) {
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_OWNER;
        }

        private AddMemberPermission(int i) {
            this.value = i;
        }
    }

    public enum BindTeamChatPermission {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_OWNER(2);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static BindTeamChatPermission fromValue(int i) {
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_OWNER;
        }

        private BindTeamChatPermission(int i) {
            this.value = i;
        }
    }

    public enum CreateTeamChatPermission {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_OWNER(2);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static CreateTeamChatPermission fromValue(int i) {
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_OWNER;
        }

        private CreateTeamChatPermission(int i) {
            this.value = i;
        }
    }

    public AddMemberPermission getAddMemberPermission() {
        return this.addMemberPermission;
    }

    public BindTeamChatPermission getBindTeamChatPermission() {
        return this.bindTeamChatPermission;
    }

    public CreateTeamChatPermission getCreateTeamChatPermission() {
        return this.createTeamChatPermission;
    }

    public void setAddMemberPermission(AddMemberPermission addMemberPermission2) {
        this.addMemberPermission = addMemberPermission2;
    }

    public void setBindTeamChatPermission(BindTeamChatPermission bindTeamChatPermission2) {
        this.bindTeamChatPermission = bindTeamChatPermission2;
    }

    public void setCreateTeamChatPermission(CreateTeamChatPermission createTeamChatPermission2) {
        this.createTeamChatPermission = createTeamChatPermission2;
    }
}
