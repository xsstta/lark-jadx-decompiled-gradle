package com.ss.android.lark.browser.biz.messenger.jsapi.p1419a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.a.a */
public class C29837a {

    /* renamed from: a */
    private Context f74562a;

    /* renamed from: b */
    private boolean f74563b;

    /* renamed from: c */
    private String f74564c = "";

    /* renamed from: d */
    private String f74565d = "";

    /* renamed from: e */
    private String f74566e = "";

    /* renamed from: a */
    public String mo107440a() {
        String str = "";
        if (this.f74562a == null) {
            return str;
        }
        int i = 3;
        String str2 = str;
        String str3 = str2;
        while (true) {
            if (i <= 0) {
                break;
            }
            str2 = C29839c.m110321a();
            str3 = C29839c.m110321a();
            byte[] a = C29838b.m110317a(this.f74562a, str2 + "#" + str3);
            if (a != null) {
                str = Base64.encodeToString(a, 10);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f74563b = true;
                break;
            }
            i--;
        }
        this.f74564c = str2;
        this.f74565d = str3;
        this.f74566e = str;
        return str;
    }

    public C29837a(Context context) {
        this.f74562a = context;
    }

    /* renamed from: b */
    public String mo107442b(String str) {
        if (this.f74563b) {
            return C29838b.m110315a(this.f74564c, this.f74565d, str);
        }
        return str;
    }

    /* renamed from: a */
    public String mo107441a(String str) {
        byte[] a = C29838b.m110317a(this.f74562a, str);
        if (a != null) {
            return Base64.encodeToString(a, 10);
        }
        return null;
    }
}
