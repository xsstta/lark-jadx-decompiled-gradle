package com.bytedance.ee.bear.net;

import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudReqFun implements Function<C10288i, AbstractC68307f<C10292m>> {

    /* renamed from: a */
    public C10291l f27740a;

    /* renamed from: b */
    private HeaderInterceptor f27741b;

    /* renamed from: com.bytedance.ee.bear.net.CloudReqFun$a */
    public static class C10271a implements AbstractC10289j {

        /* renamed from: a */
        private final C10288i f27746a;

        @Override // com.bytedance.ee.bear.net.AbstractC10289j
        /* renamed from: a */
        public String mo39257a() {
            return this.f27746a.mo39298a().mo39257a();
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10289j
        /* renamed from: b */
        public int mo39258b() {
            return this.f27746a.mo39298a().mo39258b();
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10289j
        /* renamed from: c */
        public Map<String, String> mo39259c() {
            return this.f27746a.mo39298a().mo39259c();
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10289j
        /* renamed from: e */
        public Map<String, List<String>> mo39261e() {
            return this.f27746a.mo39298a().mo39261e();
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10289j
        /* renamed from: f */
        public String mo39262f() {
            return this.f27746a.mo39298a().mo39262f();
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10289j
        /* renamed from: d */
        public Map<String, String> mo39260d() {
            Map<String, String> d = this.f27746a.mo39298a().mo39260d();
            if (d == null) {
                d = new HashMap<>();
            }
            if (this.f27746a.mo39303b()) {
                d.put("Env", "Pre_release");
            }
            d.putAll(this.f27746a.mo39304c());
            return d;
        }

        public C10271a(C10288i iVar) {
            this.f27746a = iVar;
        }
    }

    /* renamed from: a */
    public AbstractC68307f<C10292m> apply(final C10288i iVar) throws Exception {
        AbstractC68307f<C10292m> a = AbstractC68307f.m265080a(new AbstractC68324h<C10292m>() {
            /* class com.bytedance.ee.bear.net.CloudReqFun.C102691 */

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(final AbstractC68323g<C10292m> gVar) throws Exception {
                new C10290k(CloudReqFun.this.f27740a, new AbstractC10297r() {
                    /* class com.bytedance.ee.bear.net.CloudReqFun.C102691.C102701 */

                    @Override // com.bytedance.ee.bear.net.AbstractC10297r
                    /* renamed from: a */
                    public void mo39254a(int i) {
                    }

                    @Override // com.bytedance.ee.bear.net.AbstractC10297r
                    /* renamed from: a */
                    public void mo39255a(C10292m mVar) {
                        gVar.onNext(mVar);
                        gVar.onComplete();
                    }

                    @Override // com.bytedance.ee.bear.net.AbstractC10297r
                    /* renamed from: a */
                    public void mo39256a(Exception exc) {
                        if (!gVar.isCancelled()) {
                            gVar.onError(new OkHttpReqException(exc));
                            gVar.onComplete();
                        }
                    }
                }).mo39305a(new C10271a(iVar));
            }
        }, BackpressureStrategy.BUFFER);
        HeaderInterceptor eVar = this.f27741b;
        if (eVar != null) {
            eVar.mo30715a(iVar.mo39304c());
        }
        return a;
    }

    public static class OkHttpReqException extends Exception {
        public String exception;
        public Exception exceptionObj;

        public OkHttpReqException(Exception exc) {
            super("OkHttp request error. e = " + exc);
            this.exception = exc.getClass().getName();
            this.exceptionObj = exc;
        }
    }

    CloudReqFun(C10291l lVar, HeaderInterceptor eVar) {
        this.f27740a = lVar;
        this.f27741b = eVar;
    }
}
