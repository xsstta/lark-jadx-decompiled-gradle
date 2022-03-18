package com.ss.android.lark.browser.interceptor;

import android.content.Context;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.C29640b;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\f\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/browser/interceptor/QuickOpenUrlInterceptor;", "Lcom/ss/android/lark/browser/interceptor/IOpenUrlInterceptor;", "()V", "getInterceptorType", "", "handleUrl", "", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "shouldIntercept", "shouldInterceptOverrideUrlLoading", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.a.f */
public final class QuickOpenUrlInterceptor implements IOpenUrlInterceptor {

    /* renamed from: a */
    public static final QuickOpenUrlInterceptor f74310a = new QuickOpenUrlInterceptor();

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public int mo106867a() {
        return 4;
    }

    private QuickOpenUrlInterceptor() {
    }

    /* renamed from: b */
    public final boolean mo106870b() {
        IBrowserModuleDependency.AbstractC29896l quicklyOpenUrlDependency;
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a == null || (quicklyOpenUrlDependency = a.getQuicklyOpenUrlDependency()) == null) {
            return false;
        }
        return quicklyOpenUrlDependency.mo107707a();
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: b */
    public boolean mo106869b(Context context, UrlParams urlParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        C29640b.m109697a(context, urlParams);
        return true;
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public boolean mo106868a(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29896l quicklyOpenUrlDependency;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a == null || (quicklyOpenUrlDependency = a.getQuicklyOpenUrlDependency()) == null) {
            return false;
        }
        return quicklyOpenUrlDependency.mo107708a(context, urlParams);
    }
}
