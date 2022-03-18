package com.ss.android.vc.dependency;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.vc.common.lifecycle.C60793b;

/* renamed from: com.ss.android.vc.dependency.v */
public interface AbstractC60908v {

    /* renamed from: com.ss.android.vc.dependency.v$a */
    public interface AbstractC60909a {
        /* renamed from: a */
        void mo208382a(Activity activity);

        /* renamed from: a */
        void mo208383a(Activity activity, Bundle bundle);

        /* renamed from: b */
        void mo208384b(Activity activity);

        /* renamed from: b */
        void mo208385b(Activity activity, Bundle bundle);

        /* renamed from: c */
        void mo208386c(Activity activity);

        /* renamed from: d */
        void mo208387d(Activity activity);

        /* renamed from: e */
        void mo208389e(Activity activity);
    }

    /* renamed from: com.ss.android.vc.dependency.v$b */
    public interface AbstractC60910b {
        void onAppLifecycleChanged(C60793b bVar, C60793b bVar2);
    }

    /* renamed from: a */
    void mo196411a(IGetDataCallback<Activity> iGetDataCallback);

    /* renamed from: a */
    void mo196412a(AbstractC60910b bVar);

    void addActivityObserver(AbstractC60909a aVar);

    /* renamed from: b */
    Activity mo196414b();

    /* renamed from: c */
    boolean mo196415c();

    void removeActivityObserver(AbstractC60909a aVar);
}
