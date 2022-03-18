package com.ss.android.lark.member_manage.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0010H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "avatar", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SelectChatterDTO implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f113657a;

    /* renamed from: b */
    private final String f113658b;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectChatterDTO)) {
            return false;
        }
        SelectChatterDTO selectChatterDTO = (SelectChatterDTO) obj;
        return Intrinsics.areEqual(this.f113657a, selectChatterDTO.f113657a) && Intrinsics.areEqual(this.f113658b, selectChatterDTO.f113658b);
    }

    public int hashCode() {
        String str = this.f113657a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f113658b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SelectChatterDTO(id=" + this.f113657a + ", avatar=" + this.f113658b + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.dto.SelectChatterDTO$a */
    public static final class CREATOR implements Parcelable.Creator<SelectChatterDTO> {
        private CREATOR() {
        }

        /* renamed from: a */
        public SelectChatterDTO[] newArray(int i) {
            return new SelectChatterDTO[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public SelectChatterDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new SelectChatterDTO(parcel);
        }
    }

    /* renamed from: a */
    public final String mo158888a() {
        return this.f113657a;
    }

    /* renamed from: b */
    public final String mo158889b() {
        return this.f113658b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SelectChatterDTO(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = r3.readString()
            java.lang.String r0 = com.ss.android.lark.utils.C57782ag.m224244b(r0)
            java.lang.String r1 = "TextUtil.nullToEmpty(parcel.readString())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r3 = r3.readString()
            java.lang.String r3 = com.ss.android.lark.utils.C57782ag.m224244b(r3)
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.member_manage.dto.SelectChatterDTO.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f113657a);
        parcel.writeString(this.f113658b);
    }

    public SelectChatterDTO(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "avatar");
        this.f113657a = str;
        this.f113658b = str2;
    }
}
