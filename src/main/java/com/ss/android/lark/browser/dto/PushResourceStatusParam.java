package com.ss.android.lark.browser.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class PushResourceStatusParam implements Parcelable {
    public static final Parcelable.Creator<PushResourceStatusParam> CREATOR = new Parcelable.Creator<PushResourceStatusParam>() {
        /* class com.ss.android.lark.browser.dto.PushResourceStatusParam.C299051 */

        /* renamed from: a */
        public PushResourceStatusParam[] newArray(int i) {
            return new PushResourceStatusParam[i];
        }

        /* renamed from: a */
        public PushResourceStatusParam createFromParcel(Parcel parcel) {
            return new PushResourceStatusParam(parcel);
        }
    };

    /* renamed from: a */
    private String f74633a;

    /* renamed from: b */
    private boolean f74634b;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PushResourceStatusParam{key='" + this.f74633a + '\'' + ", isStatusSuccess=" + this.f74634b + '}';
    }

    protected PushResourceStatusParam(Parcel parcel) {
        boolean z;
        this.f74633a = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f74634b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74633a);
        parcel.writeByte(this.f74634b ? (byte) 1 : 0);
    }
}
