package com.bytedance.applog.manager;

import android.content.Context;
import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.l */
public class C3440l extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10940e;

    C3440l(Context context) {
        super(true, true);
        this.f10940e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        C3436h.m14500a(jSONObject, "access", NetworkUtils.getNetworkAccessType(this.f10940e));
        return true;
    }
}
