package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "Landroid/os/Parcelable;", "token", "", ShareHitPoint.f121869d, "", "ownerId", "subType", "module", "inviteDepEnable", "", "canInviteExternalUser", "isWiki", "canReAdd", "isSingleContainer", "ignoreDocContainerCollaborator", "isWikiVersionV2", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZ)V", "getCanInviteExternalUser", "()Z", "getCanReAdd", "getIgnoreDocContainerCollaborator", "getInviteDepEnable", "getModule", "()Ljava/lang/String;", "getOwnerId", "getSubType", "getToken", "getType", "()I", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class InviteMemberParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9637a();

    /* renamed from: a */
    private final String f25867a;

    /* renamed from: b */
    private final int f25868b;

    /* renamed from: c */
    private final String f25869c;

    /* renamed from: d */
    private final String f25870d;

    /* renamed from: e */
    private final String f25871e;

    /* renamed from: f */
    private final boolean f25872f;

    /* renamed from: g */
    private final boolean f25873g;

    /* renamed from: h */
    private final boolean f25874h;

    /* renamed from: i */
    private final boolean f25875i;

    /* renamed from: j */
    private final boolean f25876j;

    /* renamed from: k */
    private final boolean f25877k;

    /* renamed from: l */
    private final boolean f25878l;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams$a */
    public static class C9637a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new InviteMemberParams(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteMemberParams[i];
        }
    }

    public InviteMemberParams() {
        this(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InviteMemberParams) {
                InviteMemberParams inviteMemberParams = (InviteMemberParams) obj;
                if (Intrinsics.areEqual(this.f25867a, inviteMemberParams.f25867a)) {
                    if ((this.f25868b == inviteMemberParams.f25868b) && Intrinsics.areEqual(this.f25869c, inviteMemberParams.f25869c) && Intrinsics.areEqual(this.f25870d, inviteMemberParams.f25870d) && Intrinsics.areEqual(this.f25871e, inviteMemberParams.f25871e)) {
                        if (this.f25872f == inviteMemberParams.f25872f) {
                            if (this.f25873g == inviteMemberParams.f25873g) {
                                if (this.f25874h == inviteMemberParams.f25874h) {
                                    if (this.f25875i == inviteMemberParams.f25875i) {
                                        if (this.f25876j == inviteMemberParams.f25876j) {
                                            if (this.f25877k == inviteMemberParams.f25877k) {
                                                if (this.f25878l == inviteMemberParams.f25878l) {
                                                    return true;
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
        String str = this.f25867a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f25868b) * 31;
        String str2 = this.f25869c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25870d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f25871e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f25872f;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f25873g;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f25874h;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.f25875i;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.f25876j;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.f25877k;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        boolean z7 = this.f25878l;
        if (!z7) {
            i3 = z7 ? 1 : 0;
        }
        return i27 + i3;
    }

    public String toString() {
        return "InviteMemberParams(token=" + this.f25867a + ", type=" + this.f25868b + ", ownerId=" + this.f25869c + ", subType=" + this.f25870d + ", module=" + this.f25871e + ", inviteDepEnable=" + this.f25872f + ", canInviteExternalUser=" + this.f25873g + ", isWiki=" + this.f25874h + ", canReAdd=" + this.f25875i + ", isSingleContainer=" + this.f25876j + ", ignoreDocContainerCollaborator=" + this.f25877k + ", isWikiVersionV2=" + this.f25878l + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f25867a);
        parcel.writeInt(this.f25868b);
        parcel.writeString(this.f25869c);
        parcel.writeString(this.f25870d);
        parcel.writeString(this.f25871e);
        parcel.writeInt(this.f25872f ? 1 : 0);
        parcel.writeInt(this.f25873g ? 1 : 0);
        parcel.writeInt(this.f25874h ? 1 : 0);
        parcel.writeInt(this.f25875i ? 1 : 0);
        parcel.writeInt(this.f25876j ? 1 : 0);
        parcel.writeInt(this.f25877k ? 1 : 0);
        parcel.writeInt(this.f25878l ? 1 : 0);
    }

    /* renamed from: a */
    public final String mo36834a() {
        return this.f25867a;
    }

    /* renamed from: b */
    public final int mo36835b() {
        return this.f25868b;
    }

    /* renamed from: c */
    public final String mo36836c() {
        return this.f25869c;
    }

    /* renamed from: d */
    public final String mo36837d() {
        return this.f25870d;
    }

    /* renamed from: e */
    public final String mo36839e() {
        return this.f25871e;
    }

    /* renamed from: f */
    public final boolean mo36841f() {
        return this.f25872f;
    }

    /* renamed from: g */
    public final boolean mo36842g() {
        return this.f25873g;
    }

    /* renamed from: h */
    public final boolean mo36843h() {
        return this.f25874h;
    }

    /* renamed from: i */
    public final boolean mo36845i() {
        return this.f25875i;
    }

    /* renamed from: j */
    public final boolean mo36846j() {
        return this.f25876j;
    }

    /* renamed from: k */
    public final boolean mo36847k() {
        return this.f25877k;
    }

    /* renamed from: l */
    public final boolean mo36848l() {
        return this.f25878l;
    }

    public InviteMemberParams(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "ownerId");
        Intrinsics.checkParameterIsNotNull(str3, "subType");
        Intrinsics.checkParameterIsNotNull(str4, "module");
        this.f25867a = str;
        this.f25868b = i;
        this.f25869c = str2;
        this.f25870d = str3;
        this.f25871e = str4;
        this.f25872f = z;
        this.f25873g = z2;
        this.f25874h = z3;
        this.f25875i = z4;
        this.f25876j = z5;
        this.f25877k = z6;
        this.f25878l = z7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InviteMemberParams(java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
