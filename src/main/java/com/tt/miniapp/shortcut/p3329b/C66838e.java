package com.tt.miniapp.shortcut.p3329b;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.C66827b;
import com.tt.miniapp.shortcut.ShortcutResult;
import com.tt.miniapp.shortcut.ShortcutService;
import com.tt.miniapp.shortcut.p3328a.C66823c;
import com.tt.miniapphost.C67554l;
import java.util.List;
import java.util.UUID;

/* renamed from: com.tt.miniapp.shortcut.b.e */
public class C66838e {

    /* renamed from: a */
    public C66817a f168600a;

    /* renamed from: b */
    public String f168601b = UUID.randomUUID().toString();

    /* renamed from: c */
    boolean f168602c;

    /* renamed from: d */
    Activity f168603d;

    /* renamed from: e */
    public IAppContext f168604e;

    /* renamed from: b */
    private void m260765b() {
        if (Build.VERSION.SDK_INT < 25) {
            C66827b.m260742a("yes", "add shortcut success", this.f168604e);
        } else {
            Observable.create(new Function<Boolean>() {
                /* class com.tt.miniapp.shortcut.p3329b.C66838e.C668402 */

                /* renamed from: a */
                public Boolean fun() {
                    return Boolean.valueOf(C66823c.m260738a(C66838e.this.f168603d, C66838e.this.f168600a.mo232737c()));
                }
            }).schudleOn(C67554l.m262725b()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
                /* class com.tt.miniapp.shortcut.p3329b.C66838e.C668391 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    C66827b.m260742a("no", Log.getStackTraceString(th), C66838e.this.f168604e);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        C66827b.m260742a("yes", "add shortcut success", C66838e.this.f168604e);
                        ((ShortcutService) AppbrandApplicationImpl.getInst(C66838e.this.f168604e).getService(ShortcutService.class)).setShortcutState(true);
                        return;
                    }
                    C66827b.m260742a("no", "permission_denied", C66838e.this.f168604e);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo232768a() {
        C66836d dVar = new C66836d(this, this.f168604e);
        C66841f fVar = new C66841f(this, this.f168604e);
        C66829b bVar = new C66829b(this, this.f168604e);
        C66830c cVar = new C66830c(this, this.f168604e);
        dVar.mo232758a(fVar);
        fVar.mo232758a(bVar);
        bVar.mo232758a(cVar);
        mo232769a(dVar.mo232759b());
    }

    /* renamed from: a */
    public synchronized void mo232769a(ShortcutResult shortcutResult) {
        if (shortcutResult != null) {
            ShortcutResult.Result a = shortcutResult.mo232721a();
            if (a == ShortcutResult.Result.FAIL) {
                C66827b.m260742a("no", shortcutResult.mo232722b(), this.f168604e);
            } else if (a == ShortcutResult.Result.SUCCESS) {
                String b = shortcutResult.mo232722b();
                if (TextUtils.equals(b, "shortcut is exist and shortcut info same")) {
                    ((ShortcutService) AppbrandApplicationImpl.getInst(this.f168604e).getService(ShortcutService.class)).setShortcutState(true);
                }
                C66827b.m260742a("yes", b, this.f168604e);
            } else if (a == ShortcutResult.Result.NEED_CHECK) {
                m260765b();
            }
            ShortcutService shortcutService = (ShortcutService) AppbrandApplicationImpl.getInst(this.f168604e).getService(ShortcutService.class);
            List<C66838e> pendingList = shortcutService.getPendingList();
            if (pendingList != null) {
                pendingList.remove(this);
                if (pendingList.size() == 0) {
                    AppBrandLogger.m52828d("ShortcutRequest", "pendingList is empty unregister broadcast");
                    shortcutService.unregisterIntentCallback();
                }
            }
        }
    }

    public C66838e(Activity activity, C66817a aVar, IAppContext iAppContext) {
        this.f168604e = iAppContext;
        this.f168603d = activity;
        this.f168600a = aVar;
    }
}
