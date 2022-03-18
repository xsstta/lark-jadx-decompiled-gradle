package com.ss.android.lark.optrace.extension.clientduration;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.io.Serializable;

public class TracingClientDurationEvent implements Parcelable, Serializable {
    public static final Parcelable.Creator<TracingClientDurationEvent> CREATOR = new Parcelable.Creator<TracingClientDurationEvent>() {
        /* class com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationEvent.C489411 */

        /* renamed from: a */
        public TracingClientDurationEvent[] newArray(int i) {
            return new TracingClientDurationEvent[i];
        }

        /* renamed from: a */
        public TracingClientDurationEvent createFromParcel(Parcel parcel) {
            return new TracingClientDurationEvent(parcel);
        }
    };
    private volatile boolean finished;
    private final long startTime;

    public int describeContents() {
        return 0;
    }

    public void finish() {
        this.finished = true;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public long duration() {
        return SystemClock.elapsedRealtime() - this.startTime;
    }

    public TracingClientDurationEvent() {
        this.startTime = SystemClock.elapsedRealtime();
        this.finished = false;
    }

    public String toString() {
        return "TracingClientDurationEvent{finished=" + this.finished + ", startTime=" + this.startTime + '}';
    }

    protected TracingClientDurationEvent(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.finished = z;
        this.startTime = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.finished ? (byte) 1 : 0);
        parcel.writeLong(this.startTime);
    }
}
