package com.ss.android.openbusiness.data;

import android.os.Parcel;
import android.os.Parcelable;

public class AppShortCutChatData implements Parcelable {
    public static final Parcelable.Creator<AppShortCutChatData> CREATOR = new Parcelable.Creator<AppShortCutChatData>() {
        /* class com.ss.android.openbusiness.data.AppShortCutChatData.C595651 */

        /* renamed from: a */
        public AppShortCutChatData[] newArray(int i) {
            return new AppShortCutChatData[i];
        }

        /* renamed from: a */
        public AppShortCutChatData createFromParcel(Parcel parcel) {
            return new AppShortCutChatData(parcel);
        }
    };

    /* renamed from: a */
    private boolean f147848a;

    /* renamed from: b */
    private boolean f147849b;

    /* renamed from: c */
    private String f147850c;

    /* renamed from: d */
    private String f147851d;

    /* renamed from: e */
    private String f147852e;

    /* renamed from: f */
    private boolean f147853f;

    /* renamed from: g */
    private boolean f147854g;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo202941a() {
        return this.f147848a;
    }

    /* renamed from: b */
    public boolean mo202942b() {
        return this.f147849b;
    }

    /* renamed from: c */
    public boolean mo202943c() {
        return this.f147853f;
    }

    /* renamed from: d */
    public boolean mo202944d() {
        return this.f147854g;
    }

    /* renamed from: e */
    public String mo202946e() {
        return this.f147850c;
    }

    /* renamed from: f */
    public String mo202947f() {
        return this.f147851d;
    }

    public AppShortCutChatData(String str) {
        this.f147850c = str;
    }

    protected AppShortCutChatData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f147848a = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f147849b = z2;
        this.f147850c = parcel.readString();
        this.f147851d = parcel.readString();
        this.f147852e = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f147853f = z3;
        this.f147854g = parcel.readByte() == 0 ? false : z4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f147848a ? (byte) 1 : 0);
        parcel.writeByte(this.f147849b ? (byte) 1 : 0);
        parcel.writeString(this.f147850c);
        parcel.writeString(this.f147851d);
        parcel.writeString(this.f147852e);
        parcel.writeByte(this.f147853f ? (byte) 1 : 0);
        parcel.writeByte(this.f147854g ? (byte) 1 : 0);
    }

    public AppShortCutChatData(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3) {
        this.f147848a = z;
        this.f147849b = z2;
        this.f147853f = z3;
        this.f147854g = z4;
        this.f147850c = str;
        this.f147851d = str2;
        this.f147852e = str3;
    }
}
