package com.ss.android.vc.common.p3080d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.vc.common.p3080d.p3082b.C60717c;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.dependency.ar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.vc.common.d.i */
public class C60724i {

    /* renamed from: a */
    private Handler f151882a;

    /* renamed from: b */
    private AtomicBoolean f151883b;

    /* renamed from: c */
    private boolean f151884c;

    /* renamed from: d */
    private List<AbstractRunnableC60727j> f151885d;

    /* renamed from: e */
    private BroadcastReceiver f151886e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.d.i$a */
    public static class C60726a {

        /* renamed from: a */
        public static final C60724i f151888a = new C60724i();
    }

    /* renamed from: a */
    public static C60724i m235924a() {
        return C60726a.f151888a;
    }

    /* renamed from: b */
    public void mo208322b() {
        mo208319a(new Runnable() {
            /* class com.ss.android.vc.common.p3080d.$$Lambda$i$DAZkUkl5Jh_tMAF388MSiLhXWH0 */

            public final void run() {
                C60724i.lambda$DAZkUkl5Jh_tMAF388MSiLhXWH0(C60724i.this);
            }
        });
    }

    private C60724i() {
        this.f151883b = new AtomicBoolean(false);
        this.f151885d = new LinkedList();
        this.f151886e = new BroadcastReceiver() {
            /* class com.ss.android.vc.common.p3080d.C60724i.C607251 */

            public void onReceive(Context context, Intent intent) {
                if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                    C60724i.this.mo208322b();
                }
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m235925c() {
        boolean b = C60785x.m236238b();
        if (b != this.f151884c) {
            this.f151884c = b;
            HashSet hashSet = new HashSet();
            for (AbstractRunnableC60727j jVar : this.f151885d) {
                if (!hashSet.contains(jVar.mo208332b())) {
                    jVar.mo208305a(this.f151884c);
                    hashSet.add(jVar.mo208334d());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo208320a(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo208319a(new Runnable(str) {
                /* class com.ss.android.vc.common.p3080d.$$Lambda$i$npGOnApXjssUPxExozyoQoMfry0 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C60724i.lambda$npGOnApXjssUPxExozyoQoMfry0(C60724i.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo208325c(AbstractRunnableC60727j jVar) {
        if (jVar != null) {
            mo208319a(new Runnable(jVar) {
                /* class com.ss.android.vc.common.p3080d.$$Lambda$i$I2zz4pdJMV3tHIDflaj_nC4evOk */
                public final /* synthetic */ AbstractRunnableC60727j f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C60724i.lambda$I2zz4pdJMV3tHIDflaj_nC4evOk(C60724i.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: e */
    private void m235927e(AbstractRunnableC60727j jVar) {
        this.f151885d.add(jVar);
        jVar.mo208311a("VcNetSyncer", "sync_task_start");
        jVar.mo208305a(this.f151884c);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m235929f(AbstractRunnableC60727j jVar) {
        Iterator<AbstractRunnableC60727j> it = this.f151885d.iterator();
        while (it.hasNext()) {
            if (it.next() == jVar) {
                it.remove();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo208323b(AbstractRunnableC60727j jVar) {
        if (jVar != null) {
            mo208319a(new Runnable(jVar) {
                /* class com.ss.android.vc.common.p3080d.$$Lambda$i$Kn6o8UX1I3GDDPNdI3yOvLK9Gq4 */
                public final /* synthetic */ AbstractRunnableC60727j f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C60724i.lambda$Kn6o8UX1I3GDDPNdI3yOvLK9Gq4(C60724i.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo208326d(AbstractRunnableC60727j jVar) {
        AbstractRunnableC60727j b = m235924a().mo208321b(jVar.mo208332b());
        if (b != null) {
            b.mo208311a("VcNetSyncer", "start from previous task with the same key");
            b.mo208342k();
        }
    }

    /* renamed from: d */
    private void m235926d(String str) {
        LinkedList linkedList = new LinkedList(this.f151885d);
        boolean z = false;
        for (int i = 0; i < linkedList.size(); i++) {
            AbstractRunnableC60727j jVar = (AbstractRunnableC60727j) linkedList.get(i);
            if (jVar.mo208332b().equals(str)) {
                if (z) {
                    mo208323b(jVar);
                } else {
                    z = true;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m235928e(String str) {
        for (AbstractRunnableC60727j jVar : new LinkedList(this.f151885d)) {
            if (TextUtils.equals(jVar.mo208330a(), str)) {
                mo208323b(jVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m235930g(AbstractRunnableC60727j jVar) {
        Iterator<AbstractRunnableC60727j> it = this.f151885d.iterator();
        while (it.hasNext()) {
            if (it.next() == jVar) {
                jVar.mo208311a("VcNetSyncer", "remove from pool");
                it.remove();
                jVar.mo208306c();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m235931h(AbstractRunnableC60727j jVar) {
        m235926d(jVar.mo208332b());
        AbstractRunnableC60727j b = mo208321b(jVar.mo208332b());
        if (b == jVar) {
            b.mo208311a("VcNetSyncer", "submit repeatedly");
        } else if (b == null) {
            m235927e(jVar);
            jVar.mo208342k();
        } else if (b.mo208338g()) {
            m235927e(jVar);
            jVar.mo208311a("VcNetSyncer", "just add to pool");
        } else {
            mo208323b(b);
            m235927e(jVar);
            jVar.mo208342k();
        }
    }

    /* renamed from: a */
    public void mo208317a(Context context) {
        if (this.f151883b.compareAndSet(false, true)) {
            this.f151882a = C60735ab.m235995a("vc-syncer");
            this.f151884c = C60785x.m236238b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            m235923a(context.getApplicationContext(), this.f151886e, intentFilter);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractRunnableC60727j mo208321b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i < this.f151885d.size(); i++) {
            if (this.f151885d.get(i).mo208332b().equals(str)) {
                return this.f151885d.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo208318a(AbstractRunnableC60727j jVar) {
        if (jVar != null) {
            if (jVar.mo208341i() == null) {
                jVar.mo208331a(new C60717c());
            }
            mo208319a(new Runnable(jVar) {
                /* class com.ss.android.vc.common.p3080d.$$Lambda$i$u0cRbpPbWGEikYt2M25qTYOVS2E */
                public final /* synthetic */ AbstractRunnableC60727j f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C60724i.lambda$u0cRbpPbWGEikYt2M25qTYOVS2E(C60724i.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractRunnableC60727j mo208324c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int size = this.f151885d.size(); size > 0; size--) {
            int i = size - 1;
            if (this.f151885d.get(i).mo208332b().equals(str)) {
                return this.f151885d.get(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo208319a(Runnable runnable) {
        if (runnable != null) {
            RunnableC60722g gVar = new RunnableC60722g(runnable);
            Handler handler = this.f151882a;
            if (handler == null || handler.getLooper() == null || this.f151882a.getLooper().getThread().getId() != Thread.currentThread().getId()) {
                if (this.f151882a == null) {
                    mo208317a(ar.m236694a());
                }
                this.f151882a.post(gVar);
                return;
            }
            gVar.run();
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m235923a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
