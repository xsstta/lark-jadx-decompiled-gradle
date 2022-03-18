package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.banner.AbstractC4339e;
import com.bytedance.ee.bear.banner.p248c.AbstractC4335a;
import com.bytedance.ee.bear.banner.p248c.AbstractC4336b;
import com.bytedance.ee.bear.banner.p248c.AbstractC4337c;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.lark.C7983b;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.core.p3520e.C70042b;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.c.k */
public class C8026k implements AbstractC8019d {

    /* renamed from: a */
    private FrameLayout f21508a;

    /* renamed from: b */
    private AbstractC4339e f21509b;

    /* renamed from: c */
    private AbstractC4335a f21510c;

    /* renamed from: d */
    private AbstractC4336b f21511d;

    /* renamed from: e */
    private C7983b f21512e;

    /* renamed from: f */
    private Disposable f21513f;

    /* renamed from: g */
    private boolean f21514g;

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public void mo31027a(ConnectionService.NetworkState networkState) {
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: a */
    public void mo31029a(boolean z) {
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public boolean mo31030a() {
        return false;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public boolean mo31032b() {
        return this.f21514g;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        C13479a.m54764b("UGHeader", "reload()...");
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        C13479a.m54764b("UGHeader", "destroy()...");
        this.f21508a = null;
        this.f21512e = null;
        AbstractC4339e eVar = this.f21509b;
        if (eVar != null) {
            eVar.mo16919c();
        }
        AbstractC4335a aVar = this.f21510c;
        if (aVar != null) {
            aVar.mo16925b(this.f21511d);
        }
        Disposable disposable = this.f21513f;
        if (disposable != null && !disposable.isDisposed()) {
            this.f21513f.dispose();
        }
    }

    public C8026k(C7983b bVar) {
        this.f21512e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32065a(AbstractC4337c cVar) {
        C13479a.m54764b("UGHeader", "UserNavigationBannerListener... begin guide");
        C7983b bVar = this.f21512e;
        if (bVar != null) {
            bVar.mo30960a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32066a(Throwable th) throws Exception {
        C13479a.m54758a("UGHeader", "OnBoarding module init failed, error = " + th);
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        C13479a.m54764b("UGHeader", "createView()...");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21508a = frameLayout;
        return frameLayout;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.ug.reach.banner.enable", false);
        C13479a.m54764b("UGHeader", "initData()...enableUgReach = " + a);
        this.f21514g = true;
        AbstractC4339e eVar = this.f21509b;
        if (eVar != null) {
            eVar.mo16919c();
        }
        this.f21513f = ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b(new Consumer(a, context) {
            /* class com.bytedance.ee.bear.lark.p415c.$$Lambda$k$_jRpKNDN8SATFn6OoIErosrkaUQ */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8026k.this.m32067a(this.f$1, this.f$2, (AbstractC10386a) obj);
            }
        }, $$Lambda$k$njoNaNdh2VDJKYDg4492gvTBSUM.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32067a(boolean z, Context context, AbstractC10386a aVar) throws Exception {
        C13479a.m54764b("UGHeader", "OnBoarding module init success");
        AbstractC4339e eVar = (AbstractC4339e) KoinJavaComponent.m268611a(AbstractC4339e.class, C70042b.m268676a("space"));
        this.f21509b = eVar;
        eVar.mo16917a(z);
        this.f21509b.mo16914a(this.f21508a, context);
        this.f21509b.mo16913a();
        this.f21510c = this.f21509b.mo16920d();
        $$Lambda$k$z9Vp3_0D0XeQVAjNmDDmh_JA_w r2 = new AbstractC4336b() {
            /* class com.bytedance.ee.bear.lark.p415c.$$Lambda$k$z9Vp3_0D0XeQVAjNmDDmh_JA_w */

            @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4336b
            public final void beginGuide(AbstractC4337c cVar) {
                C8026k.this.m32065a((C8026k) cVar);
            }
        };
        this.f21511d = r2;
        this.f21510c.mo16924a(r2);
    }
}
