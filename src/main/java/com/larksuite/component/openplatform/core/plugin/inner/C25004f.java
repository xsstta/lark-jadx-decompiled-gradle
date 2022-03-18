package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.f */
public class C25004f extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "reportAnalytics";
    }

    public C25004f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.inner.f$1 */
    public static /* synthetic */ class C250051 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61113a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.inner.C25004f.C250051.f61113a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25004f.C250051.f61113a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25004f.C250051.f61113a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25004f.C250051.f61113a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.UnKnown     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.inner.C25004f.C250051.f61113a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.inner.C25004f.C250051.<clinit>():void");
        }
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            String optString = jSONObject.optString("event");
            if (TextUtils.isEmpty(optString)) {
                AppBrandLogger.m52829e("tma_reportAnalytics", "event is empty");
                return mo232451b(ApiCallResultHelper.generateIllegalParamExtraInfo("event"));
            } else if (optString.length() >= 85) {
                AppBrandLogger.m52829e("tma_reportAnalytics", "event length > MAX");
                return mo232451b("event.length must be less than 85");
            } else {
                JSONObject optJSONObject = jSONObject.optJSONObject("value");
                String jSONObject2 = optJSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    AppBrandLogger.m52829e("tma_reportAnalytics", "value is empty");
                    return mo232451b(ApiCallResultHelper.generateIllegalParamExtraInfo("value"));
                } else if (jSONObject2.length() >= 294912) {
                    AppBrandLogger.m52829e("tma_reportAnalytics", "value length > MAX");
                    return mo232451b("data.length must be less than 294912");
                } else {
                    int optInt = jSONObject.optInt(ShareHitPoint.f121869d, 0);
                    AppBrandLogger.m52828d("tma_reportAnalytics", "event=", optString, "&value=", jSONObject2);
                    if (optInt == 1 && C67432a.m262319a(mo232455f()).getAppInfo().innertype == 1) {
                        AppBrandLogger.m52829e("tma_reportAnalytics", "do not handle");
                    } else {
                        optJSONObject.put("app_id", C67432a.m262319a(mo232455f()).getAppInfo().appId);
                        optJSONObject.put("mp_name", C67432a.m262319a(mo232455f()).getAppInfo().appName);
                        if (C67432a.m262319a(mo232455f()).getAppInfo().isGame()) {
                            str = "micro_game";
                        } else {
                            str = "micro_app";
                        }
                        optJSONObject.put("_param_for_special", str);
                        optString = m90267a(optString);
                    }
                    AppBrandLogger.m52828d("tma_reportAnalytics", "event", optString, "params", optJSONObject.toString());
                    C67556a.m262937a(optString, optJSONObject, 6);
                    return mo232456g();
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_reportAnalytics", e);
            return mo232445a(e);
        }
    }

    public C25004f(String str) {
        super(str);
    }

    /* renamed from: a */
    private String m90267a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = C250051.f61113a[mo232455f().getAppType().ordinal()];
        String str2 = "micro_app";
        if (i == 1) {
            stringBuffer.append(str2);
        } else if (i == 2) {
            stringBuffer.append("web_app");
        } else if (i == 3) {
            stringBuffer.append("blockit_app");
        } else if (i == 4) {
            stringBuffer.append("unknow_app");
        } else if (i != 5) {
            if (C67432a.m262319a(mo232455f()).getAppInfo().isGame()) {
                str2 = "micro_game";
            }
            stringBuffer.append(str2);
        } else {
            stringBuffer.append("card_app");
        }
        stringBuffer.append("_");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
