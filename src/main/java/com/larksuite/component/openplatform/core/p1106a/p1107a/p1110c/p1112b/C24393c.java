package com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b;

import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12787e;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.core.block.C24410b;
import com.larksuite.component.openplatform.core.block.C24412d;
import com.larksuite.component.openplatform.core.block.C24417g;
import com.larksuite.component.openplatform.core.block.C24418h;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24388a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.sdk.SdkSender;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.c */
public class C24393c extends AbstractC24387a {

    /* renamed from: a */
    long f60200a;

    /* renamed from: e */
    private String m89013e() {
        return null;
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: a */
    public void mo87177a(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public String mo87181c() {
        return "STEP_GETBLOCKINFO";
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: c */
    public void mo87182c(IAppContext iAppContext, Bundle bundle) {
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: d */
    public boolean mo87183d() {
        return true;
    }

    /* renamed from: a */
    public void mo87184a(String str, IAppContext iAppContext, Bundle bundle, String str2, JSONObject jSONObject, C24412d dVar, boolean z) {
        AppBrandLogger.m52830i("CheckBlockInfoStep", "start request: " + jSONObject);
        if (!z) {
            new C24417g("op_block_guide_info_start", iAppContext).addCategoryValue("load_type", "async").flush();
        }
        SdkSender.C53233d<String> a = m89006a(str2, jSONObject);
        m89011a(str, iAppContext, bundle, jSONObject, dVar, z, a);
        AppBrandLogger.m52830i("CheckBlockInfoStep", "request result: " + a);
    }

    /* renamed from: f */
    private long m89014f() {
        return System.currentTimeMillis() - this.f60200a;
    }

    /* renamed from: g */
    private String m89015g() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        String lowerCase = new Locale(locale.getLanguage(), locale.getCountry()).toLanguageTag().replace("-", "_").toLowerCase();
        AppBrandLogger.m52830i("CheckBlockInfoStep", "origin locale = " + locale + " , after transform = " + lowerCase);
        return lowerCase;
    }

    /* renamed from: a */
    private String m89008a(String str) {
        return m89007a((C24388a) new Gson().fromJson(str, C24388a.class));
    }

    /* renamed from: a */
    private void m89009a(IAppContext iAppContext) {
        new C24417g("op_block_guide_info_result", iAppContext).setResultTypeFail().setDuration(m89014f()).addCategoryValue("cache", 0).addCategoryValue("load_type", "async").flush();
    }

    /* renamed from: a */
    private String m89007a(C24388a aVar) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (aVar.f60194b != null) {
            String g = m89015g();
            Map<String, String> map = aVar.f60194b.f60196a;
            if (map != null) {
                str3 = map.get(g);
                if (TextUtils.isEmpty(str3)) {
                    str3 = map.get("en_us");
                }
            } else {
                str3 = null;
            }
            List<C24388a.C24391c> list = aVar.f60194b.f60197b;
            if (list == null || list.size() <= 0) {
                str2 = null;
                str = null;
            } else {
                C24388a.C24391c cVar = list.get(0);
                Map<String, String> map2 = cVar.f60198a;
                if (map2 != null) {
                    String str5 = map2.get(g);
                    if (TextUtils.isEmpty(str3)) {
                        str5 = map2.get("en_us");
                    }
                    str4 = str5;
                }
                str = cVar.f60199b;
                str2 = str4;
            }
            str4 = str3;
        } else {
            str2 = null;
            str = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = m89013e();
        }
        C24410b bVar = new C24410b();
        bVar.f60239a = aVar.f60193a.f60195a;
        bVar.f60240b = str4;
        bVar.f60241c = str2;
        bVar.f60242d = str;
        return new Gson().toJson(bVar, C24410b.class);
    }

    /* renamed from: a */
    private SdkSender.C53233d<String> m89006a(String str, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + LarkExtensionManager.getInstance().getExtension().mo49565b());
        return SdkSender.syncSendMayError(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(str).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jSONObject.toString()), new SdkSender.IParser<String>() {
            /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24393c.C243952 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SendHttpResponse.ADAPTER.decode(bArr).json_body;
            }
        });
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a
    /* renamed from: b */
    public void mo87180b(IAppContext iAppContext, Bundle bundle) {
        this.f60200a = System.currentTimeMillis();
        if (!TextUtils.isEmpty(bundle.getString("preview_token"))) {
            mo87176a().mo87169b(this, iAppContext, bundle);
            return;
        }
        String string = bundle.getString("host");
        String string2 = bundle.getString(C24377a.f60157b);
        if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
            mo87176a().mo87166a(this, iAppContext, bundle, "-10004", "LAUNCH_SCHEDULER_STEP_LOADER_ILLEGAL_PARAMS ");
        } else {
            m89012a(string2, string, iAppContext, bundle);
        }
    }

    /* renamed from: a */
    private void m89010a(IAppContext iAppContext, Bundle bundle, SdkSender.C53233d<String> dVar) {
        mo87176a().mo87166a(this, iAppContext, bundle, "-10015", "GET_BLOCK_INFO_ERROR");
        C24417g gVar = new C24417g("mp_app_launch_result", C24418h.f60262l, mo87179b().mo87113d());
        if (dVar.f131573b != null) {
            gVar.setErrorMessage(dVar.f131573b.toString());
        }
        if (dVar.f131572a != null) {
            gVar.addCategoryValue("block_api_result", dVar.f131572a);
        }
        new C24417g("op_block_guide_info_result", iAppContext).setResultTypeFail().addCategoryValue("meta_cache", 0).flush();
    }

    /* renamed from: a */
    private void m89012a(final String str, String str2, final IAppContext iAppContext, final Bundle bundle) {
        final String format = String.format("https://%s/lark/app_interface/api/GetBlockGuideInfo", ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50475p());
        final JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        Object a = C12787e.m52853a(AppbrandContext.getInst().getApplicationContext());
        try {
            jSONObject.put("block_ids", jSONArray);
            jSONObject.put("host", str2);
            jSONObject.put("lark_version", a);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CheckBlockInfoStep", e);
        }
        final C24412d dVar = new C24412d();
        new C24417g("op_block_guide_info_start", iAppContext).addCategoryValue("load_type", "normal").flush();
        C24412d.C24413a a2 = dVar.mo87208a(iAppContext.getApplicationContext(), jSONObject.toString());
        if (a2.mo87211a()) {
            OPTrace tracingSpan = iAppContext.getTracingSpan();
            tracingSpan.mo92224i("CheckBlockInfoStep", "isCacheAvailable block available " + a2.mo87212b());
            long currentTimeMillis = System.currentTimeMillis() - this.f60200a;
            if (a2.mo87212b()) {
                mo87176a().mo87169b(this, iAppContext, bundle);
                new C24417g("op_block_guide_info_result", iAppContext).addCategoryValue("cache", 1).addCategoryValue("load_type", "normal").setResultTypeSuccess().setDuration(currentTimeMillis).flush();
            } else {
                mo87176a().mo87166a(this, iAppContext, bundle, "-10016", m89008a(a2.mo87213c()));
                new C24417g("op_block_guide_info_result", iAppContext).addCategoryValue("cache", 1).addCategoryValue("load_type", "normal").setResultTypeFail().flush();
            }
            C67554l.m262725b().execute(new Runnable() {
                /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24393c.RunnableC243941 */

                public void run() {
                    C24393c.this.mo87184a(str, iAppContext, bundle, format, jSONObject, dVar, false);
                }
            });
            return;
        }
        iAppContext.getTracingSpan().mo92224i("CheckBlockInfoStep", "isCacheAvailable no ");
        mo87184a(str, iAppContext, bundle, format, jSONObject, dVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m89011a(java.lang.String r19, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r20, android.os.Bundle r21, org.json.JSONObject r22, com.larksuite.component.openplatform.core.block.C24412d r23, boolean r24, com.ss.android.lark.sdk.SdkSender.C53233d<java.lang.String> r25) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b.C24393c.m89011a(java.lang.String, com.bytedance.ee.lark.infra.sandbox.context.IAppContext, android.os.Bundle, org.json.JSONObject, com.larksuite.component.openplatform.core.block.d, boolean, com.ss.android.lark.sdk.SdkSender$d):void");
    }
}
