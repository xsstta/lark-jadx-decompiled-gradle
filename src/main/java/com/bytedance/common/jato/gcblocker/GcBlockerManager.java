package com.bytedance.common.jato.gcblocker;

import android.os.Build;
import android.util.Log;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoNativeLoader;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import java.io.File;

public class GcBlockerManager {
    private static volatile AbsGcBlocker sGcBlocker;

    /* access modifiers changed from: private */
    public static class VoidGcBlocker extends AbsGcBlocker {
        @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
        public void requestBlockGc(long j) {
        }

        @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
        public void startBlockGc(String str) {
        }

        @Override // com.bytedance.common.jato.gcblocker.AbsGcBlocker
        public void stopBlockGc(String str) {
        }

        private VoidGcBlocker() {
        }
    }

    private static boolean isEnabled() {
        if (!new File("/data/local/tmp/disable-gcblocker").exists()) {
            return true;
        }
        Log.d("GcBlocker", "gcblock disabled");
        return false;
    }

    public static AbsGcBlocker getInstance() {
        if (sGcBlocker == null) {
            synchronized (GcBlockerManager.class) {
                if (sGcBlocker == null) {
                    if (!isEnabled()) {
                        sGcBlocker = new VoidGcBlocker();
                    } else if (!JatoNativeLoader.loadLibrary()) {
                        sGcBlocker = new VoidGcBlocker();
                    } else if (Jato.getConfig().isEnabledDalvikGcBlocker && !DeviceInfoUtils.isART() && Build.VERSION.SDK_INT == 19) {
                        sGcBlocker = new DvmGcBlocker();
                    } else if (!Jato.getConfig().isEnabledArtGcBlocker || Build.VERSION.SDK_INT < 24) {
                        sGcBlocker = new VoidGcBlocker();
                    } else {
                        sGcBlocker = new GcBlocker();
                    }
                }
            }
        }
        return sGcBlocker;
    }
}
