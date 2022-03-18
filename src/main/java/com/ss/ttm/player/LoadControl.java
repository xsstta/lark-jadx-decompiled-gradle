package com.ss.ttm.player;

public abstract class LoadControl extends NativeObject {
    /* access modifiers changed from: protected */
    public abstract int onCodecStackSelected(int i);

    /* access modifiers changed from: protected */
    public abstract int onFilterStackSelected(int i);

    /* access modifiers changed from: protected */
    public abstract int onTrackSelected(int i);

    /* access modifiers changed from: protected */
    public abstract boolean shouldStartPlayback(long j, float f, boolean z);
}
