package com.tt.miniapp.audio.background;

import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.audio.C65783c;
import com.tt.miniapp.audio.C65784d;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.C67522b;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tt.miniapp.audio.background.b */
public class C65775b {

    /* renamed from: a */
    public List<AbstractC65782c> f165760a = new ArrayList();

    /* renamed from: b */
    public int f165761b = -1;

    /* renamed from: c */
    public volatile C65780a f165762c;

    /* renamed from: d */
    public final C65784d f165763d = new C65784d(true, new AbstractC65746a.AbstractC65749c() {
        /* class com.tt.miniapp.audio.background.C65775b.C657761 */

        @Override // com.tt.miniapp.audio.AbstractC65746a.AbstractC65749c
        /* renamed from: a */
        public void mo230386a(int i, String str) {
            C65775b.this.mo230438a(i, str);
        }
    });

    /* renamed from: e */
    public boolean f165764e;

    /* renamed from: f */
    private AtomicInteger f165765f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f165766g = false;

    /* renamed from: h */
    private SparseArray<C65780a> f165767h = new SparseArray<>();

    /* renamed from: i */
    private RunnableC65781b f165768i = new RunnableC65781b();

    /* renamed from: j */
    private AtomicBoolean f165769j = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.audio.background.b$b */
    public class RunnableC65781b implements Runnable {
        /* renamed from: b */
        public void mo230453b() {
            C67866g.m264031b(this);
        }

        /* renamed from: a */
        public void mo230452a() {
            C67866g.m264031b(this);
            C67866g.m264027a(this);
        }

        public void run() {
            if (C65775b.this.f165762c == null) {
                C67866g.m264028a(this, 1000);
                return;
            }
            AbstractC65746a.C65747a a = C65775b.this.f165763d.mo230375a(C65775b.this.f165762c.f165774a, (C67522b) null);
            if (a == null || a.f165657e == 0) {
                C67866g.m264028a(this, 1000);
                return;
            }
            int i = (int) ((a.f165656d * 100) / a.f165657e);
            if (i > 100) {
                i = 100;
            }
            C65775b.this.f165762c.mo230447a(i);
            C67866g.m264028a(this, 1000);
        }

        private RunnableC65781b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.audio.background.b$a */
    public class C65780a {

        /* renamed from: a */
        public final int f165774a;

        /* renamed from: b */
        public BgAudioCallExtra f165775b;

        /* renamed from: c */
        public BgAudioModel f165776c;

        /* renamed from: d */
        public AbstractC65782c f165777d;

        /* renamed from: a */
        public String mo230446a() {
            BgAudioCallExtra bgAudioCallExtra = this.f165775b;
            if (bgAudioCallExtra != null) {
                return bgAudioCallExtra.f165723b;
            }
            return null;
        }

        /* renamed from: b */
        public void mo230450b() {
            boolean z;
            if (C65775b.this.f165762c == this) {
                C65775b.this.f165762c = null;
                z = true;
            } else {
                z = false;
            }
            AbstractC65782c cVar = this.f165777d;
            if (cVar != null) {
                cVar.mo230457a(this.f165776c, z);
            }
            synchronized (C65775b.class) {
                int size = C65775b.this.f165760a.size();
                for (int i = 0; i < size; i++) {
                    C65775b.this.f165760a.get(i).mo230457a(this.f165776c, z);
                }
            }
        }

        public String toString() {
            return "{mAudioId: " + this.f165774a + ", mBgAudioCallExtra: " + this.f165775b + ", mBgAudioModel: " + this.f165776c + ", mBgAudioPlayStateListener:" + this.f165777d + "}";
        }

        /* renamed from: a */
        public void mo230447a(int i) {
            AbstractC65782c cVar = this.f165777d;
            if (cVar != null) {
                cVar.mo230455a(i, this.f165776c);
            }
            synchronized (C65775b.class) {
                int size = C65775b.this.f165760a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C65775b.this.f165760a.get(i2).mo230455a(i, this.f165776c);
                }
            }
        }

        /* renamed from: a */
        public void mo230448a(BgAudioModel bgAudioModel) {
            this.f165776c = bgAudioModel;
            C65775b.this.f165762c = this;
            AbstractC65782c cVar = this.f165777d;
            if (cVar != null) {
                cVar.mo230456a(this.f165776c);
            }
            synchronized (C65775b.class) {
                int size = C65775b.this.f165760a.size();
                for (int i = 0; i < size; i++) {
                    C65775b.this.f165760a.get(i).mo230456a(this.f165776c);
                }
            }
        }

