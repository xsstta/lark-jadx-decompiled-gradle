package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.C20648b;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60509a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60904r;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.statistics.p3180a.C63688c;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/labs/effect/ImplNetWorker;", "Lcom/ss/android/ugc/effectmanager/common/listener/IEffectNetWorker;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Ljava/io/InputStream;", "request", "Lcom/ss/android/ugc/effectmanager/common/EffectRequest;", "effectRequest", "setHeaders", "", "Lcom/bytedance/retrofit2/client/Header;", "headerParams", "", "setRequestBody", "Lcom/bytedance/retrofit2/mime/FormUrlEncodedTypedOutput;", "bodyParams", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.f */
public final class ImplNetWorker implements AbstractC60509a {

    /* renamed from: a */
    private final String f156370a = "EffectNetWorker";

    /* renamed from: a */
    private final C20648b m243071a(Map<String, ? extends Object> map) {
        String json = new Gson().toJson(map);
        C20648b bVar = new C20648b();
        bVar.mo69480a("body", json);
        return bVar;
    }

    /* renamed from: b */
    private final List<Header> m243073b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Header(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8")));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60509a
    /* renamed from: a */
    public InputStream mo207187a(C60499b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "request");
        try {
            return m243072b(bVar);
        } catch (Exception e) {
            C60700b.m235864f(this.f156370a, "[execute]", e.getMessage());
            C63688c.m249673a("platform_sdk", -10000, bVar.mo207143a(), e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private final InputStream m243072b(C60499b bVar) throws Exception {
        C60700b.m235851b(this.f156370a, "[request]", bVar.mo207143a());
        Request.C20591a a = new Request.C20591a().mo69377a(bVar.mo207143a()).mo69376a(Integer.MAX_VALUE);
        Intrinsics.checkExpressionValueIsNotNull(a, "Request.Builder().url(ef….maxLength(Int.MAX_VALUE)");
        if (bVar.mo207149c() != null) {
            a = a.mo69379a(m243073b(bVar.mo207149c()));
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.headers(setHeaders(effectRequest.headers))");
        }
        if (Intrinsics.areEqual(bVar.mo207147b(), "GET")) {
            a = a.mo69375a();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.get()");
        } else if (bVar.mo207150d() != null) {
            String b = bVar.mo207147b();
            Map<String, Object> d = bVar.mo207150d();
            Intrinsics.checkExpressionValueIsNotNull(d, "effectRequest.params");
            a = a.mo69378a(b, m243071a(d));
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.method(effectReq…dy(effectRequest.params))");
        }
        Request b2 = a.mo69380b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "builder.build()");
        AbstractC60904r f = VideoChatModuleDependency.m236633f();
        Intrinsics.checkExpressionValueIsNotNull(f, "VideoChatModuleDependency.getHttpDependency()");
        AbstractC20594b a2 = f.mo196509b().mo51540a(b2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VideoChatModuleDependenc…all(\n            request)");
        Response a3 = a2.mo51523a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "call.execute()");
        if (a3.getStatus() != 200 || a3.getBody() == null) {
            C63688c.m249673a("platform_sdk", a3.getStatus(), bVar.mo207143a(), a3.getReason());
            return null;
        }
        bVar.mo207144a(a3.getBody().length());
        return a3.getBody().in();
    }
}
