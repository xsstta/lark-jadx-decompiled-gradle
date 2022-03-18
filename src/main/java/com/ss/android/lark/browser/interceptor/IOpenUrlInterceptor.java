package com.ss.android.lark.browser.interceptor;

import android.content.Context;
import com.ss.android.lark.biz.core.api.UrlParams;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/browser/interceptor/IOpenUrlInterceptor;", "", "getInterceptorType", "", "handleUrl", "", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "shouldIntercept", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.a.c */
public interface IOpenUrlInterceptor {
    /* renamed from: a */
    int mo106867a();

    /* renamed from: a */
    boolean mo106868a(Context context, UrlParams urlParams);

    /* renamed from: b */
    boolean mo106869b(Context context, UrlParams urlParams);
}
