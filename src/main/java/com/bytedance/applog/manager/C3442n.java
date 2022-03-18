package com.bytedance.applog.manager;

import android.content.Context;
import com.bytedance.dr.C4000c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.n */
public final class C3442n extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10942e;

    /* renamed from: f */
    private final C3435g f10943f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException, SecurityException {
        Map<String, String> a = C4000c.m16653a(this.f10942e, this.f10943f.mo13831j());
        if (a == null) {
            return false;
        }
        jSONObject.put("oaid", new JSONObject(a));
        return true;
    }

    C3442n(Context context, C3435g gVar) {
        super(true, false);
        this.f10942e = context;
        this.f10943f = gVar;
    }
}
