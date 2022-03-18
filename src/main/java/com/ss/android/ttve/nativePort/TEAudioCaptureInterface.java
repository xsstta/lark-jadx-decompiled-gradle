package com.ss.android.ttve.nativePort;

import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.ttve.model.VEAudioDeviceType;
import com.ss.android.vesdk.C64027k;
import com.ss.android.vesdk.C64083x;
import com.ss.android.vesdk.audio.AbstractC63941b;
import com.ss.android.vesdk.audio.AbstractC63942c;
import com.ss.android.vesdk.audio.C63947f;

public class TEAudioCaptureInterface implements AbstractC63941b {
    private AbstractC63942c mCallback;
    private long mHandle;

    private native long nativeCreate(boolean z, boolean z2);

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4);

    private native int nativeStart(long j);

    private native int nativeStop(long j);

    public void setAudioDevice(C63947f fVar) {
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63941b
    public void setHandler(Handler handler) {
    }

    static {
        TENativeLibsLoader.m234148d();
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63941b
    public void setAudioCallback(AbstractC63942c cVar) {
        this.mCallback = cVar;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public void release(PrivacyCert privacyCert) {
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int stop(PrivacyCert privacyCert) {
        return nativeStop(this.mHandle);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int start(PrivacyCert privacyCert) {
        int nativeStart = nativeStart(this.mHandle);
        AbstractC63942c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo221292a(C64083x.f161813H, nativeStart, 0.0d, "");
        }
        return nativeStart;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int init(C64027k kVar) {
        boolean z;
        if (TESystemUtils.getOutputAudioDeviceType() == VEAudioDeviceType.WIRED.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        long nativeCreate = nativeCreate(kVar.mo221698h(), z);
        this.mHandle = nativeCreate;
        int nativeInit = nativeInit(nativeCreate, kVar.mo221692b(), kVar.mo221691a(), kVar.mo221693c(), kVar.mo221696f());
        AbstractC63942c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo221292a(C64083x.f161812G, nativeInit, 0.0d, kVar);
        }
        return nativeInit;
    }

    public void onNativeExtCallback(int i, int i2) {
        AbstractC63942c cVar = this.mCallback;
        if (cVar == null) {
            return;
        }
        if (i == C64083x.f161818M) {
            cVar.mo221293a(C64083x.f161818M, i2, "");
        } else {
            cVar.mo221292a(i, i2, 0.0d, "");
        }
    }
}
