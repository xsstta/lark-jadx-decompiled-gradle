package com.bytedance.ee.bear.wikiv2.p588b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.AbstractC10394d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiTreeMenuPlugin;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiViewModel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.b.a */
public class C12194a {

    /* renamed from: a */
    public Boolean f32821a = false;

    /* renamed from: b */
    public final WikiTreeMenuPlugin f32822b;

    /* renamed from: c */
    private final WikiViewModel f32823c;

    /* renamed from: d */
    private boolean f32824d;

    /* renamed from: b */
    public boolean mo46651b() {
        return this.f32821a.booleanValue();
    }

    /* renamed from: c */
    public OnBoardingListener mo46652c() {
        return new OnBoardingListener() {
            /* class com.bytedance.ee.bear.wikiv2.p588b.C12194a.C121973 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeMenuOnBoarding", "click next step, open wiki tree page");
                C12194a.this.f32821a = true;
                C12194a.this.f32822b.showWikiTree();
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeMenuOnBoarding", "skip wiki tree guide");
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_wiki_newbie_swipeLeft");
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeMenuOnBoarding", "wiki tree guide dismiss");
                C12194a.this.f32821a = true;
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m50788d() {
        C13479a.m54764b("WikiTreeMenuOnBoarding", "click hollow rect to wiki tree view");
        this.f32822b.showWikiTree();
    }

    /* renamed from: a */
    public static boolean m50787a() {
        return ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_wiki_newbie_pageTree");
    }

    public C12194a(WikiTreeMenuPlugin wikiTreeMenuPlugin, WikiViewModel hVar) {
        this.f32822b = wikiTreeMenuPlugin;
        this.f32823c = hVar;
    }

    /* renamed from: a */
    public Runnable mo46649a(final AbstractC4958n nVar, final FragmentActivity fragmentActivity) {
        C13479a.m54764b("WikiTreeMenuOnBoarding", "start onBoarding Mission");
        if (this.f32824d) {
            C13479a.m54764b("WikiTreeMenuOnBoarding", "has show onBoarding in this page" + this);
            return null;
        }
        this.f32824d = true;
        if (m50787a()) {
            C13479a.m54764b("WikiTreeMenuOnBoarding", "wiki tree onboarding has already shown, return");
            return null;
        }
        RunnableC121951 r0 = new Runnable() {
            /* class com.bytedance.ee.bear.wikiv2.p588b.C12194a.RunnableC121951 */

            public void run() {
                if (C13726a.m55676b(fragmentActivity)) {
                    C12194a.this.mo46650b(nVar, fragmentActivity);
                }
            }
        };
        C13742g.m55706a(r0, 500);
        return r0;
    }

    /* renamed from: b */
    public void mo46650b(AbstractC4958n nVar, FragmentActivity fragmentActivity) {
        final View a = nVar.mo19600e().mo19507a("wiki_tree_action");
        if (a == null) {
            C13479a.m54758a("WikiTreeMenuOnBoarding", "show wiki tree onboarding failed, wikiTree == null");
            return;
        }
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b(new Consumer(fragmentActivity) {
            /* class com.bytedance.ee.bear.wikiv2.p588b.$$Lambda$a$AoSk2gzRXA5Uu4jVezS6Fqxq1A */
            public final /* synthetic */ FragmentActivity f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC10386a) obj).mo39514a(AbstractC10397d.this, this.f$1);
            }
        }, $$Lambda$a$bQNmlR2fEhUIKylt05R7v8HAvxU.INSTANCE);
    }

    /* renamed from: a */
    public C10390c mo46648a(String str, int i, int i2, View view) {
        C10390c cVar = new C10390c(str, i, i2, view);
        cVar.mo39559a(new AbstractC10394d() {
            /* class com.bytedance.ee.bear.wikiv2.p588b.$$Lambda$a$qksmsev4lICXeooCAEJkv0HxpWU */

            @Override // com.bytedance.ee.bear.onboarding.export.p516a.p517a.AbstractC10394d
            public final void onClick() {
                C12194a.this.m50788d();
            }
        });
        return cVar;
    }
}
