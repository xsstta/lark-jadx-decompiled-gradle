package com.ss.android.lark.browser.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.component.webview.container.C25819a;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.C29640b;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.interceptor.BrandOpenUrlInterceptor;
import com.ss.android.lark.browser.interceptor.DocOpenUrlInterceptor;
import com.ss.android.lark.browser.interceptor.IOpenUrlInterceptor;
import com.ss.android.lark.browser.interceptor.MailOpenUrlInterceptor;
import com.ss.android.lark.browser.interceptor.QuickOpenUrlInterceptor;
import com.ss.android.lark.browser.interceptor.WebAppOpenUrlInterceptor;
import com.ss.android.lark.browser.p1411a.C29639e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.widget.span.C59176n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.lark.browser.impl.d */
public class C29936d {

    /* renamed from: a */
    private static final ArrayList<IOpenUrlInterceptor> f74697a = new ArrayList<>();

    /* renamed from: b */
    private static final C29936d f74698b = new C29936d();

    /* renamed from: a */
    public static C29936d m110686a() {
        return f74698b;
    }

    /* renamed from: b */
    public void mo107807b() {
        ArrayList<IOpenUrlInterceptor> arrayList = f74697a;
        arrayList.add(QuickOpenUrlInterceptor.f74310a);
        arrayList.add(DocOpenUrlInterceptor.f74306a);
        arrayList.add(BrandOpenUrlInterceptor.f74305a);
        arrayList.add(MailOpenUrlInterceptor.f74307a);
        arrayList.add(WebAppOpenUrlInterceptor.f74311a);
    }

    /* renamed from: c */
    public boolean mo107808c() {
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a != null) {
            boolean isFeatureGatingEnable = a.isFeatureGatingEnable("gadget.refactor.open.url");
            Log.m165389i("OpenUrlHelperV2", "refactorIsOpen is ---" + isFeatureGatingEnable);
            new OPMonitor("client.web.refactor.open").addCategoryValue("refactorIsOpen", Boolean.valueOf(isFeatureGatingEnable)).flush();
            return isFeatureGatingEnable;
        }
        Log.m165383e("OpenUrlHelperV2", "BrowserModule.getDependency() is null,refactorIsOpen will return false");
        return false;
    }

    /* renamed from: a */
    public void mo107805a(Context context, UrlParams urlParams) {
        if (context == null || urlParams == null || TextUtils.isEmpty(urlParams.f73907q)) {
            Log.m165383e("OpenUrlHelperV2", "context-" + context + ",urlParams-" + urlParams);
            return;
        }
        Iterator<IOpenUrlInterceptor> it = f74697a.iterator();
        while (it.hasNext()) {
            IOpenUrlInterceptor next = it.next();
            if (next.mo106868a(context, urlParams)) {
                Log.m165389i("OpenUrlHelperV2", "is intercepted");
                next.mo106869b(context, urlParams);
                return;
            }
        }
        String str = urlParams.f73907q;
        Map<String, String> map = urlParams.f73908r;
        if (Uri.parse(str).getScheme() == null && C59176n.m229858b().matcher(str).find()) {
            Log.m165389i("OpenUrlHelperV2", "missing http schema");
            str = "https://" + str;
        }
        if (C29639e.m109680a(str) && C29639e.m109679a(context, str, map, urlParams.f73897g)) {
            Log.m165389i("OpenUrlHelperV2", "load intercept by MessengerUrlInterceptor");
        } else if (C25819a.m93327a(str) && C25819a.m93325a(context, str)) {
            Log.m165389i("OpenUrlHelperV2", "load intercept by WebContainerUrlInterceptor");
        } else if (!aq.m95060c(str)) {
            Log.m165383e("OpenUrlHelperV2", "url is not http or https,can not open in browser,will return");
        } else {
            Log.m165389i("OpenUrlHelperV2", "will start open browser to loading normal url");
            C29640b.m109697a(context, urlParams);
        }
    }

    /* renamed from: a */
    public boolean mo107806a(Context context, UrlParams urlParams, int i) {
        Iterator<IOpenUrlInterceptor> it = f74697a.iterator();
        while (it.hasNext()) {
            IOpenUrlInterceptor next = it.next();
            if (next.mo106867a() == i) {
                if (!next.mo106868a(context, urlParams) || !next.mo106869b(context, urlParams)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
