package com.ss.android.lark.browser.handler.translate;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.browser.handler.translate.a */
public class C29921a {

    /* renamed from: a */
    public WebTranslateConfig f74648a;

    /* renamed from: com.ss.android.lark.browser.handler.translate.a$a */
    private static class C29923a {

        /* renamed from: a */
        public static final C29921a f74650a = new C29921a();
    }

    /* renamed from: a */
    public static C29921a m110626a() {
        return C29923a.f74650a;
    }

    /* renamed from: b */
    public int mo107783b() {
        WebTranslateConfig webTranslateConfig = this.f74648a;
        if (webTranslateConfig != null) {
            return webTranslateConfig.f74643a;
        }
        return 1000;
    }

    private C29921a() {
        SettingManager.getInstance().get(WebTranslateConfig.class, new IGetDataCallback<WebTranslateConfig>() {
            /* class com.ss.android.lark.browser.handler.translate.C29921a.C299221 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165390i("WebTranslateConfigHandler", "get WebTranslateConfig error", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(WebTranslateConfig webTranslateConfig) {
                Log.m165389i("WebTranslateConfigHandler", "webTranslateConfig: " + webTranslateConfig);
                C29921a.this.f74648a = webTranslateConfig;
            }
        });
    }

    /* renamed from: a */
    public boolean mo107782a(String str) {
        WebTranslateConfig webTranslateConfig = this.f74648a;
        if (webTranslateConfig == null || webTranslateConfig.f74644b == null) {
            return true;
        }
        try {
            return this.f74648a.f74644b.mo107781a(str);
        } catch (Exception unused) {
            Log.m165379d("WebTranslateConfigHandler", "call isUrlEnable error");
            return true;
        }
    }
}
