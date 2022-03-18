package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.tt.miniapp.titlemenu.C66898a;
import com.tt.miniapp.titlemenu.item.C66938f;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.util.C67590h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tt.miniapp.titlemenu.item.f */
public class C66938f extends C66937e {

    /* renamed from: a */
    private C66899a f168836a;

    /* renamed from: b */
    private Activity f168837b;

    /* renamed from: c */
    private MultitaskHelper f168838c;

    /* renamed from: com.tt.miniapp.titlemenu.item.f$a */
    public interface AbstractC66939a {
        /* renamed from: a */
        void mo232935a();
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "multitask";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168836a;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Unit m260998f() {
        mo232963b(true);
        C67070z.m261391a(this.f168837b, 15, this.f168835d);
        return null;
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: c */
    public void mo232939c() {
        MultitaskHelper hVar = this.f168838c;
        if (hVar != null) {
            mo232963b(hVar.mo169049e());
        }
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public void mo232938a(boolean z) {
        this.f168836a.setBadgeEnable(z);
    }

    /* renamed from: a */
    public void mo232962a(AbstractC66939a aVar) {
        this.f168836a.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.tt.miniapp.titlemenu.item.$$Lambda$f$HuSQ6ic9lSc8yDa8wESU88DRdUQ */
            public final /* synthetic */ C66938f.AbstractC66939a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C66938f.lambda$HuSQ6ic9lSc8yDa8wESU88DRdUQ(C66938f.this, this.f$1, view);
            }
        });
    }

    /* renamed from: b */
    public void mo232963b(boolean z) {
        if (z) {
            this.f168836a.setIcon(this.f168837b.getDrawable(2131234088));
            this.f168836a.setLabel(C67590h.m263073a((int) R.string.Lark_Core_CancelFloating));
            return;
        }
        this.f168836a.setIcon(this.f168837b.getDrawable(2131234081));
        this.f168836a.setLabel(C67590h.m263073a((int) R.string.Lark_Core_FloatingWindow));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m260997a(AbstractC66939a aVar, View view) {
        if (LarkExtensionManager.getInstance().getExtension().mo49599e("ecosystem_gadget_mutitask_badge")) {
            LarkExtensionManager.getInstance().getExtension().mo49600f("ecosystem_gadget_mutitask_badge");
            mo232938a(false);
            C66898a.m260906a(this.f168835d).mo232912a(false);
        }
        if (this.f168838c.mo169049e()) {
            this.f168838c.mo169050f();
            mo232963b(false);
        } else {
            this.f168838c.mo169045a(new Function0() {
                /* class com.tt.miniapp.titlemenu.item.$$Lambda$f$EpCFnWmwM_S1nj3BFCsFmYjYUU */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C66938f.m271555lambda$EpCFnWmwM_S1nj3BFCsFmYjYUU(C66938f.this);
                }
            });
        }
        aVar.mo232935a();
    }

    public C66938f(Activity activity, IAppContext iAppContext, MultitaskHelper hVar) {
        super(iAppContext);
        this.f168838c = hVar;
        this.f168837b = activity;
        this.f168836a = new C66899a(activity, iAppContext);
        MultitaskHelper hVar2 = this.f168838c;
        if (hVar2 != null) {
            mo232963b(hVar2.mo169049e());
        }
    }
}
