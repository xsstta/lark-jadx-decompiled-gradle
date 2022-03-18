package com.ss.android.lark.leanmode.p2121c;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.AbstractC29621n;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.leanmode.impl.C41271a;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.leanmode.c.a */
public class C41249a implements Observer {

    /* renamed from: a */
    private List<AbstractC29621n> f105022a;

    /* renamed from: com.ss.android.lark.leanmode.c.a$a */
    public static final class C41251a {

        /* renamed from: a */
        public static final C41249a f105023a = new C41249a();
    }

    /* renamed from: a */
    public static C41249a m163558a() {
        return C41251a.f105023a;
    }

    private C41249a() {
        this.f105022a = new CopyOnWriteArrayList();
        C41271a.m163643j().addObserver(this);
    }

    /* renamed from: b */
    public void mo148607b(AbstractC29621n nVar) {
        if (nVar != null) {
            this.f105022a.remove(nVar);
        }
    }

    /* renamed from: a */
    private void m163559a(boolean z) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(z) {
            /* class com.ss.android.lark.leanmode.p2121c.$$Lambda$a$ASMX7Z5dgCh_zpeJD56I28Mok6E */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C41249a.lambda$ASMX7Z5dgCh_zpeJD56I28Mok6E(C41249a.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m163560b(boolean z) {
        for (AbstractC29621n nVar : this.f105022a) {
            nVar.mo106730a(z);
        }
    }

    /* renamed from: a */
    public void mo148606a(AbstractC29621n nVar) {
        if (nVar != null && !this.f105022a.contains(nVar)) {
            this.f105022a.add(nVar);
        }
    }

    public void update(Observable observable, Object obj) {
        if (obj == null) {
            Log.m165389i("LeanModeChangeManager", "update called. leaMode is null.");
            return;
        }
        LeanMode leanMode = (LeanMode) obj;
        Log.m165389i("LeanModeChangeManager", "update called. leaMode:" + leanMode.isDeviceInLeanMode());
        m163559a(leanMode.isDeviceInLeanMode());
    }
}
