package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.C64027k;
import com.ss.android.vesdk.C64083x;
import com.ss.android.vesdk.audio.AbstractC63946e;
import com.ss.android.vesdk.audio.C63948g;
import java.nio.ByteBuffer;

public class TEAudioDataInterface implements AbstractC63946e {
    private long handle = nativeCreate();

    private native long nativeCreate();

    private native int nativeInit(long j, int i, int i2, int i3);

    private native void nativeRelease(long j);

    private native int nativeSendData(long j, ByteBuffer byteBuffer, int i);

    @Override // com.ss.android.vesdk.audio.AbstractC63946e
    public void onError(int i, int i2, String str) {
    }

    static {
        TENativeLibsLoader.m234148d();
    }

    public long getHandle() {
        return this.handle;
    }

    public synchronized void release() {
        long j = this.handle;
        if (j != 0) {
            nativeRelease(j);
            this.handle = 0;
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63946e
    public synchronized void onReceive(C63948g gVar) {
        long j = this.handle;
        if (j != 0) {
            nativeSendData(j, ((C63948g.C63950b) gVar.mo221301a()).mo221304a(), gVar.mo221302b());
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63946e
    public void onInfo(int i, int i2, double d, Object obj) {
        if (i == C64083x.f161812G) {
            C64027k kVar = (C64027k) obj;
            long j = this.handle;
            if (j != 0) {
                nativeInit(j, kVar.mo221692b(), kVar.mo221691a(), kVar.mo221693c());
            }
        }
    }
}