        /* renamed from: a */
        public void mo230449a(String str) {
            boolean z;
            if (C65775b.this.f165762c == this) {
                z = true;
            } else {
                z = false;
            }
            AbstractC65782c cVar = this.f165777d;
            if (cVar != null) {
                cVar.mo230458a(str, this.f165776c, z);
            }
            synchronized (C65775b.class) {
                int size = C65775b.this.f165760a.size();
                for (int i = 0; i < size; i++) {
                    C65775b.this.f165760a.get(i).mo230458a(str, this.f165776c, z);
                }
            }
        }

        private C65780a(int i) {
            this.f165774a = i;
        }
    }

    /* renamed from: a */
    public static C65775b m257829a() {
        return ContextSingletonInstance.getInstance().getBgAudioManagerServiceNative();
    }

    /* renamed from: b */
    private void m257830b() {
        if (!this.f165769j.compareAndSet(false, true)) {
            AppBrandLogger.m52828d("BgAudioManagerServiceNative", "isListeningPhoneState");
            return;
        }
        AppBrandLogger.m52828d("BgAudioManagerServiceNative", "startListenPhoneState");
        C67866g.m264022a(new Runnable() {
            /* class com.tt.miniapp.audio.background.C65775b.RunnableC657783 */

            public void run() {
                Looper.prepare();
                ((TelephonyManager) AppbrandContext.getInst().getApplicationContext().getSystemService("phone")).listen(new PhoneStateListener() {
                    /* class com.tt.miniapp.audio.background.C65775b.RunnableC657783.C657791 */

                    public void onCallStateChanged(int i, String str) {
                        if (i == 0) {
                            if (C65775b.this.f165761b >= 0 && C65775b.this.f165764e) {
                                C65775b.this.f165763d.f165792b = true;
                                C65775b.this.f165763d.f165793c = C65775b.this.f165761b;
                                C65775b.this.f165763d.mo230377a(C65775b.this.f165761b, (AbstractC65746a.AbstractC65751e) null);
                            }
                            C65775b.this.f165764e = false;
                        } else if (i == 1) {
                            C65775b.this.f165764e = true;
                        }
                        super.onCallStateChanged(i, str);
                    }
                }, 32);
                Looper.loop();
            }
        }, "BgListenerPhoneState").start();
    }

