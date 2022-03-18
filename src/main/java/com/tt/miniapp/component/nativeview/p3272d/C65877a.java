package com.tt.miniapp.component.nativeview.p3272d;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40643j;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import java.util.List;

/* renamed from: com.tt.miniapp.component.nativeview.d.a */
public class C65877a {
    /* renamed from: a */
    private static String m258064a() {
        return AppbrandConstant.C65701b.m257612c().mo230137a();
    }

    /* renamed from: a */
    private static void m258065a(WebView webView, String str) {
        String a = m258064a();
        String string = AppbrandContext.getInst().getApplicationContext().getResources().getString(R.string.Lark_OpenPlatform_SecurityPromptDesc);
        String string2 = AppbrandContext.getInst().getApplicationContext().getResources().getString(R.string.Lark_OpenPlatform_SecurityPrompt);
        if (webView != null) {
            webView.loadUrl(a + "?" + "platform=android" + "&errorUrl=" + Uri.encode(str) + "&headerHeight=0" + "&errorText=" + Uri.encode(string) + "&errorTitle=" + Uri.encode(string2));
        }
    }

    /* renamed from: a */
    private static boolean m258067a(IAppContext iAppContext, String str, String str2) {
        Log.m165389i("WebViewComponentUtils", "check safe domain");
        List<String> list = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().mGadgetSafeDomains;
        if (list == null || list.isEmpty()) {
            Log.m165389i("WebViewComponentUtils", "gadget safe url is empty");
            return false;
        }
        Log.m165389i("WebViewComponentUtils", "webView url :" + str);
        String host = Uri.parse(str).getHost();
        if (host.contains(AppbrandConstant.C65701b.m257612c().mo230138b()) || str2.contains(host)) {
            return true;
        }
        if (!HostDependManager.getInst().getFeatureGating("lark.developer_console.enable_glob_in_gadget_url.native", false) || !list.contains("*:*")) {
            for (String str3 : list) {
                Log.m165389i("WebViewComponentUtils", "safeHost:" + str3);
                if (str.startsWith(str3)) {
                    return true;
                }
            }
            Log.m165383e("WebViewComponentUtils", "not safe url");
            return false;
        }
        Log.m165389i("WebViewComponentUtils", "all url is safe for gadget");
        return true;
    }

    /* renamed from: a */
    public static boolean m258066a(WebView webView, String str, IAppContext iAppContext, String str2) {
        try {
            if (HostDependManager.getInst().getFeatureGating("openplatform.webcomponent.check.safedomain") && !TextUtils.isEmpty(str) && str.startsWith("http")) {
                C67500a aVar = new C67500a(C40643j.f103101a, iAppContext);
                aVar.addCategoryValue("host", Uri.parse(str).getHost());
                if (m258067a(iAppContext, str, str2)) {
                    aVar.addCategoryValue("is_intercepted", 0).flush();
                    return false;
                }
                Log.m165389i("WebViewComponentUtils", "url is unsafe, load default safe page");
                aVar.addCategoryValue("is_intercepted", 1).flush();
                m258065a(webView, str);
                return true;
            }
        } catch (Exception e) {
            Log.m165384e("WebViewComponentUtils", "Exception", e);
        }
        return false;
    }
}
