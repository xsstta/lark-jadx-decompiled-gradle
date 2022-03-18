package com.bytedance.applog.manager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.bytedance.applog.util.C3457f;
import com.bytedance.applog.util.C3469r;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.s */
public class C3447s extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10951e;

    C3447s(Context context) {
        super(true, false);
        this.f10951e = context;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        PackageInfo packageInfo;
        Signature signature;
        String str = null;
        try {
            packageInfo = this.f10951e.getPackageManager().getPackageInfo(this.f10951e.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e) {
            C3469r.m14667a(e);
            packageInfo = null;
        }
        if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0 || (signature = packageInfo.signatures[0]) == null)) {
            str = C3457f.m14602b(signature.toByteArray());
        }
        if (str == null) {
            return true;
        }
        jSONObject.put("sig_hash", str);
        return true;
    }
}
