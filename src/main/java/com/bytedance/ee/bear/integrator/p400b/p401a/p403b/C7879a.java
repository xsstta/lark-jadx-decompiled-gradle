package com.bytedance.ee.bear.integrator.p400b.p401a.p403b;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.C7708g;
import com.bytedance.ee.bear.integrator.p400b.p401a.p403b.C7879a;
import com.bytedance.ee.bear.net.AbstractC10272a;
import com.bytedance.ee.bear.net.AbstractC10278f;
import com.bytedance.ee.bear.net.AbstractC10289j;
import com.bytedance.ee.bear.net.AbstractC10295p;
import com.bytedance.ee.bear.net.AbstractC10300u;
import com.bytedance.ee.bear.net.C10279g;
import com.bytedance.ee.bear.net.C10298s;
import com.bytedance.ee.bear.net.C10299t;
import com.bytedance.ee.bear.net.CloudReqFun;
import com.bytedance.ee.bear.net.HeaderInterceptor;
import com.bytedance.ee.bear.net.HttpException;
import com.bytedance.ee.bear.net.ParseException;
import com.bytedance.ee.bear.net.ServerResultException;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.integrator.b.a.b.a */
public class C7879a implements NetService {

    /* renamed from: g */
    public static AbstractC10300u f21269g;

    /* renamed from: h */
    private static int f21270h;

    /* renamed from: a */
    public C10279g f21271a;

    /* renamed from: b */
    protected Application f21272b = C13615c.f35773a;

    /* renamed from: c */
    public ConnectionService f21273c = C5084ad.m20847d();

    /* renamed from: d */
    public long f21274d;

    /* renamed from: e */
    public long f21275e;

    /* renamed from: f */
    public ConnectionService.NetworkState f21276f;

    /* renamed from: i */
    private NetService.C5072a f21277i;

