package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.huawei.hms.core.aidl.b */
public class C23523b implements Parcelable {
    public static final Parcelable.Creator<C23523b> CREATOR = new C23524a();

    /* renamed from: a */
    public String f57978a;

    /* renamed from: b */
    public Bundle f57979b;

    /* renamed from: c */
    private int f57980c;

    /* renamed from: d */
    private Bundle f57981d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.huawei.hms.core.aidl.b$a */
    static class C23524a implements Parcelable.Creator<C23523b> {
        C23524a() {
        }

        @Override // android.os.Parcelable.Creator
        public C23523b[] newArray(int i) {
            return new C23523b[i];
        }

        @Override // android.os.Parcelable.Creator
        public C23523b createFromParcel(Parcel parcel) {
            return new C23523b(parcel, (C23524a) null);
        }
    }

    /* renamed from: a */
    public Bundle mo82627a() {
        return this.f57981d;
    }

    /* renamed from: c */
    public int mo82630c() {
        return this.f57980c;
    }

    /* renamed from: b */
    public int mo82629b() {
        if (this.f57981d == null) {
            return 0;
        }
        return 1;
    }

    public C23523b() {
        this.f57979b = null;
        this.f57980c = 1;
        this.f57981d = null;
    }

    /* renamed from: a */
    private static ClassLoader m85288a(Class cls) {
        return cls.getClassLoader();
    }

    /* renamed from: a */
    public C23523b mo82628a(Bundle bundle) {
        this.f57981d = bundle;
        return this;
    }

    private C23523b(Parcel parcel) {
        this.f57979b = null;
        this.f57980c = 1;
        this.f57981d = null;
        m85289a(parcel);
    }

    /* renamed from: a */
    private void m85289a(Parcel parcel) {
        this.f57980c = parcel.readInt();
        this.f57978a = parcel.readString();
        this.f57979b = parcel.readBundle(m85288a(Bundle.class));
        this.f57981d = parcel.readBundle(m85288a(Bundle.class));
    }

    /* synthetic */ C23523b(Parcel parcel, C23524a aVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f57980c);
        parcel.writeString(this.f57978a);
        parcel.writeBundle(this.f57979b);
        parcel.writeBundle(this.f57981d);
    }

    public C23523b(String str, int i) {
        this.f57979b = null;
        this.f57980c = 1;
        this.f57981d = null;
        this.f57978a = str;
        this.f57980c = i;
    }
}
