package com.tt.refer.impl.business.meta.p3436a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.manager.appinfo.C66411c;
import com.tt.miniapp.util.C67064v;
import com.tt.refer.common.meta.fetch.AbstractC67797a;
import com.tt.refer.common.meta.fetch.MetaException;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetAppInfoGsonParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.meta.a.b */
public class C67947b extends AbstractC67797a<List<GadgetAppInfo>> {

    /* renamed from: a */
    private C66411c f171189a;

    @Override // com.tt.refer.common.meta.fetch.AbstractC67802f, com.tt.refer.common.meta.fetch.AbstractC67806i
    /* renamed from: a */
    public void mo235304a(C66411c cVar) {
        this.f171189a = cVar;
    }

    /* renamed from: c */
    public List<GadgetAppInfo> mo50346b(String str) throws MetaException {
        String str2;
        if (str != null) {
            try {
                ArrayList arrayList = new ArrayList();
                GadgetAppInfo decodeGadgetAppInfo = GadgetAppInfoGsonParser.decodeGadgetAppInfo(str);
                decodeGadgetAppInfo.setMetaSource(2);
                if (decodeGadgetAppInfo != null) {
                    if (this.f171189a != null) {
                        if (!TextUtils.isEmpty(decodeGadgetAppInfo.getExtra())) {
                            decodeGadgetAppInfo.setDecodeExtra(C67064v.m261368a(this.f171189a.f167668a, this.f171189a.f167669b, decodeGadgetAppInfo.getExtra()));
                            try {
                                JSONObject jSONObject = new JSONObject(decodeGadgetAppInfo.getDecodeExtra());
                                if (jSONObject.has("web_app")) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("web_app");
                                    decodeGadgetAppInfo.setWebMd5(optJSONObject.optString("md5"));
                                    decodeGadgetAppInfo.setWebUrl(optJSONObject.optString("url"));
                                    decodeGadgetAppInfo.setWebVersionCode(optJSONObject.optString("version_code"));
                                } else {
                                    AppBrandLogger.m52830i("net has no web app info!", new Object[0]);
                                }
                            } catch (JSONException unused) {
                                AppBrandLogger.m52829e("app_start_load_meta_gadget_v2", "decode extra create json failed!");
                            }
                        }
                        if (!TextUtils.isEmpty(decodeGadgetAppInfo.getDomains())) {
                            decodeGadgetAppInfo.setDecodeDomains(C67064v.m261368a(this.f171189a.f167668a, this.f171189a.f167669b, decodeGadgetAppInfo.getDomains()));
                        }
                        if (!TextUtils.isEmpty(decodeGadgetAppInfo.getMd5())) {
                            decodeGadgetAppInfo.setDecodeMd5(C67064v.m261368a(this.f171189a.f167668a, this.f171189a.f167669b, decodeGadgetAppInfo.getMd5()));
                        }
                    }
                    arrayList.add(decodeGadgetAppInfo);
                    AppBrandLogger.m52830i("app_start_load_meta_gadget_v2", "GadgetMetaNetDataParser->onParser:", decodeGadgetAppInfo);
                }
                return arrayList;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append(Log.getStackTraceString(e));
                if (TextUtils.isEmpty(str)) {
                    str2 = " empty json dta!";
                } else {
                    str2 = str;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                Object[] objArr = new Object[1];
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getAppMetaSync->onParser error:");
                if (TextUtils.isEmpty(str)) {
                    str = " empty json dta!";
                }
                sb3.append(str);
                objArr[0] = sb3.toString();
                AppBrandLogger.m52829e("app_start_load_meta_gadget_v2", objArr);
                throw new MetaException(ErrorCode.META.UNKNOWN + "", sb2);
            }
        } else {
            AppBrandLogger.m52829e("app_start_load_meta_gadget_v2", "GadgetMetaNetDataParser->onParser:meta data info is null!");
            throw new MetaException(ErrorCode.META.NULL.getCode(), ErrorCode.META.NULL.getDesc());
        }
    }
}
