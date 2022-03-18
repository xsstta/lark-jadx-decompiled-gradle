package com.bytedance.platform.godzilla;

import android.app.Activity;
import android.app.Application;
import com.bytedance.platform.godzilla.common.AbstractC20326f;
import com.bytedance.platform.godzilla.common.AbstractC20328h;
import com.bytedance.platform.godzilla.common.C20322b;
import com.bytedance.platform.godzilla.common.Logger;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public enum GodzillaCore {
    INSTANCE;
    
    private static HashMap<Integer, WeakReference<Activity>> mActivityMaps = new HashMap<>();
    private C20322b mConsumeExceptionHandler;
    private WeakReference<Activity> mLastDestoryActivity;
    private WeakReference<Activity> mLastPauseActivity;
    private WeakReference<Activity> mLastResumedActivity;
    private WeakReference<Activity> mLastStopActivity;

    public void destroy() {
        C20322b bVar = this.mConsumeExceptionHandler;
        if (bVar != null) {
            bVar.mo68633a();
        }
    }

    private void registerExceptionHandlerIfNeed() {
        if (this.mConsumeExceptionHandler == null) {
            C20322b bVar = new C20322b();
            this.mConsumeExceptionHandler = bVar;
            bVar.mo68635b();
        }
        Logger.m74098b("UncaughtExceptionPlugin", "init mConsumeExceptionHandler:" + this.mConsumeExceptionHandler);
    }

    public void addUncaughtExceptionConsumer(AbstractC20328h hVar) {
        registerExceptionHandlerIfNeed();
        Logger.m74098b("UncaughtExceptionPlugin", "add consumer:" + hVar);
        this.mConsumeExceptionHandler.mo68634a(hVar);
    }

    public void removeUncaughtExceptionConsumer(AbstractC20328h hVar) {
        Logger.m74098b("UncaughtExceptionPlugin", "remove consumer:" + hVar);
        this.mConsumeExceptionHandler.mo68636b(hVar);
    }

    public void init(Application application, AbstractC20326f fVar, Logger.Level level) {
        if (fVar != null) {
            Logger.m74094a(fVar);
        }
        if (level != null) {
            Logger.m74093a(level);
        }
    }
}
