package com.bytedance.ee.bear.list.create;

import android.os.Parcel;
import android.os.Parcelable;

public class SelectCreationMenuConfig implements Parcelable {
    public static final Parcelable.Creator<SelectCreationMenuConfig> CREATOR = new Parcelable.Creator<SelectCreationMenuConfig>() {
        /* class com.bytedance.ee.bear.list.create.SelectCreationMenuConfig.C82271 */

        /* renamed from: a */
        public SelectCreationMenuConfig[] newArray(int i) {
            return new SelectCreationMenuConfig[i];
        }

        /* renamed from: a */
        public SelectCreationMenuConfig createFromParcel(Parcel parcel) {
            return new SelectCreationMenuConfig(parcel);
        }
    };

    /* renamed from: a */
    private boolean f22177a = true;

    /* renamed from: b */
    private boolean f22178b = true;

    /* renamed from: c */
    private boolean f22179c = true;

    /* renamed from: d */
    private boolean f22180d = true;

    /* renamed from: e */
    private boolean f22181e = true;

    /* renamed from: f */
    private boolean f22182f = true;

    /* renamed from: g */
    private boolean f22183g = true;

    /* renamed from: h */
    private boolean f22184h = true;

    /* renamed from: i */
    private boolean f22185i;

    /* renamed from: j */
    private boolean f22186j;

    /* renamed from: k */
    private boolean f22187k;

    /* renamed from: l */
    private boolean f22188l;

    /* renamed from: m */
    private boolean f22189m;

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public boolean mo32300l() {
        return this.f22189m;
    }

    /* renamed from: m */
    public boolean mo32301m() {
        return this.f22187k;
    }

    /* renamed from: a */
    public boolean mo32278a() {
        return this.f22177a;
    }

    /* renamed from: b */
    public boolean mo32280b() {
        return this.f22178b;
    }

    /* renamed from: c */
    public boolean mo32282c() {
        return this.f22179c;
    }

    /* renamed from: d */
    public boolean mo32284d() {
        return this.f22180d;
    }

    /* renamed from: e */
    public boolean mo32287e() {
        return this.f22183g;
    }

    /* renamed from: f */
    public boolean mo32289f() {
        return this.f22184h;
    }

    /* renamed from: g */
    public boolean mo32291g() {
        return this.f22181e;
    }

    /* renamed from: h */
    public boolean mo32293h() {
        return this.f22182f;
    }

    /* renamed from: i */
    public boolean mo32295i() {
        return this.f22185i;
    }

    /* renamed from: j */
    public boolean mo32297j() {
        return this.f22186j;
    }

    /* renamed from: k */
    public boolean mo32299k() {
        return this.f22188l;
    }

    public SelectCreationMenuConfig() {
    }

    /* renamed from: a */
    public SelectCreationMenuConfig mo32277a(boolean z) {
        this.f22177a = z;
        return this;
    }

    /* renamed from: b */
    public SelectCreationMenuConfig mo32279b(boolean z) {
        this.f22178b = z;
        return this;
    }

    /* renamed from: c */
    public SelectCreationMenuConfig mo32281c(boolean z) {
        this.f22179c = z;
        return this;
    }

    /* renamed from: d */
    public SelectCreationMenuConfig mo32283d(boolean z) {
        this.f22180d = z;
        return this;
    }

    /* renamed from: e */
    public SelectCreationMenuConfig mo32286e(boolean z) {
        this.f22181e = z;
        return this;
    }

    /* renamed from: f */
    public SelectCreationMenuConfig mo32288f(boolean z) {
        this.f22182f = z;
        return this;
    }

    /* renamed from: g */
    public SelectCreationMenuConfig mo32290g(boolean z) {
        this.f22185i = z;
        return this;
    }

    /* renamed from: h */
    public SelectCreationMenuConfig mo32292h(boolean z) {
        this.f22186j = z;
        return this;
    }

    /* renamed from: i */
    public SelectCreationMenuConfig mo32294i(boolean z) {
        this.f22188l = z;
        return this;
    }

    /* renamed from: j */
    public SelectCreationMenuConfig mo32296j(boolean z) {
        this.f22189m = z;
        return this;
    }

    /* renamed from: k */
    public SelectCreationMenuConfig mo32298k(boolean z) {
        this.f22187k = z;
        return this;
    }

    protected SelectCreationMenuConfig(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22177a = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f22178b = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f22179c = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f22180d = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f22181e = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f22182f = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f22183g = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f22184h = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f22185i = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22186j = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22187k = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f22188l = z12;
        this.f22189m = parcel.readByte() == 0 ? false : z13;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f22177a ? (byte) 1 : 0);
        parcel.writeByte(this.f22178b ? (byte) 1 : 0);
        parcel.writeByte(this.f22179c ? (byte) 1 : 0);
        parcel.writeByte(this.f22180d ? (byte) 1 : 0);
        parcel.writeByte(this.f22181e ? (byte) 1 : 0);
        parcel.writeByte(this.f22182f ? (byte) 1 : 0);
        parcel.writeByte(this.f22183g ? (byte) 1 : 0);
        parcel.writeByte(this.f22184h ? (byte) 1 : 0);
        parcel.writeByte(this.f22185i ? (byte) 1 : 0);
        parcel.writeByte(this.f22186j ? (byte) 1 : 0);
        parcel.writeByte(this.f22187k ? (byte) 1 : 0);
        parcel.writeByte(this.f22188l ? (byte) 1 : 0);
        parcel.writeByte(this.f22189m ? (byte) 1 : 0);
    }
}
