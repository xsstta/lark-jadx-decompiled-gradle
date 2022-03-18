package com.bytedance.ee.bear.document;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;

/* renamed from: com.bytedance.ee.bear.document.y */
public class C6293y extends WebChromeClient {

    /* renamed from: a */
    private WebChromeClient.CustomViewCallback f17443a;

    /* renamed from: b */
    private AbstractC6294a f17444b;

    /* renamed from: c */
    private View f17445c;

    /* renamed from: com.bytedance.ee.bear.document.y$a */
    public interface AbstractC6294a {
        /* renamed from: a */
        ViewGroup mo22512a();
    }

    /* renamed from: a */
    private ViewGroup m25252a() {
        return this.f17444b.mo22512a();
    }

    public void onHideCustomView() {
        View view;
        WebChromeClient.CustomViewCallback customViewCallback = this.f17443a;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        ViewGroup a = m25252a();
        if (!(a == null || (view = this.f17445c) == null)) {
            a.removeView(view);
        }
        this.f17445c = null;
        super.onHideCustomView();
    }

    public C6293y(AbstractC6294a aVar) {
        this.f17444b = aVar;
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f17445c = view;
        this.f17443a = customViewCallback;
        ViewGroup a = m25252a();
        if (a != null) {
            a.addView(this.f17445c);
        }
        super.onShowCustomView(view, customViewCallback);
    }
}
