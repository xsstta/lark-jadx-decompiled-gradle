package com.bytedance.ee.bear.widgets;

import android.os.Parcel;
import android.os.Parcelable;

public class ButtonsBean implements Parcelable {
    public static final Parcelable.Creator<ButtonsBean> CREATOR = new Parcelable.Creator<ButtonsBean>() {
        /* class com.bytedance.ee.bear.widgets.ButtonsBean.C118061 */

        /* renamed from: a */
        public ButtonsBean[] newArray(int i) {
            return new ButtonsBean[i];
        }

        /* renamed from: a */
        public ButtonsBean createFromParcel(Parcel parcel) {
            return new ButtonsBean(parcel);
        }
    };

    /* renamed from: a */
    private String f31729a;

    /* renamed from: b */
    private String f31730b;

    /* renamed from: c */
    private int f31731c;

    /* renamed from: d */
    private boolean f31732d;

    public int describeContents() {
        return 0;
    }

    public ButtonsBean() {
    }

    protected ButtonsBean(Parcel parcel) {
        boolean z;
        this.f31729a = parcel.readString();
        this.f31730b = parcel.readString();
        this.f31731c = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f31732d = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31729a);
        parcel.writeString(this.f31730b);
        parcel.writeInt(this.f31731c);
        parcel.writeByte(this.f31732d ? (byte) 1 : 0);
    }
}
