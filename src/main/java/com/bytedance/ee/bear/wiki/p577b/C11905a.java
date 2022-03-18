package com.bytedance.ee.bear.wiki.p577b;

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
import com.bytedance.ee.bear.wiki.C12008i;
import com.bytedance.ee.bear.wiki.browser.plugin.WikiTreeMenuPlugin;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.b.a */
public class C11905a {

    /* renamed from: a */
    public final WikiTreeMenuPlugin f32222a;

    /* renamed from: b */
    public final C12008i f32223b;

    /* renamed from: c */
    private boolean f32224c;

    /* renamed from: b */
    public OnBoardingListener mo45784b() {
        return new OnBoardingListener() {
            /* class com.bytedance.ee.bear.wiki.p577b.C11905a.C119083 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeOnBoarding", "click next step, open wiki tree page");
                C11905a.this.f32222a.showWikiTree();
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeOnBoarding", "skip wiki tree guide");
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_wiki_newbie_swipeLeft");
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeOnBoarding", "wiki tree guide dismiss");
                C11905a.this.f32223b.getWikiInfoLoadCompletedLiveData().mo5929b((Void) null);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m49373c() {
        C13479a.m54764b("WikiTreeOnBoarding", "click hollow rect to wiki tree view");
        this.f32222a.showWikiTree();
    }

    /* renamed from: a */
    public static boolean m49372a() {
        return ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_wiki_newbie_pageTree");
    }

    public C11905a(WikiTreeMenuPlugin wikiTreeMenuPlugin, C12008i iVar) {
        this.f32222a = wikiTreeMenuPlugin;
        this.f32223b = iVar;
    }

    /* renamed from: a */
    public Runnable mo45783a(final AbstractC4958n nVar, final FragmentActivity fragmentActivity) {
        C13479a.m54764b("WikiTreeOnBoarding", "start onBoarding Mission");
        if (this.f32224c) {
            C13479a.m54764b("WikiTreeOnBoarding", "has show onBoarding in this page" + this);
            return null;
        }
        this.f32224c = true;
        if (m49372a()) {
            C13479a.m54764b("WikiTreeOnBoarding", "wiki tree onboarding has already shown, return");
            return null;
        }
        RunnableC119061 r0 = new Runnable() {
            /* class com.bytedance.ee.bear.wiki.p577b.C11905a.RunnableC119061 */

            public void run() {
                if (C13726a.m55676b(fragmentActivity)) {
                    C11905a.this.mo45785b(nVar, fragmentActivity);
                }
            }
        };
        C13742g.m55706a(r0, 500);
        return r0;
    }

    /* renamed from: b */
    public void mo45785b(AbstractC4958n nVar, FragmentActivity fragmentActivity) {
        final View a = nVar.mo19600e().mo19507a("wiki_tree_action");
        if (a == null) {
            C13479a.m54758a("WikiTreeOnBoarding", "show wiki tree onboarding failed, wikiTree == null");
            return;
        }
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b(new Consumer(fragmentActivity) {
            /* class com.bytedance.ee.bear.wiki.p577b.$$Lambda$a$Ncn8fc3wohUTnTV3jJ4dE6uXPM */
            public final /* synthetic */ FragmentActivity f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC10386a) obj).mo39514a(AbstractC10397d.this, this.f$1);
            }
        }, $$Lambda$a$RXM9ddA8vReCoN13qm8gWRG9KSg.INSTANCE);
    }

    /* renamed from: a */
    public C10390c mo45782a(String str, int i, int i2, View view) {
        C10390c cVar = new C10390c(str, i, i2, view);
        cVar.mo39559a(new AbstractC10394d() {
            /* class com.bytedance.ee.bear.wiki.p577b.$$Lambda$a$y4F2ZLH91LJ3XUUS4xxZjxafpfg */

            @Override // com.bytedance.ee.bear.onboarding.export.p516a.p517a.AbstractC10394d
            public final void onClick() {
                C11905a.this.m49373c();
            }
        });
        return cVar;
    }
}
