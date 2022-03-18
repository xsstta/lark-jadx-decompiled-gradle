package com.ttnet.org.chromium.base;

public interface Callback<T> {
    void onResult(T t);

    public static abstract class Helper {
        static void runRunnable(Runnable runnable) {
            runnable.run();
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.onResult(obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ttnet.org.chromium.base.Callback */
        /* JADX WARN: Multi-variable type inference failed */
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.onResult(Boolean.valueOf(z));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ttnet.org.chromium.base.Callback */
        /* JADX WARN: Multi-variable type inference failed */
        static void onIntResultFromNative(Callback callback, int i) {
            callback.onResult(Integer.valueOf(i));
        }
    }
}
