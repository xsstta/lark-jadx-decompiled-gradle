package com.ss.android.ugc.effectmanager.common;

import android.util.Pair;
import com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60517a;
import com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e;
import com.ss.android.ugc.effectmanager.common.p3053h.C60525c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.ugc.effectmanager.common.i */
public class C60540i {

    /* renamed from: a */
    public Map<String, Pair<Object, Future>> f151365a = new ConcurrentHashMap();

    /* renamed from: b */
    private boolean f151366b;

    /* renamed from: c */
    private ExecutorService f151367c;

    /* renamed from: d */
    private boolean f151368d;

    /* renamed from: e */
    private Map<String, AbstractC60517a> f151369e;

    /* renamed from: com.ss.android.ugc.effectmanager.common.i$a */
    public static class C60542a {

        /* renamed from: a */
        public boolean f151372a;

        /* renamed from: b */
        private ExecutorService f151373b;

        /* renamed from: a */
        public ExecutorService mo207285a() {
            return this.f151373b;
        }

        /* renamed from: a */
        public C60542a mo207284a(ExecutorService executorService, boolean z) {
            this.f151373b = executorService;
            return this;
        }
    }

    /* renamed from: a */
    private void m235326a() {
        if (!this.f151366b) {
            throw new IllegalStateException("EffectPlatformSDK: TaskManager is not init !!!");
        }
    }

    /* renamed from: a */
    public void mo207282a(C60542a aVar) {
        this.f151367c = aVar.mo207285a();
        this.f151368d = aVar.f151372a;
        this.f151369e = new ConcurrentHashMap();
        this.f151366b = true;
    }

    /* renamed from: a */
    public void mo207281a(final AbstractC60520e eVar) {
        boolean z;
        if (eVar != null) {
            m235326a();
            if (!C60525c.m235235a((Map) this.f151369e)) {
                Iterator<AbstractC60517a> it = this.f151369e.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo207214a(eVar)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                this.f151367c.execute(new Runnable() {
                    /* class com.ss.android.ugc.effectmanager.common.C60540i.RunnableC605411 */

                    public void run() {
                        eVar.mo207037a();
                    }
                });
            }
        }
    }
}
