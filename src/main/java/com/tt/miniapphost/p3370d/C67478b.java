package com.tt.miniapphost.p3370d;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.Locale;

/* renamed from: com.tt.miniapphost.d.b */
public class C67478b {
    /* renamed from: a */
    public static Locale m262464a() {
        Locale b = C67479c.m262467a().mo234228b();
        if (b != null) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    public static String m262466b() {
        Locale c = C67479c.m262467a().mo234230c();
        if (c == null) {
            return "";
        }
        String str = "language=" + c.getLanguage();
        AppBrandLogger.m52828d("LanguageUtils", "append query lang:" + str);
        return str;
    }

    /* renamed from: a */
    public static void m262465a(Context context) {
        if (context != null) {
            Configuration configuration = context.getResources().getConfiguration();
            Locale a = m262464a();
            AppBrandLogger.m52828d("LanguageUtils", "updateResourceLocale:" + a);
            if (a != null) {
                configuration.locale = a;
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                if (context instanceof Activity) {
                    Resources resources = context.getApplicationContext().getResources();
                    Configuration configuration2 = resources.getConfiguration();
                    configuration2.locale = a;
                    resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
                }
            }
        }
    }
}
