package com.ss.android.lark.multitask;

import android.app.Application;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.task.ActivityLifecycle;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.TaskSnapshotStorage;
import com.ss.android.lark.slideback.SlideBack;
import com.ss.android.lark.utils.C57765ac;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.multitask.l */
public final class C48338l {

    /* renamed from: a */
    private static final AtomicBoolean f121733a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Object f121734b = new Object();

    /* renamed from: a */
    public static boolean m190662a() {
        boolean z;
        synchronized (f121734b) {
            z = f121733a.get();
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m190663b() {
        boolean a;
        synchronized (f121734b) {
            a = MultitaskFG.f121594a.mo168906a();
        }
        return a;
    }

    /* renamed from: c */
    public static boolean m190665c() {
        boolean b;
        synchronized (f121734b) {
            b = MultitaskFG.f121594a.mo168907b();
        }
        return b;
    }

    /* renamed from: a */
    public static void m190660a(Application application) {
        m190661a(application, null);
    }

    /* renamed from: b */
    private static boolean m190664b(Application application) {
        return C57765ac.m224187a(application);
    }

    /* renamed from: c */
    private static boolean m190666c(Application application) {
        return C57765ac.m224189c(application);
    }

    /* renamed from: a */
    public static void m190661a(Application application, Function1<C48376q, Unit> function1) {
        synchronized (f121734b) {
            if (f121733a.compareAndSet(false, true)) {
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(ActivityLifecycle.f121792a);
                    Log.m165389i("MULTITASK-SlidebackSetup", "First time init");
                } else {
                    return;
                }
            }
            String c = C26252ad.m94994c(application);
            if (C57765ac.m224188b(application)) {
                MMKV mmkvWithID = MMKV.mmkvWithID("MMKV_multitask", 2);
                MultitaskFG.f121594a = new MultitaskFGDependency(true, true) {
                    /* class com.ss.android.lark.multitask.C48338l.C483391 */

                    /* renamed from: a */
                    final /* synthetic */ boolean f121735a;

                    @Override // com.ss.android.lark.multitask.MultitaskFGDependency
                    /* renamed from: a */
                    public boolean mo168906a() {
                        return this.f121735a;
                    }

                    @Override // com.ss.android.lark.multitask.MultitaskFGDependency
                    /* renamed from: b */
                    public boolean mo168907b() {
                        return true;
                    }

                    {
                        this.f121735a = r1;
                    }
                };
                Log.m165389i("MULTITASK-SlidebackSetup", "init, main process, fgEnabled = " + true);
                TaskBasketManagerImpl.f121743b.mo169076a(application, true, c, (TaskSnapshotStorage) TaskSnapshotSharedPreferencesStorage.f121768a, (Function1<? super C48376q, Unit>) C48335j.m190643a().mo168875f());
                mmkvWithID.encode("multitask_enabled", true);
                mmkvWithID.encode("floating_window_enabled", true);
            }
            if (m190664b(application) || m190666c(application)) {
                final MMKV mmkvWithID2 = MMKV.mmkvWithID("MMKV_multitask", 2);
                final boolean decodeBool = mmkvWithID2.decodeBool("floating_window_enabled", false);
                final boolean decodeBool2 = mmkvWithID2.decodeBool("multitask_enabled", false);
                MultitaskFG.f121594a = new MultitaskFGDependency() {
                    /* class com.ss.android.lark.multitask.C48338l.C483402 */

                    @Override // com.ss.android.lark.multitask.MultitaskFGDependency
                    /* renamed from: a */
                    public boolean mo168906a() {
                        return mmkvWithID2.decodeBool("multitask_enabled", decodeBool2);
                    }

                    @Override // com.ss.android.lark.multitask.MultitaskFGDependency
                    /* renamed from: b */
                    public boolean mo168907b() {
                        return mmkvWithID2.decodeBool("floating_window_enabled", decodeBool);
                    }
                };
                Log.m165389i("MULTITASK-SlidebackSetup", "init, " + C26252ad.m94994c(application) + " process, fgEnabled = " + decodeBool2);
                if (decodeBool) {
                    TaskBasketManagerImpl.f121743b.mo169075a(application, false, c, (TaskSnapshotStorage) TaskSnapshotSharedPreferencesStorage.f121768a);
                }
                if (!decodeBool || !decodeBool2) {
                    if (!TaskBasketManagerImpl.f121743b.mo169081d() && !SlideBack.m212971a()) {
                        SlideBack.m212969a(application);
                    }
                    SlideBack.m212970a(false);
                }
            }
        }
    }
}
