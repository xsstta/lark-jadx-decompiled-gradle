package com.bytedance.applog.manager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.dr.C4000c;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.e */
public final class C3433e extends AbstractC3431c {

    /* renamed from: e */
    private final C3435g f10910e;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException, SecurityException {
        String a = C4000c.m16651a(this.f10910e.mo13831j());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        jSONObject.put("cdid", a);
        return true;
    }

    C3433e(Context context, C3435g gVar) {
        super(true, false);
        this.f10910e = gVar;
    }
}
