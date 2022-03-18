package com.ss.android.lark.browser.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/browser/interceptor/MailOpenUrlInterceptor;", "Lcom/ss/android/lark/browser/interceptor/IOpenUrlInterceptor;", "()V", "TAG", "", "getInterceptorType", "", "handleUrl", "", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "shouldIntercept", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.a.d */
public final class MailOpenUrlInterceptor implements IOpenUrlInterceptor {

    /* renamed from: a */
    public static final MailOpenUrlInterceptor f74307a = new MailOpenUrlInterceptor();

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public int mo106867a() {
        return 2;
    }

    private MailOpenUrlInterceptor() {
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public boolean mo106868a(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29893i mailDependency;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        boolean z = false;
        if (TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("MailOpenUrlInterceptor", "urlParams.targetUrl is empty");
            return false;
        }
        IBrowserModuleDependency a = C29638a.m109622a();
        if (!(a == null || (mailDependency = a.getMailDependency()) == null)) {
            z = mailDependency.mo107688a(urlParams.f73907q);
        }
        Log.m165389i("MailOpenUrlInterceptor", "isIntercept---" + z);
        return z;
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: b */
    public boolean mo106869b(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29893i iVar;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        Log.m165389i("MailOpenUrlInterceptor", "handleUrl----");
        IBrowserModuleDependency a = C29638a.m109622a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BrowserModule.getDependency()");
        IBrowserModuleDependency.AbstractC29893i mailDependency = a.getMailDependency();
        if (mailDependency != null) {
            return mailDependency.mo107687a(context, urlParams.f73907q, urlParams.f73908r);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependency--");
        sb.append(C29638a.m109622a());
        sb.append(',');
        sb.append("littleDependcy--");
        IBrowserModuleDependency a2 = C29638a.m109622a();
        if (a2 != null) {
            iVar = a2.getMailDependency();
        } else {
            iVar = null;
        }
        sb.append(iVar);
        Log.m165383e("MailOpenUrlInterceptor", sb.toString());
        return false;
    }
}
