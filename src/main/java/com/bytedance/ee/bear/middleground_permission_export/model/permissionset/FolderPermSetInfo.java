package com.bytedance.ee.bear.middleground_permission_export.model.permissionset;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0013J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u000eHÂ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0011HÂ\u0003J\t\u0010 \u001a\u00020\u0013HÂ\u0003J\t\u0010!\u001a\u00020\u0005HÂ\u0003J\t\u0010\"\u001a\u00020\u0005HÂ\u0003J\t\u0010#\u001a\u00020\u0005HÂ\u0003J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\t\u0010%\u001a\u00020\u0005HÂ\u0003J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\t\u0010'\u001a\u00020\u0005HÂ\u0003J\t\u0010(\u001a\u00020\u0005HÂ\u0003J\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0013\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\u0006\u0010.\u001a\u00020\u0013J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u0013J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u00020\u0011J\u0006\u00106\u001a\u00020\u0005J\u0006\u00107\u001a\u00020\u0005J\u0006\u00108\u001a\u00020\u0005J\u0006\u00109\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u0003J\u0006\u0010;\u001a\u00020\u0005J\u0006\u0010<\u001a\u00020\u0003J\u0006\u0010=\u001a\u00020\u0013J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0006\u0010?\u001a\u00020\u0013J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010@\u001a\u00020\u0013J\u0006\u0010A\u001a\u00020\u0005J\u000e\u0010B\u001a\u00020C2\u0006\u0010=\u001a\u00020\u0013J\u000e\u0010D\u001a\u00020C2\u0006\u0010?\u001a\u00020\u0013J\u000e\u0010E\u001a\u00020C2\u0006\u0010A\u001a\u00020\u0005J\u000e\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020C2\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020\u0013J\t\u0010M\u001a\u00020\u0005HÖ\u0001J\u0019\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "Landroid/os/Parcelable;", ShareHitPoint.f121869d, "", "url", "", "token", "title", "ownerUid", "ownerName", "creatorUid", "createTime", "creatorTenantId", "shareFolderPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "spaceId", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isRoot", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/FolderVersion;Z)V", "canCross", "canInviteEdit", "canInviteFa", "canInviteView", "canManageCollaborator", "canPermSet", "canUnlock", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "externalAccess", "getCreateTime", "getCreatorTenantId", "getCreatorUid", "getLinkShareEntity", "getLockState", "getOwnerName", "getOwnerType", "getOwnerUid", "getSpaceId", "getTitle", "getToken", "getType", "getUrl", "getUserPerm", "hasPassword", "hashCode", "isOwner", "isShareFolderV2", "password", "setHasPassword", "", "setOwner", "setPassword", "setPublicPermission", "shareFolderPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "setUserPermission", "shareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "showLinkShareSetView", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FolderPermSetInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10172a();

    /* renamed from: a */
    private final int f27454a;

    /* renamed from: b */
    private final String f27455b;

    /* renamed from: c */
    private final String f27456c;

    /* renamed from: d */
    private final String f27457d;

    /* renamed from: e */
    private final String f27458e;

    /* renamed from: f */
    private String f27459f;

    /* renamed from: g */
    private final String f27460g;

    /* renamed from: h */
    private final String f27461h;

    /* renamed from: i */
    private final String f27462i;

    /* renamed from: j */
    private final ShareFolderPermission f27463j;

    /* renamed from: k */
    private final String f27464k;

    /* renamed from: l */
    private final FolderVersion f27465l;

    /* renamed from: m */
    private final boolean f27466m;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo$a */
    public static class C10172a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new FolderPermSetInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ShareFolderPermission) ShareFolderPermission.CREATOR.createFromParcel(parcel), parcel.readString(), (FolderVersion) parcel.readParcelable(FolderPermSetInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FolderPermSetInfo[i];
        }
    }

    public FolderPermSetInfo() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FolderPermSetInfo) {
                FolderPermSetInfo folderPermSetInfo = (FolderPermSetInfo) obj;
                if ((this.f27454a == folderPermSetInfo.f27454a) && Intrinsics.areEqual(this.f27455b, folderPermSetInfo.f27455b) && Intrinsics.areEqual(this.f27456c, folderPermSetInfo.f27456c) && Intrinsics.areEqual(this.f27457d, folderPermSetInfo.f27457d) && Intrinsics.areEqual(this.f27458e, folderPermSetInfo.f27458e) && Intrinsics.areEqual(this.f27459f, folderPermSetInfo.f27459f) && Intrinsics.areEqual(this.f27460g, folderPermSetInfo.f27460g) && Intrinsics.areEqual(this.f27461h, folderPermSetInfo.f27461h) && Intrinsics.areEqual(this.f27462i, folderPermSetInfo.f27462i) && Intrinsics.areEqual(this.f27463j, folderPermSetInfo.f27463j) && Intrinsics.areEqual(this.f27464k, folderPermSetInfo.f27464k) && Intrinsics.areEqual(this.f27465l, folderPermSetInfo.f27465l)) {
                    if (this.f27466m == folderPermSetInfo.f27466m) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f27454a * 31;
        String str = this.f27455b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27456c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27457d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f27458e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f27459f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f27460g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f27461h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f27462i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        ShareFolderPermission shareFolderPermission = this.f27463j;
        int hashCode9 = (hashCode8 + (shareFolderPermission != null ? shareFolderPermission.hashCode() : 0)) * 31;
        String str9 = this.f27464k;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        FolderVersion folderVersion = this.f27465l;
        if (folderVersion != null) {
            i2 = folderVersion.hashCode();
        }
        int i3 = (hashCode10 + i2) * 31;
        boolean z = this.f27466m;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public String toString() {
        return "FolderPermSetInfo(type=" + this.f27454a + ", url=" + this.f27455b + ", token=" + this.f27456c + ", title=" + this.f27457d + ", ownerUid=" + this.f27458e + ", ownerName=" + this.f27459f + ", creatorUid=" + this.f27460g + ", createTime=" + this.f27461h + ", creatorTenantId=" + this.f27462i + ", shareFolderPermission=" + this.f27463j + ", spaceId=" + this.f27464k + ", version=" + this.f27465l + ", isRoot=" + this.f27466m + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f27454a);
        parcel.writeString(this.f27455b);
        parcel.writeString(this.f27456c);
        parcel.writeString(this.f27457d);
        parcel.writeString(this.f27458e);
        parcel.writeString(this.f27459f);
        parcel.writeString(this.f27460g);
        parcel.writeString(this.f27461h);
        parcel.writeString(this.f27462i);
        this.f27463j.writeToParcel(parcel, 0);
        parcel.writeString(this.f27464k);
        parcel.writeParcelable(this.f27465l, i);
        parcel.writeInt(this.f27466m ? 1 : 0);
    }

    /* renamed from: a */
    public final String mo38858a() {
        return this.f27455b;
    }

    /* renamed from: b */
    public final int mo38863b() {
        return this.f27454a;
    }

    /* renamed from: c */
    public final String mo38864c() {
        return this.f27456c;
    }

    /* renamed from: d */
    public final String mo38865d() {
        return this.f27458e;
    }

    /* renamed from: e */
    public final String mo38867e() {
        return this.f27460g;
    }

    /* renamed from: f */
    public final String mo38869f() {
        return this.f27461h;
    }

    /* renamed from: g */
    public final String mo38870g() {
        return this.f27462i;
    }

    /* renamed from: h */
    public final String mo38871h() {
        return this.f27464k;
    }

    /* renamed from: i */
    public final FolderVersion mo38873i() {
        return this.f27465l;
    }

    /* renamed from: u */
    public final boolean mo38886u() {
        return this.f27466m;
    }

    /* renamed from: s */
    public final boolean mo38883s() {
        return this.f27465l.isShareFolderV2();
    }

    /* renamed from: j */
    public final boolean mo38874j() {
        return this.f27463j.mo38690b().isOwner();
    }

    /* renamed from: k */
    public final boolean mo38875k() {
        return this.f27463j.mo38690b().getAdminCanCross();
    }

    /* renamed from: l */
    public final boolean mo38876l() {
        return this.f27463j.mo38690b().getExternalAccess();
    }

    /* renamed from: m */
    public final int mo38877m() {
        return this.f27463j.mo38690b().getLinkShareEntity();
    }

    /* renamed from: n */
    public final int mo38878n() {
        return this.f27463j.mo38687a().getPermissions();
    }

    /* renamed from: o */
    public final boolean mo38879o() {
        return this.f27463j.mo38690b().getHasLinkPassword();
    }

    /* renamed from: p */
    public final String mo38880p() {
        return this.f27463j.mo38690b().getLinkPassword();
    }

    /* renamed from: q */
    public final boolean mo38881q() {
        return this.f27463j.mo38690b().getLock_state();
    }

    /* renamed from: r */
    public final boolean mo38882r() {
        return this.f27463j.mo38690b().getCan_unlock();
    }

    /* renamed from: v */
    public final boolean mo38887v() {
        return this.f27463j.mo38687a().canInviteFullAccess();
    }

    /* renamed from: w */
    public final boolean mo38888w() {
        return this.f27463j.mo38687a().canInviteEdit();
    }

    /* renamed from: x */
    public final boolean mo38890x() {
        return this.f27463j.mo38687a().canInviteView();
    }

    /* renamed from: y */
    public final boolean mo38891y() {
        return this.f27463j.mo38687a().canManagerCollaborator();
    }

    /* renamed from: z */
    public final boolean mo38892z() {
        return this.f27463j.mo38690b().getShowLinkShare();
    }

    /* renamed from: t */
    public final boolean mo38884t() {
        if (mo38874j() || this.f27463j.mo38687a().canManagePermissionMeta(mo38874j())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo38859a(ShareFolderPublicPermission shareFolderPublicPermission) {
        Intrinsics.checkParameterIsNotNull(shareFolderPublicPermission, "shareFolderPublicPermission");
        this.f27463j.mo38688a(shareFolderPublicPermission);
    }

    /* renamed from: a */
    public final void mo38860a(ShareFolderUserPermission shareFolderUserPermission) {
        Intrinsics.checkParameterIsNotNull(shareFolderUserPermission, "shareFolderUserPermission");
        this.f27463j.mo38689a(shareFolderUserPermission);
    }

    /* renamed from: a */
    public final void mo38861a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "password");
        this.f27463j.mo38690b().setLinkPassword(str);
    }

    /* renamed from: a */
    public final void mo38862a(boolean z) {
        this.f27463j.mo38690b().setHasLinkPassword(z);
    }

    public FolderPermSetInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShareFolderPermission shareFolderPermission, String str9, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Intrinsics.checkParameterIsNotNull(str4, "ownerUid");
        Intrinsics.checkParameterIsNotNull(str5, "ownerName");
        Intrinsics.checkParameterIsNotNull(str6, "creatorUid");
        Intrinsics.checkParameterIsNotNull(str7, "createTime");
        Intrinsics.checkParameterIsNotNull(str8, "creatorTenantId");
        Intrinsics.checkParameterIsNotNull(shareFolderPermission, "shareFolderPermission");
        Intrinsics.checkParameterIsNotNull(str9, "spaceId");
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f27454a = i;
        this.f27455b = str;
        this.f27456c = str2;
        this.f27457d = str3;
        this.f27458e = str4;
        this.f27459f = str5;
        this.f27460g = str6;
        this.f27461h = str7;
        this.f27462i = str8;
        this.f27463j = shareFolderPermission;
        this.f27464k = str9;
        this.f27465l = folderVersion;
        this.f27466m = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FolderPermSetInfo(int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission r29, java.lang.String r30, com.bytedance.ee.bear.list.dto.FolderVersion r31, boolean r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission, java.lang.String, com.bytedance.ee.bear.list.dto.FolderVersion, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
