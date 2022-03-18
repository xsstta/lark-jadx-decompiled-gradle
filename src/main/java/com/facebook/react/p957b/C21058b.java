package com.facebook.react.p957b;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.react.b.b */
public class C21058b {

    /* renamed from: b */
    private static final WeakHashMap<ReactContext, C21058b> f51472b = new WeakHashMap<>();

    /* renamed from: a */
    public final Set<AbstractC21062c> f51473a = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final WeakReference<ReactContext> f51474c;

    /* renamed from: d */
    private final AtomicInteger f51475d = new AtomicInteger(0);

    /* renamed from: e */
    private final Handler f51476e = new Handler();

    /* renamed from: f */
    private final Set<Integer> f51477f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final Map<Integer, C21057a> f51478g = new ConcurrentHashMap();

    /* renamed from: h */
    private final SparseArray<Runnable> f51479h = new SparseArray<>();

    /* renamed from: a */
    public boolean mo71419a() {
        if (this.f51477f.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo71418a(AbstractC21062c cVar) {
        this.f51473a.add(cVar);
    }

    /* renamed from: b */
    public void mo71422b(AbstractC21062c cVar) {
        this.f51473a.remove(cVar);
    }

    /* renamed from: c */
    public synchronized boolean mo71423c(int i) {
        return this.f51477f.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static C21058b m76703a(ReactContext reactContext) {
        WeakHashMap<ReactContext, C21058b> weakHashMap = f51472b;
        C21058b bVar = weakHashMap.get(reactContext);
        if (bVar != null) {
            return bVar;
        }
        C21058b bVar2 = new C21058b(reactContext);
        weakHashMap.put(reactContext, bVar2);
        return bVar2;
    }

    /* renamed from: d */
    private void m76705d(int i) {
        Runnable runnable = this.f51479h.get(i);
        if (runnable != null) {
            this.f51476e.removeCallbacks(runnable);
            this.f51479h.remove(i);
        }
    }

    private C21058b(ReactContext reactContext) {
        this.f51474c = new WeakReference<>(reactContext);
    }

    /* renamed from: a */
    public synchronized boolean mo71420a(final int i) {
        boolean z;
        C21057a aVar = this.f51478g.get(Integer.valueOf(i));
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76679a(z, "Tried to retrieve non-existent task config with id " + i + ".");
        AbstractC21063d e = aVar.mo71416e();
        if (!e.mo71429a()) {
            return false;
        }
        m76705d(i);
        final C21057a aVar2 = new C21057a(aVar.mo71412a(), aVar.mo71413b(), aVar.mo71414c(), aVar.mo71415d(), e.mo71431c());
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.p957b.C21058b.RunnableC210591 */

            public void run() {
                C21058b.this.mo71417a(aVar2, i);
            }
        }, (long) e.mo71430b());
        return true;
    }

    /* renamed from: b */
    public synchronized void mo71421b(final int i) {
        boolean z;
        boolean remove = this.f51477f.remove(Integer.valueOf(i));
        C21045a.m76679a(remove, "Tried to finish non-existent task with id " + i + ".");
        if (this.f51478g.remove(Integer.valueOf(i)) != null) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76679a(z, "Tried to remove non-existent task config with id " + i + ".");
        m76705d(i);
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.p957b.C21058b.RunnableC210602 */

            public void run() {
                for (AbstractC21062c cVar : C21058b.this.f51473a) {
                    cVar.onHeadlessJsTaskFinish(i);
                }
            }
        });
    }

    /* renamed from: a */
    private void m76704a(final int i, long j) {
        RunnableC210613 r0 = new Runnable() {
            /* class com.facebook.react.p957b.C21058b.RunnableC210613 */

            public void run() {
                C21058b.this.mo71421b(i);
            }
        };
        this.f51479h.append(i, r0);
        this.f51476e.postDelayed(r0, j);
    }

    /* renamed from: a */
    public synchronized void mo71417a(C21057a aVar, int i) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) C21045a.m76677a(this.f51474c.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED) {
            if (!aVar.mo71415d()) {
                throw new IllegalStateException("Tried to start task " + aVar.mo71412a() + " while in foreground, but this is not allowed.");
            }
        }
        this.f51477f.add(Integer.valueOf(i));
        this.f51478g.put(Integer.valueOf(i), new C21057a(aVar));
        ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i, aVar.mo71412a(), aVar.mo71413b());
        if (aVar.mo71414c() > 0) {
            m76704a(i, aVar.mo71414c());
        }
        for (AbstractC21062c cVar : this.f51473a) {
            cVar.onHeadlessJsTaskStart(i);
        }
    }
}
