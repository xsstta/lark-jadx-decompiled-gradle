package com.bytedance.ee.bear.wiki.p577b;

import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.DialogC0259b;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12164q;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.b.b */
public class C11909b {

    /* renamed from: a */
    public C12164q f32231a;

    /* renamed from: b */
    public AbstractC11913a f32232b;

    /* renamed from: c */
    private BaseActivity f32233c;

    /* renamed from: d */
    private ViewGroup f32234d;

    /* renamed from: com.bytedance.ee.bear.wiki.b.b$a */
    public interface AbstractC11913a {
        /* renamed from: a */
        void mo45794a();
    }

    /* renamed from: b */
    private int m49390b() {
        return this.f32234d.getMeasuredWidth();
    }

    /* renamed from: a */
    public static boolean m49389a() {
        return ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_wiki_newbie_swipeLeft");
    }

    /* renamed from: b */
    public OnBoardingListener mo45791b(final String str) {
        return new OnBoardingListener() {
            /* class com.bytedance.ee.bear.wiki.p577b.C11909b.C119123 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "wiki tree left swipe cancel");
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_wiki_newbie_pageTree");
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "wiki tree left swipe dismiss");
                if (C11909b.this.f32232b != null) {
                    C11909b.this.f32232b.mo45794a();
                }
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "click I known button, cancel left swipe");
                C11909b.this.f32231a.mo46511f(str);
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_wiki_newbie_pageTree");
            }
        };
    }

    /* renamed from: a */
    private int m49386a(int i) {
        int dimensionPixelSize = i - this.f32234d.getContext().getResources().getDimensionPixelSize(R.dimen.space_kit_len_128);
        C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", " root view width = " + i + " left position = " + dimensionPixelSize);
        return dimensionPixelSize;
    }

    /* renamed from: c */
    private int[] m49391c(String str) {
        List<Integer> g = this.f32231a.mo46512g(str);
        if (!C13657b.m55421a(g)) {
            C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", " target item view location on Screen xPosition = " + g.get(0) + " yPosition = " + g.get(1) + " view height = " + g.get(2));
            return new int[]{g.get(1).intValue(), g.get(2).intValue()};
        }
        C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "get Recycler view target item position on screen and view height failed");
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public RectF mo45788a(String str) {
        int b = m49390b();
        int a = m49386a(b) - C13749l.m55738a(6);
        int[] c = m49391c(str);
        int a2 = c[0] - C13749l.m55738a(5);
        int a3 = c[1] + c[0] + C13749l.m55738a(4);
        C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "RectF left top right bottom " + a + " " + a2 + " " + b + " " + a3);
        return new RectF((float) a, (float) a2, (float) b, (float) a3);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49387a(AbstractC10397d dVar, AbstractC10386a aVar) throws Exception {
        aVar.mo39514a(dVar, this.f32233c);
    }

    /* renamed from: a */
    public Runnable mo45789a(final String str, final DialogC0259b bVar) {
        boolean z;
        if (str == null || bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(" wikiToken == null ");
            boolean z2 = true;
            if (str == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" appCompatDialog == null");
            if (bVar != null) {
                z2 = false;
            }
            sb.append(z2);
            C13479a.m54758a("WikiTreeSwipeLeftOnBoarding", sb.toString());
            return null;
        } else if (m49389a()) {
            C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "wiki tree swipe left had already shown, return");
            return null;
        } else {
            RunnableC119101 r0 = new Runnable() {
                /* class com.bytedance.ee.bear.wiki.p577b.C11909b.RunnableC119101 */

                public void run() {
                    DialogC0259b bVar = bVar;
                    if (bVar != null && bVar.isShowing()) {
                        C11909b.this.f32231a.mo46510e(str);
                        RectF a = C11909b.this.mo45788a(str);
                        if (a == null) {
                            C13479a.m54758a("WikiTreeSwipeLeftOnBoarding", "can not show onBoarding, position == null");
                        } else {
                            C11909b.this.mo45790a(str, a, bVar);
                        }
                    }
                }
            };
            C13742g.m55706a(r0, 500);
            return r0;
        }
    }

    public C11909b(C12164q qVar, ViewGroup viewGroup, BaseActivity baseActivity) {
        this.f32231a = qVar;
        this.f32233c = baseActivity;
        this.f32234d = viewGroup;
    }

    /* renamed from: a */
    public void mo45790a(final String str, final RectF rectF, final DialogC0259b bVar) {
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b(new Consumer(new AbstractC10397d<C10403a>() {
            /* class com.bytedance.ee.bear.wiki.p577b.C11909b.C119112 */

            @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
            /* renamed from: a */
            public String mo21350a() {
                return "wiki";
            }

            @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
            /* renamed from: b */
            public String mo21352b() {
                return "mobile_wiki_newbie_swipeLeft";
            }

            @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
            /* renamed from: c */
            public /* synthetic */ String mo21356c() {
                return AbstractC10397d.CC.$default$c(this);
            }

            /* renamed from: a */
            public boolean mo24400a(C10403a aVar) {
                C13479a.m54764b("WikiTreeSwipeLeftOnBoarding", "show wiki tree left swipe onBoarding");
                String string = aVar.mo39612d().getResources().getString(R.string.Doc_Wiki_OnBoarding_TreeLeftSwipe);
                Window window = bVar.getWindow();
                if (window == null) {
                    C13479a.m54758a("WikiTreeSwipeLeftOnBoarding", "show wiki tree left swipe onBoarding failed, get window failed");
                    return false;
                }
                aVar.mo39604a(window, new C10390c(string, 2, 2, rectF), C11909b.this.mo45791b(str));
                return true;
            }
        }) {
            /* class com.bytedance.ee.bear.wiki.p577b.$$Lambda$b$aMgQKgrPGmSFIxXHVjTjWCzCvyo */
            public final /* synthetic */ AbstractC10397d f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11909b.this.m49387a((C11909b) this.f$1, (AbstractC10397d) ((AbstractC10386a) obj));
            }
        }, $$Lambda$b$c2HykhG1lbGH8ubvw6Mtb9i4Gc8.INSTANCE);
    }
}
