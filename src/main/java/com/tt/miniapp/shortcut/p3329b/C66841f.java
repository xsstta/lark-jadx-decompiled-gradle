package com.tt.miniapp.shortcut.p3329b;

import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.C66827b;
import com.tt.miniapp.shortcut.ShortcutResult;
import com.tt.miniapp.shortcut.p3328a.C66823c;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapphost.C67554l;

/* renamed from: com.tt.miniapp.shortcut.b.f */
public class C66841f extends AbstractC66828a {
    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.shortcut.p3329b.AbstractC66828a
    /* renamed from: b */
    public ShortcutResult mo232759b() {
        if (!C66823c.m260735a(this.f168584b)) {
            AppBrandLogger.m52828d("ValidateHandler", "device not support shortcut");
            C66827b.m260742a("no", "device_unsupported", this.f168586d);
            return new ShortcutResult(ShortcutResult.Result.FAIL, "device_unsupported");
        }
        final C66817a aVar = this.f168585c.f168600a;
        Observable.create(new Function<ShortcutResult>() {
            /* class com.tt.miniapp.shortcut.p3329b.C66841f.C668432 */

            /* renamed from: a */
            public ShortcutResult fun() {
                C66823c.C66826a a = C66823c.m260732a(C66841f.this.f168584b, aVar);
                if (a.f168581a && !a.f168582b) {
                    AppBrandLogger.m52830i("ValidateHandler", "update shortcut exist");
                    ToastManager.showShortToast(C66841f.this.f168584b, C66841f.this.f168584b.getString(R.string.microapp_m_added_desktop));
                    return new ShortcutResult(ShortcutResult.Result.SUCCESS, "shortcut is exist and shortcut info same");
                } else if (!a.f168581a) {
                    return C66841f.this.mo232757a().mo232759b();
                } else {
                    C66841f.this.f168585c.f168602c = true;
                    return C66841f.this.mo232757a().mo232759b();
                }
            }
        }).schudleOn(C67554l.m262725b()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<ShortcutResult>() {
            /* class com.tt.miniapp.shortcut.p3329b.C66841f.C668421 */

            /* renamed from: a */
            public void onSuccess(ShortcutResult shortcutResult) {
                C66841f.this.f168585c.mo232769a(shortcutResult);
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                C66841f.this.f168585c.mo232769a(new ShortcutResult(ShortcutResult.Result.FAIL, Log.getStackTraceString(th)));
            }
        });
        return null;
    }

    C66841f(C66838e eVar, IAppContext iAppContext) {
        super(eVar, iAppContext);
    }
}
