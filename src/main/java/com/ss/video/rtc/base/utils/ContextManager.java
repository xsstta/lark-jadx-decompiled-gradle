package com.ss.video.rtc.base.utils;

import android.content.Context;
import java.lang.ref.WeakReference;

public class ContextManager {
    private WeakReference<Context> mContextWeakReference;

    private static class SingletonHelper {
        public static final ContextManager INSTANCE = new ContextManager();

        private SingletonHelper() {
        }
    }

    public static ContextManager instance() {
        return SingletonHelper.INSTANCE;
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.mContextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.mContextWeakReference.get();
    }

    public void setContext(Context context) {
        if (this.mContextWeakReference != null) {
            this.mContextWeakReference = null;
        }
        this.mContextWeakReference = new WeakReference<>(context);
    }
}
