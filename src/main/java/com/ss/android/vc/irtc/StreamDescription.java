package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;

public class StreamDescription implements Parcelable {
    public static final Parcelable.Creator<StreamDescription> CREATOR = new Parcelable.Creator<StreamDescription>() {
        /* class com.ss.android.vc.irtc.StreamDescription.C610181 */

        /* renamed from: a */
        public StreamDescription[] newArray(int i) {
            return new StreamDescription[i];
        }

        /* renamed from: a */
        public StreamDescription createFromParcel(Parcel parcel) {
            return new StreamDescription(parcel);
        }
    };

    /* renamed from: a */
    public int f152900a;

    /* renamed from: b */
    public int f152901b;

    /* renamed from: c */
    public int f152902c;

    /* renamed from: d */
    public int f152903d;

    /* renamed from: e */
    public int f152904e;

    public int describeContents() {
        return 0;
    }

    public StreamDescription() {
    }

    public String toString() {
        return "StreamDescription{width=" + this.f152900a + ", height=" + this.f152901b + ", frameRate=" + this.f152902c + ", maxKbps=" + this.f152903d + ", scaleMode=" + this.f152904e + '}';
    }

    protected StreamDescription(Parcel parcel) {
        this.f152900a = parcel.readInt();
        this.f152901b = parcel.readInt();
        this.f152902c = parcel.readInt();
        this.f152903d = parcel.readInt();
        this.f152904e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f152900a);
        parcel.writeInt(this.f152901b);
        parcel.writeInt(this.f152902c);
        parcel.writeInt(this.f152903d);
        parcel.writeInt(this.f152904e);
    }
}
