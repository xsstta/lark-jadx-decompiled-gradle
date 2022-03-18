package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.common.e.d */
public class C60750d {
    /* renamed from: a */
    public static void m236072a(Activity activity) {
        m236073a(activity, 0);
    }

    /* renamed from: a */
    public static void m236073a(Activity activity, int i) {
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | DynamicModule.f58006b);
        }
        if (UDUiModeUtils.m93319a(activity)) {
            boolean b = RomUtils.m94941b(activity, window);
            C60700b.m235843a("ImmersiveUtils", "[showImmersivePage]", "darkMode flag=" + b);
        } else {
            boolean a = RomUtils.m94934a(activity, window);
            C60700b.m235843a("ImmersiveUtils", "[showImmersivePage2]", "lightMode flag=" + a);
        }
        window.setStatusBarColor(i);
        window.setNavigationBarColor(activity.getResources().getColor(R.color.bg_body));
    }
}
