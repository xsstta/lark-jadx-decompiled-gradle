package com.bytedance.ee.bear.banner;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.ee.bear.banner.bean.BannerScene;
import com.bytedance.ee.bear.banner.p247b.C4320b;
import com.bytedance.ee.bear.banner.p247b.C4322c;
import com.bytedance.ee.bear.banner.p247b.C4323d;
import com.bytedance.ee.bear.banner.p247b.C4325e;
import com.bytedance.ee.bear.banner.p247b.C4326f;
import com.bytedance.ee.bear.banner.p248c.AbstractC4335a;
import com.bytedance.ee.bear.banner.p248c.AbstractC4336b;
import com.bytedance.ee.bear.banner.p249d.AbstractC4338a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.banner.export.AbstractC29478a;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.banner.b */
public class C4316b implements AbstractC4339e {

    /* renamed from: a */
    public static final String f12916a = ("DocsBanner_" + C4316b.class.getSimpleName());

    /* renamed from: b */
    public static List<AbstractC4336b> f12917b = new ArrayList();

    /* renamed from: c */
    private AbstractC29479b f12918c;

    /* renamed from: d */
    private WeakReference<ViewGroup> f12919d;

    /* renamed from: e */
    private WeakReference<Context> f12920e;

    /* renamed from: f */
    private AbstractC4335a f12921f;

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16915a(BannerScene bannerScene) {
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16917a(boolean z) {
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: b */
    public void mo16918b() {
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: e */
    public List<AbstractC4336b> mo16921e() {
        return f12917b;
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: d */
    public AbstractC4335a mo16920d() {
        if (this.f12921f == null) {
            this.f12921f = new AbstractC4335a() {
                /* class com.bytedance.ee.bear.banner.C4316b.C43182 */

                @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4335a
                /* renamed from: a */
                public void mo16924a(AbstractC4336b bVar) {
                    C4316b.f12917b.add(bVar);
                }

                @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4335a
                /* renamed from: b */
                public void mo16925b(AbstractC4336b bVar) {
                    C4316b.f12917b.remove(bVar);
                }
            };
        }
        return this.f12921f;
    }

    /* renamed from: f */
    private void m17835f() {
        C13479a.m54764b(f12916a, "initControllerListener()...");
        this.f12918c.mo104347a(new AbstractC29479b.AbstractC29480a() {
            /* class com.bytedance.ee.bear.banner.C4316b.C43171 */

            @Override // com.ss.android.lark.banner.export.AbstractC29479b.AbstractC29480a
            /* renamed from: a */
            public void mo16922a() {
                C13479a.m54764b(C4316b.f12916a, "controllerListener, onBannerClose()...");
                C4316b.this.mo16916a((AbstractC29478a) null);
            }

            @Override // com.ss.android.lark.banner.export.AbstractC29479b.AbstractC29480a
            /* renamed from: a */
            public void mo16923a(AbstractC29478a aVar) {
                String str = C4316b.f12916a;
                C13479a.m54764b(str, "onBannerAvailable()...，banner = " + aVar);
                C4316b.this.mo16916a(aVar);
            }
        });
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: c */
    public void mo16919c() {
        C13479a.m54764b(f12916a, "destroy()...");
        AbstractC29479b bVar = this.f12918c;
        if (bVar != null) {
            bVar.mo104357e();
            this.f12918c = null;
        }
    }

    /* renamed from: h */
    private Map<String, String> m17837h() {
        HashMap hashMap = new HashMap();
        String str = f12916a;
        C13479a.m54764b(str, "getExtraParam()... version = " + "4");
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "4");
        return hashMap;
    }

    /* renamed from: g */
    private void m17836g() {
        C13479a.m54764b(f12916a, "registerHandler()...");
        this.f12918c.mo104350a("OldUserNavigation", new C4323d());
        this.f12918c.mo104350a("NewUserNavigation", new C4320b());
        this.f12918c.mo104350a("NewYearTpl", new C4322c());
        this.f12918c.mo104350a("MobileTemplRecommendationV1", new C4325e());
        this.f12918c.mo104350a("SingleProductTemplRecommendationV1", new C4325e());
        this.f12918c.mo104350a("SingleProductTemplRecommendationV3", new C4326f());
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16913a() {
        String str = f12916a;
        C13479a.m54764b(str, "loadBanners()...");
        if (this.f12920e.get() != null && this.f12919d.get() != null) {
            if (this.f12918c == null) {
                AbstractC29479b a = ((AbstractC4338a) KoinJavaComponent.m268610a(AbstractC4338a.class)).mo16948a("BANNER_SCENE_CCM");
                this.f12918c = a;
                if (a == null) {
                    C13479a.m54758a(str, "loadBanner()... unable to get BannerController instance");
                    return;
                }
                m17835f();
                m17836g();
                this.f12918c.mo104356d();
            }
            this.f12918c.mo104352a(m17837h());
        }
    }

    /* renamed from: a */
    public void mo16916a(AbstractC29478a aVar) {
        C13479a.m54764b(f12916a, "updateBanner()...");
        Context context = this.f12920e.get();
        ViewGroup viewGroup = this.f12919d.get();
        if (context != null && viewGroup != null) {
            C13742g.m55705a(new Runnable(viewGroup, aVar, context) {
                /* class com.bytedance.ee.bear.banner.$$Lambda$b$d9IGRrWYoZMvLLr040gsGuoHDSM */
                public final /* synthetic */ ViewGroup f$1;
                public final /* synthetic */ AbstractC29478a f$2;
                public final /* synthetic */ Context f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C4316b.lambda$d9IGRrWYoZMvLLr040gsGuoHDSM(C4316b.this, this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16914a(ViewGroup viewGroup, Context context) {
        this.f12919d = new WeakReference<>(viewGroup);
        this.f12920e = new WeakReference<>(context);
    }

    /* renamed from: a */
    private void m17832a(View view, ViewGroup viewGroup) {
        C13479a.m54764b(f12916a, "startCloseAnim()...");
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) view.getMeasuredHeight(), 0.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view, viewGroup) {
            /* class com.bytedance.ee.bear.banner.$$Lambda$b$vzmX9uMJtQboXYCzXZoVRNXRWc */
            public final /* synthetic */ View f$0;
            public final /* synthetic */ ViewGroup f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4316b.m269077lambda$vzmX9uMJtQboXYCzXZoVRNXRWc(this.f$0, this.f$1, valueAnimator);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat2.setDuration(250L);
        ofFloat.start();
        ofFloat2.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17833a(View view, ViewGroup viewGroup, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.setLayoutParams(layoutParams);
        if (layoutParams.height == 0) {
            view.setVisibility(8);
            viewGroup.removeView(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17834a(ViewGroup viewGroup, AbstractC29478a aVar, Context context) {
        View a;
        if (viewGroup.getChildCount() > 0) {
            if (aVar == null) {
                m17832a(viewGroup.getChildAt(0), viewGroup);
            } else {
                viewGroup.removeAllViews();
            }
        }
        if (aVar != null && (a = aVar.mo104364a(context)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.topMargin = C57582a.m223600a(4);
            marginLayoutParams.bottomMargin = C57582a.m223600a(8);
            viewGroup.addView(a, marginLayoutParams);
        }
    }
}
