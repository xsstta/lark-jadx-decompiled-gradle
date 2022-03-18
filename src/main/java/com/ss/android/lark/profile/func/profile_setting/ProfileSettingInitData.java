package com.ss.android.lark.profile.func.profile_setting;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "Ljava/io/Serializable;", "userId", "", "showCallSettingItem", "", "isBlock", "showBlockItem", "showReportItem", "showDeleteItem", "tenantId", "(Ljava/lang/String;ZZZZZLjava/lang/String;)V", "()Z", "getShowBlockItem", "getShowCallSettingItem", "getShowDeleteItem", "getShowReportItem", "getTenantId", "()Ljava/lang/String;", "getUserId", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProfileSettingInitData implements Serializable {
    private final boolean isBlock;
    private final boolean showBlockItem;
    private final boolean showCallSettingItem;
    private final boolean showDeleteItem;
    private final boolean showReportItem;
    private final String tenantId;
    private final String userId;

    public final boolean getShowBlockItem() {
        return this.showBlockItem;
    }

    public final boolean getShowCallSettingItem() {
        return this.showCallSettingItem;
    }

    public final boolean getShowDeleteItem() {
        return this.showDeleteItem;
    }

    public final boolean getShowReportItem() {
        return this.showReportItem;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isBlock() {
        return this.isBlock;
    }

    public ProfileSettingInitData(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "tenantId");
        this.userId = str;
        this.showCallSettingItem = z;
        this.isBlock = z2;
        this.showBlockItem = z3;
        this.showReportItem = z4;
        this.showDeleteItem = z5;
        this.tenantId = str2;
    }
}
