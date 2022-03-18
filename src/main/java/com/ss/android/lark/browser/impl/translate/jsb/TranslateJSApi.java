package com.ss.android.lark.browser.impl.translate.jsb;

import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.browser.impl.translate.jsb.params.ChangeBannerJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.DetectSourceLanguageJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.GetTranslateSettingJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.SendTranslateRequestJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.UpdateBarStatusJSPrams;
import com.ss.android.lark.browser.impl.translate.jsb.result.BaseJSResult;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;
import com.ss.android.lark.utils.C57878s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bf\u0018\u0000 \u00022\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi;", "", "Companion", "ICallerApi", "IHandlerApi", "IHandlerApiProvider", "JSApiCallback", "JSApiV2Callback", "ManualType", "TranslateStatus", "TranslateType", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface TranslateJSApi {

    /* renamed from: a */
    public static final Companion f74732a = Companion.f74735a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$ManualType;", "", "Companion", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ManualType {
        public static final Companion Companion = Companion.f74733a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$ManualType$Companion;", "", "()V", "REVERT", "", "TRANSLATE", "UPDATE_TARGET_LANG", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$ManualType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f74733a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$TranslateStatus;", "", "Companion", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TranslateStatus {
        public static final Companion Companion = Companion.f74734a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$TranslateStatus$Companion;", "", "()V", "FAILED", "", "LOADING", "ORIGIN", "TARGET", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$TranslateStatus$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f74734a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$ICallerApi;", "", "doTranslate", "", "manualType", "", "originLang", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "targetLang", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$b */
    public interface ICallerApi {
        /* renamed from: a */
        void mo107839a(String str, TranslateLanguage translateLanguage, TranslateLanguage translateLanguage2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "", "changeBanner", "", "params", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/ChangeBannerJSParams;", "callback", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$JSApiCallback;", "detectSourceLanguage", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/DetectSourceLanguageJSParams;", "getDetectSetting", "getTranslateSetting", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/GetTranslateSettingJSParams;", "sendTranslateRequest", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/SendTranslateRequestJSParams;", "updateBarStatus", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/UpdateBarStatusJSPrams;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$c */
    public interface IHandlerApi {
        /* renamed from: a */
        void mo107879a(JSApiCallback eVar);

        /* renamed from: a */
        void mo107880a(ChangeBannerJSParams changeBannerJSParams, JSApiCallback eVar);

        /* renamed from: a */
        void mo107881a(DetectSourceLanguageJSParams detectSourceLanguageJSParams, JSApiCallback eVar);

        /* renamed from: a */
        void mo107882a(GetTranslateSettingJSParams getTranslateSettingJSParams, JSApiCallback eVar);

        /* renamed from: a */
        void mo107883a(SendTranslateRequestJSParams sendTranslateRequestJSParams, JSApiCallback eVar);

        /* renamed from: a */
        void mo107884a(UpdateBarStatusJSPrams updateBarStatusJSPrams, JSApiCallback eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApiProvider;", "", "getHandlerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$d */
    public interface IHandlerApiProvider {
        IHandlerApi getHandlerApi();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$JSApiCallback;", "", "onFail", "", "error", "Lcom/ss/android/lark/browser/impl/translate/jsb/result/ErrorJSResult;", "onSuccess", "result", "Lcom/ss/android/lark/browser/impl/translate/jsb/result/BaseJSResult;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$e */
    public interface JSApiCallback {
        /* renamed from: a */
        void mo107885a(BaseJSResult baseJSResult);

        /* renamed from: a */
        void mo107886a(ErrorJSResult errorJSResult);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$Companion;", "", "()V", "CHANGE_BANNER", "", "DETECT_SOURCE_LANGUAGE", "GET_DETECT_SETTING", "GET_TRANSLATE_SETTINGS", "MANUAL_TRANSLATE", "SEND_TRANSLATE_REQUEST", "UPDATE_TRANSLATE_STATUS", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f74735a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$JSApiV2Callback;", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$JSApiCallback;", "callback", "Lcom/larksuite/component/webview/container/dto/IJSApiRequestCallback;", "(Lcom/larksuite/component/webview/container/dto/IJSApiRequestCallback;)V", "onFail", "", "error", "Lcom/ss/android/lark/browser/impl/translate/jsb/result/ErrorJSResult;", "onSuccess", "result", "Lcom/ss/android/lark/browser/impl/translate/jsb/result/BaseJSResult;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi$f */
    public static final class JSApiV2Callback implements JSApiCallback {

        /* renamed from: a */
        private final AbstractC25832c f74736a;

        public JSApiV2Callback(AbstractC25832c cVar) {
            this.f74736a = cVar;
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.JSApiCallback
        /* renamed from: a */
        public void mo107885a(BaseJSResult baseJSResult) {
            Intrinsics.checkParameterIsNotNull(baseJSResult, "result");
            String a = C57878s.m224591a(baseJSResult);
            if (a == null) {
                a = "{}";
            }
            AbstractC25832c cVar = this.f74736a;
            if (cVar != null) {
                cVar.mo91902a(a);
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.JSApiCallback
        /* renamed from: a */
        public void mo107886a(ErrorJSResult errorJSResult) {
            Intrinsics.checkParameterIsNotNull(errorJSResult, "error");
            String a = C57878s.m224591a(errorJSResult);
            if (a == null) {
                a = "{}";
            }
            AbstractC25832c cVar = this.f74736a;
            if (cVar != null) {
                cVar.mo91904b(a);
            }
        }
    }
}
