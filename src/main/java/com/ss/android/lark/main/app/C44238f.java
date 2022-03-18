package com.ss.android.lark.main.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.main.app.fragment.desktop.C44270a;
import com.ss.android.lark.main.app.fragment.phone.C44300b;
import com.ss.android.lark.main.router.C44507b;
import com.ss.android.lark.utils.C57766ad;
import com.ss.android.lark.utils.C57858o;
import java.util.Map;

/* renamed from: com.ss.android.lark.main.app.f */
public class C44238f implements AbstractC29555b {

    /* renamed from: a */
    private static volatile Intent f112221a;

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public String mo105699a() {
        return "from_notification";
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: b */
    public Class<?> mo105704b() {
        return MainActivity.class;
    }

    /* renamed from: c */
    public static boolean m175447c() {
        if (f112221a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: b */
    public void mo105705b(Context context) {
        mo105706b(context, "");
    }

    /* renamed from: b */
    public static void m175446b(Activity activity) {
        if (activity != null && f112221a != null) {
            Intent intent = f112221a;
            f112221a = null;
            activity.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: d */
    public void mo105710d(Context context) {
        C57858o.m224559a(MainActivity.class).mo196064a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: c */
    public void mo105708c(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("key_tab_view_index", "");
        intent.addFlags(268468224);
        context.startActivity(intent);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public boolean mo105701a(Activity activity) {
        return activity instanceof MainActivity;
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public boolean mo105702a(Context context) {
        if (!(context instanceof MainActivity)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public boolean mo105703a(Fragment fragment) {
        if ((fragment instanceof C44300b) || (fragment instanceof C44270a)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public Intent mo105697a(Context context, String str) {
        return mo105698a(context, str, (Bundle) null);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public void mo105700a(Context context, Intent intent) {
        f112221a = intent;
        C57858o.m224559a(MainActivity.class).mo196064a(context);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: c */
    public void mo105709c(Context context, String str) {
        new C44507b().mo157954a(context, str);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: b */
    public void mo105706b(Context context, String str) {
        mo105707b(context, str, null);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public Intent mo105696a(Context context, Bundle bundle, int i) {
        return C57858o.m224559a(MainActivity.class).mo196050a(i).mo196052a(bundle).mo196066b(context);
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: a */
    public Intent mo105698a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(335544320);
        if (str != null) {
            intent.putExtra("key_tab_view_index", str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    @Override // com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b
    /* renamed from: b */
    public void mo105707b(Context context, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("key_tab_view_index", str);
        boolean z = bundle.getBoolean("transition", false);
        C57766ad a = C57858o.m224559a(MainActivity.class).mo196050a(335544320).mo196052a(bundle);
        if (z) {
            a.mo196051a(0, 0);
        }
        a.mo196064a(context);
    }

    /* renamed from: a */
    public void mo157267a(Context context, int i, Map<String, String> map) {
        C57766ad a = C57858o.m224559a(MainActivity.class);
        if (map != null) {
            for (String str : map.keySet()) {
                a.mo196058a(str, map.get(str));
            }
        }
        a.mo196050a(i).mo196064a(context);
    }
}
