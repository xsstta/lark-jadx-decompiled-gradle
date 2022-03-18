package com.tt.miniapp.shortcut.p3329b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.C66827b;
import com.tt.miniapp.shortcut.ShortcutResult;
import com.tt.miniapp.shortcut.p3328a.C66819a;
import com.tt.miniapp.shortcut.p3328a.C66820b;
import com.tt.miniapp.shortcut.p3328a.C66823c;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.shortcut.b.b */
public class C66829b extends AbstractC66828a {
    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.shortcut.p3329b.AbstractC66828a
    /* renamed from: b */
    public ShortcutResult mo232759b() {
        if (!this.f168585c.f168602c) {
            AppBrandLogger.m52830i("AddHandler", "update shortcut not exist");
            if (!m260750b(this.f168585c.f168600a)) {
                this.f168585c.mo232769a(new ShortcutResult(ShortcutResult.Result.FAIL, "permission_denied"));
            }
            return mo232757a().mo232759b();
        }
        AppBrandLogger.m52830i("AddHandler", "update shortcut need update");
        ToastManager.showShortToast(this.f168584b, this.f168584b.getString(R.string.microapp_m_added_desktop));
        boolean a = m260749a(this.f168585c.f168600a);
        AppBrandLogger.m52830i("AddHandler", "update shortcut result:" + a);
        C66827b.m260742a("yes", "shortcut is exist but need update", this.f168586d);
        return new ShortcutResult(ShortcutResult.Result.SUCCESS, "shortcut is exist but need update");
    }

    /* renamed from: a */
    private boolean m260749a(C66817a aVar) {
        return C66823c.m260737a(this.f168584b, m260748a(this.f168584b, aVar), AppbrandContext.getInst().getInitParams().mo234509i());
    }

    /* renamed from: b */
    private boolean m260750b(C66817a aVar) {
        C66820b a = m260748a(this.f168584b, aVar);
        Intent intent = new Intent();
        intent.setAction("com.tt.appbrand.shorcut." + aVar.mo232737c());
        intent.putExtra("key_request_id", this.f168585c.f168601b);
        boolean a2 = C66823c.m260736a(this.f168584b, a, PendingIntent.getBroadcast(this.f168584b, 1000, intent, 134217728).getIntentSender());
        if (!a2) {
            C66827b.m260742a("no", "permission_denied", this.f168586d);
        }
        AppBrandLogger.m52828d("AddHandler", "addShortCut result", Boolean.valueOf(a2));
        return a2;
    }

    C66829b(C66838e eVar, IAppContext iAppContext) {
        super(eVar, iAppContext);
    }

    /* renamed from: a */
    private C66820b m260748a(Context context, C66817a aVar) {
        Intent intent = new Intent();
        aVar.mo232735a(intent);
        intent.setAction("android.intent.action.VIEW");
        try {
            intent.setClass(context, Class.forName(AppbrandContext.getInst().getInitParams().mo234509i()));
        } catch (ClassNotFoundException e) {
            AppBrandLogger.m52829e("AddHandler", "shortcut launch class not found:", e);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("key_shortcut_id", aVar.mo232738d());
        return new C66820b.C66822a(context, aVar.mo232737c()).mo232751a(C66819a.m260719a(aVar.mo232734a())).mo232752a(aVar.mo232736b()).mo232750a(persistableBundle).mo232749a(intent).mo232754a();
    }
}
