package com.tt.refer.impl.business.file.log;

import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0001\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00065"}, d2 = {"Lcom/tt/refer/impl/business/file/log/LogMeta;", "Ljava/io/Serializable;", "path", "", "size", "", "createTime", "modifyTime", "md5", "userId", "tenantId", "appId", "appType", "tag", "primitiveApi", "timestamp", "(Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAppId", "()Ljava/lang/String;", "getAppType", "getCreateTime", "()J", "getMd5", "setMd5", "(Ljava/lang/String;)V", "getModifyTime", "getPath", "getPrimitiveApi", "getSize", "getTag", "getTenantId", "getTimestamp", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LogMeta implements Serializable {
    private final String appId;
    private final String appType;
    private final long createTime;
    private String md5;
    private final long modifyTime;
    private final String path;
    private final String primitiveApi;
    private final long size;
    private final String tag;
    private final String tenantId;
    private final long timestamp;
    private final String userId;

    public static /* synthetic */ LogMeta copy$default(LogMeta logMeta, String str, long j, long j2, long j3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j4, int i, Object obj) {
        return logMeta.copy((i & 1) != 0 ? logMeta.path : str, (i & 2) != 0 ? logMeta.size : j, (i & 4) != 0 ? logMeta.createTime : j2, (i & 8) != 0 ? logMeta.modifyTime : j3, (i & 16) != 0 ? logMeta.md5 : str2, (i & 32) != 0 ? logMeta.userId : str3, (i & 64) != 0 ? logMeta.tenantId : str4, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? logMeta.appId : str5, (i & DynamicModule.f58006b) != 0 ? logMeta.appType : str6, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? logMeta.tag : str7, (i & 1024) != 0 ? logMeta.primitiveApi : str8, (i & 2048) != 0 ? logMeta.timestamp : j4);
    }

    public final String component1() {
        return this.path;
    }

    public final String component10() {
        return this.tag;
    }

    public final String component11() {
        return this.primitiveApi;
    }

    public final long component12() {
        return this.timestamp;
    }

    public final long component2() {
        return this.size;
    }

    public final long component3() {
        return this.createTime;
    }

    public final long component4() {
        return this.modifyTime;
    }

    public final String component5() {
        return this.md5;
    }

    public final String component6() {
        return this.userId;
    }

    public final String component7() {
        return this.tenantId;
    }

    public final String component8() {
        return this.appId;
    }

    public final String component9() {
        return this.appType;
    }

    public final LogMeta copy(@JSONField(name = "path") String str, @JSONField(name = "size") long j, @JSONField(name = "create_date") long j2, @JSONField(name = "modify_date") long j3, @JSONField(name = "md5") String str2, @JSONField(name = "user_id") String str3, @JSONField(name = "tenant_id") String str4, @JSONField(name = "app_id") String str5, @JSONField(name = "app_type") String str6, @JSONField(name = "tag") String str7, @JSONField(name = "primitive_api") String str8, @JSONField(name = "timestamp") long j4) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(str2, "md5");
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        Intrinsics.checkParameterIsNotNull(str4, "tenantId");
        Intrinsics.checkParameterIsNotNull(str5, "appId");
        Intrinsics.checkParameterIsNotNull(str6, "appType");
        Intrinsics.checkParameterIsNotNull(str7, "tag");
        Intrinsics.checkParameterIsNotNull(str8, "primitiveApi");
        return new LogMeta(str, j, j2, j3, str2, str3, str4, str5, str6, str7, str8, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogMeta)) {
            return false;
        }
        LogMeta logMeta = (LogMeta) obj;
        return Intrinsics.areEqual(this.path, logMeta.path) && this.size == logMeta.size && this.createTime == logMeta.createTime && this.modifyTime == logMeta.modifyTime && Intrinsics.areEqual(this.md5, logMeta.md5) && Intrinsics.areEqual(this.userId, logMeta.userId) && Intrinsics.areEqual(this.tenantId, logMeta.tenantId) && Intrinsics.areEqual(this.appId, logMeta.appId) && Intrinsics.areEqual(this.appType, logMeta.appType) && Intrinsics.areEqual(this.tag, logMeta.tag) && Intrinsics.areEqual(this.primitiveApi, logMeta.primitiveApi) && this.timestamp == logMeta.timestamp;
    }

    public int hashCode() {
        String str = this.path;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.size;
        long j2 = this.createTime;
        long j3 = this.modifyTime;
        int i2 = ((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str2 = this.md5;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tenantId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.appId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.appType;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.tag;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.primitiveApi;
        if (str8 != null) {
            i = str8.hashCode();
        }
        long j4 = this.timestamp;
        return ((hashCode7 + i) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "LogMeta(path=" + this.path + ", size=" + this.size + ", createTime=" + this.createTime + ", modifyTime=" + this.modifyTime + ", md5=" + this.md5 + ", userId=" + this.userId + ", tenantId=" + this.tenantId + ", appId=" + this.appId + ", appType=" + this.appType + ", tag=" + this.tag + ", primitiveApi=" + this.primitiveApi + ", timestamp=" + this.timestamp + ")";
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final long getModifyTime() {
        return this.modifyTime;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPrimitiveApi() {
        return this.primitiveApi;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setMd5(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.md5 = str;
    }

    public LogMeta(@JSONField(name = "path") String str, @JSONField(name = "size") long j, @JSONField(name = "create_date") long j2, @JSONField(name = "modify_date") long j3, @JSONField(name = "md5") String str2, @JSONField(name = "user_id") String str3, @JSONField(name = "tenant_id") String str4, @JSONField(name = "app_id") String str5, @JSONField(name = "app_type") String str6, @JSONField(name = "tag") String str7, @JSONField(name = "primitive_api") String str8, @JSONField(name = "timestamp") long j4) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(str2, "md5");
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        Intrinsics.checkParameterIsNotNull(str4, "tenantId");
        Intrinsics.checkParameterIsNotNull(str5, "appId");
        Intrinsics.checkParameterIsNotNull(str6, "appType");
        Intrinsics.checkParameterIsNotNull(str7, "tag");
        Intrinsics.checkParameterIsNotNull(str8, "primitiveApi");
        this.path = str;
        this.size = j;
        this.createTime = j2;
        this.modifyTime = j3;
        this.md5 = str2;
        this.userId = str3;
        this.tenantId = str4;
        this.appId = str5;
        this.appType = str6;
        this.tag = str7;
        this.primitiveApi = str8;
        this.timestamp = j4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LogMeta(java.lang.String r21, long r22, long r24, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, long r35, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r7 = r1
            goto L_0x000a
        L_0x0008:
            r7 = r24
        L_0x000a:
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0010
            r9 = r1
            goto L_0x0012
        L_0x0010:
            r9 = r26
        L_0x0012:
            r3 = r20
            r4 = r21
            r5 = r22
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r35
            r3.<init>(r4, r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.impl.business.file.log.LogMeta.<init>(java.lang.String, long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
