package com.ss.android.lark.mediapicker.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class EditInfo implements Parcelable {
    public static final Parcelable.Creator<EditInfo> CREATOR = new Parcelable.Creator<EditInfo>() {
        /* class com.ss.android.lark.mediapicker.entity.EditInfo.C446781 */

        /* renamed from: a */
        public EditInfo[] newArray(int i) {
            return new EditInfo[i];
        }

        /* renamed from: a */
        public EditInfo createFromParcel(Parcel parcel) {
            return new EditInfo(parcel);
        }
    };

    /* renamed from: a */
    public int f113228a;

    /* renamed from: b */
    public String f113229b;

    public int describeContents() {
        return 0;
    }

    public EditInfo() {
    }

    protected EditInfo(Parcel parcel) {
        this.f113228a = parcel.readInt();
        this.f113229b = parcel.readString();
    }

    public EditInfo(int i, String str) {
        this.f113228a = i;
        this.f113229b = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f113228a);
        parcel.writeString(this.f113229b);
    }
}