    /* renamed from: j */
    private al f21278j = C4511g.m18594d();

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: a */
    public NetService.C5072a mo20116a() {
        return this.f21277i;
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: b */
    public int mo20121b() {
        return f21270h;
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: c */
    public boolean mo20123c() {
        int i = f21270h;
        if (i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    public C7879a() {
        f21270h = this.f21278j.mo17370t();
        C13479a.m54764b("NetServiceImp", "lazyInit()...mEnv = " + f21270h);
        m31599e();
        m31598b(f21270h);
    }

    /* renamed from: e */
    private void m31599e() {
        this.f21275e = (long) ((Integer) C4211a.m17514a().mo16533a("carrier_timeout", (Object) 0)).intValue();
        this.f21274d = (long) ((Integer) C4211a.m17514a().mo16533a("wifi_timeout", (Object) 0)).intValue();
        this.f21276f = this.f21273c.mo20038b();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.integrator.p400b.p401a.p403b.C7879a.RunnableC78801 */

            public void run() {
                C7879a.this.f21273c.mo20037a().mo5925a(new AbstractC1178x<ConnectionService.NetworkState>() {
                    /* class com.bytedance.ee.bear.integrator.p400b.p401a.p403b.C7879a.RunnableC78801.C78811 */

                    /* renamed from: a */
                    public void onChanged(ConnectionService.NetworkState networkState) {
                        if (networkState != null) {
                            if (C7879a.this.f21271a != null && !C7879a.this.f21276f.mo20043d() && networkState.mo20043d()) {
                                C13479a.m54764b("NetServiceImp", "onChanged: NetworkState has switched to mobile, so rebuild okHttpClient, currentTimeout is " + C7879a.this.f21275e);
                                C7879a.this.f21271a.mo39285b().mo39307a(C7879a.this.f21275e);
                            } else if (C7879a.this.f21271a == null || C7879a.this.f21276f.mo20042c() || !networkState.mo20042c()) {
                                C7879a.this.f21276f = networkState;
                            } else {
                                C13479a.m54764b("NetServiceImp", "onChanged: NetworkState has switched to wifi, so rebuild okHttpClient, currentTimeout is " + C7879a.this.f21274d);
                                C7879a.this.f21271a.mo39285b().mo39307a(C7879a.this.f21274d);
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: d */
    public void mo20124d() {
        C13479a.m54764b("NetServiceImp", "onConfigChanged(): " + C13629i.m55307c(null));
        mo30711a(C4511g.m18594d().mo17370t());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.b.a$a */
    public static class C7883a implements HeaderInterceptor {

        /* renamed from: a */
        private NetService.AbstractC5073b f21283a;

        C7883a(NetService.AbstractC5073b bVar) {
            this.f21283a = bVar;
        }

        @Override // com.bytedance.ee.bear.net.HeaderInterceptor
        /* renamed from: a */
        public void mo30715a(Map<String, String> map) {
            NetService.AbstractC5073b bVar = this.f21283a;
            if (bVar != null) {
                bVar.mo20140a(map);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.b.a$b */
    public class C7884b implements AbstractC10278f {
        private C7884b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m31619a(Boolean bool) throws Exception {
            C13479a.m54764b("NetServiceImp", "accept: register success: " + bool);
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10278f
        /* renamed from: a */
        public void mo30716a(AbstractC10272a aVar) {
            String v = C4511g.m18594d().mo17372v();
            if (TextUtils.isEmpty(v)) {
                C13479a.m54775e("NetServiceImp", "token is null for check login.");
                aVar.mo39277a(false, null, null);
                return;
            }
            aVar.mo39277a(true, v, C4511g.m18594d().mo17356e());
            ((an) KoinJavaComponent.m268610a(an.class)).mo16396a(v).mo238001b($$Lambda$a$b$VeHJxvALx1NrdmRttfa77PdvRY.INSTANCE, $$Lambda$a$b$s42C3Rdhnu1I7nrR5y7QveGis94.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.b.a$c */
    public static class C7885c<R extends NetService.Result> implements AbstractC10295p<R> {

        /* renamed from: a */
        private NetService.AbstractC5074c<R> f21285a;

        C7885c(NetService.AbstractC5074c<R> cVar) {
            this.f21285a = cVar;
        }

        /* renamed from: a */
        public R mo30718b(String str) throws ParseException {
            try {
                return this.f21285a.parse(str);
            } catch (NetService.ParseException unused) {
                throw new ParseException();
            }
        }
    }

    /* renamed from: a */
    private <R extends NetService.Result> NetService.AbstractC5075d<R> m31596a(final C10298s<R> sVar) {
        return new NetService.AbstractC5075d<R>() {
            /* class com.bytedance.ee.bear.integrator.p400b.p401a.p403b.C7879a.C78822 */

            @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5075d
            /* renamed from: a */
            public AbstractC68307f<R> mo20141a(NetService.C5076e eVar) {
                return AbstractC68307f.m265080a(new AbstractC68324h() {
                    /* class com.bytedance.ee.bear.integrator.p400b.p401a.p403b.$$Lambda$a$2$9rnurGrSF3UPThOezEKQmLojsss */

                    @Override // io.reactivex.AbstractC68324h
                    public final void subscribe(AbstractC68323g gVar) {
                        C7879a.C78822.m31614a(AbstractC68307f.this, gVar);
                    }
                }, BackpressureStrategy.BUFFER);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m31614a(AbstractC68307f fVar, AbstractC68323g gVar) throws Exception {
                fVar.mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.integrator.p400b.p401a.p403b.$$Lambda$a$2$D63HjEyn07p4bNMNPMJ70Qcnbs */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7879a.C78822.m31615a(AbstractC68323g.this, (NetService.Result) obj);
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.integrator.p400b.p401a.p403b.$$Lambda$a$2$snRN8sV4CkidpIYKmNGudOHQJmM */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7879a.C78822.m31616a(AbstractC68323g.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m31615a(AbstractC68323g gVar, NetService.Result result) throws Exception {
                if (!gVar.isCancelled()) {
                    gVar.onNext(result);
                    gVar.onComplete();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m31616a(AbstractC68323g gVar, Throwable th) throws Exception {
                if (!gVar.isCancelled()) {
                    if (th instanceof ServerResultException) {
                        ServerResultException serverResultException = (ServerResultException) th;
                        gVar.onError(new NetService.ServerErrorException(serverResultException.getCode(), serverResultException.getMsg(), serverResultException.getData(), serverResultException.getJson()));
                    } else if (th instanceof CloudReqFun.OkHttpReqException) {
                        CloudReqFun.OkHttpReqException okHttpReqException = (CloudReqFun.OkHttpReqException) th;
                        if (okHttpReqException.exceptionObj instanceof HttpException) {
                            HttpException httpException = (HttpException) okHttpReqException.exceptionObj;
                            gVar.onError(new NetService.HttpErrorException(httpException.getCode(), httpException.getHttpStr()));
                        } else {
                            gVar.onError(th);
                        }
                    } else {
                        gVar.onError(th);
                    }
                    gVar.onComplete();
                }
            }
        };
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: a */
    public <R extends NetService.Result> NetService.AbstractC5075d<R> mo20117a(NetService.AbstractC5074c<R> cVar) {
        return mo30709a(cVar, (NetService.AbstractC5073b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.b.a$d */
    public static class C7886d implements AbstractC10300u {
        @Override // com.bytedance.ee.bear.net.AbstractC10300u
        /* renamed from: a */
        public void mo30719a(String str) {
            C13479a.m54775e("NetServiceImp", "token expired, log out.");
            if (C7879a.f21269g != null) {
                C7879a.f21269g.mo30719a(str);
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: a */
    public <R extends NetService.Result> NetService.AbstractC5075d<R> mo20118a(Type type) {
        return m31596a(this.f21271a.mo39283a(type));
    }

    /* renamed from: b */
    private void m31598b(int i) {
        long j;
        boolean z;
        f21270h = i;
        if (this.f21276f.mo20043d()) {
            j = this.f21275e;
        } else if (this.f21276f.mo20042c()) {
            j = this.f21274d;
        } else {
            j = 0;
        }
        C13479a.m54764b("NetServiceImp", "initNet: timeout = " + j);
        C10279g.C10280a a = new C10279g.C10280a().mo39286a(i);
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        C10279g.C10280a a2 = a.mo39292a(z).mo39288a(new C7884b()).mo39287a(j).mo39289a(new C7886d()).mo39290a(new C7708g());
        if (PacketCaptureInterceptor.m31625a()) {
            a2.mo39291a(new PacketCaptureInterceptor());
        }
        this.f21271a = a2.mo39293a();
        NetService.C5072a aVar = new NetService.C5072a();
        this.f21277i = aVar;
        aVar.f14784a = this.f21271a.mo39280a().mo39294a();
        NetService.C5072a aVar2 = this.f21277i;
        aVar2.f14786c = m31597a(aVar2.f14785b, f21270h);
        mo30712a(C4511g.m18594d().mo17362l());
        C13479a.m54764b("NetServiceImp", "initNet()...host = " + this.f21277i.f14784a + ", websocket url = " + this.f21277i.f14786c + ", env = " + f21270h);
    }

    /* renamed from: a */
    public AbstractC10289j mo30710a(NetService.C5076e eVar) {
        if (eVar.mo20142a() == null) {
            eVar.mo20144a(mo20116a().f14784a);
        }
        String b = eVar.mo20149b();
        if (eVar.mo20161j()) {
            b = C6313i.m25327a().mo25400h(eVar.mo20149b());
        }
        C10299t tVar = new C10299t(b);
        tVar.mo39320b(eVar.mo20142a());
        Map<String, String> d = eVar.mo20155d();
        if (d != null) {
            tVar.mo39319a(new HashMap(d));
        }
        Map<String, List<String>> f = eVar.mo20157f();
        if (f != null) {
            tVar.mo39325e(new HashMap(f));
        }
        if (!TextUtils.isEmpty(eVar.mo20158g())) {
            tVar.mo39322c(eVar.mo20158g());
        }
        Map<String, String> h = eVar.mo20159h();
        if (h != null) {
            tVar.mo39323c(h);
        }
        tVar.mo39324d(eVar.mo20160i());
        Map<String, String> e = eVar.mo20156e();
        if (e != null) {
            tVar.mo39321b(e);
        }
        if (eVar.mo20152c() == 2) {
            tVar.mo39318a(2);
        } else {
            tVar.mo39318a(1);
        }
        return tVar;
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: a */
    public Response mo20120a(Request request) {
        if (request == null) {
            return null;
        }
        try {
            return this.f21271a.mo39285b().mo39306a().newCall(request).execute();
        } catch (Exception e) {
            C13479a.m54764b("NetServiceImp", " sendRequestSync e: " + e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo30711a(int i) {
        C13479a.m54764b("NetServiceImp", "switchToEnv()...env = " + i);
        if (f21270h != i) {
            m31598b(i);
        }
    }

    /* renamed from: a */
    public void mo30712a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("https://")) {
                str = "https://" + str;
            }
            C13479a.m54764b("NetServiceImp", "changeHost: " + str);
            if (!TextUtils.equals(str, this.f21277i.f14784a)) {
                this.f21277i.f14784a = str;
                this.f21271a.mo39284a(str);
            }
        }
    }

    /* renamed from: a */
    public <R extends NetService.Result> NetService.AbstractC5075d<R> mo30709a(NetService.AbstractC5074c<R> cVar, NetService.AbstractC5073b bVar) {
        return m31596a(this.f21271a.mo39282a(new C7885c(cVar), new C7883a(bVar)));
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: b */
    public void mo20122b(Request request, Callback callback) {
        if (request != null && callback != null) {
            this.f21271a.mo39285b().mo39306a().newBuilder().build().newCall(request).enqueue(callback);
        }
    }

    /* renamed from: a */
    private String m31597a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            if (i == 2) {
                str = "internal-api.feishu-staging.cn";
            } else if (i == 5) {
                str = "internal-api.larksuite-staging.com";
            } else {
                str = "ccm-frontier.feishu.cn";
            }
        }
        return "wss://" + str + "/ws/v2";
    }

    @Override // com.bytedance.ee.bear.contract.NetService
    /* renamed from: a */
    public Call mo20119a(Request request, Callback callback) {
        if (request == null || callback == null) {
            return null;
        }
        Call newCall = this.f21271a.mo39285b().mo39306a().newCall(request);
        newCall.enqueue(callback);
        return newCall;
    }
}
