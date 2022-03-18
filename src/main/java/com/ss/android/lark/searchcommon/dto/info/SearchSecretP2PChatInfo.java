package com.ss.android.lark.searchcommon.dto.info;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;

public class SearchSecretP2PChatInfo extends SearchBaseInfo {
    private static final long serialVersionUID = 2201107773829679779L;
    private boolean canJoinGroup;
    private ChatterDescription chatterDescription;
    private String chatterId;
    private Chatter.ChatterType chatterType;
    private boolean inContacts;
    private boolean isRegistered;
    private String tenantId;
    private String withBotTag;

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public String getChatterId() {
        return this.chatterId;
    }

    public Chatter.ChatterType getChatterType() {
        return this.chatterType;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getWithBotTag() {
        return this.withBotTag;
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

    public SearchSecretP2PChatInfo() {
        this.type = 11;
    }

    public void setCanJoinGroup(boolean z) {
        this.canJoinGroup = z;
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setChatterId(String str) {
        this.chatterId = str;
    }

    public void setChatterType(Chatter.ChatterType chatterType2) {
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
}
