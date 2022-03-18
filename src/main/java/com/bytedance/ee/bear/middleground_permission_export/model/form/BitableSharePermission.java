package com.bytedance.ee.bear.middleground_permission_export.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "Landroid/os/Parcelable;", "userPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;)V", "getPublicPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "setPublicPermission", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;)V", "getUserPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;", "setUserPermission", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableShareUserPermission;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableSharePermission implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10168a();

    /* renamed from: a */
    private IBitableShareUserPermission f27437a;

    /* renamed from: b */
    private IBitableSharePublicPermission f27438b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission$a */
    public static class C10168a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new BitableSharePermission((IBitableShareUserPermission) parcel.readSerializable(), (IBitableSharePublicPermission) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BitableSharePermission[i];
        }
    }

    public BitableSharePermission() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitableSharePermission)) {
            return false;
        }
        BitableSharePermission bitableSharePermission = (BitableSharePermission) obj;
        return Intrinsics.areEqual(this.f27437a, bitableSharePermission.f27437a) && Intrinsics.areEqual(this.f27438b, bitableSharePermission.f27438b);
    }

    public int hashCode() {
        IBitableShareUserPermission iBitableShareUserPermission = this.f27437a;
        int i = 0;
        int hashCode = (iBitableShareUserPermission != null ? iBitableShareUserPermission.hashCode() : 0) * 31;
        IBitableSharePublicPermission iBitableSharePublicPermission = this.f27438b;
        if (iBitableSharePublicPermission != null) {
            i = iBitableSharePublicPermission.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "BitableSharePermission(userPermission=" + this.f27437a + ", publicPermission=" + this.f27438b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeSerializable(this.f27437a);
        parcel.writeSerializable(this.f27438b);
    }

    /* renamed from: a */
    public final IBitableShareUserPermission mo38769a() {
        return this.f27437a;
    }

    /* renamed from: b */
    public final IBitableSharePublicPermission mo38771b() {
        return this.f27438b;
    }

    /* renamed from: a */
    public final void mo38770a(IBitableSharePublicPermission iBitableSharePublicPermission) {
        Intrinsics.checkParameterIsNotNull(iBitableSharePublicPermission, "<set-?>");
        this.f27438b = iBitableSharePublicPermission;
    }

    public BitableSharePermission(IBitableShareUserPermission iBitableShareUserPermission, IBitableSharePublicPermission iBitableSharePublicPermission) {
        Intrinsics.checkParameterIsNotNull(iBitableShareUserPermission, "userPermission");
        Intrinsics.checkParameterIsNotNull(iBitableSharePublicPermission, "publicPermission");
        this.f27437a = iBitableShareUserPermission;
        this.f27438b = iBitableSharePublicPermission;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitableSharePermission(IBitableShareUserPermission iBitableShareUserPermission, IBitableSharePublicPermission iBitableSharePublicPermission, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefaultBitableShareUserPermission() : iBitableShareUserPermission, (i & 2) != 0 ? new DefaultBitableSharePublicPermission() : iBitableSharePublicPermission);
    }
}
