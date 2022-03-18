package com.bytedance.sdk.bytebridge.web.context;

import android.app.Activity;
import android.webkit.ValueCallback;
import com.bytedance.sdk.bytebridge.base.context.IBridgeView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0007H'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "Lcom/bytedance/sdk/bytebridge/base/context/IBridgeView;", "addJavascriptInterface", "", "jsInterface", "", "name", "", "evaluateJavascript", "script", "resultCallback", "Landroid/webkit/ValueCallback;", "getActivity", "Landroid/app/Activity;", "getUrl", "loadUrl", "url", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.c.a */
public interface IWebView extends IBridgeView {
    /* renamed from: a */
    Activity mo69585a();

    /* renamed from: a */
    void mo69586a(String str);

    /* renamed from: a */
    void mo69587a(String str, ValueCallback<String> valueCallback);

    /* renamed from: b */
    String mo69588b();
}
