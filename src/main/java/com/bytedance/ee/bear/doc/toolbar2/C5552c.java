package com.bytedance.ee.bear.doc.toolbar2;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.PluginInfoExtractException;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.doc.p291b.C5321a;
import com.bytedance.ee.bear.doc.p291b.C5327f;
import com.bytedance.ee.bear.doc.p291b.C5329h;
import com.bytedance.ee.bear.doc.p291b.C5330i;
import com.bytedance.ee.bear.doc.p291b.p292a.C5322a;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.onboarding.C6039a;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingPlugin;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7604b;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.edit.component.toolbar2.C7645l;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p717s.C13725c;
import com.ss.android.lark.slideback.SlideFrameLayout;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.toolbar2.c */
public class C5552c extends AbstractC7604b {
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7604b
    /* renamed from: b */
    public Class<? extends AbstractC7610d> mo22167b() {
        return C5550a.class;
    }

    /* renamed from: h */
    private void m22544h() throws PluginInfoExtractException {
        C4943e.m20402a(this).mo19549a(OnBoardingPlugin.class, new AbstractC4942d() {
            /* class com.bytedance.ee.bear.doc.toolbar2.$$Lambda$c$STK29gbjbZgbOKHLv2vnCj6X1eA */

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                C5552c.this.m22537a((C5552c) ((OnBoardingPlugin) cVar));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m22542f() {
        try {
            C4943e.m20402a(this).mo19549a(OnBoardingPlugin.class, new AbstractC4942d() {
                /* class com.bytedance.ee.bear.doc.toolbar2.$$Lambda$c$C1Sbx6SWlRGqYVTXfOoA5ibjXGQ */

                @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
                public final void onPluginFound(AbstractC4941c cVar) {
                    C5552c.this.m22539b((C5552c) ((OnBoardingPlugin) cVar));
                }
            });
        } catch (PluginInfoExtractException e) {
            C13479a.m54761a("ToolbarV2", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public AbstractC7616f<DocToolbarV2> mo22165a() {
        return (AbstractC7616f) C4950k.m20474a(this, C7645l.class);
    }

    /* renamed from: e */
    private void m22541e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View findViewById = activity.findViewById(16908290);
            if (findViewById.getParent() instanceof SlideFrameLayout) {
                ((SlideFrameLayout) findViewById.getParent()).mo187225a(new SlideFrameLayout.AbstractC54913h() {
                    /* class com.bytedance.ee.bear.doc.toolbar2.C5552c.C55531 */

                    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
                    /* renamed from: a */
                    public void mo22169a(View view, int i) {
                    }

                    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
                    /* renamed from: a */
                    public void mo22170a(View view, boolean z) {
                    }

                    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
                    /* renamed from: a */
                    public void mo22168a(View view, float f) {
                        C5552c.this.mo22165a().hideToolbar();
                    }
                });
            }
        }
    }

    /* renamed from: g */
    private void m22543g() {
        ar.m20936a().mo41507b(AccountService.class).mo238014c($$Lambda$c$kt09XSoWsUEb4Ugn2_gXX_1vec.INSTANCE).mo237998a((AbstractC68322n) $$Lambda$c$MMByPCHWqfPtf1hBeRnopmgAFHI.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.doc.toolbar2.$$Lambda$c$tVFaV0EcWMnFKjnEprKVf4uZxs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5552c.this.m22536a((C5552c) ((AccountService.Account) obj));
            }
        }, $$Lambda$c$_A50uSL0wQxpCfSHOO931JStGA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22536a(AccountService.Account account) throws Exception {
        m22544h();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m22540b(AccountService.Account account) throws Exception {
        if (C13725c.m55671a(account.f14584a, new Date(2021, 1, 1)) < 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22537a(OnBoardingPlugin onBoardingPlugin) {
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39515a(new C5329h(), new C6042c(onBoardingPlugin.getStatusListener(), getActivity(), null, this.f20664f) {
            /* class com.bytedance.ee.bear.doc.toolbar2.C5552c.C55553 */

            @Override // com.bytedance.ee.bear.document.onboarding.C6042c, com.bytedance.ee.bear.onboarding.export.ui.C10403a
            /* renamed from: a */
            public boolean mo22171a() {
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22539b(OnBoardingPlugin onBoardingPlugin) {
        C13479a.m54764b("ToolbarV2", "check show onboarding");
        C55542 r0 = new C6042c(onBoardingPlugin.getStatusListener(), getActivity(), null, this.f20664f) {
            /* class com.bytedance.ee.bear.doc.toolbar2.C5552c.C55542 */

            @Override // com.bytedance.ee.bear.document.onboarding.C6042c, com.bytedance.ee.bear.onboarding.export.ui.C10403a
            /* renamed from: a */
            public boolean mo22171a() {
                return true;
            }
        };
        for (Class cls : new ArrayList(Arrays.asList(C5321a.class, C5327f.class, C5322a.class, C5330i.class))) {
            AbstractC10397d a = C6039a.m24495a().mo24393a(cls);
            if (a != null) {
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39515a(a, r0);
            }
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20664f.postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.doc.toolbar2.$$Lambda$c$aUhuci7AAv9oYYRTzAQNVZyw6Y */

            public final void run() {
                C5552c.this.m22542f();
            }
        }, 100);
        m22541e();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7604b, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public void mo22166a(ItemIdV2 itemIdV2, String str) {
        super.mo22166a(itemIdV2, str);
        if (itemIdV2 == ToolbarPrimaryItemId.insertImage) {
            m22543g();
        }
    }
}
