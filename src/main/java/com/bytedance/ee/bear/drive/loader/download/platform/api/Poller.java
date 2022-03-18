package com.bytedance.ee.bear.drive.loader.download.platform.api;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d;
import com.bytedance.ee.bear.drive.loader.download.platform.api.Poller;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.android.HwBuildEx;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

public class Poller<PARAMS, RESULT> implements AbstractC7065d<PARAMS, RESULT> {

    /* renamed from: a */
    public final AbstractC7064c<PARAMS, RESULT> f18999a;

    /* renamed from: b */
    public AbstractC7054c f19000b;

    /* renamed from: c */
    public C68289a f19001c = new C68289a();

    /* renamed from: d */
    public volatile RESULT f19002d;

    /* renamed from: e */
    public volatile RESULT f19003e;

    /* renamed from: f */
    public volatile Throwable f19004f = null;

    /* renamed from: g */
    private final AbstractC7053b<RESULT> f19005g;

    /* renamed from: h */
    private final AbstractC7052a<RESULT> f19006h;

    /* renamed from: i */
    private C7055d f19007i;

    /* renamed from: j */
    private RnPushProtocol f19008j;

    /* renamed from: k */
    private C7073g f19009k = new C7073g();

    /* renamed from: l */
    private AbstractC7065d.AbstractC7066a f19010l;

    public static class Body implements Serializable {
        public String data;
    }

    public static class Data implements Serializable {
        public Body body;
    }

    public static class Result implements Serializable {
        public Data data;
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.Poller$a */
    public interface AbstractC7052a<RESULT> {
        /* renamed from: a */
        int mo27601a(RESULT result);
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.Poller$b */
    public interface AbstractC7053b<RESULT> {
        /* renamed from: a */
        boolean mo27599a(RESULT result);
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.Poller$c */
    public interface AbstractC7054c {
        /* renamed from: a */
        boolean mo27602a(String str);
    }

