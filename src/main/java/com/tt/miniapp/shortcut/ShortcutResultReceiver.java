package com.tt.miniapp.shortcut;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;

public class ShortcutResultReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private String f168554a;

    /* renamed from: b */
    private IAppContext f168555b;

    /* renamed from: a */
    private ShortcutService m260703a() {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f168555b);
        if (inst == null) {
            return null;
        }
        return (ShortcutService) inst.getService(ShortcutService.class);
    }

    public ShortcutResultReceiver(IAppContext iAppContext) {
        this.f168555b = iAppContext;
    }

    /* renamed from: a */
    private void m260704a(Intent intent) {
        String stringExtra = intent.getStringExtra("key_request_id");
        if (!TextUtils.equals(stringExtra, this.f168554a)) {
            this.f168554a = stringExtra;
            ShortcutService a = m260703a();
            if (a != null) {
                a.onResult(this.f168554a);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        AppBrandLogger.m52829e("ShortcutResultReceiver", "shortcut result callback");
        if (intent != null) {
            m260704a(intent);
        }
    }
}
