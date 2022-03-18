package com.ss.android.ttve.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class VETrackParams implements Parcelable {
    public static final Parcelable.Creator<VETrackParams> CREATOR = new Parcelable.Creator<VETrackParams>() {
        /* class com.ss.android.ttve.model.VETrackParams.C602091 */

        /* renamed from: a */
        public VETrackParams[] newArray(int i) {
            return new VETrackParams[i];
        }

        /* renamed from: a */
        public VETrackParams createFromParcel(Parcel parcel) {
            return new VETrackParams(parcel);
        }
    };

    /* renamed from: a */
    public List<String> f150278a;

    /* renamed from: b */
    public List<Integer> f150279b;

    /* renamed from: c */
    public List<Integer> f150280c;

    /* renamed from: d */
    public List<Integer> f150281d;

    /* renamed from: e */
    public List<Integer> f150282e;

    /* renamed from: f */
    public List<Double> f150283f;

    /* renamed from: g */
    public int f150284g = -1;

    /* renamed from: h */
    public TrackPriority f150285h = TrackPriority.DEFAULT;

    /* renamed from: i */
    public int f150286i;

    public enum TrackPriority {
        DEFAULT,
        HOST,
        External
    }

    public int describeContents() {
        return 0;
    }

    private VETrackParams() {
    }

    public String toString() {
        return "VETrackParams{paths=" + this.f150278a + ", trimIns=" + this.f150279b + ", trimOuts=" + this.f150280c + ", seqIns=" + this.f150281d + ", seqOuts=" + this.f150282e + ", speeds=" + this.f150283f + ", layer=" + this.f150284g + ", trackPriority=" + this.f150285h + ", extFlag=" + this.f150286i + '}';
    }

    protected VETrackParams(Parcel parcel) {
        TrackPriority trackPriority;
        this.f150278a = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList();
        this.f150279b = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f150280c = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.f150281d = arrayList3;
        parcel.readList(arrayList3, Integer.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.f150282e = arrayList4;
        parcel.readList(arrayList4, Integer.class.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        this.f150283f = arrayList5;
        parcel.readList(arrayList5, Double.class.getClassLoader());
        this.f150284g = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            trackPriority = null;
        } else {
            trackPriority = TrackPriority.values()[readInt];
        }
        this.f150285h = trackPriority;
        this.f150286i = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeStringList(this.f150278a);
        parcel.writeList(this.f150279b);
        parcel.writeList(this.f150280c);
        parcel.writeList(this.f150281d);
        parcel.writeList(this.f150282e);
        parcel.writeList(this.f150283f);
        parcel.writeInt(this.f150284g);
        TrackPriority trackPriority = this.f150285h;
        if (trackPriority == null) {
            i2 = -1;
        } else {
            i2 = trackPriority.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f150286i);
    }
}
