package com.lynx.tasm.behavior;

import android.util.DisplayMetrics;
import com.lynx.react.bridge.ReadableMap;

public abstract class LayoutContext {

    /* renamed from: a */
    private long f65896a;

    /* renamed from: b */
    private boolean f65897b;

    private native void nativeTriggerLayout(long j, long j2);

    /* renamed from: a */
    public abstract DisplayMetrics mo94507a();

    /* renamed from: b */
    public void mo94510b() {
        this.f65897b = true;
    }

    public abstract int createNode(int i, String str, ReadableMap readableMap, long j);

    public abstract void destroyNodes(int[] iArr);

    public abstract void dispatchOnLayout(int i, int i2, int i3, int i4, int i5);

    public abstract void dispatchOnLayoutBefore(int i);

    public abstract void dispatchOnLayoutFinish();

    public abstract void insertNode(int i, int i2, int i3);

    public abstract void moveNode(int i, int i2, int i3, int i4);

    public abstract void removeNode(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void scheduleLayout(long j);

    /* access modifiers changed from: protected */
    public abstract void updateDataWithoutChange();

    public abstract void updateProps(int i, ReadableMap readableMap);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo94511c() {
        return this.f65897b;
    }

    /* access modifiers changed from: protected */
    public void detachNativePtr() {
        this.f65896a = 0;
    }

    /* access modifiers changed from: protected */
    public void attachNativePtr(long j) {
        this.f65896a = j;
    }

    /* renamed from: a */
    public void mo94508a(long j) {
        long j2 = this.f65896a;
        if (j2 != 0) {
            nativeTriggerLayout(j2, j);
        }
    }
}
