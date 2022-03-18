package com.ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new Parcelable.Creator<TEFocusParameters>() {
        /* class com.ss.android.ttvecamera.TEFocusParameters.C603071 */

        /* renamed from: a */
        public TEFocusParameters[] newArray(int i) {
            return new TEFocusParameters[i];
        }

        /* renamed from: a */
        public TEFocusParameters createFromParcel(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }
    };

    /* renamed from: a */
    public Rect f150712a;

    /* renamed from: b */
    public Rect f150713b;

    /* renamed from: c */
    public int f150714c;

    /* renamed from: d */
    public int f150715d;

    public int describeContents() {
        return 0;
    }

    public TEFocusParameters() {
    }

    public String toString() {
        return "active size is:" + this.f150712a.toString() + " crop size is: " + this.f150713b.toString() + "  max AF regions is: " + this.f150714c + "  max AE regions is: " + this.f150715d;
    }

    public TEFocusParameters(Parcel parcel) {
        this.f150712a = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f150714c = parcel.readInt();
        this.f150715d = parcel.readInt();
        this.f150713b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f150712a, i);
        parcel.writeInt(this.f150714c);
        parcel.writeInt(this.f150715d);
        parcel.writeParcelable(this.f150713b, i);
    }
}
