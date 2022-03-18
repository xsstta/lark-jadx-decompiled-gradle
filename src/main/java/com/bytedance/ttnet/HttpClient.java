package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.AbstractC13978a;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.AbstractC14025e;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.tnc.TNCManager;
import com.bytedance.ttnet.utils.C20793d;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.IOException;
import java.net.MalformedURLException;

public class HttpClient {
    static final C20718a CRONET_IMPL = new C20718a();
    static final C20720c OK3_IMPL = new C20720c();
    static volatile boolean sCronetBootSucceed;
    static String sCronetExceptionMessage;
    private static volatile AbstractC20719b sHttpClientConfig;
    static boolean sIsCronetException;

    /* renamed from: com.bytedance.ttnet.HttpClient$b */
    public interface AbstractC20719b {
        /* renamed from: f */
        boolean mo69956f();
    }

    /* renamed from: com.bytedance.ttnet.HttpClient$c */
    private static class C20720c {
        private C20720c() {
        }

        /* renamed from: a */
        public AbstractC13978a mo69955a() {
            Context a = TTNetInit.getTTNetDepend().mo69984a();
            C14055o a2 = C14055o.m56884a(a);
            if (C14089g.m57048b(a)) {
                a2.mo51724a((AbstractC14025e) TNCManager.m75687b());
            }
            return a2;
        }
    }

    public static String getCronetExceptionMessage() {
        return sCronetExceptionMessage;
    }

    /* renamed from: com.bytedance.ttnet.HttpClient$a */
    private static class C20718a extends C20720c {
        private C20718a() {
            super();
        }

        @Override // com.bytedance.ttnet.HttpClient.C20720c
        /* renamed from: a */
        public AbstractC13978a mo69955a() {
            return C20721d.m75517a(C13998f.m56620a(TTNetInit.getTTNetDepend().mo69984a()));
        }
    }

    public static boolean isCronetClientEnable() {
        if (sHttpClientConfig == null) {
            C14055o.m56892a(9);
            return false;
        } else if (!sHttpClientConfig.mo69956f()) {
            return false;
        } else {
            if (!TTNetInit.getTTNetDepend().mo69991b()) {
                C14055o.m56892a(6);
                return false;
            } else if (!sIsCronetException || sCronetBootSucceed) {
                return true;
            } else {
                C14055o.m56892a(7);
                C14055o.m56896a(sCronetExceptionMessage);
                return false;
            }
        }
    }

    public static void setCronetBootSucceed(boolean z) {
        sCronetBootSucceed = z;
    }

    public static void setHttpClientConfig(AbstractC20719b bVar) {
        sHttpClientConfig = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ttnet.HttpClient$d */
    public static class C20721d implements AbstractC13978a {

        /* renamed from: a */
        private static volatile C20721d f50688a;

        /* renamed from: b */
        private C13998f f50689b;

        /* renamed from: c */
        private volatile int f50690c;

        private C20721d(C13998f fVar) {
            this.f50689b = fVar;
        }

        /* renamed from: a */
        public static C20721d m75517a(C13998f fVar) {
            if (f50688a == null) {
                synchronized (C20721d.class) {
                    if (f50688a == null) {
                        f50688a = new C20721d(fVar);
                    }
                }
            }
            return f50688a;
        }

        @Override // com.bytedance.retrofit2.client.AbstractC20592a
        /* renamed from: a */
        public AbstractC20594b mo51540a(Request request) throws IOException {
            try {
                return this.f50689b.mo51540a(request);
            } catch (Throwable th) {
                m75518a(th);
                TTNetInit.notifyColdStartFinish();
                return HttpClient.OK3_IMPL.mo69955a().mo51540a(request);
            }
        }

        /* renamed from: a */
        private void m75518a(Throwable th) {
            if (!(th instanceof MalformedURLException)) {
                if ((th.getMessage() == null || !th.getMessage().contains("MalformedURLException")) && TTNetInitMetrics.m56573b().mo51511a()) {
                    int i = this.f50690c + 1;
                    this.f50690c = i;
                    if (i > 3) {
                        HttpClient.sIsCronetException = true;
                        HttpClient.sCronetExceptionMessage = C20793d.m75743a(th);
                        if (HttpClient.sCronetExceptionMessage.length() > 256) {
                            HttpClient.sCronetExceptionMessage = HttpClient.sCronetExceptionMessage.substring(0, DynamicModule.f58006b);
                        }
                    }
                }
            }
        }
    }

    public static AbstractC13978a getHttpClient(String str) {
        if (isCronetClientEnable()) {
            return CRONET_IMPL.mo69955a();
        }
        return OK3_IMPL.mo69955a();
    }
}
