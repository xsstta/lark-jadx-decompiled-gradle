package com.ss.android.lark.app.taskv2.preload;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.app.p1356b.C28851a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StartTimingDetector {

    /* renamed from: a */
    public boolean f72833a;

    /* renamed from: b */
    public IStartTimingDetectorObserver f72834b;

    /* renamed from: c */
    public Map<Activity, Object> f72835c = new ConcurrentHashMap();

    /* renamed from: d */
    public String f72836d = "";

    /* renamed from: e */
    public int f72837e = 0;

    /* renamed from: f */
    Application.ActivityLifecycleCallbacks f72838f = new Application.ActivityLifecycleCallbacks() {
        /* class com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290661 */

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityDestroyed(Activity activity) {
            StartTimingDetector.this.mo103129a(activity);
        }

        public void onActivityStopped(Activity activity) {
            if (!StartTimingDetector.this.f72833a) {
                UICallbackExecutor.executeDelayed(StartTimingDetector.this.f72839g, 1000);
            }
        }

        public void onActivityCreated(final Activity activity, Bundle bundle) {
            if (StartTimingDetector.this.f72836d != null) {
                StartTimingDetector startTimingDetector = StartTimingDetector.this;
                startTimingDetector.f72836d = StartTimingDetector.this.f72836d + "#" + activity.getClass().getSimpleName();
                StartTimingDetector startTimingDetector2 = StartTimingDetector.this;
                startTimingDetector2.f72837e = startTimingDetector2.f72837e + 1;
            }
            UICallbackExecutor.removeCallbacks(StartTimingDetector.this.f72839g);
            if (!StartTimingDetector.this.mo103133a()) {
                return;
            }
            if (activity instanceof ILifeCycleEventObserve) {
                C290671 r0 = new ILifeCycleEventObserve.AbstractC58308a() {
                    /* class com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290661.C290671 */

                    @Override // com.ss.android.lark.widget.ILifeCycleEventObserve.AbstractC58308a
                    /* renamed from: a */
                    public void mo103142a(ILifeCycleEventObserve.Event event) {
                        StartTimingDetector.this.mo103132a(activity.getClass().getSimpleName(), event);
                    }
                };
                ((ILifeCycleEventObserve) activity).mo129675a(r0);
                StartTimingDetector.this.f72835c.put(activity, r0);
                return;
            }
            ViewTreeObserver$OnPreDrawListenerC290682 r4 = new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290661.ViewTreeObserver$OnPreDrawListenerC290682 */

                public boolean onPreDraw() {
                    activity.getWindow().getDecorView().getViewTreeObserver().removeOnPreDrawListener(this);
                    StartTimingDetector.this.mo103132a(activity.getClass().getSimpleName(), ILifeCycleEventObserve.Event.FIRST_CONTENT_SHOWED);
                    StartTimingDetector.this.f72835c.remove(activity);
                    return true;
                }
            };
            StartTimingDetector.this.f72835c.put(activity, r4);
            activity.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(r4);
        }
    };

    /* renamed from: g */
    public Runnable f72839g = new Runnable() {
        /* class com.ss.android.lark.app.taskv2.preload.StartTimingDetector.RunnableC290692 */

        public void run() {
            if (StartTimingDetector.this.f72834b != null) {
                int loginType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginType();
                Log.m165389i("StartTimingDetector", "onBackGroundLaunched! loginStatus = " + loginType);
                StartTimingDetector.this.f72834b.mo103102a(loginType);
            }
        }
    };

    /* renamed from: h */
    private boolean f72840h;

    /* renamed from: i */
    private boolean f72841i;

    /* renamed from: j */
    private Application f72842j;

    /* renamed from: k */
    private C28851a f72843k;

    /* renamed from: l */
    private Runnable f72844l = new Runnable() {
        /* class com.ss.android.lark.app.taskv2.preload.StartTimingDetector.RunnableC290703 */

        public void run() {
            if (StartTimingDetector.this.f72834b != null) {
                int loginType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginType();
                Log.m165389i("StartTimingDetector", "onUserBackGroundLaunched! loginStatus = " + loginType);
                StartTimingDetector.this.f72834b.mo103102a(loginType);
            }
        }
    };

    public interface IStartTimingDetectorObserver {
        /* renamed from: a */
        void mo103101a();

        /* renamed from: a */
        void mo103102a(int i);

        /* renamed from: a */
        void mo103103a(String str, int i);
    }

    /* renamed from: a */
    public boolean mo103133a() {
        if (!this.f72833a || !this.f72840h) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo103134b() {
        Application application = this.f72842j;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f72838f);
        }
        this.f72843k.mo102517b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.app.taskv2.preload.StartTimingDetector$4 */
    public static /* synthetic */ class C290714 {

        /* renamed from: a */
        static final /* synthetic */ int[] f72852a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.widget.ILifeCycleEventObserve$Event[] r0 = com.ss.android.lark.widget.ILifeCycleEventObserve.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290714.f72852a = r0
                com.ss.android.lark.widget.ILifeCycleEventObserve$Event r1 = com.ss.android.lark.widget.ILifeCycleEventObserve.Event.FIRST_DATA_LOADED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290714.f72852a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.ILifeCycleEventObserve$Event r1 = com.ss.android.lark.widget.ILifeCycleEventObserve.Event.FIRST_FRAME_SHOWED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290714.f72852a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.ILifeCycleEventObserve$Event r1 = com.ss.android.lark.widget.ILifeCycleEventObserve.Event.FIRST_CONTENT_SHOWED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.app.taskv2.preload.StartTimingDetector.C290714.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo103129a(Activity activity) {
        if (this.f72835c.containsKey(activity)) {
            Object remove = this.f72835c.remove(activity);
            if (remove instanceof ILifeCycleEventObserve.AbstractC58308a) {
                ((ILifeCycleEventObserve) activity).mo129678b((ILifeCycleEventObserve.AbstractC58308a) remove);
            } else {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) remove);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo103131a(String str) {
        UICallbackExecutor.removeCallbacks(this.f72844l);
        int loginType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginType();
        Log.m165389i("StartTimingDetector", "onFirstScreenShowed: " + str + " , LoginStatus = " + loginType);
        if (!this.f72833a) {
            this.f72833a = true;
            IStartTimingDetectorObserver iStartTimingDetectorObserver = this.f72834b;
            if (iStartTimingDetectorObserver != null) {
                iStartTimingDetectorObserver.mo103101a();
            }
            this.f72843k.mo102518c();
        }
        if (!this.f72841i && loginType == 2) {
            this.f72841i = true;
            IStartTimingDetectorObserver iStartTimingDetectorObserver2 = this.f72834b;
            if (iStartTimingDetectorObserver2 != null) {
                iStartTimingDetectorObserver2.mo103103a(str, loginType);
            }
        }
        if (loginType == 1) {
            this.f72840h = true;
            IStartTimingDetectorObserver iStartTimingDetectorObserver3 = this.f72834b;
            if (iStartTimingDetectorObserver3 != null) {
                iStartTimingDetectorObserver3.mo103103a(str, loginType);
            }
        }
    }

    /* renamed from: a */
    public void mo103130a(Application application, IStartTimingDetectorObserver iStartTimingDetectorObserver) {
        this.f72842j = application;
        this.f72834b = iStartTimingDetectorObserver;
        application.registerActivityLifecycleCallbacks(this.f72838f);
        UICallbackExecutor.executeDelayed(this.f72839g, 5000);
        C28851a aVar = new C28851a();
        this.f72843k = aVar;
        aVar.mo102515a();
    }

    /* renamed from: a */
    public void mo103132a(String str, ILifeCycleEventObserve.Event event) {
        int i = C290714.f72852a[event.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                Log.m165389i("StartTimingDetector", "onEventChanged:" + event);
            } else if (mo103133a()) {
                String str2 = this.f72836d;
                if (str2 != null) {
                    C51959a.m201531a(str, str2, this.f72837e);
                    this.f72836d = null;
                }
                mo103131a(str);
                for (Activity activity : this.f72835c.keySet()) {
                    mo103129a(activity);
                }
            }
        }
    }
}
