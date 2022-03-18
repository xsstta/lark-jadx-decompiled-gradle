package com.bytedance.ee.bear.wikiv2.p588b;

import android.app.Dialog;
import android.graphics.RectF;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.b.b */
public class C12198b {

    /* renamed from: a */
    public WikiTreeCtrlView f32831a;

    /* renamed from: b */
    private FragmentActivity f32832b;

    /* renamed from: b */
    private int m50806b() {
        return this.f32831a.getMeasuredWidth();
    }

    /* renamed from: a */
    public static boolean m50805a() {
        return ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a("mobile_wiki_newbie_swipeLeft");
    }

    /* renamed from: b */
    public OnBoardingListener mo46658b(final String str) {
        return new OnBoardingListener() {
            /* class com.bytedance.ee.bear.wikiv2.p588b.C12198b.C122013 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "wiki tree left swipe dismiss");
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "wiki tree left swipe cancel");
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_wiki_newbie_pageTree");
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "click I known button, cancel left swipe");
                C12198b.this.f32831a.mo47708a(str, false);
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_wiki_newbie_pageTree");
            }
        };
    }

    /* renamed from: a */
    private int m50802a(int i) {
        int dimensionPixelSize = i - this.f32832b.getResources().getDimensionPixelSize(R.dimen.space_kit_len_128);
        C13479a.m54764b("WikiTreeSwipeItemOnBoarding", " root view width = " + i + " left position = " + dimensionPixelSize);
        return dimensionPixelSize;
    }

    /* renamed from: c */
    private int[] m50807c(String str) {
        List<Integer> b = this.f32831a.mo47709b(str);
        if (!C13657b.m55421a(b)) {
            C13479a.m54764b("WikiTreeSwipeItemOnBoarding", " target item view location on Screen xPosition = " + b.get(0) + " yPosition = " + b.get(1) + " view height = " + b.get(2));
            return new int[]{b.get(1).intValue(), b.get(2).intValue()};
        }
        C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "get Recycler view target item position on screen and view height failed");
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public RectF mo46655a(String str) {
        int b = m50806b();
        int a = m50802a(b) - C13749l.m55738a(6);
        int[] c = m50807c(str);
        int a2 = c[0] - C13749l.m55738a(5);
        int a3 = c[1] + c[0] + C13749l.m55738a(4);
        C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "RectF left top right bottom " + a + " " + a2 + " " + b + " " + a3);
        return new RectF((float) a, (float) a2, (float) b, (float) a3);
    }

    public C12198b(FragmentActivity fragmentActivity, WikiTreeCtrlView wikiTreeCtrlView) {
        this.f32832b = fragmentActivity;
        this.f32831a = wikiTreeCtrlView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50803a(AbstractC10397d dVar, AbstractC10386a aVar) throws Exception {
        aVar.mo39514a(dVar, this.f32832b);
    }

    /* renamed from: a */
    public Runnable mo46656a(final String str, final Dialog dialog) {
        boolean z;
        if (str == null || dialog == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(" uid == null ");
            boolean z2 = true;
            if (str == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" appCompatDialog == null");
            if (dialog != null) {
                z2 = false;
            }
            sb.append(z2);
            C13479a.m54758a("WikiTreeSwipeItemOnBoarding", sb.toString());
            return null;
        } else if (m50805a()) {
            C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "wiki tree swipe left had already shown, return");
            return null;
        } else {
            RunnableC121991 r0 = new Runnable() {
                /* class com.bytedance.ee.bear.wikiv2.p588b.C12198b.RunnableC121991 */

                public void run() {
                    Dialog dialog = dialog;
                    if (dialog != null && dialog.isShowing()) {
                        C12198b.this.f32831a.mo47708a(str, true);
                        RectF a = C12198b.this.mo46655a(str);
                        if (a == null) {
                            C13479a.m54758a("WikiTreeSwipeItemOnBoarding", "can not show onBoarding, position == null");
                        } else {
                            C12198b.this.mo46657a(str, a, dialog);
                        }
                    }
                }
            };
            C13742g.m55706a(r0, 500);
            return r0;
        }
    }

    /* renamed from: a */
    public void mo46657a(final String str, final RectF rectF, final Dialog dialog) {
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b(new Consumer(new AbstractC10397d<C10403a>() {
            /* class com.bytedance.ee.bear.wikiv2.p588b.C12198b.C122002 */

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
                C13479a.m54764b("WikiTreeSwipeItemOnBoarding", "show wiki tree left swipe onBoarding");
                String string = aVar.mo39612d().getResources().getString(R.string.Doc_Wiki_OnBoarding_TreeLeftSwipe);
                Window window = dialog.getWindow();
                if (window == null) {
                    C13479a.m54758a("WikiTreeSwipeItemOnBoarding", "show wiki tree left swipe onBoarding failed, get window failed");
                    return false;
                }
                aVar.mo39604a(window, new C10390c(string, 2, 2, rectF), C12198b.this.mo46658b(str));
                return true;
            }
        }) {
            /* class com.bytedance.ee.bear.wikiv2.p588b.$$Lambda$b$EoIr2Qgv6TOTJ13cE51xb5ZvdrA */
            public final /* synthetic */ AbstractC10397d f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12198b.this.m50803a((C12198b) this.f$1, (AbstractC10397d) ((AbstractC10386a) obj));
            }
        }, $$Lambda$b$E7Edy1jUDFbg0jwo30SD0HMVI4.INSTANCE);
    }
}
