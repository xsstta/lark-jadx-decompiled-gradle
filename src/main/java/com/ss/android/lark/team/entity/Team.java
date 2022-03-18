package com.ss.android.lark.team.entity;

import java.io.Serializable;

public class Team implements Serializable {
    private static final long serialVersionUID = 849621351243686877L;
    private String avatarKey;
    private long createTime;
    private long defaultChatId;
    private String description;
    private long id;
    private int memberCount;
    private String name;
    private long ownerId;
    private Status status;
    private TeamSetting teamSetting;
    private TeamUserEntity teamUserEntity;
    private long version;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDefaultChatId() {
        return this.defaultChatId;
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.id;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public String getName() {
        return this.name;
    }

    public long getOwnerId() {
        return this.ownerId;
    }

    public Status getStatus() {
        return this.status;
    }

    public TeamSetting getTeamSetting() {
        return this.teamSetting;
    }

    public TeamUserEntity getTeamUserEntity() {
        return this.teamUserEntity;
    }

    public long getVersion() {
        return this.version;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDefaultChatId(long j) {
        this.defaultChatId = j;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwnerId(long j) {
        this.ownerId = j;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setTeamSetting(TeamSetting teamSetting2) {
        this.teamSetting = teamSetting2;
    }

    public void setTeamUserEntity(TeamUserEntity teamUserEntity2) {
        this.teamUserEntity = teamUserEntity2;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public enum Status {
        UNKNOWN(0),
        ACTIVE(1),
        DISSOLVED(2);
        
        int value;

        public static Status fromValue(int i) {
            if (i == 1) {
                return ACTIVE;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return DISSOLVED;
        }

        private Status(int i) {
            this.value = i;
        }
    }
}
