package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import com.larksuite.component.webview.container.dto.C25830a;
import com.ss.android.lark.browser.impl.translate.WebTranslateHelper;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.translate.a */
public class C29867a {
    /* renamed from: a */
    public static void m110436a(C25830a aVar) {
        if (aVar == null) {
            Log.m165389i("TranslateApiHandlerRegistry", "[registerHandler] injector is null");
        } else if (WebTranslateHelper.f74708c.mo107838a()) {
            aVar.mo91891a("biz.larkWebTranslate.getDetectSetting", new GetDetectSettingHandlerV2());
            aVar.mo91891a("biz.larkWebTranslate.detectSourceLanguage", new DetectSourceLanguageHandlerV2());
            aVar.mo91891a("biz.larkWebTranslate.getTranslateSettings", new GetTranslateSettingHandlerV2());
            aVar.mo91891a("biz.larkWebTranslate.sendTranslateRequest", new SendTranslateRequestHandlerV2());
            aVar.mo91891a("biz.larkWebTranslate.changeBanner", new ChangeBannerHandlerV2());
            aVar.mo91891a("biz.larkWebTranslate.updateTranslateStatus", new UpdateBarStatusHandlerV2());
        } else {
            Log.m165389i("TranslateApiHandlerRegistry", "[registerHandler] fg=false");
        }
    }
}
