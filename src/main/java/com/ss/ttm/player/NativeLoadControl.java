package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

public class NativeLoadControl extends LoadControl {
    private static boolean isNativeLoadControl(LoadControl loadControl) {
        return loadControl instanceof NativeLoadControl;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public int onCodecStackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public int onFilterStackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public int onTrackSelected(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.LoadControl
    public boolean shouldStartPlayback(long j, float f, boolean z) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
