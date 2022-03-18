package com.ss.android.lark.p1786d;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.Reflect;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.AbstractC36428b;
import com.ss.android.lark.p1786d.C36421a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.d.k */
public class C36443k extends AbstractC36428b implements C37030f.AbstractC37033c {

    /* renamed from: a */
    public static final boolean f93993a;

    /* renamed from: m */
    private static volatile C36443k f93994m;

    /* renamed from: b */
    public final Resources f93995b;

    /* renamed from: c */
    public final Context f93996c;

    /* renamed from: d */
    public ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> f93997d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public final FrameLayout f93998e;

    /* renamed from: f */
    private int f93999f;

    /* renamed from: g */
    private int f94000g;

    /* renamed from: h */
    private final C36421a f94001h;

    /* renamed from: i */
    private final ConcurrentHashMap<String, C36447l> f94002i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private final ArrayMap<Activity, AbstractC36436g> f94003j = new ArrayMap<>();

    /* renamed from: k */
    private AbstractC36428b.C36430b f94004k;

    /* renamed from: l */
    private Runnable f94005l;

    @Override // com.ss.android.lark.p1786d.AbstractC36428b
    /* renamed from: a */
    public void mo134296a(ViewGroup viewGroup, AbstractC36428b.C36430b bVar, long j) {
        this.f94004k = bVar;
        bVar.mo134301a(new AbstractC36428b.AbstractC36429a(viewGroup) {
            /* class com.ss.android.lark.p1786d.$$Lambda$k$KKTFi5RgUtNxlwCOBByU6Rfk5A */
            public final /* synthetic */ ViewGroup f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.p1786d.AbstractC36428b.AbstractC36429a
            public final void action(int i, int i2) {
                C36443k.this.m143602a((C36443k) this.f$1, (ViewGroup) i, i2);
            }
        });
    }

    /* renamed from: a */
    public void mo134317a(int i, String str, C36421a.AbstractC36427f fVar) {
        if (this.f94002i.get(str) != null) {
            Log.m165383e("PreLoadAsyncInflater", "addPreloadView: error.");
            return;
        }
        C36447l lVar = new C36447l(fVar, i);
        this.f94002i.put(str, lVar);
        lVar.mo134329a(mo134321b(this.f93996c), this.f93998e);
    }

    /* renamed from: a */
    public View mo134315a(ViewStub viewStub) {
        View view;
        ConcurrentLinkedQueue<View> concurrentLinkedQueue;
        AbstractC36436g d = m143604d(viewStub.getContext());
        ViewStub.OnInflateListener onInflateListener = null;
        if (d != null) {
            view = d.mo134306a(viewStub);
            if (view != null) {
                return view;
            }
        } else {
            view = null;
        }
        ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> concurrentHashMap = this.f93997d;
        if (!(concurrentHashMap == null || (concurrentLinkedQueue = concurrentHashMap.get(Integer.valueOf(viewStub.getLayoutResource()))) == null)) {
            view = concurrentLinkedQueue.poll();
        }
        if (view == null) {
            return viewStub.inflate();
        }
        boolean z = false;
        try {
            z = true;
            onInflateListener = (ViewStub.OnInflateListener) Reflect.m94918a(viewStub).mo93335a("mInflateListener", new Class[0]).mo93337a();
        } catch (Throwable unused) {
            view = viewStub.inflate();
        }
        if (z) {
            m143601a(viewStub.getContext(), view);
            if (viewStub.getInflatedId() != -1) {
                view.setId(viewStub.getInflatedId());
            }
            m143603a(viewStub, view);
            if (onInflateListener != null) {
                onInflateListener.onInflate(viewStub, view);
            }
        }
        if (f93993a) {
            mo134318a(mo134321b(this.f93996c), viewStub.getLayoutResource(), this.f93998e);
            return view;
        }
        mo134324c(this.f93996c);
        return view;
    }

    /* renamed from: a */
    public void mo134319a(Integer[] numArr) {
        if (!(this.f93997d == null || numArr == null)) {
            for (Integer num : numArr) {
                this.f93997d.remove(Integer.valueOf(num.intValue()));
            }
        }
    }

