package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoSolution implements Parcelable {
    public static final Parcelable.Creator<VideoSolution> CREATOR = new Parcelable.Creator<VideoSolution>() {
        /* class com.ss.android.vc.irtc.VideoSolution.C610211 */

        /* renamed from: a */
        public VideoSolution[] newArray(int i) {
            return new VideoSolution[i];
        }

        /* renamed from: a */
        public VideoSolution createFromParcel(Parcel parcel) {
            return new VideoSolution(parcel);
        }
    };

    /* renamed from: a */
    public int f152913a;

    /* renamed from: b */
    public int f152914b;

    /* renamed from: c */
    public int f152915c;

    /* renamed from: d */
    public int f152916d;

    /* renamed from: e */
    public int f152917e;

    public int describeContents() {
        return 0;
    }

    public VideoSolution(Parcel parcel) {
        this.f152913a = parcel.readInt();
        this.f152914b = parcel.readInt();
        this.f152915c = parcel.readInt();
        this.f152916d = parcel.readInt();
        this.f152917e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f152913a);
        parcel.writeInt(this.f152914b);
        parcel.writeInt(this.f152915c);
        parcel.writeInt(this.f152916d);
        parcel.writeInt(this.f152917e);
    }
}
