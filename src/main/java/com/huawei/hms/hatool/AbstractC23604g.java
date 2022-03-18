package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* renamed from: com.huawei.hms.hatool.g */
public abstract class AbstractC23604g {
    /* renamed from: a */
    public static String m85714a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC23594a.m85593a(str, str2))) {
            return AbstractC23594a.m85593a(str, str2);
        }
        C23625y.m85977c("hmsSdk", "getAndroidId(): to getConfigByType()");
        return m85716c(context, str, str2);
    }

    /* renamed from: b */
    public static String m85715b(Context context, String str, String str2) {
        if (str2.equals("oper")) {
            return m85717d(context, str, str2);
        }
        if (str2.equals("maint")) {
            return m85717d(context, str, str2);
        }
        if (str2.equals("diffprivacy")) {
            return m85717d(context, str, str2);
        }
        if (str2.equals("preins")) {
            return m85717d(context, str, str2);
        }
        C23625y.m85982f("hmsSdk", "getChannel(): Invalid type: " + str2);
        return "";
    }

    /* renamed from: c */
    public static String m85716c(Context context, String str, String str2) {
        if (!AbstractC23594a.m85594b(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(AbstractC23596b.m85613b())) {
            C23606i.m85750c().mo83025b().mo83087b(AbstractC23601f.m85693a(context));
        }
        return AbstractC23596b.m85613b();
    }

    /* renamed from: d */
    public static String m85717d(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC23598c.m85634d(str, str2))) {
            return AbstractC23598c.m85634d(str, str2);
        }
        C23609l b = C23606i.m85750c().mo83025b();
        if (TextUtils.isEmpty(b.mo83096g())) {
            String b2 = AbstractC23601f.m85697b(context);
            if (!q0.m85894a("channel", b2, (int) DynamicModule.f58006b)) {
                b2 = "";
            }
            b.mo83091d(b2);
        }
        return b.mo83096g();
    }
}
