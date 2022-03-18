package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "Landroid/os/Parcelable;", "userId", "", "userName", "avatar", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getUserId", "getUserName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VisibleTopUserInDep implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9871a();

    /* renamed from: a */
    private final String f26663a;

    /* renamed from: b */
    private final String f26664b;

    /* renamed from: c */
    private final String f26665c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.VisibleTopUserInDep$a */
    public static class C9871a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new VisibleTopUserInDep(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VisibleTopUserInDep[i];
        }
    }

    public VisibleTopUserInDep() {
        this(null, null, null, 7, null);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "VisibleTopUserInDep(userId=" + this.f26663a + ", userName=" + this.f26664b + ", avatar=" + this.f26665c + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f26663a);
        parcel.writeString(this.f26664b);
        parcel.writeString(this.f26665c);
    }

    /* renamed from: a */
    public final String mo37552a() {
        return this.f26663a;
    }

    /* renamed from: b */
    public final String mo37553b() {
        return this.f26664b;
    }

    /* renamed from: c */
    public final String mo37554c() {
        return this.f26665c;
    }

    public int hashCode() {
        return this.f26663a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!Intrinsics.areEqual(getClass(), obj.getClass()))) {
            return false;
        }
        return Objects.equals(this.f26663a, ((VisibleTopUserInDep) obj).f26663a);
    }

    public VisibleTopUserInDep(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "userName");
        Intrinsics.checkParameterIsNotNull(str3, "avatar");
        this.f26663a = str;
        this.f26664b = str2;
        this.f26665c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VisibleTopUserInDep(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
