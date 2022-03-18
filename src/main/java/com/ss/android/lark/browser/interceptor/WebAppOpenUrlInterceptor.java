package com.ss.android.lark.browser.interceptor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/browser/interceptor/WebAppOpenUrlInterceptor;", "Lcom/ss/android/lark/browser/interceptor/IOpenUrlInterceptor;", "()V", "TAG", "", "getInterceptorType", "", "handleUrl", "", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "isApp", "url", "shouldIntercept", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.a.g */
public final class WebAppOpenUrlInterceptor implements IOpenUrlInterceptor {

    /* renamed from: a */
    public static final WebAppOpenUrlInterceptor f74311a = new WebAppOpenUrlInterceptor();

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public int mo106867a() {
        return 3;
    }

    private WebAppOpenUrlInterceptor() {
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: b */
    public boolean mo106869b(Context context, UrlParams urlParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        Log.m165389i("WebAppOpenUrlInterceptor", "handleUrl----");
        return true;
    }

    /* renamed from: a */
    private final boolean m109693a(String str, UrlParams urlParams) {
        if (!TextUtils.isEmpty(urlParams.f73892b)) {
            return true;
        }
        Bundle bundle = urlParams.f73900j;
        if (bundle != null) {
            if (!(!TextUtils.isEmpty(bundle.getString("app_id", null)))) {
                bundle = null;
            }
            if (bundle != null) {
                return true;
            }
        }
        try {
            return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("app_id"));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public boolean mo106868a(Context context, UrlParams urlParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        if (TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("WebAppOpenUrlInterceptor", "urlParams.targetUrl is empty");
            return false;
        }
        String str = urlParams.f73907q;
        Intrinsics.checkExpressionValueIsNotNull(str, "urlParams.targetUrl");
        if (!m109693a(str, urlParams) || !C29638a.m109622a().onAppIntercept(context)) {
            return false;
        }
        Log.m165389i("WebAppOpenUrlInterceptor", "load intercept by isApp");
        return true;
    }
}
