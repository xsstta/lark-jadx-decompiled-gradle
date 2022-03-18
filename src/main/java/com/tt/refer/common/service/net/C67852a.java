package com.tt.refer.common.service.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.util.C67064v;
import com.tt.miniapp.util.C67067x;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.refer.common.service.net.a */
public class C67852a {

    /* renamed from: a */
    private Context f170908a = AppbrandContext.getInst().getApplicationContext();

    /* renamed from: b */
    private boolean f170909b;

    /* renamed from: c */
    private String f170910c = "";

    /* renamed from: d */
    private String f170911d = "";

    /* renamed from: e */
    private String f170912e = "";

    /* renamed from: a */
    public String mo235487a(String str) {
        if (this.f170909b) {
            return C67064v.m261368a(this.f170910c, this.f170911d, str);
        }
        return str;
    }

    /* renamed from: a */
    public String mo235486a(IAppContext iAppContext) {
        String str = "";
        if (this.f170908a == null) {
            AppBrandLogger.m52829e("EncryptContext", "context is null");
            return str;
        }
        String str2 = str;
        String str3 = str2;
        int i = 3;
        while (true) {
            if (i <= 0) {
                break;
            }
            str2 = C67067x.m261375a();
            str3 = C67067x.m261375a();
            byte[] a = C67064v.m261370a(this.f170908a, str2 + "#" + str3, iAppContext);
            if (a != null) {
                str = Base64.encodeToString(a, 10);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f170909b = true;
                break;
            }
            AppBrandLogger.m52829e("EncryptContext", "ttCode isEmpty. key:", str2, " iv:", str3, " secret:", a);
            i--;
        }
        this.f170910c = str2;
        this.f170911d = str3;
        this.f170912e = str;
        return str;
    }
}