    /* renamed from: a */
    public void mo134318a(C36421a aVar, final int i, ViewGroup viewGroup) {
        aVar.mo134284a(i, viewGroup, new C36421a.AbstractC36426e() {
            /* class com.ss.android.lark.p1786d.C36443k.C364463 */

            @Override // com.ss.android.lark.p1786d.C36421a.AbstractC36426e
            /* renamed from: a */
            public void mo134291a(View view, int i, ViewGroup viewGroup) {
                if (view == null) {
                    C36438i.m143589a(C36443k.this.f93995b.getResourceEntryName(i));
                    return;
                }
                ConcurrentLinkedQueue<View> concurrentLinkedQueue = C36443k.this.f93997d.get(Integer.valueOf(i));
                Log.m165379d("PreLoadAsyncInflater", "onInflateFinished1:" + concurrentLinkedQueue);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                    C36443k.this.f93997d.put(Integer.valueOf(i), concurrentLinkedQueue);
                }
                concurrentLinkedQueue.offer(view);
            }
        });
    }

    @Override // com.ss.android.lark.C37030f.AbstractC37033c
    /* renamed from: a */
    public void mo134316a(int i) {
        Log.m165379d("PreLoadAsyncInflater", "onNightModeChange:" + i);
        C36431c.m143579a();
        mo134322b();
    }

    static {
        boolean z;
        if (Runtime.getRuntime().availableProcessors() > 4) {
            z = true;
        } else {
            z = false;
        }
        f93993a = z;
    }

    /* renamed from: b */
    public void mo134322b() {
        if (this.f94005l == null) {
            this.f94005l = new Runnable() {
                /* class com.ss.android.lark.p1786d.$$Lambda$k$1ahsK9NbkPKyVqpxObvl3IpICU */

                public final void run() {
                    C36443k.this.m143607e();
                }
            };
        }
        CoreThreadPool.getNonblockingHandler().removeCallbacks(this.f94005l);
        CoreThreadPool.getNonblockingHandler().postDelayed(this.f94005l, 0);
    }

    /* renamed from: c */
    public void mo134323c() {
        C36438i.m143588a(this.f93999f, this.f94000g);
        this.f93999f = 0;
        this.f94000g = 0;
        if (!f93993a) {
            m143600a(2000L);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m143607e() {
        if (this.f93997d != null) {
            Log.m165379d("PreLoadAsyncInflater", "resetCache mViewCaches");
            this.f93997d.clear();
        }
        if (this.f94002i != null) {
            Log.m165379d("PreLoadAsyncInflater", "resetCache mViewPools");
            for (C36447l lVar : this.f94002i.values()) {
                lVar.mo134328a();
            }
        }
        m143600a(2000L);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m143605d() {
        if (this.f94004k != null) {
            Log.m165379d("PreLoadAsyncInflater", "completeCache mViewCaches");
            this.f94004k.mo134301a(new AbstractC36428b.AbstractC36429a() {
                /* class com.ss.android.lark.p1786d.$$Lambda$k$SxCz4JaUwFsA53qRbU6xInPNYaM */

                @Override // com.ss.android.lark.p1786d.AbstractC36428b.AbstractC36429a
                public final void action(int i, int i2) {
                    C36443k.this.m143599a((C36443k) i, i2);
                }
            });
        }
        if (this.f94002i != null) {
            Log.m165379d("PreLoadAsyncInflater", "completeCache mViewPools");
            for (C36447l lVar : this.f94002i.values()) {
                lVar.mo134329a(mo134321b(this.f93996c), this.f93998e);
            }
        }
    }

    /* renamed from: b */
    public C36421a mo134321b(Context context) {
        this.f94001h.mo134285a(new C36437h(context));
        return this.f94001h;
    }

    /* renamed from: c */
    public void mo134324c(Context context) {
        C36437h hVar = new C36437h(context);
        C36421a aVar = this.f94001h;
        if (aVar != null) {
            aVar.mo134285a(hVar);
        }
    }

    /* renamed from: a */
    public static C36443k m143598a(Context context) {
        if (f93994m == null) {
            synchronized (C36443k.class) {
                if (f93994m == null) {
                    f93994m = new C36443k(context);
                }
            }
        }
        return f93994m;
    }

    /* renamed from: d */
    private AbstractC36436g m143604d(Context context) {
        Activity e = m143606e(context);
        if (e == null) {
            return null;
        }
        return this.f94003j.get(e);
    }

    /* renamed from: e */
    private Activity m143606e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof C36437h) {
            return m143606e(((C36437h) context).getBaseContext());
        }
        return null;
    }

    private C36443k(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f93996c = applicationContext;
        this.f93995b = applicationContext.getResources();
        this.f93998e = new FrameLayout(applicationContext);
        this.f94001h = new C36421a(new C36437h(context));
        C37030f.m146093a().mo103024a(this);
    }

    /* renamed from: a */
    private void m143600a(long j) {
        CoreThreadPool.getNonblockingHandler().postDelayed(new Runnable() {
            /* class com.ss.android.lark.p1786d.$$Lambda$k$yYj6Muy8DTiFMLOxiIWPKvRBsaA */

            public final void run() {
                C36443k.this.m143605d();
            }
        }, j);
    }

    /* renamed from: a */
    public static View m143597a(Context context, String str) {
        if (f93994m == null) {
            return null;
        }
        return f93994m.mo134320b(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m143599a(int i, int i2) {
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f93997d.get(Integer.valueOf(i));
        if (concurrentLinkedQueue != null) {
            i2 -= concurrentLinkedQueue.size();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            mo134318a(mo134321b(this.f93996c), i, new FrameLayout(this.f93996c));
        }
    }

    /* renamed from: b */
    public View mo134320b(Context context, String str) {
        final C36447l lVar = this.f94002i.get(str);
        if (lVar == null) {
            return null;
        }
        View a = lVar.mo134327a(context);
        if (!(a == null || context == null)) {
            m143601a(context, a);
        }
        this.f94001h.f93968b.submit(new Runnable() {
            /* class com.ss.android.lark.p1786d.C36443k.RunnableC364441 */

            public void run() {
                C36447l lVar = lVar;
                C36443k kVar = C36443k.this;
                lVar.mo134329a(kVar.mo134321b(kVar.f93996c), C36443k.this.f93998e);
            }
        });
        return a;
    }

    /* renamed from: a */
    private void m143601a(Context context, View view) {
        if (context != null && view != null) {
            if (context instanceof C36437h) {
                context = ((C36437h) context).getBaseContext();
            }
            Context context2 = view.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
        }
    }

    /* renamed from: a */
    private void m143603a(ViewStub viewStub, View view) {
        ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36434e, com.ss.android.lark.p1786d.AbstractC36428b
    /* renamed from: a */
    public View mo134293a(Context context, int i, ViewGroup viewGroup) {
        return mo134294a(context, i, viewGroup, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m143602a(ViewGroup viewGroup, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo134318a(mo134321b(this.f93996c), i, viewGroup);
        }
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36434e, com.ss.android.lark.p1786d.AbstractC36428b
    /* renamed from: a */
    public View mo134294a(Context context, final int i, ViewGroup viewGroup, final boolean z) {
        View view;
        ConcurrentLinkedQueue<View> concurrentLinkedQueue;
        AbstractC36436g d = m143604d(context);
        if (d != null) {
            view = d.mo134305a(context, i, viewGroup, z);
            if (view != null) {
                return view;
            }
        } else {
            view = null;
        }
        ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> concurrentHashMap = this.f93997d;
        if (!(concurrentHashMap == null || (concurrentLinkedQueue = concurrentHashMap.get(Integer.valueOf(i))) == null)) {
            view = concurrentLinkedQueue.poll();
        }
        if (view == null) {
            this.f94000g++;
            Log.m165389i("PreLoadAsyncInflater", "getView2 cache is null");
            view = LayoutInflater.from(context).inflate(i, viewGroup, false);
        } else {
            if (context != null) {
                m143601a(context, view);
            }
            this.f94001h.f93968b.submit(new Runnable() {
                /* class com.ss.android.lark.p1786d.C36443k.RunnableC364452 */

                public void run() {
                    if (!z || !C36443k.f93993a) {
                        C36443k kVar = C36443k.this;
                        kVar.mo134324c(kVar.f93996c);
                        return;
                    }
                    C36443k kVar2 = C36443k.this;
                    kVar2.mo134318a(kVar2.mo134321b(kVar2.f93996c), i, C36443k.this.f93998e);
                }
            });
        }
        this.f93999f++;
        return view;
    }
}
