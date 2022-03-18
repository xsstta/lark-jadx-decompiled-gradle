package com.bytedance.android.monitor;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.p104a.AbstractC2632d;
import com.bytedance.android.monitor.p104a.AbstractC2636h;
import com.bytedance.android.monitor.p105b.C2639a;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.p111h.AbstractC2650b;
import com.bytedance.android.monitor.p111h.C2649a;
import com.bytedance.android.monitor.p112i.C2655c;
import com.bytedance.android.monitor.p112i.C2659h;
import com.bytedance.android.monitor.p112i.C2660i;
import com.bytedance.android.monitor.util.MonitorUtils;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class HybridMonitor {
    private static volatile HybridMonitor instance;
    public boolean AB_TEST = false;
    private Application application;
    private AbstractC2632d exceptionHandler;
    private List<AbstractC2636h> interceptorList;
    private boolean isInitialized;
    private boolean isRegisterTouchCallback;
    private C2627a normalCustomMonitor = new C2627a();
    private AbstractC2650b settingManager;
    private C2625a touchTraceCallback;

    public Application getApplication() {
        return this.application;
    }

    public AbstractC2632d getExceptionHandler() {
        return this.exceptionHandler;
    }

    public boolean isAbTestEnable() {
        return this.AB_TEST;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.android.monitor.HybridMonitor$b */
    public static class Window$CallbackC2626b implements Window.Callback {

        /* renamed from: a */
        private Window.Callback f8365a;

        public void onAttachedToWindow() {
            this.f8365a.onAttachedToWindow();
        }

        public void onContentChanged() {
            this.f8365a.onContentChanged();
        }

        public void onDetachedFromWindow() {
            this.f8365a.onDetachedFromWindow();
        }

        public boolean onSearchRequested() {
            return this.f8365a.onSearchRequested();
        }

        private Window$CallbackC2626b(Window.Callback callback) {
            this.f8365a = callback;
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.f8365a.dispatchGenericMotionEvent(motionEvent);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f8365a.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.f8365a.dispatchKeyShortcutEvent(keyEvent);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.f8365a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.f8365a.dispatchTrackballEvent(motionEvent);
        }

        public void onActionModeFinished(ActionMode actionMode) {
            this.f8365a.onActionModeFinished(actionMode);
        }

        public void onActionModeStarted(ActionMode actionMode) {
            this.f8365a.onActionModeStarted(actionMode);
        }

        public View onCreatePanelView(int i) {
            return this.f8365a.onCreatePanelView(i);
        }

        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.f8365a.onWindowAttributesChanged(layoutParams);
        }

        public void onWindowFocusChanged(boolean z) {
            this.f8365a.onWindowFocusChanged(z);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f8365a.onWindowStartingActionMode(callback);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            C2660i.m11189a(motionEvent);
            return this.f8365a.dispatchTouchEvent(motionEvent);
        }

        public boolean onSearchRequested(SearchEvent searchEvent) {
            return this.f8365a.onSearchRequested(searchEvent);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return this.f8365a.onCreatePanelMenu(i, menu);
        }

        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return this.f8365a.onMenuItemSelected(i, menuItem);
        }

        public boolean onMenuOpened(int i, Menu menu) {
            return this.f8365a.onMenuOpened(i, menu);
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f8365a.onPanelClosed(i, menu);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return this.f8365a.onWindowStartingActionMode(callback, i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            return this.f8365a.onPreparePanel(i, view, menu);
        }
    }

    private void initComponent() {
        injectWebOffline();
        injectFalconX();
    }

    public static boolean isDebuggable() {
        return C2639a.m11085a();
    }

    public static boolean isOutputFile() {
        return C2639a.m11088b();
    }

    public void DisableReportInfo() {
        C2640c.m11089a().mo11420b();
    }

    public AbstractC2677a getCustomReportMonitor() {
        return this.normalCustomMonitor.mo11397a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.android.monitor.HybridMonitor$a */
    public static class C2625a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private Set<Integer> f8364a;

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private C2625a() {
            this.f8364a = new HashSet();
        }

        public void onActivityDestroyed(Activity activity) {
            m11049b(activity);
        }

        public void onActivityStarted(Activity activity) {
            mo11366a(activity);
        }

        /* renamed from: b */
        private void m11049b(Activity activity) {
            this.f8364a.remove(Integer.valueOf(activity.hashCode()));
        }

        /* renamed from: c */
        private boolean m11050c(Activity activity) {
            if (activity == null) {
                return false;
            }
            return !this.f8364a.contains(Integer.valueOf(activity.hashCode()));
        }

        /* renamed from: a */
        public void mo11366a(Activity activity) {
            try {
                if (m11050c(activity)) {
                    this.f8364a.add(Integer.valueOf(activity.hashCode()));
                    Window window = activity.getWindow();
                    window.setCallback(new Window$CallbackC2626b(window.getCallback()));
                }
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            mo11366a(activity);
        }
    }

    private void initDebugEnvir() {
        MonitorExecutor.f8417a.mo11452a(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.RunnableC26222 */

            public void run() {
                C2639a.m11082a(HybridMonitor.this.getApplication());
            }
        });
    }

    private void initFileRecord() {
        registerReportInterceptor(new AbstractC2636h() {
            /* class com.bytedance.android.monitor.HybridMonitor.C26211 */

            @Override // com.bytedance.android.monitor.p104a.AbstractC2636h
            /* renamed from: a */
            public void mo11362a(String str, String str2, String str3, JSONObject jSONObject) {
                if (HybridMonitor.isOutputFile()) {
                    MonitorUtils.m11182a(str2, jSONObject);
                }
            }
        });
    }

    private void injectFalconX() {
        MonitorExecutor.f8417a.mo11451a().execute(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.RunnableC26244 */

            public void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.FalconXMonitor");
                    C2659h.m11186a(cls, "beginMonitor", C2659h.m11186a(cls, "getInstance", new Object[0]));
                } catch (Exception e) {
                    C2655c.m11159a(e);
                }
            }
        });
    }

    private void injectWebOffline() {
        MonitorExecutor.f8417a.mo11451a().execute(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.RunnableC26233 */

            public void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.WebOfflineMonitor");
                    C2659h.m11186a(cls, "beginMonitor", C2659h.m11186a(cls, "getInstance", new Object[0]));
                } catch (Exception e) {
                    C2655c.m11159a(e);
                }
            }
        });
    }

    public void clearSetting() {
        AbstractC2650b bVar = this.settingManager;
        if (bVar != null) {
            bVar.mo11468d();
            this.settingManager = null;
        }
    }

    public AbstractC2650b getSettingManager() {
        AbstractC2650b bVar = this.settingManager;
        if (bVar != null) {
            return bVar;
        }
        return C2649a.m11147a();
    }

    public static HybridMonitor getInstance() {
        if (instance == null) {
            synchronized (HybridMonitor.class) {
                if (instance == null) {
                    instance = new HybridMonitor();
                }
            }
        }
        return instance;
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            C2625a aVar = new C2625a();
            this.touchTraceCallback = aVar;
            this.application.registerActivityLifecycleCallbacks(aVar);
            this.isRegisterTouchCallback = true;
        }
    }

    public static void setDebuggable(boolean z) {
        C2639a.m11083a(z);
    }

    public static void setOutputFile(boolean z) {
        C2639a.m11086b(z);
    }

    public void setAbTestEnable(boolean z) {
        this.AB_TEST = z;
    }

    public void setExceptionHandler(AbstractC2632d dVar) {
        this.exceptionHandler = dVar;
    }

    public void clearDisableReportInfo(String str) {
        C2640c.m11089a().mo11417a(str);
    }

    public void customReport(C2641a aVar) {
        this.normalCustomMonitor.mo11398a(aVar);
    }

    public void init(Application application2) {
        init(application2, true);
    }

    public void setCustomReportMonitor(AbstractC2677a aVar) {
        this.normalCustomMonitor.mo11399a(aVar);
    }

    public void initSetting(AbstractC2650b bVar) {
        if (bVar != null) {
            this.settingManager = bVar;
            try {
                bVar.mo11465a(this.application);
            } catch (Throwable th) {
                C2655c.m11159a(th);
            }
        }
    }

    public void wrapTouchTraceCallback(Activity activity) {
        C2625a aVar;
        if (activity != null && this.isRegisterTouchCallback && (aVar = this.touchTraceCallback) != null) {
            aVar.mo11366a(activity);
        }
    }

    public void registerReportInterceptor(AbstractC2636h hVar) {
        if (hVar != null) {
            if (this.interceptorList == null) {
                this.interceptorList = new CopyOnWriteArrayList();
            }
            this.interceptorList.add(hVar);
        }
    }

    public void unregisterReportInterceptor(AbstractC2636h hVar) {
        List<AbstractC2636h> list;
        if (hVar != null && (list = this.interceptorList) != null && list.size() != 0) {
            this.interceptorList.remove(hVar);
        }
    }

    public static void setDebuggable(boolean z, boolean z2) {
        C2639a.m11084a(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        C2639a.m11087b(z, z2);
    }

    public void registerDisableReportInfo(String str, List<String> list) {
        C2640c.m11089a().mo11418a(str, list);
    }

    public void init(Application application2, boolean z) {
        if (application2 != null && !this.isInitialized) {
            this.isInitialized = true;
            this.application = application2;
            if (z) {
                registerTouchCallback();
            }
            initComponent();
            initFileRecord();
            initDebugEnvir();
        }
    }

    public void notifyReportInterceptor(String str, String str2, String str3, JSONObject jSONObject) {
        List<AbstractC2636h> list = this.interceptorList;
        if (list != null && list.size() > 0) {
            for (AbstractC2636h hVar : this.interceptorList) {
                if (hVar != null) {
                    hVar.mo11362a(str, str2, str3, jSONObject);
                }
            }
        }
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        this.normalCustomMonitor.mo11400a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, AbstractC2677a aVar) {
        this.normalCustomMonitor.mo11401a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, aVar);
    }
}
