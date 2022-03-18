package com.ss.android.lark.screen.p2581a.p2582a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.screen.a.a.a */
public class C53223a implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    private AbstractC53225c m205870a() {
        return (AbstractC53225c) ClaymoreServiceLoader.loadFirst(AbstractC53225c.class);
    }

    /* renamed from: b */
    private boolean m205871b() {
        AbstractC53224b bVar = (AbstractC53224b) ClaymoreServiceLoader.loadFirst(AbstractC53224b.class);
        if (bVar == null) {
            return false;
        }
        return bVar.isLogin();
    }

    public void onActivityPaused(Activity activity) {
        Log.m165379d("ActivityObserver", "onActivityPaused called, activity:" + activity);
        if (!m205871b()) {
            Log.m165389i("ActivityObserver", "failed to stop to detect screenshots, because not login.");
            return;
        }
        AbstractC53225c a = m205870a();
        if (a == null) {
            Log.m165383e("ActivityObserver", "failed to stop to detect screenshots, because detector is null.");
        } else {
            a.stop();
        }
    }

    public void onActivityResumed(Activity activity) {
        Log.m165379d("ActivityObserver", "onActivityResumed called, activity:" + activity);
        if (!m205871b()) {
            Log.m165389i("ActivityObserver", "failed to start to detect screenshots, because not login.");
            return;
        }
        AbstractC53225c a = m205870a();
        if (a == null) {
            Log.m165383e("ActivityObserver", "failed to start to detect screenshots, because detector is null.");
        } else {
            a.start(activity);
        }
    }
}
