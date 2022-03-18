package com.tt.miniapp.audio;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.audio.c */
public class C65783c {

    /* renamed from: a */
    public String f165780a;

    /* renamed from: b */
    public String f165781b;

    /* renamed from: c */
    public int f165782c;

    /* renamed from: d */
    public boolean f165783d;

    /* renamed from: e */
    public long f165784e;

    /* renamed from: f */
    public boolean f165785f;

    /* renamed from: g */
    public boolean f165786g;

    /* renamed from: h */
    public boolean f165787h;

    /* renamed from: i */
    public int f165788i;

    /* renamed from: j */
    public float f165789j;

    /* renamed from: k */
    public boolean f165790k;

    /* renamed from: l */
    public String f165791l;

    /* renamed from: a */
    private static AbstractC67709b m257856a(IAppContext iAppContext) {
        return (AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class);
    }

    /* renamed from: b */
    private static AbstractC67709b.AbstractC67710a m257858b(IAppContext iAppContext) {
        return (AbstractC67709b.AbstractC67710a) m257856a(iAppContext).mo235130i();
    }

    /* renamed from: b */
    private static C65783c m257857b(String str, IAppContext iAppContext) throws Exception {
        AppBrandLogger.m52830i("tma_AudioStateModule", "standardParse");
        JSONObject jSONObject = new JSONObject(str);
        C65783c cVar = new C65783c();
        cVar.f165788i = jSONObject.optInt("audioId");
        cVar.f165780a = jSONObject.optString("src");
        cVar.f165781b = jSONObject.optString("encrypt_token");
        cVar.f165782c = jSONObject.optInt("startTime");
        cVar.f165783d = jSONObject.optBoolean("paused");
        cVar.f165784e = jSONObject.optLong("duration");
        cVar.f165785f = jSONObject.optBoolean("obeyMuteSwitch");
        cVar.f165786g = jSONObject.optBoolean("autoplay");
        cVar.f165787h = jSONObject.optBoolean("loop");
        cVar.f165789j = (float) jSONObject.optDouble("volume");
        return cVar;
    }

    /* renamed from: a */
    public static C65783c m257855a(String str, IAppContext iAppContext) throws Exception {
        if (TTFileHelper.m264259a("audio", iAppContext)) {
            return m257857b(str, iAppContext);
        }
        JSONObject jSONObject = new JSONObject(str);
        C65783c cVar = new C65783c();
        cVar.f165788i = jSONObject.optInt("audioId");
        cVar.f165780a = jSONObject.optString("src");
        cVar.f165781b = jSONObject.optString("encrypt_token");
        AppBrandLogger.m52828d("tma_AudioStateModule", "before ", cVar.f165780a);
        String waitExtractFinishIfNeeded = StreamLoader.waitExtractFinishIfNeeded(m257858b(iAppContext).mo235044c(cVar.f165780a), iAppContext);
        cVar.f165780a = waitExtractFinishIfNeeded;
        AppBrandLogger.m52828d("tma_AudioStateModule", "after ", waitExtractFinishIfNeeded);
        cVar.f165782c = jSONObject.optInt("startTime");
        cVar.f165783d = jSONObject.optBoolean("paused");
        cVar.f165784e = jSONObject.optLong("duration");
        cVar.f165785f = jSONObject.optBoolean("obeyMuteSwitch");
        cVar.f165786g = jSONObject.optBoolean("autoplay");
        cVar.f165787h = jSONObject.optBoolean("loop");
        cVar.f165789j = (float) jSONObject.optDouble("volume");
        return cVar;
    }
}
