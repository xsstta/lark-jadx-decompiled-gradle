package com.ss.android.lark.member_manage.dto;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import java.util.List;

public class SearchChatterInfo extends BaseSearchInfo {
    private static final long serialVersionUID = -6450079357246355860L;
    private ChatterDescription chatterDescription;
    private Chatter.ChatterType chatterType;
    private int deniedReason;
    private boolean hasOUPermission;
    private boolean hasSecretPermission;
    private boolean inChat;
    private boolean isRegistered;
    private boolean isRemind;
    private String tenantId;
    private String withBotTag;
    private WorkStatus workStatus;
    private final long zenModeEndTime;

    public ChatterDescription getChatterDescription() {
        return this.chatterDescription;
    }

    public Chatter.ChatterType getChatterType() {
        return this.chatterType;
    }

    public int getDeniedReason() {
        return this.deniedReason;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getWithBotTag() {
        return this.withBotTag;
    }

    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }

    public long getZenModeEndTime() {
        return this.zenModeEndTime;
    }

    public boolean isHasOUPermission() {
        return this.hasOUPermission;
    }

    public boolean isHasSecretPermission() {
        return this.hasSecretPermission;
    }

    public boolean isInChat() {
        return this.inChat;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    public void setChatterDescription(ChatterDescription chatterDescription2) {
        this.chatterDescription = chatterDescription2;
    }

    public void setChatterType(Chatter.ChatterType chatterType2) {
        this.chatterType = chatterType2;
    }

    public void setDeniedReason(int i) {
        this.deniedReason = i;
    }

    public void setHasOUPermission(boolean z) {
        this.hasOUPermission = z;
    }

    public void setHasSecretPermission(boolean z) {
        this.hasSecretPermission = z;
    }

    public void setInChat(boolean z) {
        this.inChat = z;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setWithBotTag(String str) {
        this.withBotTag = str;
    }

    public void setWorkStatus(WorkStatus workStatus2) {
        this.workStatus = workStatus2;
    }

    public SearchChatterInfo(String str, int i, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, Chatter.ChatterType chatterType2, ChatterDescription chatterDescription2, boolean z, boolean z2, String str6, String str7, boolean z3, WorkStatus workStatus2, long j, boolean z4, boolean z5, int i2) {
        super(str, i, str2, str3, str4, str5, list, list2);
        this.chatterType = chatterType2;
        this.chatterDescription = chatterDescription2;
        this.isRegistered = z;
        this.isRemind = z2;
        this.withBotTag = str6;
        this.tenantId = str7;
        this.workStatus = workStatus2;
        this.inChat = z3;
        this.zenModeEndTime = j;
        this.hasOUPermission = z4;
        this.hasSecretPermission = z5;
        this.deniedReason = i2;
    }
}
