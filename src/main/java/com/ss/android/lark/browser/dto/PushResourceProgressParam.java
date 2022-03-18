package com.ss.android.lark.browser.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class PushResourceProgressParam implements Parcelable {
    public static final Parcelable.Creator<PushResourceProgressParam> CREATOR = new Parcelable.Creator<PushResourceProgressParam>() {
        /* class com.ss.android.lark.browser.dto.PushResourceProgressParam.C299041 */

        /* renamed from: a */
        public PushResourceProgressParam[] newArray(int i) {
            return new PushResourceProgressParam[i];
        }

        /* renamed from: a */
        public PushResourceProgressParam createFromParcel(Parcel parcel) {
            return new PushResourceProgressParam(parcel);
        }
    };

    /* renamed from: a */
    private String f74629a;

    /* renamed from: b */
    private int f74630b;

    /* renamed from: c */
    private long f74631c;

    /* renamed from: d */
    private long f74632d;

    public int describeContents() {
        return 0;
    }

    public PushResourceProgressParam() {
    }

    public String toString() {
        return "PushResourceProgressParam{key='" + this.f74629a + '\'' + ", progress=" + this.f74630b + ", totalSize=" + this.f74631c + ", transferredSize=" + this.f74632d + '}';
    }

    protected PushResourceProgressParam(Parcel parcel) {
        this.f74629a = parcel.readString();
        this.f74630b = parcel.readInt();
        this.f74631c = parcel.readLong();
        this.f74632d = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74629a);
        parcel.writeInt(this.f74630b);
        parcel.writeLong(this.f74631c);
        parcel.writeLong(this.f74632d);
    }
}
