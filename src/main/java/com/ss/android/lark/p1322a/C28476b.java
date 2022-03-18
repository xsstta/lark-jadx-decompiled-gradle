package com.ss.android.lark.p1322a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1322a.p1323a.AbstractC28475a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57824f;
import java.util.List;

/* renamed from: com.ss.android.lark.a.b */
public class C28476b {

    /* renamed from: a */
    private static String f71606a;

    /* renamed from: b */
    private static volatile AbstractC28475a f71607b;

    /* renamed from: a */
    public static AbstractC28475a m104344a() {
        return f71607b;
    }

    /* renamed from: b */
    public static List<AbstractC28490a> m104345b() {
        return C28479d.f71611a;
    }

    /* renamed from: c */
    public boolean mo101338c() {
        return C28477c.m104353a();
    }

    /* renamed from: d */
    public static void m104347d() {
        C57744a.m224104a().putString("KEY_AOTMODULE_DO_AOT", f71606a);
    }

    public C28476b(AbstractC28475a aVar) {
        f71607b = aVar;
    }

    /* renamed from: a */
    public void mo101337a(Context context) {
        if (m104346b(context) && C28474a.m104340b()) {
            C28477c.m104352a(context);
        }
    }

    /* renamed from: b */
    private boolean m104346b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        if (!m104344a().mo101336a()) {
            Log.m165389i("AotModule", " aot FG close");
            return false;
        }
        f71606a = C57824f.m224459a(context);
        if (TextUtils.equals(f71606a, C57744a.m224104a().getString("KEY_AOTMODULE_DO_AOT"))) {
            return false;
        }
        Log.m165389i("AotModule", " do aot");
        return true;
    }
}
