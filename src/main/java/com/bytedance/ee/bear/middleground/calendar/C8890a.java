package com.bytedance.ee.bear.middleground.calendar;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.calendar.bean.C8918a;
import com.bytedance.ee.bear.middleground.calendar.pool.DefaultWebEditorPool;
import com.bytedance.ee.bear.middleground.calendar.pool.IWebEditorPool;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.a */
public class C8890a {

    /* renamed from: a */
    private static final IWebEditorPool f23973a = new DefaultWebEditorPool();

    /* renamed from: b */
    private static C8918a f23974b;

    /* renamed from: d */
    public static C8918a m37288d() {
        return f23974b;
    }

    /* renamed from: a */
    public static WebEditorWrapper m37284a() {
        return f23973a.obtain();
    }

    /* renamed from: b */
    public static void m37286b() {
        C13479a.m54764b("WebEditor", "clearPool(): ");
        f23973a.clear();
    }

    /* renamed from: c */
    public static String m37287c() {
        C8918a aVar = f23974b;
        if (aVar == null || TextUtils.isEmpty(aVar.mo34210c())) {
            C13479a.m54758a("WebEditor", "getPreloadUrl: SuiteDomain is null or empty");
            return "";
        }
        String str = "https://" + f23974b.mo34210c() + "/space/blank/";
        C13479a.m54764b("WebEditor", "getPreloadUrl: url = " + str);
        return str;
    }

    /* renamed from: a */
    public static void m37285a(Context context, C8918a aVar) {
        f23974b = aVar;
        f23973a.init(context);
    }
}
