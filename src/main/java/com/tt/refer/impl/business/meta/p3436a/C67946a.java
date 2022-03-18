package com.tt.refer.impl.business.meta.p3436a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.util.C67064v;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.MetaException;
import com.tt.refer.common.p3417c.C67746a;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetAppInfoGsonParser;
import com.tt.refer.impl.business.meta.GadgetSchema;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.meta.a.a */
public class C67946a extends AbstractC67806i<GadgetAppInfo> {

    /* renamed from: a */
    private IAppContext f171188a;

    public C67946a(IAppContext iAppContext) {
        this.f171188a = iAppContext;
    }

    /* renamed from: c */
    public GadgetAppInfo mo50346b(String str) throws MetaException {
        String str2;
        try {
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            String asString = asJsonObject.get("encryKey").getAsString();
            AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "local gadget meta parser key:", asString);
            String asString2 = asJsonObject.get("encryIV").getAsString();
            AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "local gadget meta parser value:", asString2);
            String asString3 = asJsonObject.get("value").getAsString();
            String asString4 = asJsonObject.get("lang").getAsString();
            boolean asBoolean = asJsonObject.get("from_preset").getAsBoolean();
            GadgetAppInfo decodeGadgetAppInfo = GadgetAppInfoGsonParser.decodeGadgetAppInfo(asString3);
            if (decodeGadgetAppInfo != null) {
                if (!TextUtils.isEmpty(decodeGadgetAppInfo.getExtra()) && TextUtils.isEmpty(decodeGadgetAppInfo.getDecodeExtra())) {
                    AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "decode extra app id:", decodeGadgetAppInfo.getIdentifier());
                    decodeGadgetAppInfo.setDecodeExtra(C67064v.m261368a(asString, asString2, decodeGadgetAppInfo.getExtra()));
                }
                if (!TextUtils.isEmpty(decodeGadgetAppInfo.getDecodeExtra())) {
                    try {
                        JSONObject jSONObject = new JSONObject(decodeGadgetAppInfo.getDecodeExtra());
                        if (jSONObject.has("web_app")) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("web_app");
                            decodeGadgetAppInfo.setWebMd5(optJSONObject.optString("md5"));
                            decodeGadgetAppInfo.setWebUrl(optJSONObject.optString("url"));
                            decodeGadgetAppInfo.setWebVersionCode(optJSONObject.optString("version_code"));
                        } else {
                            AppBrandLogger.m52830i("has no web app info!", new Object[0]);
                        }
                    } catch (JSONException unused) {
                        AppBrandLogger.m52829e("gadget_app_start_load_local_parser", "decode extra create json failed!");
                    }
                }
                if (!TextUtils.isEmpty(decodeGadgetAppInfo.getDomains()) && TextUtils.isEmpty(decodeGadgetAppInfo.getDecodeDomains())) {
                    AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "decode domains app id:", decodeGadgetAppInfo.getIdentifier());
                    decodeGadgetAppInfo.setDecodeDomains(C67064v.m261368a(asString, asString2, decodeGadgetAppInfo.getDomains()));
                }
                if (!TextUtils.isEmpty(decodeGadgetAppInfo.getMd5()) && TextUtils.isEmpty(decodeGadgetAppInfo.getDecodeMd5())) {
                    AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "decode md5 app id:", decodeGadgetAppInfo.getIdentifier());
                    decodeGadgetAppInfo.setDecodeMd5(C67064v.m261368a(asString, asString2, decodeGadgetAppInfo.getMd5()));
                }
                decodeGadgetAppInfo.setMetaSource(1);
                decodeGadgetAppInfo.setLanguage(asString4);
                decodeGadgetAppInfo.setFromPreset(asBoolean);
                AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "parser from local:", decodeGadgetAppInfo);
                if (!TextUtils.isEmpty(decodeGadgetAppInfo.getMd5()) && TextUtils.isEmpty(decodeGadgetAppInfo.getDecodeMd5())) {
                    try {
                        AppBrandLogger.m52830i("gadget_app_start_load_local_parser", "delete meta,appid:", decodeGadgetAppInfo.getIdentifier());
                        ((IAppMetaService) this.f171188a.findServiceByInterface(IAppMetaService.class)).mo235257b(this.f171188a.getApplicationContext(), new GadgetSchema.C67943Entity(decodeGadgetAppInfo.getAppId()));
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("gadget_app_start_load_local_parser", "delete meta failed:", e.getMessage(), "appid:", decodeGadgetAppInfo.getIdentifier());
                    }
                    new C67500a(C67746a.f170628p, this.f171188a).mo234325a(this.f171188a.getAppId()).setResultTypeFail().setErrorMessage("md5 aes decode failed!").flush();
                    return null;
                }
            }
            return decodeGadgetAppInfo;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(Log.getStackTraceString(e2));
            if (TextUtils.isEmpty(str)) {
                str2 = " empty json dta!";
            } else {
                str2 = str;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            Object[] objArr = new Object[1];
            StringBuilder sb3 = new StringBuilder();
            sb3.append("LocalGadgetMetaDataParser->error:");
            if (TextUtils.isEmpty(str)) {
                str = " empty json dta!";
            }
            sb3.append(str);
            objArr[0] = sb3.toString();
            AppBrandLogger.m52829e("gadget_app_start_load_local_parser", objArr);
            throw new MetaException(ErrorCode.META.UNKNOWN + "", sb2);
        }
    }
}
