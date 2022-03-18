package com.ss.android.lark.openplatform.webapp.p2408c.p2409a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.ss.android.lark.openplatform.webapp.p2408c.AbstractC48875a;

/* renamed from: com.ss.android.lark.openplatform.webapp.c.a.a */
public class C48876a implements AbstractC48875a {
    @Override // com.ss.android.lark.openplatform.webapp.p2408c.AbstractC48875a
    /* renamed from: a */
    public WebAppContainerDelegate mo170697a() {
        return new WebAppContainerDelegate();
    }

    @Override // com.ss.android.lark.openplatform.webapp.p2408c.AbstractC48875a
    /* renamed from: a */
    public boolean mo170698a(String str, String str2, boolean z) {
        if (z) {
            Logger.m15173i("WebAppServiceImpl", "WebAppServiceImpl isWebApp so can open the app");
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            Logger.m15173i("WebAppServiceImpl", "WebAppServiceImpl appId is not empty so can open the app");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            try {
                if (TextUtils.isEmpty(Uri.parse(str).getQueryParameter("app_id"))) {
                    return false;
                }
            } catch (Exception e) {
                Logger.m15171e("WebAppServiceImpl", "WebAppServiceImpl query app_id exception , ", e);
            }
            Logger.m15173i("WebAppServiceImpl", "WebAppServiceImpl isWebApp!");
            return false;
        }
    }
}
