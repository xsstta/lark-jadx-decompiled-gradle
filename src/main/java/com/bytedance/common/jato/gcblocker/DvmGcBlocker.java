package com.bytedance.common.jato.gcblocker;

public class DvmGcBlocker extends AbsGcBlocker {
    private static native void nativeDalvikStartBlockGc();

    private static native void nativeDalvikStopBlockGc();

    private static native void nativeInit();

    @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
    public void requestBlockGc(long j) {
    }

    public DvmGcBlocker() {
        nativeInit();
    }

    @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
    public void startBlockGc(String str) {
        nativeDalvikStartBlockGc();
    }

    @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
    public void stopBlockGc(String str) {
        nativeDalvikStopBlockGc();
    }
}
