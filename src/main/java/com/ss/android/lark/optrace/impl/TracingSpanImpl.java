package com.ss.android.lark.optrace.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.TracingCoreTarget;
import com.ss.android.lark.optrace.core.TracingSpanMemData;
import java.util.HashMap;

public class TracingSpanImpl extends TracingCoreTarget implements Parcelable {
    public static final Parcelable.Creator<TracingSpanImpl> CREATOR = new Parcelable.Creator<TracingSpanImpl>() {
        /* class com.ss.android.lark.optrace.impl.TracingSpanImpl.C489431 */

        /* renamed from: a */
        public TracingSpanImpl[] newArray(int i) {
            return new TracingSpanImpl[i];
        }

        /* renamed from: a */
        public TracingSpanImpl createFromParcel(Parcel parcel) {
            return new TracingSpanImpl(parcel);
        }
    };

    public int describeContents() {
        return 0;
    }

    public TracingSpanImpl() {
    }

    @Override // com.ss.android.lark.optrace.api.TracingCoreSpan
    public TracingCoreSpan generateSpan() {
        return new TracingSpanImpl(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.optrace.core.TracingCoreTarget
    public void generateSpanData() {
        this.spanData = new TracingSpanMemData();
    }

    @Override // com.ss.android.lark.optrace.api.TracingCoreSpan
    public TracingCoreSpan subTrace() {
        return new TracingSpanImpl(this);
    }

    public TracingSpanImpl(TracingCoreSpan tracingCoreSpan) {
        super(tracingCoreSpan);
    }

    public TracingSpanImpl(String str) {
        super(str);
    }

    protected TracingSpanImpl(Parcel parcel) {
        this.cacheTracingId = parcel.readString();
        this.extensions = new HashMap();
        parcel.readMap(this.extensions, getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cacheTracingId);
        parcel.writeMap(this.extensions);
    }
}
