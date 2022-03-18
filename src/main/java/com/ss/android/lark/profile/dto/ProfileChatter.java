package com.ss.android.lark.profile.dto;

import com.ss.android.lark.chat.entity.chatter.AvatarMedal;
import com.ss.android.lark.profile.entity.WorkStatus;
import java.io.Serializable;

public class ProfileChatter implements Serializable {
    private String alias;
    private String avatarKey;
    private AvatarMedal avatarMedal;
    private String id;
    private boolean isCustomer;
    private boolean isDimission;
    private boolean isProfileEnable;
    private String tenantId;
    private ChatterType type;
    private WorkStatus workStatus;
    private long zenModeEndTime;

    public enum ChatterType {
        USER(1),
        BOT(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ChatterType valueOf(int i) {
            return forNumber(i);
        }

        public static ChatterType forNumber(int i) {
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return null;
            }
            return BOT;
        }

        private ChatterType(int i) {
            this.value = i;
        }
    }

    public ProfileChatter() {
    }

    public String getAlias() {
        return this.alias;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public AvatarMedal getAvatarMedal() {
        return this.avatarMedal;
    }

    public String getId() {
        return this.id;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public ChatterType getType() {
        return this.type;
    }

    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isCustomer() {
        return this.isCustomer;
    }

    public boolean isDimission() {
        return this.isDimission;
    }

    public boolean isProfileEnable() {
        return this.isProfileEnable;
    }

    public boolean isBot() {
        if (getType() == ChatterType.BOT) {
            return true;
        }
        return false;
    }

    public boolean isUser() {
        if (getType() == ChatterType.USER) {
            return true;
        }
        return false;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarMedal(AvatarMedal avatarMedal2) {
        this.avatarMedal = avatarMedal2;
    }

    public void setCustomer(boolean z) {
        this.isCustomer = z;
    }

    public void setDimission(boolean z) {
        this.isDimission = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setProfileEnable(boolean z) {
        this.isProfileEnable = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setType(ChatterType chatterType) {
        this.type = chatterType;
    }

    public void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }

    public ProfileChatter(String str, ChatterType chatterType, WorkStatus workStatus2, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, long j, AvatarMedal avatarMedal2) {
        this.id = str;
        this.type = chatterType;
        this.workStatus = workStatus2;
        this.avatarKey = str2;
        this.tenantId = str3;
        this.alias = str4;
        this.isProfileEnable = z;
        this.isDimission = z2;
        this.isCustomer = z3;
        this.zenModeEndTime = j;
        this.avatarMedal = avatarMedal2;
    }
}
