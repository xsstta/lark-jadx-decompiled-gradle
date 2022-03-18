package com.ss.android.lark.biz.core.api;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/biz/core/api/PickType;", "Ljava/io/Serializable;", "()V", "enableChatter", "", "getEnableChatter", "()Z", "setEnableChatter", "(Z)V", "enableDepartment", "getEnableDepartment", "setEnableDepartment", "enableExternalChatter", "getEnableExternalChatter", "setEnableExternalChatter", "enableExternalGroup", "getEnableExternalGroup", "setEnableExternalGroup", "enableGroupChat", "getEnableGroupChat", "setEnableGroupChat", "enableMeetingGroup", "getEnableMeetingGroup", "setEnableMeetingGroup", "enablePublicGroup", "getEnablePublicGroup", "setEnablePublicGroup", "enableSecretGroup", "getEnableSecretGroup", "setEnableSecretGroup", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PickType implements Serializable {
    private boolean enableChatter = true;
    private boolean enableDepartment;
    private boolean enableExternalChatter = true;
    private boolean enableExternalGroup;
    private boolean enableGroupChat = true;
    private boolean enableMeetingGroup = true;
    private boolean enablePublicGroup = true;
    private boolean enableSecretGroup = true;

    public final boolean getEnableChatter() {
        return this.enableChatter;
    }

    public final boolean getEnableDepartment() {
        return this.enableDepartment;
    }

    public final boolean getEnableExternalChatter() {
        return this.enableExternalChatter;
    }

    public final boolean getEnableExternalGroup() {
        return this.enableExternalGroup;
    }

    public final boolean getEnableGroupChat() {
        return this.enableGroupChat;
    }

    public final boolean getEnableMeetingGroup() {
        return this.enableMeetingGroup;
    }

    public final boolean getEnablePublicGroup() {
        return this.enablePublicGroup;
    }

    public final boolean getEnableSecretGroup() {
        return this.enableSecretGroup;
    }

    public final void setEnableChatter(boolean z) {
        this.enableChatter = z;
    }

    public final void setEnableDepartment(boolean z) {
        this.enableDepartment = z;
    }

    public final void setEnableExternalChatter(boolean z) {
        this.enableExternalChatter = z;
    }

    public final void setEnableExternalGroup(boolean z) {
        this.enableExternalGroup = z;
    }

    public final void setEnableGroupChat(boolean z) {
        this.enableGroupChat = z;
    }

    public final void setEnableMeetingGroup(boolean z) {
        this.enableMeetingGroup = z;
    }

    public final void setEnablePublicGroup(boolean z) {
        this.enablePublicGroup = z;
    }

    public final void setEnableSecretGroup(boolean z) {
        this.enableSecretGroup = z;
    }
}
