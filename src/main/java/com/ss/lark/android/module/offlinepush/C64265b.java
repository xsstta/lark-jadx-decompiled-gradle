package com.ss.lark.android.module.offlinepush;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bytedance.push.C20384b;
import com.bytedance.push.interfaze.AbstractC20451n;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import org.json.JSONObject;

/* renamed from: com.ss.lark.android.module.offlinepush.b */
public class C64265b implements AbstractC64262a {

    /* renamed from: a */
    private Context f162454a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m252719b() {
        C64266c.m252728a(this.f162454a, false);
    }

    /* renamed from: a */
    public void mo222744a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f162454a);
        if (!defaultSharedPreferences.getBoolean("offline_config", false)) {
            defaultSharedPreferences.edit().putBoolean("offline_config", true).apply();
            AbstractC20451n a = C20384b.m74261a(this.f162454a);
            a.mo68924b(true);
            a.mo68923a(false);
            a.mo68925c(true);
            a.mo68926d(false);
            a.mo68927e(false);
            a.mo68928f(false);
        }
    }

    public C64265b(Context context) {
        this.f162454a = context;
        mo222744a();
    }

    @Override // com.ss.lark.android.module.offlinepush.AbstractC64262a
    /* renamed from: a */
    public void mo222725a(boolean z, JSONObject jSONObject) {
        Log.m165383e("MessageConfig", "onConfigChange changed:" + z);
        if (z) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.lark.android.module.offlinepush.$$Lambda$b$w24B5SdPnnb9rmAehPQ1CFYv2e0 */

                public final void run() {
                    C64265b.this.m252719b();
                }
            });
        }
    }
}
