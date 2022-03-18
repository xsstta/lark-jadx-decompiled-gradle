package com.ss.android.lark.browser.impl.translate.p1424a;

import android.os.SystemClock;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.browser.impl.translate.a.a */
public class C29947a {

    /* renamed from: com.ss.android.lark.browser.impl.translate.a.a$a */
    private static class C29949a {

        /* renamed from: a */
        public static C29947a f74720a = new C29947a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.impl.translate.a.a$b */
    public static class C29950b {

        /* renamed from: a */
        private long f74721a;

        private C29950b() {
        }

        /* renamed from: a */
        public void mo107858a() {
            this.f74721a = SystemClock.uptimeMillis();
        }

        /* renamed from: b */
        public long mo107859b() {
            return SystemClock.uptimeMillis() - this.f74721a;
        }
    }

    /* renamed from: a */
    public static C29947a m110732a() {
        return C29949a.f74720a;
    }

    /* renamed from: a */
    public void mo107851a(IGetDataCallback<List<TranslateLanguage>> iGetDataCallback) {
        C29638a.m109622a().getMineDependency().mo107710a(new UIGetDataCallback(new C29951c("get_web_translate_setting", iGetDataCallback)));
    }

    /* renamed from: com.ss.android.lark.browser.impl.translate.a.a$c */
    private static class C29951c<T> implements IGetDataCallback<T> {

        /* renamed from: a */
        private String f74722a;

        /* renamed from: b */
        private IGetDataCallback<T> f74723b;

        /* renamed from: c */
        private C29950b f74724c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            IGetDataCallback<T> iGetDataCallback = this.f74723b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            Log.m165389i("WebTranslateService", String.format("on web translate request failed, task=%s, latency=%d, failed=%s", this.f74722a, Long.valueOf(this.f74724c.mo107859b()), errorResult.toString()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            IGetDataCallback<T> iGetDataCallback = this.f74723b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(t);
            }
            Log.m165389i("WebTranslateService", String.format("on web translate request success, task=%s, latency=%d", this.f74722a, Long.valueOf(this.f74724c.mo107859b())));
        }

        public C29951c(String str, IGetDataCallback<T> iGetDataCallback) {
            this.f74722a = str;
            this.f74723b = iGetDataCallback;
            C29950b bVar = new C29950b();
            this.f74724c = bVar;
            bVar.mo107858a();
        }
    }

    /* renamed from: a */
    public void mo107856a(boolean z) {
        C29638a.m109622a().getMineDependency().mo107715a(z, new C29951c("set_autot_ranslate", null));
    }

    /* renamed from: a */
    public void mo107852a(TranslateLanguage translateLanguage, boolean z) {
        C29638a.m109622a().getMineDependency().mo107711a(translateLanguage, z, new C29951c("set_untranslate_language", null));
    }

    /* renamed from: a */
    public void mo107855a(String str, boolean z) {
        C29638a.m109622a().getMineDependency().mo107714a(str, z, new C29951c("set_untranslate_site", null));
    }

    /* renamed from: a */
    public void mo107857a(String[] strArr, IGetDataCallback<TranslateLanguage> iGetDataCallback) {
        C29638a.m109622a().getMineDependency().mo107716a(strArr, new UIGetDataCallback(new C29951c("detect_source_language", iGetDataCallback)));
    }

    /* renamed from: a */
    public void mo107853a(String str, String str2, IGetDataCallback<C29953a> iGetDataCallback) {
        C29638a.m109622a().getMineDependency().mo107712a(str, str2, new C29951c("get_web_translate_setting", new UIGetDataCallback(iGetDataCallback)));
    }

    /* renamed from: a */
    public void mo107854a(String str, String str2, String[] strArr, IGetDataCallback<List<String>> iGetDataCallback) {
        C29638a.m109622a().getMineDependency().mo107713a(str, str2, strArr, new UIGetDataCallback(new C29951c("send_translate_request", iGetDataCallback)));
    }
}
