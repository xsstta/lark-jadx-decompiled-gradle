package com.bytedance.ee.bear.middleground_permission_export.model.permissionset;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.bytedance.ee.bear.share.IShareMeta;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÂ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "Landroid/os/Parcelable;", "url", "", ShareHitPoint.f121869d, "", "token", "shareMeta", "Lcom/bytedance/ee/bear/share/IShareMeta;", "bitableSharePermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "(Ljava/lang/String;ILjava/lang/String;Lcom/bytedance/ee/bear/share/IShareMeta;Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;)V", "getShareMeta", "()Lcom/bytedance/ee/bear/share/IShareMeta;", "getToken", "()Ljava/lang/String;", "getType", "()I", "getUrl", "canShare", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "getPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "hashCode", "setPublicPermission", "", "newPublicPermission", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableSharePermSetInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10170a();

    /* renamed from: a */
    private final String f27439a;

    /* renamed from: b */
    private final int f27440b;

    /* renamed from: c */
    private final String f27441c;

    /* renamed from: d */
    private final IShareMeta f27442d;

    /* renamed from: e */
    private BitableSharePermission f27443e;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo$a */
    public static class C10170a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new BitableSharePermSetInfo(parcel.readString(), parcel.readInt(), parcel.readString(), (IShareMeta) parcel.readSerializable(), (BitableSharePermission) BitableSharePermission.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BitableSharePermSetInfo[i];
        }
    }

    public BitableSharePermSetInfo() {
        this(null, 0, null, null, null, 31, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BitableSharePermSetInfo) {
                BitableSharePermSetInfo bitableSharePermSetInfo = (BitableSharePermSetInfo) obj;
                if (Intrinsics.areEqual(this.f27439a, bitableSharePermSetInfo.f27439a)) {
                    if (!(this.f27440b == bitableSharePermSetInfo.f27440b) || !Intrinsics.areEqual(this.f27441c, bitableSharePermSetInfo.f27441c) || !Intrinsics.areEqual(this.f27442d, bitableSharePermSetInfo.f27442d) || !Intrinsics.areEqual(this.f27443e, bitableSharePermSetInfo.f27443e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f27439a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f27440b) * 31;
        String str2 = this.f27441c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        IShareMeta iShareMeta = this.f27442d;
        int hashCode3 = (hashCode2 + (iShareMeta != null ? iShareMeta.hashCode() : 0)) * 31;
        BitableSharePermission bitableSharePermission = this.f27443e;
        if (bitableSharePermission != null) {
            i = bitableSharePermission.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "BitableSharePermSetInfo(url=" + this.f27439a + ", type=" + this.f27440b + ", token=" + this.f27441c + ", shareMeta=" + this.f27442d + ", bitableSharePermission=" + this.f27443e + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f27439a);
        parcel.writeInt(this.f27440b);
        parcel.writeString(this.f27441c);
        parcel.writeSerializable(this.f27442d);
        this.f27443e.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public final int mo38782c() {
        return this.f27440b;
    }

    /* renamed from: d */
    public final String mo38783d() {
        return this.f27441c;
    }

    /* renamed from: e */
    public final IShareMeta mo38785e() {
        return this.f27442d;
    }

    /* renamed from: a */
    public final IBitableSharePublicPermission mo38779a() {
        return this.f27443e.mo38771b();
    }

    /* renamed from: b */
    public final boolean mo38781b() {
        return this.f27443e.mo38769a().canShare();
    }

    /* renamed from: a */
    public final void mo38780a(IBitableSharePublicPermission iBitableSharePublicPermission) {
        Intrinsics.checkParameterIsNotNull(iBitableSharePublicPermission, "newPublicPermission");
        this.f27443e.mo38770a(iBitableSharePublicPermission);
    }

    public BitableSharePermSetInfo(String str, int i, String str2, IShareMeta iShareMeta, BitableSharePermission bitableSharePermission) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(iShareMeta, "shareMeta");
        Intrinsics.checkParameterIsNotNull(bitableSharePermission, "bitableSharePermission");
        this.f27439a = str;
        this.f27440b = i;
        this.f27441c = str2;
        this.f27442d = iShareMeta;
        this.f27443e = bitableSharePermission;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BitableSharePermSetInfo(java.lang.String r4, int r5, java.lang.String r6, com.bytedance.ee.bear.share.IShareMeta r7, com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0018
            com.bytedance.ee.bear.list.dto.a r4 = com.bytedance.ee.bear.list.dto.C8275a.f22371d
            java.lang.String r5 = "DocumentType.DOC"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r5 = r4.mo32555b()
        L_0x0018:
            r1 = r5
            r4 = r9 & 4
            if (r4 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = r6
        L_0x001f:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x002b
            com.bytedance.ee.bear.share.DefaultShareMeta r4 = new com.bytedance.ee.bear.share.DefaultShareMeta
            r4.<init>()
            r7 = r4
            com.bytedance.ee.bear.share.IShareMeta r7 = (com.bytedance.ee.bear.share.IShareMeta) r7
        L_0x002b:
            r2 = r7
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0037
            com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission r8 = new com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission
            r4 = 3
            r5 = 0
            r8.<init>(r5, r5, r4, r5)
        L_0x0037:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo.<init>(java.lang.String, int, java.lang.String, com.bytedance.ee.bear.share.IShareMeta, com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
