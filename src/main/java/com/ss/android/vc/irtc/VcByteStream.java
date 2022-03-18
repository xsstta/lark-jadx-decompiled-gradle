package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class VcByteStream implements Parcelable {
    public static final Parcelable.Creator<VcByteStream> CREATOR = new Parcelable.Creator<VcByteStream>() {
        /* class com.ss.android.vc.irtc.VcByteStream.C610201 */

        /* renamed from: a */
        public VcByteStream[] newArray(int i) {
            return new VcByteStream[i];
        }

        /* renamed from: a */
        public VcByteStream createFromParcel(Parcel parcel) {
            return new VcByteStream(parcel);
        }
    };

    /* renamed from: a */
    public String f152907a;

    /* renamed from: b */
    public String f152908b;

    /* renamed from: c */
    public boolean f152909c;

    /* renamed from: d */
    public boolean f152910d;

    /* renamed from: e */
    public boolean f152911e;

    /* renamed from: f */
    public List<StreamDescription> f152912f;

    public int describeContents() {
        return 0;
    }

    public VcByteStream() {
    }

    public String toString() {
        return "VcByteStream{streamId='" + this.f152907a + '\'' + ", userId='" + this.f152908b + '\'' + ", isScreen=" + this.f152909c + ", hasVideo=" + this.f152910d + ", hasAudio=" + this.f152911e + ", streamDescriptions=" + this.f152912f + '}';
    }

    protected VcByteStream(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f152907a = parcel.readString();
        this.f152908b = parcel.readString();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f152909c = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f152910d = z2;
        this.f152911e = parcel.readByte() == 0 ? false : z3;
        this.f152912f = parcel.createTypedArrayList(StreamDescription.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152907a);
        parcel.writeString(this.f152908b);
        parcel.writeByte(this.f152909c ? (byte) 1 : 0);
        parcel.writeByte(this.f152910d ? (byte) 1 : 0);
        parcel.writeByte(this.f152911e ? (byte) 1 : 0);
        parcel.writeTypedList(this.f152912f);
    }
}
