package com.bytedance.ee.util.p701d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: com.bytedance.ee.util.d.e */
public class C13617e extends ContextWrapper {
    private C13617e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static ContextWrapper m55264a(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 24) {
            context = context.createConfigurationContext(configuration);
        }
        return new C13617e(context);
    }
}
