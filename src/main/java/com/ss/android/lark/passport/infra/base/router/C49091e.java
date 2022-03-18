package com.ss.android.lark.passport.infra.base.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.util.C49146ab;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;

/* renamed from: com.ss.android.lark.passport.infra.base.router.e */
public class C49091e {

    /* renamed from: a */
    private final Class<? extends Activity> f123292a;

    /* renamed from: a */
    public String mo171384a() {
        Class<? extends Activity> cls = this.f123292a;
        if (cls != null) {
            return cls.getSimpleName();
        }
        return "";
    }

    public C49091e(Class<? extends Activity> cls) {
        this.f123292a = cls;
    }

    /* renamed from: a */
    public boolean mo171386a(Context context, JSONObject jSONObject, UniContext uniContext) {
        if (this.f123292a == null) {
            return false;
        }
        Intent intent = new Intent(context, this.f123292a);
        intent.putExtra("step_info", jSONObject);
        String a = C49146ab.m193802a(context, jSONObject);
        if (a != null) {
            intent.putExtra("__tea_path__", a);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (uniContext != null) {
            intent.putExtra("key_of_uni_context", uniContext);
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public boolean mo171385a(Activity activity, JSONObject jSONObject, int i, UniContext uniContext) {
        if (this.f123292a == null) {
            return false;
        }
        Intent intent = new Intent(activity, this.f123292a);
        intent.putExtra("step_info", jSONObject);
        if (uniContext != null) {
            intent.putExtra("key_of_uni_context", uniContext);
        }
        activity.startActivityForResult(intent, i);
        return true;
    }
}