    public C65775b() {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (iAppSandboxEnvProcessor != null) {
                iAppSandboxEnvProcessor.registerSandboxLifeListener(new SandboxMonitor.AbstractC66610a() {
                    /* class com.tt.miniapp.audio.background.C65775b.C657772 */

                    @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
                    public void onAlive(ISandboxEnvInfo iSandboxEnvInfo) {
                    }

                    @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
                    public void onDied(ISandboxEnvInfo iSandboxEnvInfo) {
                        C65775b.this.mo230439a(iSandboxEnvInfo.getSandboxName());
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo230434a(int i) {
        this.f165763d.mo230377a(i, (AbstractC65746a.AbstractC65751e) null);
    }

    /* renamed from: b */
    public void mo230440b(int i) {
        this.f165761b = -1;
        this.f165763d.mo230380b(i, (AbstractC65746a.AbstractC65751e) null);
    }

    /* renamed from: c */
    public void mo230441c(int i) {
        this.f165761b = -1;
        this.f165763d.mo230383c(i, null);
    }

    /* renamed from: f */
    private synchronized C65780a m257831f(int i) {
        C65780a aVar = this.f165767h.get(i);
        if (aVar != null) {
            return aVar;
        }
        C65780a aVar2 = new C65780a(i);
        this.f165767h.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: d */
    public BgAudioState mo230442d(int i) {
        AbstractC65746a.C65747a a = this.f165763d.mo230375a(i, (C67522b) null);
        if (a == null) {
            return null;
        }
        BgAudioState bgAudioState = new BgAudioState();
        bgAudioState.f165736a = (int) a.f165657e;
        bgAudioState.f165737b = (int) a.f165656d;
        bgAudioState.f165738c = a.f165655c;
        bgAudioState.f165739d = a.f165659g;
        bgAudioState.f165740e = Math.round(a.f165662j);
        return bgAudioState;
    }

    /* renamed from: e */
    public boolean mo230443e(int i) {
        String a = m257831f(i).mo230446a();
        if (a == null) {
            return false;
        }
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (TextUtils.equals(iAppSandboxEnvProcessor.getPlayingBgAudioProcessName(), a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo230439a(String str) {
        AppBrandLogger.m52828d("BgAudioManagerServiceNative", "onProcessDied processName:", str);
        int size = this.f165767h.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C65780a valueAt = this.f165767h.valueAt(i);
            if (TextUtils.equals(valueAt.mo230446a(), str)) {
                AppBrandLogger.m52828d("BgAudioManagerServiceNative", "onBgPlayProcessDied processName:", str);
                this.f165763d.mo230460a(valueAt.f165774a);
                valueAt.mo230450b();
                this.f165767h.removeAt(i);
                break;
            }
            i++;
        }
    }

    /* renamed from: a */
    public synchronized int mo230433a(int i, BgAudioCallExtra bgAudioCallExtra) {
        m257830b();
        if (this.f165763d.mo230465b(i)) {
            return i;
        }
        int incrementAndGet = this.f165765f.incrementAndGet();
        m257831f(incrementAndGet).f165775b = bgAudioCallExtra;
        return incrementAndGet;
    }

    /* renamed from: a */
    public void mo230435a(int i, int i2) {
        this.f165763d.mo230376a(i, i2, (AbstractC65746a.AbstractC65751e) null);
    }

    /* renamed from: a */
    public void mo230436a(int i, BgAudioModel bgAudioModel) {
        AppBrandLogger.m52828d("BgAudioManagerServiceNative", "setAudioModel model:", bgAudioModel);
        if (bgAudioModel != null) {
            m257831f(i).mo230448a(bgAudioModel);
            C65783c cVar = new C65783c();
            cVar.f165788i = i;
            cVar.f165780a = bgAudioModel.f165725a;
            this.f165763d.mo230461a(i, (AbstractC65746a.AbstractC65751e) null, true);
            this.f165763d.mo230464a(i, (C67522b) null, true);
            cVar.f165782c = bgAudioModel.f165726b;
            cVar.f165786g = true;
            cVar.f165787h = bgAudioModel.f165728d;
            cVar.f165785f = bgAudioModel.f165729e;
            cVar.f165789j = bgAudioModel.f165730f;
            cVar.f165790k = true;
            cVar.f165791l = bgAudioModel.f165735k;
            try {
                this.f165763d.mo230378a(cVar, (AbstractC65746a.AbstractC65751e) null);
            } catch (Exception e) {
                AppBrandLogger.m52829e("BgAudioManagerServiceNative", "", e);
            }
        }
    }

    /* renamed from: a */
    public void mo230437a(int i, AbstractC65782c cVar) {
        AppBrandLogger.m52828d("BgAudioManagerServiceNative", "register id:", Integer.valueOf(i), "listener:", cVar);
        m257831f(i).f165777d = cVar;
    }

    /* renamed from: a */
    public synchronized void mo230438a(int i, String str) {
        char c = 0;
        AppBrandLogger.m52830i("BgAudioManagerServiceNative", "onEvent state", str, "audioId", Integer.valueOf(i));
        C65780a f = m257831f(i);
        switch (str.hashCode()) {
            case -906224361:
                if (str.equals("seeked")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3443508:
                if (str.equals("play")) {
                    break;
                }
                c = 65535;
                break;
            case 550609668:
                if (str.equals("canplay")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1971820138:
                if (str.equals("seeking")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.f165761b = i;
            this.f165762c = f;
            for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                if (iAppSandboxEnvProcessor != null) {
                    iAppSandboxEnvProcessor.setPlayingBgAudioProcessName(f.mo230446a());
                }
            }
            this.f165768i.mo230452a();
        } else if (!(c == 1 || c == 2 || c == 3)) {
            if (!this.f165766g) {
                for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor2 : C66645a.m260337a().mo232359b()) {
                    if (iAppSandboxEnvProcessor2 != null) {
                        iAppSandboxEnvProcessor2.setPlayingBgAudioProcessName(null);
                    }
                }
            }
            this.f165768i.mo230453b();
        }
        f.mo230449a(str);
    }
}
