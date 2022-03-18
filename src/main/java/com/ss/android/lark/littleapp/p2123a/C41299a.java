package com.ss.android.lark.littleapp.p2123a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import com.ss.android.lark.littleapp.C41354g;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.a.a */
public class C41299a extends AbstractC28490a<String> {

    /* renamed from: a */
    private static final AppType f105087a = AppType.WebGadgetAPP;

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("tabGadgetApp", "主导航小程序同构为普通小程序的 AB 实验", "machao.mc", "对Lark Android 侧主导航小程序同构为普通小程序进行 AB 实验");
    }

    /* renamed from: a */
    public static AppType m163737a() {
        if (C41354g.m163939a() == null) {
            AppBrandLogger.m52830i("TabGadgetAppExperiment", "dependency is null");
            return f105087a;
        }
        String str = (String) C41354g.m163939a().getAbTestValue(C41299a.class, true);
        if (!TextUtils.isEmpty(str)) {
            try {
                AppBrandLogger.m52828d("TabGadgetAppExperiment", "libraConfig:" + str);
                String optString = new JSONObject(str).optString("appType", f105087a.name());
                AppBrandLogger.m52830i("TabGadgetAppExperiment", "appTypeName:" + optString);
                return AppType.valueOf(optString);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("TabGadgetAppExperiment", "JSONException:" + str, e);
            }
        }
        return f105087a;
    }
}
