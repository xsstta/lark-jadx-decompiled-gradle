package com.bytedance.ee.bear.middleground_permission_export.model.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0004HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003Jw\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015¨\u0006>"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "isOwner", "", "adminCanCross", "externalAccess", "hasLinkPassword", "linkPassword", "", "linkShareEntity", "", "showLinkShare", "isShareFolder", "lock_state", "can_unlock", "reportPublicPermJson", "(ZZZZLjava/lang/String;IZZZZLjava/lang/String;)V", "getAdminCanCross", "()Z", "setAdminCanCross", "(Z)V", "getCan_unlock", "setCan_unlock", "getExternalAccess", "setExternalAccess", "getHasLinkPassword", "setHasLinkPassword", "setOwner", "setShareFolder", "getLinkPassword", "()Ljava/lang/String;", "setLinkPassword", "(Ljava/lang/String;)V", "getLinkShareEntity", "()I", "setLinkShareEntity", "(I)V", "getLock_state", "setLock_state", "getReportPublicPermJson", "setReportPublicPermJson", "getShowLinkShare", "setShowLinkShare", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareFolderPublicPermission extends NetService.Result<Serializable> {
    public static final Companion Companion = new Companion(null);
    private boolean adminCanCross;
    private boolean can_unlock;
    private boolean externalAccess;
    private boolean hasLinkPassword;
    private boolean isOwner;
    private boolean isShareFolder;
    private String linkPassword;
    private int linkShareEntity;
    private boolean lock_state;
    private String reportPublicPermJson;
    private boolean showLinkShare;

    public ShareFolderPublicPermission() {
        this(false, false, false, false, null, 0, false, false, false, false, null, 2047, null);
    }

    public static /* synthetic */ ShareFolderPublicPermission copy$default(ShareFolderPublicPermission shareFolderPublicPermission, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, boolean z5, boolean z6, boolean z7, boolean z8, String str2, int i2, Object obj) {
        return shareFolderPublicPermission.copy((i2 & 1) != 0 ? shareFolderPublicPermission.isOwner : z, (i2 & 2) != 0 ? shareFolderPublicPermission.adminCanCross : z2, (i2 & 4) != 0 ? shareFolderPublicPermission.externalAccess : z3, (i2 & 8) != 0 ? shareFolderPublicPermission.hasLinkPassword : z4, (i2 & 16) != 0 ? shareFolderPublicPermission.linkPassword : str, (i2 & 32) != 0 ? shareFolderPublicPermission.linkShareEntity : i, (i2 & 64) != 0 ? shareFolderPublicPermission.showLinkShare : z5, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? shareFolderPublicPermission.isShareFolder : z6, (i2 & DynamicModule.f58006b) != 0 ? shareFolderPublicPermission.lock_state : z7, (i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? shareFolderPublicPermission.can_unlock : z8, (i2 & 1024) != 0 ? shareFolderPublicPermission.reportPublicPermJson : str2);
    }

    @JvmStatic
    public static final int getLinkShareAnyonePerm(boolean z) {
        return Companion.mo38736a(z);
    }

    @JvmStatic
    public static final int getLinkShareClosePerm() {
        return Companion.mo38735a();
    }

    @JvmStatic
    public static final int getLinkShareInternalEditPerm() {
        return Companion.mo38738c();
    }

    @JvmStatic
    public static final int getLinkShareInternalReadPerm() {
        return Companion.mo38737b();
    }

    public final boolean component1() {
        return this.isOwner;
    }

    public final boolean component10() {
        return this.can_unlock;
    }

    public final String component11() {
        return this.reportPublicPermJson;
    }

    public final boolean component2() {
        return this.adminCanCross;
    }

    public final boolean component3() {
        return this.externalAccess;
    }

    public final boolean component4() {
        return this.hasLinkPassword;
    }

    public final String component5() {
        return this.linkPassword;
    }

    public final int component6() {
        return this.linkShareEntity;
    }

    public final boolean component7() {
        return this.showLinkShare;
    }

    public final boolean component8() {
        return this.isShareFolder;
    }

    public final boolean component9() {
        return this.lock_state;
    }

    public final ShareFolderPublicPermission copy(boolean z, boolean z2, boolean z3, boolean z4, String str, int i, boolean z5, boolean z6, boolean z7, boolean z8, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "linkPassword");
        Intrinsics.checkParameterIsNotNull(str2, "reportPublicPermJson");
        return new ShareFolderPublicPermission(z, z2, z3, z4, str, i, z5, z6, z7, z8, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareFolderPublicPermission) {
                ShareFolderPublicPermission shareFolderPublicPermission = (ShareFolderPublicPermission) obj;
                if (this.isOwner == shareFolderPublicPermission.isOwner) {
                    if (this.adminCanCross == shareFolderPublicPermission.adminCanCross) {
                        if (this.externalAccess == shareFolderPublicPermission.externalAccess) {
                            if ((this.hasLinkPassword == shareFolderPublicPermission.hasLinkPassword) && Intrinsics.areEqual(this.linkPassword, shareFolderPublicPermission.linkPassword)) {
                                if (this.linkShareEntity == shareFolderPublicPermission.linkShareEntity) {
                                    if (this.showLinkShare == shareFolderPublicPermission.showLinkShare) {
                                        if (this.isShareFolder == shareFolderPublicPermission.isShareFolder) {
                                            if (this.lock_state == shareFolderPublicPermission.lock_state) {
                                                if (!(this.can_unlock == shareFolderPublicPermission.can_unlock) || !Intrinsics.areEqual(this.reportPublicPermJson, shareFolderPublicPermission.reportPublicPermJson)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
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
        boolean z = this.isOwner;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.adminCanCross;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.externalAccess;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.hasLinkPassword;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        String str = this.linkPassword;
        int i18 = 0;
        int hashCode = (((i17 + (str != null ? str.hashCode() : 0)) * 31) + this.linkShareEntity) * 31;
        boolean z5 = this.showLinkShare;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (hashCode + i19) * 31;
        boolean z6 = this.isShareFolder;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z7 = this.lock_state;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z8 = this.can_unlock;
        if (!z8) {
            i = z8 ? 1 : 0;
        }
        int i31 = (i30 + i) * 31;
        String str2 = this.reportPublicPermJson;
        if (str2 != null) {
            i18 = str2.hashCode();
        }
        return i31 + i18;
    }

    public String toString() {
        return "ShareFolderPublicPermission(isOwner=" + this.isOwner + ", adminCanCross=" + this.adminCanCross + ", externalAccess=" + this.externalAccess + ", hasLinkPassword=" + this.hasLinkPassword + ", linkPassword=" + this.linkPassword + ", linkShareEntity=" + this.linkShareEntity + ", showLinkShare=" + this.showLinkShare + ", isShareFolder=" + this.isShareFolder + ", lock_state=" + this.lock_state + ", can_unlock=" + this.can_unlock + ", reportPublicPermJson=" + this.reportPublicPermJson + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission$Companion;", "", "()V", "LINK_SHARE_ANYONE_READ_V1", "", "LINK_SHARE_ANYONE_READ_V2", "LINK_SHARE_CLOSE", "LINK_SHARE_INTERNAL_EDIT", "LINK_SHARE_INTERNAL_READ", "getLinkShareAnyonePerm", "isV2", "", "getLinkShareClosePerm", "getLinkShareInternalEditPerm", "getLinkShareInternalReadPerm", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final int mo38735a() {
            return 0;
        }

        @JvmStatic
        /* renamed from: a */
        public final int mo38736a(boolean z) {
            return z ? 3 : 4;
        }

        @JvmStatic
        /* renamed from: b */
        public final int mo38737b() {
            return 1;
        }

        @JvmStatic
        /* renamed from: c */
        public final int mo38738c() {
            return 2;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getAdminCanCross() {
        return this.adminCanCross;
    }

    public final boolean getCan_unlock() {
        return this.can_unlock;
    }

    public final boolean getExternalAccess() {
        return this.externalAccess;
    }

    public final boolean getHasLinkPassword() {
        return this.hasLinkPassword;
    }

    public final String getLinkPassword() {
        return this.linkPassword;
    }

    public final int getLinkShareEntity() {
        return this.linkShareEntity;
    }

    public final boolean getLock_state() {
        return this.lock_state;
    }

    public final String getReportPublicPermJson() {
        return this.reportPublicPermJson;
    }

    public final boolean getShowLinkShare() {
        return this.showLinkShare;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public final boolean isShareFolder() {
        return this.isShareFolder;
    }

    public final void setAdminCanCross(boolean z) {
        this.adminCanCross = z;
    }

    public final void setCan_unlock(boolean z) {
        this.can_unlock = z;
    }

    public final void setExternalAccess(boolean z) {
        this.externalAccess = z;
    }

    public final void setHasLinkPassword(boolean z) {
        this.hasLinkPassword = z;
    }

    public final void setLinkShareEntity(int i) {
        this.linkShareEntity = i;
    }

    public final void setLock_state(boolean z) {
        this.lock_state = z;
    }

    public final void setOwner(boolean z) {
        this.isOwner = z;
    }

    public final void setShareFolder(boolean z) {
        this.isShareFolder = z;
    }

    public final void setShowLinkShare(boolean z) {
        this.showLinkShare = z;
    }

    public final void setLinkPassword(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.linkPassword = str;
    }

    public final void setReportPublicPermJson(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.reportPublicPermJson = str;
    }

    public ShareFolderPublicPermission(boolean z, boolean z2, boolean z3, boolean z4, String str, int i, boolean z5, boolean z6, boolean z7, boolean z8, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "linkPassword");
        Intrinsics.checkParameterIsNotNull(str2, "reportPublicPermJson");
        this.isOwner = z;
        this.adminCanCross = z2;
        this.externalAccess = z3;
        this.hasLinkPassword = z4;
        this.linkPassword = str;
        this.linkShareEntity = i;
        this.showLinkShare = z5;
        this.isShareFolder = z6;
        this.lock_state = z7;
        this.can_unlock = z8;
        this.reportPublicPermJson = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareFolderPublicPermission(boolean r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, int r19, boolean r20, boolean r21, boolean r22, boolean r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission.<init>(boolean, boolean, boolean, boolean, java.lang.String, int, boolean, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
