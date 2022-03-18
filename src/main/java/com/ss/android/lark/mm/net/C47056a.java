package com.ss.android.lark.mm.net;

import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.error.MmCommonLocalErrorHandler;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.Map;

/* renamed from: com.ss.android.lark.mm.net.a */
public class C47056a {
    /* renamed from: a */
    private static HttpHeaders m186228a() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("app-id", C45899c.m181859a().getHostDepend().mo144634b());
        httpHeaders.put("m-version", C45899c.m181859a().getHostDepend().mo144637e());
        httpHeaders.put("m-locale", C45899c.m181859a().getHostDepend().mo144635c());
        httpHeaders.put("device-id", C45899c.m181859a().getHostDepend().mo144630a());
        httpHeaders.put(ConvertOfficeToSpaceService.f88309g, "session=" + C45899c.m181859a().getLoginDepend().mo144652d());
        httpHeaders.put("user-agent", C45899c.m181859a().getHostDepend().mo144638f());
        httpHeaders.put("request-id", C45899c.m181859a().getHostDepend().mo144631a("pro"));
        httpHeaders.put("platform", "android");
        C45855f.m181663b("MmHttpExecutor", "buildHeaders " + httpHeaders);
        return httpHeaders;
    }

    /* renamed from: b */
    public static void m186233b(C47066b bVar, AbstractC47070c cVar) {
        m186230a(bVar, cVar, null);
    }

    /* renamed from: a */
    public static void m186229a(C47066b bVar, AbstractC47070c cVar) {
        m186230a(bVar, cVar, new MmCommonLocalErrorHandler());
    }

    /* renamed from: a */
    public static void m186230a(C47066b bVar, AbstractC47070c cVar, IHttpLocalErrorHandler aVar) {
        if (bVar.f118450a == HttpMethod.GET) {
            m186231a(bVar.f118451b, bVar.f118452c, bVar.f118453d, cVar, aVar);
        } else if (bVar.f118450a == HttpMethod.POST) {
            m186232a(bVar.f118451b, bVar.f118452c, bVar.f118453d, bVar.f118454e, cVar, aVar);
        }
    }

    /* renamed from: a */
    private static void m186231a(String str, String str2, Map<String, String> map, AbstractC47070c cVar, IHttpLocalErrorHandler aVar) {
        C45899c.m181859a().getHttpExecutorDepend().mo144626a(str, str2, map, m186228a(), cVar, aVar);
    }

    /* renamed from: a */
    private static void m186232a(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC47070c cVar, IHttpLocalErrorHandler aVar) {
        C45899c.m181859a().getHttpExecutorDepend().mo144628a(str, str2, map, map2, m186228a(), cVar, aVar);
    }
}
