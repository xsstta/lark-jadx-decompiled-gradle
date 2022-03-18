package com.ss.android.lark.browser.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/browser/interceptor/BrandOpenUrlInterceptor;", "Lcom/ss/android/lark/browser/interceptor/IOpenUrlInterceptor;", "()V", "TAG", "", "getInterceptorType", "", "handleUrl", "", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "shouldIntercept", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.a.a */
public final class BrandOpenUrlInterceptor implements IOpenUrlInterceptor {

    /* renamed from: a */
    public static final BrandOpenUrlInterceptor f74305a = new BrandOpenUrlInterceptor();

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public int mo106867a() {
        return 5;
    }

    private BrandOpenUrlInterceptor() {
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public boolean mo106868a(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29890g littleAppDependency;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        boolean z = false;
        if (TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("BrandOpenUrlInterceptor", "urlParams.targetUrl is empty");
            return false;
        }
        IBrowserModuleDependency a = C29638a.m109622a();
        if (!(a == null || (littleAppDependency = a.getLittleAppDependency()) == null)) {
            z = littleAppDependency.mo107676a(urlParams.f73907q);
        }
        Log.m165389i("BrandOpenUrlInterceptor", "isIntercept---" + z);
        return z;
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: b */
    public boolean mo106869b(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29890g gVar;
        IBrowserModuleDependency.AbstractC29890g littleAppDependency;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        Log.m165389i("BrandOpenUrlInterceptor", "handleUrl----");
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a != null && (littleAppDependency = a.getLittleAppDependency()) != null) {
            return littleAppDependency.mo107675a(context, urlParams.f73907q, urlParams.f73897g);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependency--");
        sb.append(C29638a.m109622a());
        sb.append(',');
        sb.append("littleDependcy--");
        IBrowserModuleDependency a2 = C29638a.m109622a();
        if (a2 != null) {
            gVar = a2.getLittleAppDependency();
        } else {
            gVar = null;
        }
        sb.append(gVar);
        Log.m165383e("BrandOpenUrlInterceptor", sb.toString());
        return false;
    }
}
