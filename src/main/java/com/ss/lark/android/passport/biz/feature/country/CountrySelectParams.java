package com.ss.lark.android.passport.biz.feature.country;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/country/CountrySelectParams;", "Landroid/os/Parcelable;", "availableCodes", "", "", "reFetchWhenShow", "", "(Ljava/util/List;Z)V", "getAvailableCodes", "()Ljava/util/List;", "getReFetchWhenShow", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CountrySelectParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64710a();

    /* renamed from: a */
    private final List<String> f163228a;

    /* renamed from: b */
    private final boolean f163229b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.country.CountrySelectParams$a */
    public static class C64710a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new CountrySelectParams(parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountrySelectParams[i];
        }
    }

    public CountrySelectParams() {
        this(null, false, 3, null);
    }

    public CountrySelectParams(List<String> list) {
        this(list, false, 2, null);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountrySelectParams)) {
            return false;
        }
        CountrySelectParams countrySelectParams = (CountrySelectParams) obj;
        return Intrinsics.areEqual(this.f163228a, countrySelectParams.f163228a) && this.f163229b == countrySelectParams.f163229b;
    }

    public int hashCode() {
        List<String> list = this.f163228a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f163229b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "CountrySelectParams(availableCodes=" + this.f163228a + ", reFetchWhenShow=" + this.f163229b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.f163228a);
        parcel.writeInt(this.f163229b ? 1 : 0);
    }

    /* renamed from: a */
    public final List<String> mo223547a() {
        return this.f163228a;
    }

    /* renamed from: b */
    public final boolean mo223548b() {
        return this.f163229b;
    }

    public CountrySelectParams(List<String> list, boolean z) {
        this.f163228a = list;
        this.f163229b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountrySelectParams(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? true : z);
    }
}
