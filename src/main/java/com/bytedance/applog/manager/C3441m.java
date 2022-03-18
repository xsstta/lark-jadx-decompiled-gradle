package com.bytedance.applog.manager;

import android.content.Context;
import com.bytedance.applog.util.C3469r;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.m */
public class C3441m extends AbstractC3431c {

    /* renamed from: e */
    Context f10941e;

    C3441m(Context context) {
        super(true, false);
        this.f10941e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException, SecurityException {
        boolean isNewUserMode = DeviceRegisterParameterFactory.isNewUserMode(this.f10941e);
        if (isNewUserMode) {
            jSONObject.put("new_user_mode", 1);
        }
        if (C3469r.f10990a || isNewUserMode) {
            C3469r.m14666a("new user mode = " + isNewUserMode, (Throwable) null);
        }
        return true;
    }
}
