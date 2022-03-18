package com.bytedance.ee.bear.rn.p528a.p530b;

import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocRequest;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSNativeRequest;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSRequest;
import com.bytedance.ee.bear.rn.p528a.AbstractC10625a;
import com.bytedance.ee.bear.rn.p528a.p529a.AbstractC10630i;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.bytedance.ee.bear.rn.p528a.p529a.C10627d;
import com.bytedance.ee.bear.rn.p528a.p529a.C10628f;
import com.bytedance.ee.bear.rn.p528a.p529a.C10629g;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bridge.p597a.AbstractC12581a;
import com.bytedance.ee.bridge.p597a.AbstractC12592h;
import com.bytedance.ee.bridge.p597a.C12586f;
import com.bytedance.ee.bridge.p597a.C12593i;
import com.bytedance.ee.log.C13479a;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.rn.a.b.b */
public class C10632b implements C12586f.AbstractC12589a<AbstractC10630i> {

    /* renamed from: a */
    private C12593i f28551a;

    /* renamed from: b */
    private Set<AbstractC10631a> f28552b = new HashSet(1);

    /* renamed from: c */
    private AbstractC10625a f28553c;

    /* renamed from: d */
    private AbstractC5233x f28554d;

    /* renamed from: a */
    public void mo40291a(String str) {
        this.f28551a.mo47862a(str);
    }

    /* renamed from: a */
    public void mo40289a(AbstractC10631a aVar) {
        synchronized (this.f28552b) {
            if (aVar != null) {
                this.f28552b.add(aVar);
            }
        }
    }

    /* renamed from: g */
    private void m44149g() {
        m44146a((Consumer<String>) null, (Consumer<Throwable>) null);
    }

    /* renamed from: c */
    public void mo40295c() {
        this.f28551a.mo47869g();
    }

    /* renamed from: f */
    private void m44148f() {
        this.f28551a.mo47861a((C12586f.AbstractC12589a) this);
        this.f28551a.mo47859a();
    }

    /* renamed from: h */
    private void m44150h() {
        this.f28551a.mo47863b();
        this.f28551a.mo47864b(this);
    }

    /* renamed from: i */
    private List<AbstractC10631a> m44151i() {
        ArrayList arrayList;
        synchronized (this.f28552b) {
            arrayList = new ArrayList(this.f28552b);
        }
        return arrayList;
    }

    /* renamed from: j */
    private void m44152j() {
        for (AbstractC10631a aVar : m44151i()) {
            aVar.mo40281a();
        }
    }

    /* renamed from: k */
    private void m44153k() {
        for (AbstractC10631a aVar : m44151i()) {
            aVar.mo40282c();
        }
    }

    /* renamed from: b */
    public void mo40292b() {
        C13479a.m54764b("JSModelService-Docs", "JSModelService hashcode: " + hashCode() + "->stop");
        m44149g();
    }

    @Override // com.bytedance.ee.bridge.p597a.C12586f.AbstractC12589a
    /* renamed from: d */
    public void mo40297d() {
        C13479a.m54764b("JSModelService-Docs", "JSModelService hashcode: " + hashCode() + " jsClient connected");
        m44152j();
    }

    @Override // com.bytedance.ee.bridge.p597a.C12586f.AbstractC12589a
    /* renamed from: e */
    public void mo40299e() {
        C13479a.m54764b("JSModelService-Docs", "JSModelService hashcode: " + hashCode() + " jsClient disconnected");
        m44153k();
    }

    /* renamed from: a */
    public void mo40285a() {
        C13479a.m54764b("JSModelService-Docs", "JSModelService hashcode: " + hashCode() + "->start");
        m44148f();
    }

    /* renamed from: a */
    public void mo40286a(Activity activity) {
        this.f28551a.mo47860a(activity);
    }

    /* renamed from: b */
    public void mo40293b(AbstractC10631a aVar) {
        synchronized (this.f28552b) {
            this.f28552b.remove(aVar);
        }
    }

    /* renamed from: c */
    public void mo40296c(String str) {
        mo40287a(new JSNativeRequest(), str, -1, -1);
    }

    /* renamed from: b */
    public void mo40294b(String str) {
        JSNativeRequest eVar = new JSNativeRequest();
        eVar.mo40277b(str);
        this.f28551a.mo47858a((AbstractC12581a) eVar).mo47837a();
    }

    /* renamed from: d */
    public void mo40298d(String str) {
        JSDocRequest bVar = new JSDocRequest();
        bVar.mo40277b(str);
        this.f28551a.mo47858a((AbstractC12581a) bVar).mo47837a();
    }

