package com.bytedance.ee.bear;

import com.bytedance.ee.bear.contract.NetService;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0014HÖ\u0001J\t\u0010?\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b!\u0010 R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010*¨\u0006@"}, d2 = {"Lcom/bytedance/ee/bear/DocMetaInfo;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "title", "", "creatorUid", "creatorName", "creatorTenantId", "ownerUid", "ownerName", "createTime", "subType", "isPined", "", "isStared", "appId", "appLink", "supportMobile", "icon", "realType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "getAppId", "()Ljava/lang/String;", "getAppLink", "getCreateTime", "getCreatorName", "getCreatorTenantId", "getCreatorUid", "getIcon", "()Z", "setPined", "(Z)V", "setStared", "getOwnerName", "getOwnerUid", "getRealType", "()I", "getSubType", "getSupportMobile", "getTitle", "setTitle", "(Ljava/lang/String;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "document-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocMetaInfo extends NetService.Result<Serializable> {
    private final String appId;
    private final String appLink;
    private final String createTime;
    private final String creatorName;
    private final String creatorTenantId;
    private final String creatorUid;
    private final String icon;
    private boolean isPined;
    private boolean isStared;
    private final String ownerName;
    private final String ownerUid;
    private final int realType;
    private final String subType;
    private final boolean supportMobile;
    private String title;

    public DocMetaInfo() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, false, null, 0, 32767, null);
    }

    public static /* synthetic */ DocMetaInfo copy$default(DocMetaInfo docMetaInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, boolean z3, String str11, int i, int i2, Object obj) {
        return docMetaInfo.copy((i2 & 1) != 0 ? docMetaInfo.title : str, (i2 & 2) != 0 ? docMetaInfo.creatorUid : str2, (i2 & 4) != 0 ? docMetaInfo.creatorName : str3, (i2 & 8) != 0 ? docMetaInfo.creatorTenantId : str4, (i2 & 16) != 0 ? docMetaInfo.ownerUid : str5, (i2 & 32) != 0 ? docMetaInfo.ownerName : str6, (i2 & 64) != 0 ? docMetaInfo.createTime : str7, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? docMetaInfo.subType : str8, (i2 & DynamicModule.f58006b) != 0 ? docMetaInfo.isPined : z, (i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? docMetaInfo.isStared : z2, (i2 & 1024) != 0 ? docMetaInfo.appId : str9, (i2 & 2048) != 0 ? docMetaInfo.appLink : str10, (i2 & 4096) != 0 ? docMetaInfo.supportMobile : z3, (i2 & 8192) != 0 ? docMetaInfo.icon : str11, (i2 & 16384) != 0 ? docMetaInfo.realType : i);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.isStared;
    }

    public final String component11() {
        return this.appId;
    }

    public final String component12() {
        return this.appLink;
    }

    public final boolean component13() {
        return this.supportMobile;
    }

    public final String component14() {
        return this.icon;
    }

    public final int component15() {
        return this.realType;
    }

    public final String component2() {
        return this.creatorUid;
    }

    public final String component3() {
        return this.creatorName;
    }

    public final String component4() {
        return this.creatorTenantId;
    }

    public final String component5() {
        return this.ownerUid;
    }

    public final String component6() {
        return this.ownerName;
    }

    public final String component7() {
        return this.createTime;
    }

    public final String component8() {
        return this.subType;
    }

    public final boolean component9() {
        return this.isPined;
    }

    public final DocMetaInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, boolean z3, String str11, int i) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "creatorUid");
        Intrinsics.checkParameterIsNotNull(str3, "creatorName");
        Intrinsics.checkParameterIsNotNull(str4, "creatorTenantId");
        Intrinsics.checkParameterIsNotNull(str5, "ownerUid");
        Intrinsics.checkParameterIsNotNull(str6, "ownerName");
        Intrinsics.checkParameterIsNotNull(str7, "createTime");
        Intrinsics.checkParameterIsNotNull(str8, "subType");
        Intrinsics.checkParameterIsNotNull(str9, "appId");
        Intrinsics.checkParameterIsNotNull(str10, "appLink");
        Intrinsics.checkParameterIsNotNull(str11, "icon");
        return new DocMetaInfo(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, z3, str11, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocMetaInfo) {
                DocMetaInfo docMetaInfo = (DocMetaInfo) obj;
                if (Intrinsics.areEqual(this.title, docMetaInfo.title) && Intrinsics.areEqual(this.creatorUid, docMetaInfo.creatorUid) && Intrinsics.areEqual(this.creatorName, docMetaInfo.creatorName) && Intrinsics.areEqual(this.creatorTenantId, docMetaInfo.creatorTenantId) && Intrinsics.areEqual(this.ownerUid, docMetaInfo.ownerUid) && Intrinsics.areEqual(this.ownerName, docMetaInfo.ownerName) && Intrinsics.areEqual(this.createTime, docMetaInfo.createTime) && Intrinsics.areEqual(this.subType, docMetaInfo.subType)) {
                    if (this.isPined == docMetaInfo.isPined) {
                        if ((this.isStared == docMetaInfo.isStared) && Intrinsics.areEqual(this.appId, docMetaInfo.appId) && Intrinsics.areEqual(this.appLink, docMetaInfo.appLink)) {
                            if ((this.supportMobile == docMetaInfo.supportMobile) && Intrinsics.areEqual(this.icon, docMetaInfo.icon)) {
                                if (this.realType == docMetaInfo.realType) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.creatorUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.creatorName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.creatorTenantId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.ownerUid;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.ownerName;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.createTime;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.subType;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z = this.isPined;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode8 + i3) * 31;
        boolean z2 = this.isStared;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        String str9 = this.appId;
        int hashCode9 = (i10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.appLink;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        boolean z3 = this.supportMobile;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (hashCode10 + i2) * 31;
        String str11 = this.icon;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return ((i11 + i) * 31) + this.realType;
    }

    public String toString() {
        return "DocMetaInfo(title=" + this.title + ", creatorUid=" + this.creatorUid + ", creatorName=" + this.creatorName + ", creatorTenantId=" + this.creatorTenantId + ", ownerUid=" + this.ownerUid + ", ownerName=" + this.ownerName + ", createTime=" + this.createTime + ", subType=" + this.subType + ", isPined=" + this.isPined + ", isStared=" + this.isStared + ", appId=" + this.appId + ", appLink=" + this.appLink + ", supportMobile=" + this.supportMobile + ", icon=" + this.icon + ", realType=" + this.realType + ")";
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getCreatorName() {
        return this.creatorName;
    }

    public final String getCreatorTenantId() {
        return this.creatorTenantId;
    }

    public final String getCreatorUid() {
        return this.creatorUid;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getOwnerUid() {
        return this.ownerUid;
    }

    public final int getRealType() {
        return this.realType;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final boolean getSupportMobile() {
        return this.supportMobile;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPined() {
        return this.isPined;
    }

    public final boolean isStared() {
        return this.isStared;
    }

    public final void setPined(boolean z) {
        this.isPined = z;
    }

    public final void setStared(boolean z) {
        this.isStared = z;
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.title = str;
    }

    public DocMetaInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, boolean z3, String str11, int i) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "creatorUid");
        Intrinsics.checkParameterIsNotNull(str3, "creatorName");
        Intrinsics.checkParameterIsNotNull(str4, "creatorTenantId");
        Intrinsics.checkParameterIsNotNull(str5, "ownerUid");
        Intrinsics.checkParameterIsNotNull(str6, "ownerName");
        Intrinsics.checkParameterIsNotNull(str7, "createTime");
        Intrinsics.checkParameterIsNotNull(str8, "subType");
        Intrinsics.checkParameterIsNotNull(str9, "appId");
        Intrinsics.checkParameterIsNotNull(str10, "appLink");
        Intrinsics.checkParameterIsNotNull(str11, "icon");
        this.title = str;
        this.creatorUid = str2;
        this.creatorName = str3;
        this.creatorTenantId = str4;
        this.ownerUid = str5;
        this.ownerName = str6;
        this.createTime = str7;
        this.subType = str8;
        this.isPined = z;
        this.isStared = z2;
        this.appId = str9;
        this.appLink = str10;
        this.supportMobile = z3;
        this.icon = str11;
        this.realType = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocMetaInfo(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, java.lang.String r27, java.lang.String r28, boolean r29, java.lang.String r30, int r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.DocMetaInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
