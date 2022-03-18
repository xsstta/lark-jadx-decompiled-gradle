package com.ss.android.lark.browser.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.dto.AbstractC29907a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/browser/interceptor/DocOpenUrlInterceptor;", "Lcom/ss/android/lark/browser/interceptor/IOpenUrlInterceptor;", "()V", "TAG", "", "getInterceptorType", "", "handleUrl", "", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "shouldIntercept", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.a.b */
public final class DocOpenUrlInterceptor implements IOpenUrlInterceptor {

    /* renamed from: a */
    public static final DocOpenUrlInterceptor f74306a = new DocOpenUrlInterceptor();

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public int mo106867a() {
        return 1;
    }

    private DocOpenUrlInterceptor() {
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: a */
    public boolean mo106868a(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29884b docsDependency;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        String str = urlParams.f73907q;
        if (str != null) {
            if (!(!TextUtils.isEmpty(str))) {
                str = null;
            }
            if (str != null) {
                IBrowserModuleDependency a = C29638a.m109622a();
                if (a == null || (docsDependency = a.getDocsDependency()) == null) {
                    return false;
                }
                return docsDependency.mo107663a(str);
            }
        }
        Log.m165383e("DocOpenUrlInterceptor", "urlParams.targetUrl is empty");
        return false;
    }

    @Override // com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor
    /* renamed from: b */
    public boolean mo106869b(Context context, UrlParams urlParams) {
        IBrowserModuleDependency.AbstractC29884b docsDependency;
        String str;
        AbstractC29907a perfEnterChatMonitor;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(urlParams, "urlParams");
        Log.m165389i("DocOpenUrlInterceptor", "DocOpenUrlInterceptor handleUrl");
        if (TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("DocOpenUrlInterceptor", "handleUrl urlParams.targetUrl is empty,will return");
            return false;
        }
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a == null || (docsDependency = a.getDocsDependency()) == null) {
            return false;
        }
        HashMap hashMap = urlParams.f73909s;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        IBrowserModuleDependency a2 = C29638a.m109622a();
        String str2 = "";
        if (a2 == null || (perfEnterChatMonitor = a2.getPerfEnterChatMonitor()) == null || (str = perfEnterChatMonitor.mo107771b()) == null) {
            str = str2;
        }
        String a3 = docsDependency.mo107659a(urlParams.f73907q, str, hashMap);
        if (a3 != null) {
            str2 = a3;
        }
        if (TextUtils.isEmpty(str2)) {
            Log.m165383e("DocOpenUrlInterceptor", "handleUrl newDocUrl is empty,will return ");
            return false;
        }
        boolean a4 = docsDependency.mo107664a(str2, urlParams.f73908r);
        Log.m165389i("DocOpenUrlInterceptor", "handleUrl result :" + a4);
        return a4;
    }
}