    /* renamed from: a */
    public static boolean m28069a(int i, int i2) {
        return (i == 9 && i2 == 0) || i == i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ DefinitionParameters m28070b() {
        return C70039b.m268661a(this.f19007i.f19016a, this.f19007i.f19017b);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d
    /* renamed from: a */
    public void mo27629a() {
        if (this.f19009k.mo27656f()) {
            C13479a.m54764b("DrivePlatform_Poller", "shutdown poller, clear disposable and unregister push.");
            C68289a aVar = this.f19001c;
            if (aVar != null) {
                aVar.mo237935a();
            }
            RnPushProtocol rnPushProtocol = this.f19008j;
            if (rnPushProtocol != null) {
                rnPushProtocol.mo40241a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d
    /* renamed from: a */
    public void mo27631a(AbstractC7065d.AbstractC7066a aVar) {
        this.f19010l = aVar;
    }

    /* renamed from: a */
    private int m28068a(int i) {
        if (i > 0) {
            return i;
        }
        C13479a.m54764b("DrivePlatform_Poller", "get pull intervals return less than 0, use default pull intervals.");
        return HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    }

    /* renamed from: a */
    public String mo27628a(String str) {
        Result result;
        C13479a.m54764b("DrivePlatform_Poller", "receive json from push, json: " + str);
        try {
            result = (Result) JSON.parseObject(str, Result.class);
        } catch (Exception unused) {
            C13479a.m54758a("DrivePlatform_Poller", "parse json from push failed.");
            result = null;
        }
        if (result == null || result.data == null || result.data.body == null || result.data.body.data == null) {
            return null;
        }
        return result.data.body.data;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7065d
    /* renamed from: a */
    public RESULT mo27627a(final PARAMS params) throws Throwable {
        boolean z = false;
        C13479a.m54764b("DrivePlatform_Poller", String.format("===> poller start, %s poll start.", this.f18999a.getClass().getName()));
        RESULT d = this.f18999a.mo26542a(params).mo238023d();
        if (d == null) {
            C13479a.m54758a("DrivePlatform_Poller", "===> poller end, the first request failed, result is null.");
            return null;
        }
        boolean a = this.f19005g.mo27599a(d);
        int a2 = m28068a(this.f19006h.mo27601a(d));
        if (a) {
            C13479a.m54764b("DrivePlatform_Poller", "===> poller end, the first request check passed.");
            return d;
        }
        this.f19009k.mo27655e();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(a2);
        if (this.f19007i != null) {
            z = true;
        }
        objArr[1] = String.valueOf(z);
        C13479a.m54764b("DrivePlatform_Poller", String.format("the first request check unPassed, pull per %d milliseconds, register push: %s", objArr));
        AbstractC7065d.AbstractC7066a aVar = this.f19010l;
        if (aVar != null) {
            aVar.onPollingStart();
        }
        if (this.f19007i != null) {
            RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
                /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$Poller$cc3G9l75Cn_9dwM935BsYBAw */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Poller.this.m28070b();
                }
            });
            this.f19008j = rnPushProtocol;
            rnPushProtocol.mo40242a(new RnPushProtocol.AbstractC10622a() {
                /* class com.bytedance.ee.bear.drive.loader.download.platform.api.Poller.C70491 */

                /* access modifiers changed from: private */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
                /* JADX WARN: Multi-variable type inference failed */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m28077a(Object obj) throws Exception {
                    Poller.this.f19002d = obj;
                    Poller poller = Poller.this;
                    poller.mo27632a((Object) poller.f19002d, true);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: com.bytedance.ee.bear.drive.loader.download.platform.api.c<PARAMS, RESULT> */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
                public void didReceivePush(String str) {
                    String a = Poller.this.mo27628a(str);
                    if (Poller.this.f19000b != null && a != null && Poller.this.f19000b.mo27602a(a)) {
                        Poller.this.f18999a.mo26542a(params).mo238001b(new Consumer() {
                            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$Poller$1$2KYWMoLLjjtX9n0f6bj1TZXYvGo */

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                Poller.C70491.this.m28077a((Poller.C70491) obj);
                            }
                        }, $$Lambda$Poller$1$YEAkGSkX9ANrAR4evDDFkOzKAFA.INSTANCE);
                    }
                }
            });
        }
        this.f19001c.mo237937a(AbstractC68307f.m265073a(1, (long) a2, TimeUnit.MILLISECONDS).mo238004b(C11678b.m48479c()).mo238001b(new Consumer<Long>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.Poller.C70502 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.drive.loader.download.platform.api.c<PARAMS, RESULT> */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public void accept(Long l) throws Exception {
                if (!Poller.this.f19001c.isDisposed()) {
                    Poller poller = Poller.this;
                    poller.f19003e = (RESULT) poller.f18999a.mo26542a(params).mo238023d();
                    Poller poller2 = Poller.this;
                    poller2.mo27632a((Object) poller2.f19003e, false);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.Poller.C70513 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54758a("DrivePlatform_Poller", "pull failed, throwable: " + th);
                Poller.this.f19004f = th;
                Poller.this.mo27629a();
            }
        }));
        C13479a.m54764b("DrivePlatform_Poller", "thread id: " + Thread.currentThread().getId() + " go sleeping.");
        this.f19009k.mo27657g();
        C13479a.m54764b("DrivePlatform_Poller", "thread id: " + Thread.currentThread().getId() + " has wake up.");
        if (this.f19009k.mo27651a()) {
            mo27629a();
            C13479a.m54764b("DrivePlatform_Poller", "===> poller end, push result is ready, return result from push.");
            return this.f19002d;
        } else if (this.f19009k.mo27652b()) {
            mo27629a();
            C13479a.m54764b("DrivePlatform_Poller", "===> poller end, pull result is ready, return result from pull.");
            return this.f19003e;
        } else if (this.f19004f == null) {
            return null;
        } else {
            Throwable th = this.f19004f;
            this.f19004f = null;
            throw th;
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.Poller$d */
    public static class C7055d {

        /* renamed from: a */
        public final String f19016a;

        /* renamed from: b */
        public final String f19017b;

        public C7055d(String str, String str2) {
            this.f19016a = str;
            this.f19017b = str2;
        }
    }

    /* renamed from: a */
    public void mo27630a(C7055d dVar, AbstractC7054c cVar) {
        this.f19007i = dVar;
        this.f19000b = cVar;
    }

    /* renamed from: a */
    public void mo27632a(RESULT result, boolean z) {
        String str;
        if (z) {
            str = "push ";
        } else {
            str = "pull";
        }
        if (result == null) {
            C13479a.m54758a("DrivePlatform_Poller", "handle result failed, result is null, result from: " + str);
            return;
        }
        if (this.f19005g.mo27599a(result)) {
            C13479a.m54764b("DrivePlatform_Poller", "handle result success, check passed, result from: " + str);
            if (z) {
                this.f19009k.mo27653c();
            } else {
                this.f19009k.mo27654d();
            }
            C13479a.m54764b("DrivePlatform_Poller", "try to wake poller thread up.");
            this.f19009k.mo27658h();
        }
        C13479a.m54764b("DrivePlatform_Poller", "handle result failed, check unPassed & waiting for next time, result from: " + str);
    }

    public Poller(AbstractC7064c<PARAMS, RESULT> cVar, AbstractC7053b<RESULT> bVar, AbstractC7052a<RESULT> aVar) {
        this.f18999a = cVar;
        this.f19005g = bVar;
        this.f19006h = aVar;
    }
}
