package com.bytedance.common.util;

import android.app.ActivityManager;
import android.os.Build;

public class JellyBeanV16Compat {
    private static BaseImpl mImpl;

    /* access modifiers changed from: private */
    public static class BaseImpl {
        public long getTotalMem(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private BaseImpl() {
        }
    }

    private static class V16Impl extends BaseImpl {
        private V16Impl() {
            super();
        }

        @Override // com.bytedance.common.util.JellyBeanV16Compat.BaseImpl
        public long getTotalMem(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            mImpl = new V16Impl();
        } else {
            mImpl = new BaseImpl();
        }
    }

    public static long getTotalMem(ActivityManager.MemoryInfo memoryInfo) {
        return mImpl.getTotalMem(memoryInfo);
    }
}
