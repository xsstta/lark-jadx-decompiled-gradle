package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

public class NativeMaskInfo extends MaskInfo {
    private static boolean isNativeMaskInfo(MaskInfo maskInfo) {
        return maskInfo instanceof NativeMaskInfo;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.MaskInfo
    public void onMaskInfoCallback(int i, int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
