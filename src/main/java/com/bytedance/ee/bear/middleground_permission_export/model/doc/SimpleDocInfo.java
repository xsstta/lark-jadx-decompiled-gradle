package com.bytedance.ee.bear.middleground_permission_export.model.doc;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/SimpleDocInfo;", "Landroid/os/Parcelable;", ShareHitPoint.f121869d, "", "token", "", "(ILjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SimpleDocInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10164a();

    /* renamed from: a */
    private final int f27430a;

    /* renamed from: b */
    private final String f27431b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.doc.SimpleDocInfo$a */
    public static class C10164a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new SimpleDocInfo(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleDocInfo[i];
        }
    }

    public SimpleDocInfo() {
        this(0, null, 3, null);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SimpleDocInfo(type=" + this.f27430a + ", token=" + this.f27431b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f27430a);
        parcel.writeString(this.f27431b);
    }

    public int hashCode() {
        return (this.f27430a * 31) + this.f27431b.hashCode();
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            SimpleDocInfo simpleDocInfo = (SimpleDocInfo) obj;
            if (this.f27430a == simpleDocInfo.f27430a && !(!Intrinsics.areEqual(this.f27431b, simpleDocInfo.f27431b))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.doc.SimpleDocInfo");
    }

    public SimpleDocInfo(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f27430a = i;
        this.f27431b = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SimpleDocInfo(int r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x000f
            com.bytedance.ee.bear.list.dto.a r1 = com.bytedance.ee.bear.list.dto.C8275a.f22371d
            java.lang.String r4 = "DocumentType.DOC"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            int r1 = r1.mo32555b()
        L_0x000f:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0015
            java.lang.String r2 = ""
        L_0x0015:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.doc.SimpleDocInfo.<init>(int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
