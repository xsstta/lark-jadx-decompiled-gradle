package com.bytedance.ee.bear.document;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.ac */
public class C5628ac {
    /* renamed from: a */
    public static boolean m22844a(String str, C6095s sVar) {
        return m22843a(sVar.mo19562e(), str, sVar.mo24598m().getOriginUrl(), sVar.mo19448b().mo19435b());
    }

    /* renamed from: a */
    private static void m22842a(Context context, WebView webView, String str) {
        String fragment = Uri.parse(str).getFragment();
        if (TextUtils.isEmpty(fragment)) {
            Toast.showFailureText(context, context.getString(R.string.Doc_Doc_LinkToCurrentDoc), 0);
            return;
        }
        C13479a.m54764b("JumpUrlHelper", "checkJumpDocIsSame(): origin hash = " + fragment);
        if (fragment.contains("?")) {
            fragment = fragment.substring(0, fragment.indexOf("?"));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hash", (Object) fragment);
        C11755a.m48725a(webView, "javascript:window.lark.biz.navigation.jump", jSONObject);
    }

    /* renamed from: a */
    private static boolean m22843a(Context context, String str, String str2, WebView webView) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54759a("JumpUrlHelper", "Empty url !", new IllegalStateException());
            return false;
        } else if (!C6313i.m25327a().mo25389b(str2, str)) {
            return false;
        } else {
            m22842a(context, webView, str);
            return true;
        }
    }
}
