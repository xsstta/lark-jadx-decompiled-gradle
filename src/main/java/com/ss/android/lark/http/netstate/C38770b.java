package com.ss.android.lark.http.netstate;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.http.netstate.NetworkUtils;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.http.netstate.b */
public class C38770b {

    /* renamed from: a */
    private NetworkUtils.NetworkType f99699a;

    /* renamed from: b */
    private HandlerThread f99700b;

    /* renamed from: c */
    private Handler f99701c;

    /* renamed from: d */
    private Set<AbstractC38769a> f99702d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.http.netstate.b$a */
    public static class C38772a {

        /* renamed from: a */
        public static final C38770b f99705a = new C38770b();
    }

    /* renamed from: a */
    public static HandlerThread m153077a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static C38770b m153078a() {
        return C38772a.f99705a;
    }

    private C38770b() {
        this.f99702d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f99699a = NetworkUtils.NetworkType.UNKNOWN;
    }

    /* renamed from: b */
    private void m153079b() {
        if (this.f99700b == null) {
            synchronized (this) {
                if (this.f99700b == null) {
                    HandlerThread a = m153077a("NetworkStateManager");
                    this.f99700b = a;
                    a.start();
                    this.f99701c = new Handler(this.f99700b.getLooper());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo142127a(AbstractC38769a aVar) {
        if (aVar != null) {
            this.f99702d.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo142129b(AbstractC38769a aVar) {
        if (aVar != null) {
            this.f99702d.remove(aVar);
        }
    }

    /* renamed from: b */
    public void mo142128b(NetworkUtils.NetworkType networkType) {
        for (AbstractC38769a aVar : this.f99702d) {
            if (aVar != null) {
                aVar.onNetworkStateChange(networkType);
            }
        }
    }

    /* renamed from: a */
    public void mo142126a(final NetworkUtils.NetworkType networkType) {
        if (this.f99699a.getValue() != networkType.getValue() || this.f99699a == NetworkUtils.NetworkType.UNKNOWN) {
            this.f99699a = networkType;
            m153079b();
            this.f99701c.post(new Runnable() {
                /* class com.ss.android.lark.http.netstate.C38770b.RunnableC387711 */

                public void run() {
                    C38770b.this.mo142128b(networkType);
                }
            });
        }
    }
}
