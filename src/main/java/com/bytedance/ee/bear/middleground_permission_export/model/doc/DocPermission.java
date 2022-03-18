package com.bytedance.ee.bear.middleground_permission_export.model.doc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "Landroid/os/Parcelable;", "userPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;)V", "getPublicPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "setPublicPermission", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;)V", "getUserPermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "setUserPermission", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocPermission implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10161a();

    /* renamed from: a */
    private IDocUserPermission f27428a;

    /* renamed from: b */
    private IDocPublicPermission f27429b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission$a */
    public static class C10161a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new DocPermission((IDocUserPermission) parcel.readSerializable(), (IDocPublicPermission) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocPermission[i];
        }
    }

    public DocPermission() {
        this(null, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocPermission)) {
            return false;
        }
        DocPermission docPermission = (DocPermission) obj;
        return Intrinsics.areEqual(this.f27428a, docPermission.f27428a) && Intrinsics.areEqual(this.f27429b, docPermission.f27429b);
    }

    public int hashCode() {
        IDocUserPermission iDocUserPermission = this.f27428a;
        int i = 0;
        int hashCode = (iDocUserPermission != null ? iDocUserPermission.hashCode() : 0) * 31;
        IDocPublicPermission iDocPublicPermission = this.f27429b;
        if (iDocPublicPermission != null) {
            i = iDocPublicPermission.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeSerializable(this.f27428a);
        parcel.writeSerializable(this.f27429b);
    }

    /* renamed from: a */
    public final IDocUserPermission mo38591a() {
        return this.f27428a;
    }

    /* renamed from: b */
    public final IDocPublicPermission mo38594b() {
        return this.f27429b;
    }

    public String toString() {
        return "DocPermission(docUserPermission=" + this.f27428a + ", docPublicPermission=" + this.f27429b + ')';
    }

    /* renamed from: a */
    public final void mo38592a(IDocPublicPermission iDocPublicPermission) {
        Intrinsics.checkParameterIsNotNull(iDocPublicPermission, "<set-?>");
        this.f27429b = iDocPublicPermission;
    }

    /* renamed from: a */
    public final void mo38593a(IDocUserPermission iDocUserPermission) {
        Intrinsics.checkParameterIsNotNull(iDocUserPermission, "<set-?>");
        this.f27428a = iDocUserPermission;
    }

    public DocPermission(IDocUserPermission iDocUserPermission, IDocPublicPermission iDocPublicPermission) {
        Intrinsics.checkParameterIsNotNull(iDocUserPermission, "userPermission");
        Intrinsics.checkParameterIsNotNull(iDocPublicPermission, "publicPermission");
        this.f27428a = iDocUserPermission;
        this.f27429b = iDocPublicPermission;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocPermission(IDocUserPermission iDocUserPermission, IDocPublicPermission iDocPublicPermission, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefaultDocUserPermission() : iDocUserPermission, (i & 2) != 0 ? new DefaultDocPublicPermission() : iDocPublicPermission);
    }
}
