package com.bytedance.ee.bear.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.share.IShareInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\b\u0010-\u001a\u00020\u001fH\u0016J\u0013\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\b\u00101\u001a\u00020\u001fH\u0016J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0006H\u0016J\b\u00104\u001a\u00020\u0006H\u0016J\b\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u00020\u0006H\u0016J\b\u00107\u001a\u00020\u0006H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J\t\u00109\u001a\u00020\u0004HÖ\u0001J\b\u0010:\u001a\u00020\u001fH\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020\u001fH\u0016J\b\u0010=\u001a\u00020\u001fH\u0016J\b\u0010>\u001a\u00020\u001fH\u0016J\b\u0010?\u001a\u00020\u001fH\u0016J\b\u0010@\u001a\u00020\u001fH\u0016J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006G"}, d2 = {"Lcom/bytedance/ee/bear/share/ShareFolderInfo;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/bear/share/IShareInfo;", ShareHitPoint.f121869d, "", "docUrl", "", "token", "ownerUid", "createTime", "spaceId", "ownerTenantId", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "folderPerm", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/FolderVersion;Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;)V", "getCreateTime", "()Ljava/lang/String;", "getDocUrl", "getFolderPerm", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "getFolderVersion", "()Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "getOwnerTenantId", "getOwnerUid", "getSpaceId", "getToken", "getType", "()I", "adminCanCross", "", "canExport", "canShare", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "enablePermSet", "equals", "other", "", "externalAccess", "getCreateTimeStr", "getCreatorTenantId", "getCreatorUid", "getDocType", "getObjToken", "getRequestToken", "getUserPerm", "hashCode", "isLinkShareAnyoneEdit", "isLinkShareAnyoneRead", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isOwner", "isSingleContainer", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareFolderInfo implements Parcelable, IShareInfo {
    public static final Parcelable.Creator CREATOR = new C10966a();

    /* renamed from: a */
    private final int f29523a;

    /* renamed from: b */
    private final String f29524b;

    /* renamed from: c */
    private final String f29525c;

    /* renamed from: d */
    private final String f29526d;

    /* renamed from: e */
    private final String f29527e;

    /* renamed from: f */
    private final String f29528f;

    /* renamed from: g */
    private final String f29529g;

    /* renamed from: h */
    private final FolderVersion f29530h;

    /* renamed from: i */
    private final ShareFolderPermission f29531i;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.ShareFolderInfo$a */
    public static class C10966a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ShareFolderInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (FolderVersion) parcel.readParcelable(ShareFolderInfo.class.getClassLoader()), (ShareFolderPermission) parcel.readParcelable(ShareFolderInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareFolderInfo[i];
        }
    }

    public ShareFolderInfo() {
        this(0, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareFolderInfo) {
                ShareFolderInfo shareFolderInfo = (ShareFolderInfo) obj;
                if (!(this.f29523a == shareFolderInfo.f29523a) || !Intrinsics.areEqual(this.f29524b, shareFolderInfo.f29524b) || !Intrinsics.areEqual(this.f29525c, shareFolderInfo.f29525c) || !Intrinsics.areEqual(this.f29526d, shareFolderInfo.f29526d) || !Intrinsics.areEqual(this.f29527e, shareFolderInfo.f29527e) || !Intrinsics.areEqual(this.f29528f, shareFolderInfo.f29528f) || !Intrinsics.areEqual(this.f29529g, shareFolderInfo.f29529g) || !Intrinsics.areEqual(this.f29530h, shareFolderInfo.f29530h) || !Intrinsics.areEqual(this.f29531i, shareFolderInfo.f29531i)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f29523a * 31;
        String str = this.f29524b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29525c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29526d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29527e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f29528f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f29529g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        FolderVersion folderVersion = this.f29530h;
        int hashCode7 = (hashCode6 + (folderVersion != null ? folderVersion.hashCode() : 0)) * 31;
        ShareFolderPermission shareFolderPermission = this.f29531i;
        if (shareFolderPermission != null) {
            i2 = shareFolderPermission.hashCode();
        }
        return hashCode7 + i2;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: q */
    public boolean mo41673q() {
        return false;
    }

    public String toString() {
        return "ShareFolderInfo(type=" + this.f29523a + ", docUrl=" + this.f29524b + ", token=" + this.f29525c + ", ownerUid=" + this.f29526d + ", createTime=" + this.f29527e + ", spaceId=" + this.f29528f + ", ownerTenantId=" + this.f29529g + ", folderVersion=" + this.f29530h + ", folderPerm=" + this.f29531i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f29523a);
        parcel.writeString(this.f29524b);
        parcel.writeString(this.f29525c);
        parcel.writeString(this.f29526d);
        parcel.writeString(this.f29527e);
        parcel.writeString(this.f29528f);
        parcel.writeString(this.f29529g);
        parcel.writeParcelable(this.f29530h, i);
        parcel.writeParcelable(this.f29531i, i);
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: a */
    public String mo41654a() {
        return this.f29527e;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: b */
    public String mo41655b() {
        return this.f29526d;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: d */
    public int mo41657d() {
        return this.f29523a;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: e */
    public String mo41659e() {
        return this.f29525c;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: f */
    public String mo41661f() {
        return this.f29529g;
    }

    /* renamed from: s */
    public final String mo41688s() {
        return this.f29527e;
    }

    /* renamed from: t */
    public final ShareFolderPermission mo41689t() {
        return this.f29531i;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: h */
    public boolean mo41663h() {
        return this.f29530h.isShareFolderV2();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: r */
    public boolean mo41674r() {
        return IShareInfo.C10990a.m45697a(this);
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: c */
    public boolean mo41656c() {
        return this.f29531i.mo38690b().isOwner();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: g */
    public boolean mo41662g() {
        return this.f29531i.mo38690b().getAdminCanCross();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: i */
    public String mo41665i() {
        if (mo41663h()) {
            return this.f29525c;
        }
        return this.f29528f;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: k */
    public boolean mo41667k() {
        return this.f29531i.mo38690b().getExternalAccess();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: j */
    public boolean mo41666j() {
        if (mo41656c() || this.f29531i.mo38687a().canManagePermissionMeta(mo41656c())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: l */
    public boolean mo41668l() {
        return ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36544c(this.f29523a, this.f29525c);
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: n */
    public boolean mo41670n() {
        if (this.f29531i.mo38690b().getLinkShareEntity() == ShareFolderPublicPermission.Companion.mo38737b()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: o */
    public boolean mo41671o() {
        if (this.f29531i.mo38690b().getLinkShareEntity() == ShareFolderPublicPermission.Companion.mo38738c()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: p */
    public boolean mo41672p() {
        if (this.f29531i.mo38690b().getLinkShareEntity() == ShareFolderPublicPermission.Companion.mo38736a(this.f29530h.isShareFolderV2())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: m */
    public boolean mo41669m() {
        if (!this.f29530h.isFolderV1()) {
            return this.f29531i.mo38687a().canManagerCollaborator();
        }
        if (this.f29530h.isPersonalFolder()) {
            return true;
        }
        return this.f29531i.mo38687a().canManagerCollaborator();
    }

    public ShareFolderInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, FolderVersion folderVersion, ShareFolderPermission shareFolderPermission) {
        Intrinsics.checkParameterIsNotNull(str, "docUrl");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "ownerUid");
        Intrinsics.checkParameterIsNotNull(str4, "createTime");
        Intrinsics.checkParameterIsNotNull(str5, "spaceId");
        Intrinsics.checkParameterIsNotNull(str6, "ownerTenantId");
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        Intrinsics.checkParameterIsNotNull(shareFolderPermission, "folderPerm");
        this.f29523a = i;
        this.f29524b = str;
        this.f29525c = str2;
        this.f29526d = str3;
        this.f29527e = str4;
        this.f29528f = str5;
        this.f29529g = str6;
        this.f29530h = folderVersion;
        this.f29531i = shareFolderPermission;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareFolderInfo(int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.bytedance.ee.bear.list.dto.FolderVersion r22, com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.share.ShareFolderInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ee.bear.list.dto.FolderVersion, com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
