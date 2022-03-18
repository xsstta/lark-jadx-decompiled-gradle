package com.ss.android.ttve.audio;

public class TEDubWriter implements AbstractC60179b {

    /* renamed from: a */
    long f150181a = nativeCreate();

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);

    @Override // com.ss.android.ttve.audio.AbstractC60179b
    /* renamed from: a */
    public void mo205496a() {
        long j = this.f150181a;
        if (j != 0) {
            nativeDestroy(j);
        }
    }
}
