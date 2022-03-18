package com.bytedance.applog.manager;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.applog.util.C3465n;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.p */
public class C3444p extends AbstractC3431c {
    C3444p() {
        super(true, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder(16);
        if (C3465n.m14649m()) {
            sb.append("MIUI-");
        } else if (C3465n.m14642f()) {
            sb.append("FLYME-");
        } else {
            String a = C3465n.m14634a();
            if (C3465n.m14636a(a)) {
                sb.append("EMUI-");
            }
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                sb.append("-");
            }
        }
        sb.append(Build.VERSION.INCREMENTAL);
        jSONObject.put("rom", sb.toString());
        String b = C3465n.m14637b();
        if (TextUtils.isEmpty(b)) {
            return true;
        }
        jSONObject.put("rom_version", b);
        return true;
    }
}
