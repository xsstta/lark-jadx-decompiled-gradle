package com.bytedance.common.jato.gcblocker;

import android.os.Build;
import android.util.Log;
import java.util.HashMap;

public final class GcBlocker extends AbsGcBlocker {
    private static long HEAP_SIZE_LIMIT = 209715200;
    private static long MAX_HEAP_SIZE = 536870912;
    private final HashMap<String, Integer> mTokens = new HashMap<>();

    private static native int nativeCreateToken(boolean z);

    private static native void nativeReleaseToken(int i);

    private static native void nativeRequestBlockGc(long j);

    private static native int nativeStartBlockGc(int i);

    private static native void nativeStopBlockGc(int i);

    private static boolean checkHeapSizeLimit() {
        long j = Runtime.getRuntime().totalMemory();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 29 && j >= MAX_HEAP_SIZE) {
            return true;
        }
        if (j >= HEAP_SIZE_LIMIT) {
            z = false;
        }
        if (!z) {
            Log.e("GcBlocker", "total memory over heap size limit: " + j);
        }
        return z;
    }

    @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
    public void requestBlockGc(long j) {
        if (checkHeapSizeLimit() && j > 0 && j <= 5000) {
            nativeRequestBlockGc(j);
        }
    }

    @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
    public void startBlockGc(String str) {
        if (checkHeapSizeLimit()) {
            synchronized (this.mTokens) {
                Integer num = this.mTokens.get(str);
                if (num == null) {
                    num = Integer.valueOf(nativeCreateToken(false));
                    this.mTokens.put(str, num);
                }
                if (num != null && num.intValue() > 0) {
                    nativeStartBlockGc(num.intValue());
                }
            }
        }
    }

    @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
    public void stopBlockGc(String str) {
        synchronized (this.mTokens) {
            Integer remove = this.mTokens.remove(str);
            if (remove != null && remove.intValue() > 0) {
                nativeStopBlockGc(remove.intValue());
                nativeReleaseToken(remove.intValue());
            }
        }
    }
}