    /* renamed from: e */
    public void mo40300e(String str) {
        m44144a(new JSDocRequest(), str, -1L, -1L).mo238036k();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m44147a(Exception exc) {
        if (exc != null && exc.getStackTrace() != null && exc.getMessage() != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exc.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("crash_message", exc.getMessage());
            hashMap.put("trace", stringWriter2);
            AbstractC5233x xVar = this.f28554d;
            if (xVar != null) {
                xVar.mo21079a("rn_exception", hashMap);
            }
            C13479a.m54761a("JSModelService-Docs", exc);
        }
    }

    /* renamed from: a */
    public void mo40290a(AbstractC10630i iVar) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long nanoTime = System.nanoTime();
        long currentTimeMillis = System.currentTimeMillis();
        if (iVar instanceof C10628f) {
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            long nanoTime2 = System.nanoTime();
            long currentTimeMillis2 = System.currentTimeMillis();
            C13479a.m54772d("JSModelService-Docs", "elapsedRealtimeNanos: " + (elapsedRealtimeNanos2 - elapsedRealtimeNanos) + " ns, nanoTime: " + (nanoTime2 - nanoTime) + " ns, currentTimeMillis: " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            this.f28553c.mo40265a((C10628f) iVar);
        } else if (iVar instanceof C10626c) {
            C10626c cVar = (C10626c) iVar;
            if (cVar.mo40273b()) {
                this.f28553c.mo40266a(iVar.mo40279c());
            } else {
                this.f28553c.mo40264a(cVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44145a(JSDocRequest bVar, final AbstractC68323g gVar) throws Exception {
        this.f28551a.mo47858a((AbstractC12581a) bVar).mo47838a(new AbstractC12592h<AbstractC10630i>() {
            /* class com.bytedance.ee.bear.rn.p528a.p530b.C10632b.C106342 */

            /* renamed from: a */
            public void mo40302a(AbstractC10630i iVar) {
                if (!gVar.isCancelled()) {
                    gVar.onNext(iVar.mo40279c());
                }
            }

            @Override // com.bytedance.ee.bridge.p597a.AbstractC12592h
            /* renamed from: a */
            public void mo40303a(String str, String str2) {
                C13479a.m54764b("JSModelService-Docs", "sendDocRequest()... commands-> + onError  ->code: " + str + " message: " + str2);
                if (!gVar.isCancelled()) {
                    gVar.onNext("{ \"errorMsg\": \"rn timeout\"}");
                }
            }
        });
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo40283a(String str, long j) {
        return m44144a(new JSDocRequest(), str, j, -1L);
    }

    /* renamed from: a */
    private void m44146a(Consumer<String> consumer, Consumer<Throwable> consumer2) {
        C13479a.m54764b("JSModelService-Docs", "JSModelService hashcode: " + hashCode() + "->doStopJSClient");
        m44150h();
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo40284a(String str, String str2) {
        JSDocRequest bVar = new JSDocRequest();
        bVar.mo40269a(str2);
        return m44144a(bVar, str, -1L, -1L);
    }

    /* renamed from: a */
    private AbstractC68307f<String> m44144a(JSDocRequest bVar, String str, long j, long j2) {
        bVar.mo40277b(str);
        bVar.mo47834b(j2);
        bVar.mo47833a(j);
        return AbstractC68307f.m265080a(new AbstractC68324h(bVar) {
            /* class com.bytedance.ee.bear.rn.p528a.p530b.$$Lambda$b$JFzACfHKsRf7dElIrNxtVqZI3xI */
            public final /* synthetic */ JSDocRequest f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C10632b.this.m44145a((C10632b) this.f$1, (JSDocRequest) gVar);
            }
        }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48477a()).mo237985a(C11678b.m48481e());
    }

    public C10632b(Application application, AbstractC5233x xVar, String str, AbstractC10625a aVar) {
        C12593i.C12595a aVar2 = new C12593i.C12595a();
        aVar2.mo47870a(application);
        aVar2.mo47874a(((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("rn_debug", false)).booleanValue());
        aVar2.mo47873a(str);
        aVar2.mo47871a(new C10629g());
        aVar2.mo47876b(new C10627d());
        aVar2.mo47872a(new NativeModuleCallExceptionHandler() {
            /* class com.bytedance.ee.bear.rn.p528a.p530b.$$Lambda$b$p03byCAeHoI3wyJtmB9hctCH4 */

            @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
            public final void handleException(Exception exc) {
                C10632b.this.m44147a((C10632b) exc);
            }
        });
        this.f28551a = aVar2.mo47875a();
        this.f28553c = aVar;
        this.f28554d = xVar;
    }

    /* renamed from: a */
    public void mo40287a(JSRequest hVar, String str, long j, long j2) {
        hVar.mo40277b(str);
        hVar.mo47834b(j2);
        hVar.mo47833a(j);
        this.f28551a.mo47858a((AbstractC12581a) hVar).mo47838a(new AbstractC12592h<AbstractC10630i>() {
            /* class com.bytedance.ee.bear.rn.p528a.p530b.C10632b.C106331 */

            /* renamed from: a */
            public void mo40302a(AbstractC10630i iVar) {
            }

            @Override // com.bytedance.ee.bridge.p597a.AbstractC12592h
            /* renamed from: a */
            public void mo40303a(String str, String str2) {
                C13479a.m54764b("JSModelService-Docs", "commands-> + onError  ->code: " + str + " message: " + str2);
                RnSyncManager.m44268a("dev_performance_rn_error", str, str2);
            }
        });
    }
}
