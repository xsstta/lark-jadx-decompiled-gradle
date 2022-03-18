package com.bytedance.ee.webapp.config;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.util.p700c.C13602d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.permission.bean.PermissionModel;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.webapp.config.b */
public class C13771b {

    /* renamed from: a */
    private PermissionModel f36003a;

    /* renamed from: b */
    private final Map<String, String> f36004b = new HashMap();

    /* renamed from: a */
    public String mo50789a() {
        PermissionModel permissionModel = this.f36003a;
        if (permissionModel != null) {
            return permissionModel.getApiSession();
        }
        Log.m165397w("AuthResultManager", "fetch js sdk session but is empty");
        return null;
    }

    /* renamed from: a */
    public boolean mo50792a(String str) {
        if (!this.f36004b.containsKey(str) || TextUtils.isEmpty(this.f36004b.get(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo50790a(C48772b bVar, VerifyResponse verifyResponse) {
        this.f36003a = C13772c.m55811a(bVar, verifyResponse);
    }

    /* renamed from: a */
    public void mo50791a(String str, String str2) {
        String a = C13772c.m55812a(str);
        Uri parse = Uri.parse(a);
        AppBrandLogger.m52830i("AuthResultManager", "config success url host:" + parse.getHost() + ",path:" + parse.getEncodedPath() + ",query:" + parse.getEncodedQuery() + ", fragment" + parse.getEncodedFragment());
        StringBuilder sb = new StringBuilder();
        sb.append("config success save memory url hash code:");
        sb.append(C13602d.m55222a(a));
        AppBrandLogger.m52830i("AuthResultManager", sb.toString());
        this.f36004b.put(a, str2);
    }
}
