package com.bytedance.ee.bear.middleground_permission_export.model.permissionset;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\bJ\t\u0010&\u001a\u00020\u0003HÂ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÂ\u0003J\t\u0010)\u001a\u00020\u0003HÂ\u0003J\t\u0010*\u001a\u00020\bHÂ\u0003J\t\u0010+\u001a\u00020\nHÂ\u0003J\t\u0010,\u001a\u00020\fHÂ\u0003J\t\u0010-\u001a\u00020\u000eHÂ\u0003J\t\u0010.\u001a\u00020\bHÂ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003Jm\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0013\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\u0006\u00105\u001a\u00020\bJ\u0006\u00106\u001a\u00020\bJ\u0006\u00107\u001a\u00020\u0003J\u0006\u00108\u001a\u00020\u0003J\u0006\u00109\u001a\u00020\u0003J\u0006\u0010:\u001a\u00020\u0005J\u0006\u0010;\u001a\u00020\u0005J\u0006\u0010<\u001a\u00020\bJ\u0006\u0010=\u001a\u00020\u0003J\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020\bJ\u0006\u0010A\u001a\u00020\bJ\u0006\u0010B\u001a\u00020\u0003J\u0006\u0010C\u001a\u00020\u0003J\u0006\u0010D\u001a\u00020\u0003J\u0006\u0010E\u001a\u00020\u0005J\u0006\u0010F\u001a\u00020\u0003J\u0006\u0010G\u001a\u00020\u0005J\u0006\u0010H\u001a\u00020\bJ\t\u0010I\u001a\u00020\u0005HÖ\u0001J\u0006\u0010J\u001a\u00020\bJ\u0006\u0010K\u001a\u00020\bJ\u0006\u0010L\u001a\u00020\bJ\u0006\u0010M\u001a\u00020\bJ\u0006\u0010N\u001a\u00020\bJ\u0006\u0010O\u001a\u00020\bJ\u0006\u0010P\u001a\u00020\bJ\u0006\u0010Q\u001a\u00020\bJ\u0006\u0010R\u001a\u00020\bJ\u0006\u0010S\u001a\u00020\bJ\u0006\u0010T\u001a\u00020\bJ\u0006\u0010U\u001a\u00020\bJ\u0006\u0010V\u001a\u00020\bJ\u0006\u0010W\u001a\u00020\bJ\u0006\u0010X\u001a\u00020\bJ\u0006\u0010Y\u001a\u00020\bJ\u0006\u0010Z\u001a\u00020\bJ\u0006\u0010[\u001a\u00020\bJ\u0006\u0010\\\u001a\u00020\bJ\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010]\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020?J\u000e\u0010a\u001a\u00020_2\u0006\u0010b\u001a\u00020cJ\u000e\u0010d\u001a\u00020_2\u0006\u0010H\u001a\u00020\bJ\u000e\u0010e\u001a\u00020_2\u0006\u0010X\u001a\u00020\bJ\u000e\u0010f\u001a\u00020_2\u0006\u0010]\u001a\u00020\u0003J\t\u0010g\u001a\u00020\u0003HÖ\u0001J\u0019\u0010h\u001a\u00020_2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "Landroid/os/Parcelable;", "url", "", ShareHitPoint.f121869d, "", "token", "isWiki", "", "docMetaInfo", "Lcom/bytedance/ee/bear/DocMetaInfo;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "passwordSharingEnable", "transferOwnerEnable", "isWikiVersionV2", "(Ljava/lang/String;ILjava/lang/String;ZLcom/bytedance/ee/bear/DocMetaInfo;Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;Lcom/bytedance/ee/bear/list/dto/DocVersion;ZZZ)V", "()Z", "setWikiVersionV2", "(Z)V", "getTransferOwnerEnable", "setTransferOwnerEnable", "canEdit", "canInviteContainerEdit", "canInviteContainerFa", "canInviteContainerRead", "canInviteSinglePageEdit", "canInviteSinglePageFa", "canInviteSinglePageRead", "canManageContainerPermissionMeta", "canManagePermissionMeta", "canManageSinglePagePermissionMeta", "canManagerCollaborator", "canManagerContainerCollaborator", "canManagerSinglePageCollaborator", "canUnLock", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getCommentSettingDisableByContainer", "getCommentSettingEnable", "getCreateTime", "getCreatorTenantId", "getCreatorUid", "getLinkShareAnyoneEditBlockValue", "getLinkShareAnyoneReadBlockValue", "getLockState", "getOwnerId", "getPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "getSecuritySettingDisableByContainer", "getSecuritySettingEnable", "getSubType", "getTitle", "getToken", "getType", "getUrl", "getUserPerm", "hasPassword", "hashCode", "isCanCross", "isCommentWithEdit", "isCommentWithRead", "isDocV2", "isExternalAccess", "isExternalAccessDisableByContainer", "isExternalAccessSinglePagePermType", "isInviteExternal", "isLinkShareSinglePagePermType", "isManagerCollaboratorAnyone", "isManagerCollaboratorTenant", "isManagerCollaboratorWithEdit", "isManagerCollaboratorWithFA", "isManagerCollaboratorWithRead", "isOwner", "isSecurityWithEdit", "isSecurityWithFA", "isSecurityWithRead", "isShareExternalWithFA", "password", "setDocPermission", "", "docPublicPermission", "setDocUserPermission", "docUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "setHasPassword", "setOwner", "setPassword", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocPermSetInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10171a();

    /* renamed from: a */
    private final String f27444a;

    /* renamed from: b */
    private final int f27445b;

    /* renamed from: c */
    private final String f27446c;

    /* renamed from: d */
    private final boolean f27447d;

    /* renamed from: e */
    private final DocMetaInfo f27448e;

    /* renamed from: f */
    private final DocPermission f27449f;

    /* renamed from: g */
    private final DocVersion f27450g;

    /* renamed from: h */
    private final boolean f27451h;

    /* renamed from: i */
    private boolean f27452i;

    /* renamed from: j */
    private boolean f27453j;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo$a */
    public static class C10171a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new DocPermSetInfo(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (DocMetaInfo) parcel.readSerializable(), (DocPermission) DocPermission.CREATOR.createFromParcel(parcel), (DocVersion) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocPermSetInfo[i];
        }
    }

    public DocPermSetInfo() {
        this(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocPermSetInfo) {
                DocPermSetInfo docPermSetInfo = (DocPermSetInfo) obj;
                if (Intrinsics.areEqual(this.f27444a, docPermSetInfo.f27444a)) {
                    if ((this.f27445b == docPermSetInfo.f27445b) && Intrinsics.areEqual(this.f27446c, docPermSetInfo.f27446c)) {
                        if ((this.f27447d == docPermSetInfo.f27447d) && Intrinsics.areEqual(this.f27448e, docPermSetInfo.f27448e) && Intrinsics.areEqual(this.f27449f, docPermSetInfo.f27449f) && Intrinsics.areEqual(this.f27450g, docPermSetInfo.f27450g)) {
                            if (this.f27451h == docPermSetInfo.f27451h) {
                                if (this.f27452i == docPermSetInfo.f27452i) {
                                    if (this.f27453j == docPermSetInfo.f27453j) {
                                        return true;
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
        String str = this.f27444a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f27445b) * 31;
        String str2 = this.f27446c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f27447d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        DocMetaInfo docMetaInfo = this.f27448e;
        int hashCode3 = (i6 + (docMetaInfo != null ? docMetaInfo.hashCode() : 0)) * 31;
        DocPermission docPermission = this.f27449f;
        int hashCode4 = (hashCode3 + (docPermission != null ? docPermission.hashCode() : 0)) * 31;
        DocVersion docVersion = this.f27450g;
        if (docVersion != null) {
            i = docVersion.hashCode();
        }
        int i7 = (hashCode4 + i) * 31;
        boolean z2 = this.f27451h;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f27452i;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f27453j;
        if (!z4) {
            i2 = z4 ? 1 : 0;
        }
        return i15 + i2;
    }

    public String toString() {
        return "DocPermSetInfo(url=" + this.f27444a + ", type=" + this.f27445b + ", token=" + this.f27446c + ", isWiki=" + this.f27447d + ", docMetaInfo=" + this.f27448e + ", docPermission=" + this.f27449f + ", version=" + this.f27450g + ", passwordSharingEnable=" + this.f27451h + ", transferOwnerEnable=" + this.f27452i + ", isWikiVersionV2=" + this.f27453j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f27444a);
        parcel.writeInt(this.f27445b);
        parcel.writeString(this.f27446c);
        parcel.writeInt(this.f27447d ? 1 : 0);
        parcel.writeSerializable(this.f27448e);
        this.f27449f.writeToParcel(parcel, 0);
        parcel.writeSerializable(this.f27450g);
        parcel.writeInt(this.f27451h ? 1 : 0);
        parcel.writeInt(this.f27452i ? 1 : 0);
        parcel.writeInt(this.f27453j ? 1 : 0);
    }

    /* renamed from: Z */
    public final boolean mo38817Z() {
        return this.f27451h;
    }

    /* renamed from: a */
    public final String mo38818a() {
        return this.f27444a;
    }

    public final boolean aa() {
        return this.f27452i;
    }

    public final boolean ab() {
        return this.f27453j;
    }

    /* renamed from: b */
    public final int mo38825b() {
        return this.f27445b;
    }

    /* renamed from: c */
    public final String mo38827c() {
        return this.f27446c;
    }

    /* renamed from: q */
    public final boolean mo38844q() {
        return this.f27447d;
    }

    /* renamed from: Y */
    public final boolean mo38816Y() {
        return this.f27450g.isDocV2();
    }

    /* renamed from: d */
    public final String mo38828d() {
        return this.f27448e.getTitle();
    }

    /* renamed from: e */
    public final String mo38830e() {
        return this.f27448e.getSubType();
    }

    /* renamed from: f */
    public final String mo38832f() {
        return this.f27448e.getOwnerUid();
    }

    /* renamed from: g */
    public final String mo38833g() {
        return this.f27448e.getCreateTime();
    }

    /* renamed from: h */
    public final String mo38834h() {
        return this.f27448e.getCreatorUid();
    }

    /* renamed from: i */
    public final String mo38836i() {
        return this.f27448e.getCreatorTenantId();
    }

    /* renamed from: j */
    public final IDocPublicPermission mo38837j() {
        return this.f27449f.mo38594b();
    }

    /* renamed from: A */
    public final boolean mo38792A() {
        return this.f27449f.mo38591a().canInviteSinglePageView();
    }

    /* renamed from: B */
    public final boolean mo38793B() {
        return this.f27449f.mo38594b().adminCanCross();
    }

    /* renamed from: C */
    public final boolean mo38794C() {
        return this.f27449f.mo38594b().externalAccess();
    }

    /* renamed from: D */
    public final boolean mo38795D() {
        return this.f27449f.mo38594b().inviteExternal();
    }

    /* renamed from: E */
    public final boolean mo38796E() {
        return this.f27449f.mo38591a().canManageCollaborator();
    }

    /* renamed from: F */
    public final boolean mo38797F() {
        return this.f27449f.mo38591a().canManageContainerCollaborator();
    }

    /* renamed from: G */
    public final boolean mo38798G() {
        return this.f27449f.mo38591a().canManageSinglePageCollaborator();
    }

    /* renamed from: H */
    public final boolean mo38799H() {
        return this.f27449f.mo38594b().isLock();
    }

    /* renamed from: I */
    public final boolean mo38800I() {
        return this.f27449f.mo38594b().canUnLock();
    }

    /* renamed from: J */
    public final boolean mo38801J() {
        return this.f27449f.mo38594b().hasLinkPassword();
    }

    /* renamed from: K */
    public final String mo38802K() {
        return this.f27449f.mo38594b().linkPassword();
    }

    /* renamed from: L */
    public final boolean mo38803L() {
        return this.f27449f.mo38594b().isShareExternalWithFA();
    }

    /* renamed from: M */
    public final boolean mo38804M() {
        return this.f27449f.mo38594b().isManagerCollaboratorWithRead();
    }

    /* renamed from: N */
    public final boolean mo38805N() {
        return this.f27449f.mo38594b().isManagerCollaboratorWithEdit();
    }

    /* renamed from: O */
    public final boolean mo38806O() {
        return this.f27449f.mo38594b().isManagerCollaboratorWithFA();
    }

    /* renamed from: P */
    public final boolean mo38807P() {
        return this.f27449f.mo38594b().isCommentWithRead();
    }

    /* renamed from: Q */
    public final boolean mo38808Q() {
        return this.f27449f.mo38594b().isCommentWithEdit();
    }

    /* renamed from: R */
    public final boolean mo38809R() {
        return this.f27449f.mo38594b().isSecurityWithRead();
    }

    /* renamed from: S */
    public final boolean mo38810S() {
        return this.f27449f.mo38594b().isSecurityWithEdit();
    }

    /* renamed from: T */
    public final boolean mo38811T() {
        return this.f27449f.mo38594b().isSecurityWithFA();
    }

    /* renamed from: U */
    public final boolean mo38812U() {
        return this.f27449f.mo38594b().isExternalAccessPermTypeSinglePage();
    }

    /* renamed from: V */
    public final boolean mo38813V() {
        return this.f27449f.mo38594b().isLinkSharePermTypeSinglePage();
    }

    /* renamed from: W */
    public final int mo38814W() {
        return this.f27449f.mo38594b().getLinkShareAnyoneReadBlockValue();
    }

    /* renamed from: X */
    public final int mo38815X() {
        return this.f27449f.mo38594b().getLinkShareAnyoneEditBlockValue();
    }

    /* renamed from: k */
    public final int mo38838k() {
        return this.f27449f.mo38591a().getPermissions();
    }

    /* renamed from: l */
    public final boolean mo38839l() {
        return this.f27449f.mo38594b().isSecuritySettingEnable();
    }

    /* renamed from: m */
    public final boolean mo38840m() {
        return this.f27449f.mo38594b().isCommentSettingEnable();
    }

    /* renamed from: n */
    public final boolean mo38841n() {
        return this.f27449f.mo38594b().isSecuritySettingDisableByContainer();
    }

    /* renamed from: o */
    public final boolean mo38842o() {
        return this.f27449f.mo38594b().isCommentSettingDisableByContainer();
    }

    /* renamed from: p */
    public final boolean mo38843p() {
        return this.f27449f.mo38594b().isExternalAccessConstraintByContainer();
    }

    /* renamed from: r */
    public final boolean mo38845r() {
        return this.f27449f.mo38594b().isOwner();
    }

    /* renamed from: s */
    public final boolean mo38846s() {
        return this.f27449f.mo38591a().canManagePermissionMeta();
    }

    /* renamed from: t */
    public final boolean mo38847t() {
        return this.f27449f.mo38591a().canManageContainerPermissionMeta();
    }

    /* renamed from: u */
    public final boolean mo38849u() {
        return this.f27449f.mo38591a().canManageSinglePagePermissionMeta();
    }

    /* renamed from: v */
    public final boolean mo38850v() {
        return this.f27449f.mo38591a().canInviteFullAccess();
    }

    /* renamed from: w */
    public final boolean mo38851w() {
        return this.f27449f.mo38591a().canInviteEdit();
    }

    /* renamed from: x */
    public final boolean mo38853x() {
        return this.f27449f.mo38591a().canInviteView();
    }

    /* renamed from: y */
    public final boolean mo38854y() {
        return this.f27449f.mo38591a().canInviteSinglePageFullAccess();
    }

    /* renamed from: z */
    public final boolean mo38855z() {
        return this.f27449f.mo38591a().canInviteSinglePageEdit();
    }

    /* renamed from: a */
    public final void mo38819a(IDocPublicPermission iDocPublicPermission) {
        Intrinsics.checkParameterIsNotNull(iDocPublicPermission, "docPublicPermission");
        this.f27449f.mo38592a(iDocPublicPermission);
    }

    /* renamed from: b */
    public final void mo38826b(boolean z) {
        this.f27449f.mo38594b().setOwner(z);
    }

    /* renamed from: a */
    public final void mo38820a(IDocUserPermission iDocUserPermission) {
        Intrinsics.checkParameterIsNotNull(iDocUserPermission, "docUserPermission");
        this.f27449f.mo38593a(iDocUserPermission);
    }

    /* renamed from: a */
    public final void mo38821a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "password");
        this.f27449f.mo38594b().setPassword(str);
    }

    /* renamed from: a */
    public final void mo38822a(boolean z) {
        this.f27449f.mo38594b().setHasPassword(z);
    }

    public DocPermSetInfo(String str, int i, String str2, boolean z, DocMetaInfo docMetaInfo, DocPermission docPermission, DocVersion docVersion, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(docMetaInfo, "docMetaInfo");
        Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
        Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f27444a = str;
        this.f27445b = i;
        this.f27446c = str2;
        this.f27447d = z;
        this.f27448e = docMetaInfo;
        this.f27449f = docPermission;
        this.f27450g = docVersion;
        this.f27451h = z2;
        this.f27452i = z3;
        this.f27453j = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocPermSetInfo(java.lang.String r26, int r27, java.lang.String r28, boolean r29, com.bytedance.ee.bear.DocMetaInfo r30, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission r31, com.bytedance.ee.bear.list.dto.DocVersion r32, boolean r33, boolean r34, boolean r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo.<init>(java.lang.String, int, java.lang.String, boolean, com.bytedance.ee.bear.DocMetaInfo, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission, com.bytedance.ee.bear.list.dto.DocVersion, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
