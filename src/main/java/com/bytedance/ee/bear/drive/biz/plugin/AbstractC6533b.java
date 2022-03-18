package com.bytedance.ee.bear.drive.biz.plugin;

import android.content.Context;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.services.AbstractC7197n;
import com.bytedance.ee.bear.drive.services.BinderIPluginUpdateCallback;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.PluginManager;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.ee.bear.drive.biz.plugin.b */
public abstract class AbstractC6533b {

    /* renamed from: b */
    public String f17982b = mo26079b();

    /* renamed from: c */
    protected AtomicBoolean f17983c = new AtomicBoolean(false);

    /* renamed from: d */
    protected AtomicBoolean f17984d = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26212a(AbstractC7197n nVar) throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26077a(Class cls) throws Throwable;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo26078a(C6923a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo26079b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo26080b(C6923a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo26081c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo26082d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo26083e();

    /* renamed from: i */
    public Context mo26099i() {
        return C13615c.f35773a;
    }

    /* renamed from: h */
    public boolean mo26098h() {
        return this.f17984d.get();
    }

    /* renamed from: j */
    public boolean mo26100j() {
        return this.f17983c.get();
    }

    /* renamed from: a */
    private void m26210a() {
        if (mo26101k() && !mo26100j()) {
            C13479a.m54764b(this.f17982b, "checkInit, do init. ");
            mo26084f();
        }
    }

    /* renamed from: f */
    public void mo26084f() {
        try {
            m26214d(C6920b.m27342f().mo27168c());
        } catch (Exception e) {
            C13479a.m54761a(this.f17982b, e);
        }
    }

    /* renamed from: k */
    public boolean mo26101k() {
        if (mo26082d()) {
            return C6534c.m26233b(mo26079b());
        }
        C13479a.m54758a(this.f17982b, "isInstalled() isPkgCanUsePlugin is false, return false.");
        return false;
    }

    /* renamed from: l */
    public boolean mo26102l() {
        if (mo26082d()) {
            return C6534c.m26235d(mo26079b());
        }
        C13479a.m54758a(this.f17982b, "isInstalled() isPkgCanUsePlugin is false, return false.");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26213a(Throwable th) throws Exception {
        C13479a.m54759a(this.f17982b, "checkInstallPlugin() error ", th);
    }

    /* renamed from: a */
    public void mo26096a(C10917c cVar) {
        String str;
        if (!mo26082d()) {
            String str2 = this.f17982b;
            StringBuilder sb = new StringBuilder();
            sb.append("checkInstallPlugin() isPkgCanUsePlugin=false, ignore install Plugin , pkg=");
            if (C13615c.f35773a == null) {
                str = "";
            } else {
                str = C13615c.f35773a.getPackageName();
            }
            sb.append(str);
            C13479a.m54775e(str2, sb.toString());
        } else if (this.f17984d.get()) {
            C13479a.m54775e(this.f17982b, "checkInstallPlugin, but current sNetInitFalseUninstalled=true, ignore checkInstallPlugin");
        } else {
            C13479a.m54764b(this.f17982b, "checkInstallPlugin start onPluginUpdate");
            cVar.mo41505a(AbstractC7197n.class, C11678b.m48479c()).mo238005b((Consumer) new Consumer(new DriveBasePlugin$1(this)) {
                /* class com.bytedance.ee.bear.drive.biz.plugin.$$Lambda$b$S5eaCmDTfVowSkKTGz3vllsw7RM */
                public final /* synthetic */ BinderIPluginUpdateCallback f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC6533b.this.m26211a(this.f$1, (AbstractC7197n) obj);
                }
            }).mo238001b($$Lambda$b$alYGNZ3AsvYMzwG5PCMvolUoQPE.INSTANCE, new Consumer() {
                /* class com.bytedance.ee.bear.drive.biz.plugin.$$Lambda$b$6Yj628EwAnPUBfbK73k_fsN4_ds */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC6533b.this.m26213a((AbstractC6533b) ((Throwable) obj));
                }
            });
        }
    }

    /* renamed from: c */
    public boolean mo26097c(C6923a aVar) {
        m26210a();
        boolean j = mo26100j();
        boolean e = mo26083e();
        boolean d = mo26082d();
        boolean z = this.f17984d.get();
        String str = this.f17982b;
        StringBuilder sb = new StringBuilder();
        sb.append(mo26079b());
        sb.append(" isActiveState():  isInit=");
        sb.append(j);
        sb.append(" isPkgCanUsePlugin=");
        sb.append(d);
        sb.append(" isPluginEnable=");
        sb.append(e);
        sb.append(" netInitFalseUninstalled is false?=");
        sb.append(!z);
        C13479a.m54764b(str, sb.toString());
        if (!j || !d || !e || z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private synchronized void m26214d(C6923a aVar) {
        if (this.f17983c.get()) {
            C13479a.m54764b(this.f17982b, "sHasInit is true, ignore init");
        } else if (this.f17984d.get()) {
            C13479a.m54764b(this.f17982b, "sNetInitFalseUninstalled is true, ignore init");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (!mo26082d()) {
                    C13479a.m54764b(this.f17982b, "init isPkgCanUsePlugin=false, ignore init");
                } else if (!mo26083e()) {
                    C13479a.m54764b(this.f17982b, "init isPluginStateEnable=false, ignore init");
                } else if (!mo26078a(aVar)) {
                    C13479a.m54764b(this.f17982b, "init isFGEnable=false, ignore init");
                } else if (mo26099i() == null) {
                    C13479a.m54758a(this.f17982b, "pluginContext is null");
                } else {
                    boolean d = C6534c.m26235d(mo26079b());
                    String str = this.f17982b;
                    C13479a.m54764b(str, "isPluginLoaded=" + d);
                    if (!d) {
                        C13479a.m54772d(this.f17982b, "init isPluginLoaded=false");
                        boolean e = C6534c.m26236e(mo26079b());
                        String str2 = this.f17982b;
                        C13479a.m54772d(str2, "init loadSuccess=" + e);
                        if (!e) {
                            String str3 = this.f17982b;
                            C13479a.m54758a(str3, "init return loadSuccess=" + e);
                            return;
                        }
                    }
                    C13479a.m54764b(this.f17982b, "init start");
                    ClassLoader c = C6534c.m26234c(mo26079b());
                    if (c == null) {
                        C13479a.m54758a(this.f17982b, "pluginClassLoader is null");
                        return;
                    }
                    mo26077a(c.loadClass(mo26081c()));
                    boolean b = mo26080b(aVar);
                    if (!b) {
                        C13479a.m54758a(this.f17982b, "uninstallSuccess false!!!, try uninstall plugin....");
                        boolean f = C6534c.m26237f(mo26079b());
                        String str4 = this.f17982b;
                        C13479a.m54764b(str4, "uninstallSuccess false, uninstall result=" + f);
                        this.f17984d.set(f);
                    }
                    this.f17983c.set(b);
                    String str5 = this.f17982b;
                    C13479a.m54764b(str5, "init end, cost time = " + (System.currentTimeMillis() - currentTimeMillis) + " thread=" + Thread.currentThread() + " success=" + b + " pluginApiVersion=" + PluginManager.getPluginApiVersion());
                }
            } catch (Throwable th) {
                C13479a.m54761a(this.f17982b, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26211a(BinderIPluginUpdateCallback binderIPluginUpdateCallback, AbstractC7197n nVar) throws Exception {
        nVar.onPluginUpdate(mo26079b(), binderIPluginUpdateCallback);
    }
}
