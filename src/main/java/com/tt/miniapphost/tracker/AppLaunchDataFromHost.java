package com.tt.miniapphost.tracker;

import android.os.Parcel;
import android.os.Parcelable;

public class AppLaunchDataFromHost implements Parcelable {
    public static final Parcelable.Creator<AppLaunchDataFromHost> CREATOR = new Parcelable.Creator<AppLaunchDataFromHost>() {
        /* class com.tt.miniapphost.tracker.AppLaunchDataFromHost.C675781 */

        /* renamed from: a */
        public AppLaunchDataFromHost[] newArray(int i) {
            return new AppLaunchDataFromHost[i];
        }

        /* renamed from: a */
        public AppLaunchDataFromHost createFromParcel(Parcel parcel) {
            return new AppLaunchDataFromHost(parcel);
        }
    };

    /* renamed from: a */
    protected Long f170398a;

    /* renamed from: b */
    protected Long f170399b;

    /* renamed from: c */
    protected String f170400c;

    /* renamed from: d */
    protected String f170401d;

    /* renamed from: e */
    protected String f170402e;

    /* renamed from: f */
    protected Boolean f170403f;

    public int describeContents() {
        return 0;
    }

    protected AppLaunchDataFromHost() {
    }

    /* renamed from: b */
    protected static String m263029b(Parcel parcel) {
        String readString = parcel.readString();
        if ("".equals(readString)) {
            return null;
        }
        return readString;
    }

    /* renamed from: a */
    protected static Long m263025a(Parcel parcel) {
        long readLong = parcel.readLong();
        if (readLong == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(readLong);
    }

    /* renamed from: c */
    protected static Boolean m263030c(Parcel parcel) {
        byte readByte = parcel.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return null;
        }
        boolean z = true;
        if (readByte != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    protected AppLaunchDataFromHost(Parcel parcel) {
        this.f170398a = m263025a(parcel);
        this.f170399b = m263025a(parcel);
        this.f170400c = m263029b(parcel);
        this.f170401d = m263029b(parcel);
        this.f170402e = m263029b(parcel);
        this.f170403f = m263030c(parcel);
    }

    /* renamed from: a */
    protected static void m263026a(Parcel parcel, Boolean bool) {
        if (bool == null) {
            parcel.writeByte(Byte.MAX_VALUE);
        } else {
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        m263027a(parcel, this.f170398a);
        m263027a(parcel, this.f170399b);
        m263028a(parcel, this.f170400c);
        m263028a(parcel, this.f170401d);
        m263028a(parcel, this.f170402e);
        m263026a(parcel, this.f170403f);
    }

    /* renamed from: a */
    protected static void m263027a(Parcel parcel, Long l) {
        if (l == null) {
            parcel.writeLong(Long.MAX_VALUE);
        } else {
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: a */
    protected static void m263028a(Parcel parcel, String str) {
        if (str == null) {
            parcel.writeString("");
        } else {
            parcel.writeString(str);
        }
    }
}
