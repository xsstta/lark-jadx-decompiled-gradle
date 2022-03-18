package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C22741m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.internal.ac */
public final class C22622ac<T extends IInterface> {

    /* renamed from: a */
    private static final Map<String, Handler> f56005a = new HashMap();

    /* renamed from: b */
    private final Context f56006b;

    /* renamed from: c */
    private final C22630b f56007c;

    /* renamed from: d */
    private final String f56008d;

    /* renamed from: e */
    private final List<AbstractRunnableC22634c> f56009e = new ArrayList();

    /* renamed from: f */
    private boolean f56010f;

    /* renamed from: g */
    private final Intent f56011g;

    /* renamed from: h */
    private final AbstractC22642k<T> f56012h;

    /* renamed from: i */
    private final WeakReference<AbstractC22639h> f56013i;

    /* renamed from: j */
    private final IBinder.DeathRecipient f56014j = new C22635d(this);

    /* renamed from: k */
    private ServiceConnection f56015k;

    /* renamed from: l */
    private T f56016l;

    public C22622ac(Context context, C22630b bVar, String str, Intent intent, AbstractC22642k<T> kVar) {
        this.f56006b = context;
        this.f56007c = bVar;
        this.f56008d = str;
        this.f56011g = intent;
        this.f56012h = kVar;
        this.f56013i = new WeakReference<>(null);
    }

    /* renamed from: a */
    static /* synthetic */ void m82230a(C22622ac acVar, AbstractRunnableC22634c cVar) {
        if (acVar.f56016l == null && !acVar.f56010f) {
            acVar.f56007c.mo78874c("Initiate binding to the service.", new Object[0]);
            acVar.f56009e.add(cVar);
            ServiceConnectionC22621ab abVar = new ServiceConnectionC22621ab(acVar);
            acVar.f56015k = abVar;
            acVar.f56010f = true;
            if (!acVar.f56006b.bindService(acVar.f56011g, abVar, 1)) {
                acVar.f56007c.mo78874c("Failed to bind to the service.", new Object[0]);
                acVar.f56010f = false;
                List<AbstractRunnableC22634c> list = acVar.f56009e;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C22741m<?> b = list.get(i).mo78910b();
                    if (b != null) {
                        b.mo79091b((Exception) new al());
                    }
                }
                acVar.f56009e.clear();
            }
        } else if (acVar.f56010f) {
            acVar.f56007c.mo78874c("Waiting to bind to the service.", new Object[0]);
            acVar.f56009e.add(cVar);
        } else {
            cVar.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m82233b(AbstractRunnableC22634c cVar) {
        Handler handler;
        Map<String, Handler> map = f56005a;
        synchronized (map) {
            if (!map.containsKey(this.f56008d)) {
                HandlerThread handlerThread = new HandlerThread(this.f56008d, 10);
                handlerThread.start();
                map.put(this.f56008d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f56008d);
        }
        handler.post(cVar);
    }

    /* renamed from: f */
    static /* synthetic */ void m82237f(C22622ac acVar) {
        acVar.f56007c.mo78874c("linkToDeath", new Object[0]);
        try {
            acVar.f56016l.asBinder().linkToDeath(acVar.f56014j, 0);
        } catch (RemoteException e) {
            acVar.f56007c.mo78872a(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m82239h(C22622ac acVar) {
        acVar.f56007c.mo78874c("unlinkToDeath", new Object[0]);
        acVar.f56016l.asBinder().unlinkToDeath(acVar.f56014j, 0);
    }

    /* renamed from: a */
    public final void mo78858a() {
        m82233b(new C22638g(this));
    }

    /* renamed from: a */
    public final void mo78859a(AbstractRunnableC22634c cVar) {
        m82233b(new C22637f(this, cVar.mo78910b(), cVar));
    }

    /* renamed from: b */
    public final T mo78860b() {
        return this.f56016l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo78861c() {
        this.f56007c.mo78874c("reportBinderDeath", new Object[0]);
        AbstractC22639h hVar = this.f56013i.get();
        if (hVar == null) {
            this.f56007c.mo78874c("%s : Binder has died.", this.f56008d);
            List<AbstractRunnableC22634c> list = this.f56009e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C22741m<?> b = list.get(i).mo78910b();
                if (b != null) {
                    b.mo79091b((Exception) (Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f56008d).concat(" : Binder has died."))));
                }
            }
            this.f56009e.clear();
            return;
        }
        this.f56007c.mo78874c("calling onBinderDied", new Object[0]);
        hVar.mo78942a();
    }
}
