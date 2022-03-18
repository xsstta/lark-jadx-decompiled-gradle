package com.bytedance.ee.bear.integrator.di.configs.net;

import android.app.Application;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.DebugRequest;
import com.bytedance.ee.bear.contract.RequestCache;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.document.security.SecurityUtils;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69699e;
import okio.C69694c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/integrator/di/configs/net/PacketCaptureInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.b.a.b.b */
public final class PacketCaptureInterceptor implements Interceptor {

    /* renamed from: a */
    public static final Companion f21286a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m31625a() {
        return f21286a.mo30720a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/integrator/di/configs/net/PacketCaptureInterceptor$Companion;", "", "()V", "TAG", "", "appendInterceptIfAllow", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo30720a() {
            Application application = C13615c.f35773a;
            Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            boolean a = SecurityUtils.m23555a(application, d);
            boolean booleanValue = ((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("net_interceptable", false)).booleanValue();
            if (!a || !booleanValue) {
                return false;
            }
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String str;
        AbstractC69699e eVar;
        String str2;
        C69694c buffer;
        C69694c h;
        String readString;
        Intrinsics.checkParameterIsNotNull(chain, "chain");
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String url = request.url().url().toString();
            Intrinsics.checkExpressionValueIsNotNull(url, "request.url().url().toString()");
            Map<String, List<String>> multimap = request.headers().toMultimap();
            String header = proceed.header("x-tt-logid");
            if (header != null) {
                str = header;
            } else {
                str = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "response.header(\"x-tt-logid\") ?: \"\"");
            ResponseBody body = proceed.body();
            if (body != null) {
                eVar = body.source();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                eVar.request(Long.MAX_VALUE);
            }
            if (eVar == null || (buffer = eVar.getBuffer()) == null || (h = buffer.clone()) == null || (readString = h.readString(Charset.forName("UTF-8"))) == null) {
                str2 = "";
            } else {
                str2 = readString;
            }
            Map<String, List<String>> multimap2 = proceed.headers().toMultimap();
            Intrinsics.checkExpressionValueIsNotNull(multimap, "headers");
            Intrinsics.checkExpressionValueIsNotNull(multimap2, "responseHeader");
            RequestCache.f14808a.mo20218a(new DebugRequest(currentTimeMillis, url, multimap, str, multimap2, str2));
        } catch (Throwable th) {
            C13479a.m54761a("PacketCaptureInterceptor", th);
        }
        Intrinsics.checkExpressionValueIsNotNull(proceed, "response");
        return proceed;
    }
}
