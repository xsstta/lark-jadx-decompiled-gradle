package com.ss.android.lark.browser.biz.messenger.jsapi.translate;

import android.os.Parcel;
import android.view.ViewGroup;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.impl.translate.WebTranslateHelper;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import java.io.Serializable;

public abstract class BaseJsApiHandlerV2<PARAM extends Serializable> extends AbstractInjectJSApiHandler<PARAM> {
    public BaseJsApiHandlerV2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public TranslateJSApi.IHandlerApi mo107524b() {
        ViewGroup f = mo91999w().mo67313f();
        if (f != null) {
            return WebTranslateHelper.f74708c.mo107837a(f);
        }
        return null;
    }

    public BaseJsApiHandlerV2(Parcel parcel) {
        super(parcel);
    }
}
