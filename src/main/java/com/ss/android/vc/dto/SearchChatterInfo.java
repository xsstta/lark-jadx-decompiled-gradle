package com.ss.android.vc.dto;

import com.ss.android.lark.chat.export.entity.chatter.ChatterType;
import com.ss.android.lark.chat.export.entity.chatter.IChatterDesc;

public class SearchChatterInfo extends BaseSearchInfo {
    private boolean canJoinGroup;
    private IChatterDesc chatterDescription;
    private ChatterType chatterType;
    private boolean inContacts;
    private boolean isRegistered;
    private String tenantId;
    private String withBotTag;
    private long zenModeEndTime;

    public IChatterDesc getChatterDescription() {
        return this.chatterDescription;
    }

    public ChatterType getChatterType() {
        return this.chatterType;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getWithBotTag() {
        return this.withBotTag;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isCanJoinGroup() {
        return this.canJoinGroup;
    }

    public boolean isInContacts() {
        return this.inContacts;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public void setCanJoinGroup(boolean z) {
        this.canJoinGroup = z;
    }

    public void setChatterDescription(IChatterDesc iChatterDesc) {
        this.chatterDescription = iChatterDesc;
    }

    public void setChatterType(ChatterType chatterType2) {
        this.chatterType = chatterType2;
    }

    public void setInContacts(boolean z) {
        this.inContacts = z;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setWithBotTag(String str) {
        this.withBotTag = str;
    }

    public void setZenModeEndTime(long j) {
        this.zenModeEndTime = j;
    }
}
