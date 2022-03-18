package com.bytedance.ee.bear.atbottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.at.AbstractC4241h;
import com.bytedance.ee.bear.atbottombar.AtBottomBar;
import com.bytedance.ee.bear.atbottombar.C4255a;
import com.bytedance.ee.bear.atfinder.AbstractC4269d;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.p526r.C10601c;
import com.bytedance.ee.bear.widget.AbstractC11774d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b;

public class AtBottomBar extends FrameLayout implements AbstractC7720n, AbstractC11774d {

    /* renamed from: a */
    public Context f12769a;

    /* renamed from: b */
    public C4253c f12770b;

    /* renamed from: c */
    public List<C4255a> f12771c = new ArrayList();

    /* renamed from: d */
    public C4258c f12772d;

    /* renamed from: e */
    public boolean f12773e;

    /* renamed from: f */
    public boolean f12774f;

    /* renamed from: g */
    public List<C4260d> f12775g;

    /* renamed from: h */
    public int f12776h = 0;

    /* renamed from: i */
    public AbstractC69621a f12777i = new AbstractC69621a() {
        /* class com.bytedance.ee.bear.atbottombar.AtBottomBar.C42492 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            return null;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return AtBottomBar.this.f12775g.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            C69628b bVar = new C69628b(AtBottomBar.this.f12769a);
            bVar.setContentView(R.layout.at_indicator_item);
            View findViewById = bVar.findViewById(R.id.at_bar_item);
            ImageView imageView = (ImageView) bVar.findViewById(R.id.at_bar_icon);
            imageView.setImageResource(AtBottomBar.this.f12775g.get(i).f12816a);
            findViewById.setOnClickListener(new AbstractView$OnClickListenerC11839e(LocationRequest.PRIORITY_INDOOR) {
                /* class com.bytedance.ee.bear.atbottombar.AtBottomBar.C42492.C42501 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    AtBottomBar.this.f12770b.f12795a.setCurrentItem(i, true);
                }
            });
            bVar.setOnPagerTitleChangeListener(new C4251a(imageView));
            return bVar;
        }
    };

    /* renamed from: j */
    private AbstractC4269d f12778j;

    /* renamed from: k */
    private boolean f12779k = true;

    /* renamed from: l */
    private AbstractC7719m f12780l;

    /* renamed from: m */
    private AbstractC4241h f12781m = new C10601c();

    /* renamed from: n */
    private C4519b f12782n;

    /* renamed from: o */
    private String f12783o;

    /* renamed from: p */
    private C4255a.AbstractC4256a f12784p;

    @Override // com.bytedance.ee.bear.widget.AbstractC11774d
    public void onCancel() {
        mo16685a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.atbottombar.AtBottomBar$c */
    public class C4253c {

        /* renamed from: a */
        public ViewPager f12795a;

        /* renamed from: b */
        public LinearLayout f12796b;

        /* renamed from: d */
        private final int f12798d;

        /* renamed from: e */
        private int f12799e;

        /* renamed from: f */
        private int f12800f;

        /* renamed from: g */
        private MagicIndicator f12801g;

        /* renamed from: h */
        private int f12802h;

        /* renamed from: b */
        private void m17684b() {
            C69619a aVar = new C69619a(AtBottomBar.this.f12769a);
            aVar.setAdapter(AtBottomBar.this.f12777i);
            this.f12801g.setNavigator(aVar);
            C69634c.m267483a(this.f12801g, this.f12795a);
        }

        /* renamed from: c */
        private int m17686c() {
            if (!C13749l.m55763g(AtBottomBar.this.f12769a)) {
                return this.f12802h;
            }
            return Math.min(((C13749l.m55748b() - AtBottomBar.this.f12776h) - AbstractC10550f.AbstractC10551a.m43717b((Activity) AtBottomBar.this.f12769a).mo39934h()) - AtBottomBar.this.f12769a.getResources().getDimensionPixelSize(R.dimen.space_kit_len_44), this.f12802h);
        }

        /* renamed from: a */
        public void mo16707a() {
            this.f12795a.getLayoutParams().height = m17686c();
            AtBottomBar.this.requestLayout();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m17683a(View view) {
            AtBottomBar.this.mo16685a(false);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m17682a(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f12795a.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f12795a.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17685b(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f12795a.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f12795a.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16708a(int i) {
            C13479a.m54772d("AtBarViewHolder", "show atBottomBar");
            this.f12800f = m17686c();
            AtBottomBar.this.f12773e = true;
            if (this.f12795a.getAdapter() != null && i >= this.f12795a.getAdapter().getCount()) {
                i = 0;
            }
            this.f12795a.setCurrentItem(i, false);
            AtBottomBar.this.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12796b, "translationX", (float) this.f12799e, 0.0f);
            ValueAnimator duration = ValueAnimator.ofInt(0, this.f12800f).setDuration((long) this.f12798d);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ee.bear.atbottombar.$$Lambda$AtBottomBar$c$RvmYBNmEBguL3xdgYq06JFVYcFY */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AtBottomBar.C4253c.lambda$RvmYBNmEBguL3xdgYq06JFVYcFY(AtBottomBar.C4253c.this, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration((long) this.f12798d);
            animatorSet.playTogether(ofFloat, duration);
            animatorSet.start();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16709a(boolean z) {
            C13479a.m54772d("AtBarViewHolder", "hide atBottomBar: immediately = " + z);
            AtBottomBar.this.f12773e = false;
            if (z) {
                AtBottomBar.this.setVisibility(8);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12796b, "translationX", 0.0f, (float) this.f12799e);
            ValueAnimator duration = ValueAnimator.ofInt(this.f12800f, 0).setDuration((long) this.f12798d);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ee.bear.atbottombar.$$Lambda$AtBottomBar$c$rlhKjhlWoz7z7heRfZd6txquiOc */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AtBottomBar.C4253c.lambda$rlhKjhlWoz7z7heRfZd6txquiOc(AtBottomBar.C4253c.this, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration((long) this.f12798d);
            animatorSet.playTogether(ofFloat, duration);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.atbottombar.AtBottomBar.C4253c.C42541 */

                public void onAnimationCancel(Animator animator) {
                    AtBottomBar.this.setVisibility(8);
                }

                public void onAnimationEnd(Animator animator) {
                    AtBottomBar.this.setVisibility(8);
                }
            });
            animatorSet.start();
        }

        C4253c(View view) {
            this.f12802h = AtBottomBar.this.f12769a.getResources().getDimensionPixelSize(R.dimen.at_viewpager_max_height);
            this.f12795a = (ViewPager) view.findViewById(R.id.vp_at);
            this.f12801g = (MagicIndicator) view.findViewById(R.id.magic_indicator);
            this.f12796b = (LinearLayout) view.findViewById(R.id.ll_at_bar);
            View findViewById = view.findViewById(R.id.at_back);
            C13747j.m55728a((ImageView) view.findViewById(R.id.at_back_icon), (int) R.color.icon_n1);
            findViewById.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.atbottombar.$$Lambda$AtBottomBar$c$HUtQhN0niQnJcheuAwvlOl5k */

                public final void onClick(View view) {
                    AtBottomBar.C4253c.m269075lambda$HUtQhN0niQnJcheuAwvlOl5k(AtBottomBar.C4253c.this, view);
                }
            });
            this.f12795a.setOffscreenPageLimit(2);
            this.f12795a.setAdapter(new C4257b(AtBottomBar.this.f12771c));
            m17684b();
            this.f12799e = C13749l.m55760e(AtBottomBar.this.f12769a);
            this.f12798d = m17681a(AtBottomBar.this.f12769a.getResources(), R.integer.at_finder_anim_duration);
        }

        /* renamed from: a */
        public static int m17681a(Resources resources, int i) throws Resources.NotFoundException {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
            if (matchConfig == null) {
                return resources.getInteger(i);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(i);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i2 = 0; i2 < min; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (stackTraceElement != null) {
                        if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                            if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                                return matchConfig.mReturnIdWhenException;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return resources.getInteger(i);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.atbottombar.AtBottomBar$b */
    class C4252b implements AbstractC4269d {

        /* renamed from: b */
        private AbstractC4269d f12794b;

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16703a() {
            if (!AtBottomBar.this.f12773e) {
                C13479a.m54772d("AtFinderCallbackWrapper", "onClosedView: atBottomBar is already closed");
            } else if (this.f12794b != null) {
                C13479a.m54764b("AtFinderCallbackWrapper", "onClosedView: isCloseImmediately = " + AtBottomBar.this.f12774f);
                this.f12794b.mo16703a();
                AtBottomBar atBottomBar = AtBottomBar.this;
                atBottomBar.mo16687b(atBottomBar.f12774f);
            } else {
                C13479a.m54775e("AtFinderCallbackWrapper", "onClosedView: atFinderDataCallback is null");
            }
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16704a(AtFinderResultList atFinderResultList) {
            if (this.f12794b != null) {
                C13479a.m54772d("AtFinderCallbackWrapper", "onSelectData");
                this.f12794b.mo16704a(atFinderResultList);
                AtBottomBar.this.mo16687b(false);
                return;
            }
            C13479a.m54775e("AtFinderCallbackWrapper", "onSelectData: atFinderDataCallback is null");
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: b */
        public void mo16706b(String str) {
            C13479a.m54764b("AtFinderCallbackWrapper", "onExistResult: ");
            if (AtBottomBar.this.f12772d != null) {
                AtBottomBar.this.f12772d.mo16721a(false);
            }
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16705a(String str) {
            if (str == null) {
                C13479a.m54775e("AtFinderCallbackWrapper", "onEmptyResult, keyword is null");
                return;
            }
            AbstractC4269d dVar = this.f12794b;
            if (dVar != null) {
                dVar.mo16705a(str);
            } else {
                C13479a.m54775e("AtFinderCallbackWrapper", "onEmptyResult: atFinderDataCallback is null");
            }
        }

        C4252b(AbstractC4269d dVar) {
            this.f12794b = dVar;
        }
    }

    /* renamed from: c */
    private void m17661c() {
        for (final int i = 0; i < this.f12775g.size(); i++) {
            final C4260d dVar = this.f12775g.get(i);
            C4255a aVar = new C4255a(this.f12769a, dVar, this.f12782n, this);
            aVar.mo16714a(this.f12784p);
            dVar.mo16727a(new AbstractC4272g() {
                /* class com.bytedance.ee.bear.atbottombar.AtBottomBar.C42481 */

                @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
                /* renamed from: a */
                public void mo16696a() {
                    AtBottomBar.this.f12772d.mo16717a().get(i).mo16787b();
                }

                @Override // com.bytedance.ee.bear.atfinder.AbstractC4272g
                /* renamed from: a */
                public void mo16697a(AtFinderResult atFinderResult) {
                    AtBottomBar.this.f12772d.mo16717a().get(i).mo16793e().onSearchResult(C10599b.m43900a(dVar.mo16725a()), atFinderResult);
                }
            });
            this.f12771c.add(aVar);
        }
    }

    private int getMentionPanelIndex() {
        if (TextUtils.isEmpty(this.f12783o)) {
            return 0;
        }
        for (int i = 0; i < this.f12775g.size(); i++) {
            C4260d dVar = this.f12775g.get(i);
            if (dVar.mo16730d() != null && dVar.mo16730d().name().equals(this.f12783o)) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo16683a() {
        if (this.f12770b == null) {
            m17661c();
            this.f12781m = this.f12782n.mo17411a();
            this.f12770b = new C4253c(LayoutInflater.from(this.f12769a).inflate(R.layout.at_bar, this));
        }
    }

    /* renamed from: b */
    public void mo16686b() {
        C13479a.m54764b("AtBottomBar", "showAtFinder");
        if (this.f12772d != null) {
            this.f12781m.mo16674a(this.f12779k);
            this.f12781m.mo16669a();
            this.f12772d.mo16721a(false);
            m17660a(getMentionPanelIndex());
        }
    }

    public void setCardsData(List<C4260d> list) {
        this.f12775g = list;
    }

    public void setDelegate(C4255a.AbstractC4256a aVar) {
        this.f12784p = aVar;
    }

    public void setTouchMonitor(AbstractC7719m mVar) {
        this.f12780l = mVar;
    }

    public void setAtCommonConfig(C4519b bVar) {
        if (bVar != null) {
            this.f12782n = bVar;
            return;
        }
        throw new IllegalArgumentException("atCommonConfig not be null!!!");
    }

    /* renamed from: a */
    private void m17660a(int i) {
        if (!this.f12773e) {
            AbstractC7719m mVar = this.f12780l;
            if (mVar != null) {
                mVar.mo30100a(this);
            }
            this.f12770b.mo16708a(i);
            return;
        }
        C13479a.m54775e("AtBottomBar", "show atBottomBar fail: isAnimStart = true");
    }

    /* renamed from: b */
    public void mo16687b(boolean z) {
        if (this.f12773e) {
            AbstractC7719m mVar = this.f12780l;
            if (mVar != null) {
                mVar.mo30101b(this);
            }
            this.f12770b.mo16709a(z);
            return;
        }
        C13479a.m54775e("AtBottomBar", "hide atBottomBar fail: isAnimStart = false");
    }

    public void setSelectDataCallback(AbstractC4269d dVar) {
        if (this.f12772d != null) {
            C4252b bVar = new C4252b(dVar);
            this.f12778j = bVar;
            this.f12772d.mo16719a(bVar);
        }
    }

    public void setTitleBarLocationY(int i) {
        if (C13749l.m55763g(this.f12769a) && i != this.f12776h) {
            this.f12776h = i;
            if (this.f12773e) {
                this.f12770b.mo16707a();
            }
        }
    }

    public AtBottomBar(Context context) {
        super(context);
        this.f12769a = context;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
    public boolean onTouchStartIntercept(MotionEvent motionEvent) {
        C4258c cVar = this.f12772d;
        if (cVar == null || C13749l.m55747a(cVar.mo16722b().mo16715b(), motionEvent) || C13749l.m55747a(this.f12770b.f12796b, motionEvent)) {
            return false;
        }
        mo16685a(false);
        return true;
    }

    /* renamed from: a */
    public void mo16685a(boolean z) {
        C13479a.m54764b("AtBottomBar", "closeAtFinder: immediately = " + z);
        C4258c cVar = this.f12772d;
        if (cVar != null) {
            this.f12774f = z;
            cVar.mo16723c();
        }
    }

    /* renamed from: com.bytedance.ee.bear.atbottombar.AtBottomBar$a */
    private class C4251a implements C69628b.AbstractC69630b {

        /* renamed from: b */
        private View f12792b;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: a */
        public void mo16700a(int i, int i2, float f, boolean z) {
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: b */
        public void mo16702b(int i, int i2, float f, boolean z) {
        }

        public C4251a(View view) {
            this.f12792b = view;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: b */
        public void mo16701b(int i, int i2) {
            this.f12792b.setSelected(false);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: a */
        public void mo16699a(int i, int i2) {
            if (AtBottomBar.this.f12772d != null) {
                AtBottomBar.this.f12772d.mo16718a(i);
            }
            this.f12792b.setSelected(true);
        }
    }

    public AtBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12769a = context;
    }

    /* renamed from: a */
    public void mo16684a(Fragment fragment, C4520c cVar, String str) {
        this.f12783o = str;
        this.f12779k = TextUtils.equals(cVar.mo17419g(), "toolbar");
        C4258c cVar2 = this.f12772d;
        if (cVar2 == null) {
            this.f12772d = new C4258c(this.f12771c, fragment, cVar);
            this.f12781m.mo16672a(cVar);
            return;
        }
        cVar2.mo16720a(cVar);
    }

    public AtBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12769a = context;
    }
}
