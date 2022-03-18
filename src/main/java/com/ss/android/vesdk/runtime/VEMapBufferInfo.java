package com.ss.android.vesdk.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class VEMapBufferInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VEMapBufferInfo> CREATOR = new Parcelable.Creator<VEMapBufferInfo>() {
        /* class com.ss.android.vesdk.runtime.VEMapBufferInfo.C640481 */

        /* renamed from: a */
        public VEMapBufferInfo[] newArray(int i) {
            return new VEMapBufferInfo[i];
        }

        /* renamed from: a */
        public VEMapBufferInfo createFromParcel(Parcel parcel) {
            return new VEMapBufferInfo(parcel);
        }
    };
    private static final long serialVersionUID = 1;
    public double CMTime;
    public float[] clientVertexes;
    public int[] clientVertexesLength;
    public double firstTriggerTime;
    public double[] timestamp;
    public double totalTriggerTime;

    public int describeContents() {
        return 0;
    }

    public VEMapBufferInfo() {
    }

    protected VEMapBufferInfo(Parcel parcel) {
        this.CMTime = parcel.readDouble();
        this.firstTriggerTime = parcel.readDouble();
        this.totalTriggerTime = parcel.readDouble();
        this.timestamp = parcel.createDoubleArray();
        this.clientVertexes = parcel.createFloatArray();
        this.clientVertexesLength = parcel.createIntArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.CMTime);
        parcel.writeDouble(this.firstTriggerTime);
        parcel.writeDouble(this.totalTriggerTime);
        parcel.writeDoubleArray(this.timestamp);
        parcel.writeFloatArray(this.clientVertexes);
        parcel.writeIntArray(this.clientVertexesLength);
    }
}
