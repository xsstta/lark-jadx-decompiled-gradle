package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Banner extends FrameLayout implements ViewPager.OnPageChangeListener {

    /* renamed from: A */
    private int f38116A;

    /* renamed from: B */
    private int f38117B;

    /* renamed from: C */
    private List<View> f38118C;

    /* renamed from: D */
    private LinearLayout f38119D;

    /* renamed from: E */
    private C14459a f38120E;

    /* renamed from: F */
    private ViewPager.OnPageChangeListener f38121F;

    /* renamed from: G */
    private boolean f38122G;

    /* renamed from: H */
    private Method f38123H;

    /* renamed from: I */
    private Field f38124I;

    /* renamed from: a */
    public int f38125a;

    /* renamed from: b */
    public int f38126b;

    /* renamed from: c */
    public int f38127c;

    /* renamed from: d */
    public int f38128d;

    /* renamed from: e */
    public String f38129e;

    /* renamed from: f */
    public boolean f38130f;

    /* renamed from: g */
    public boolean f38131g;

    /* renamed from: h */
    public boolean f38132h;

    /* renamed from: i */
    public int f38133i;

    /* renamed from: j */
    public int f38134j;

    /* renamed from: k */
    public BannerViewPager f38135k;

    /* renamed from: l */
    public List<LynxUI> f38136l;

    /* renamed from: m */
    public final Runnable f38137m;

    /* renamed from: n */
    private int f38138n;

    /* renamed from: o */
    private int f38139o;

    /* renamed from: p */
    private int f38140p;

    /* renamed from: q */
    private int f38141q;

    /* renamed from: r */
    private int f38142r;

    /* renamed from: s */
    private int f38143s;

    /* renamed from: t */
    private int f38144t;

    /* renamed from: u */
    private int f38145u;

    /* renamed from: v */
    private boolean f38146v;

    /* renamed from: w */
    private boolean f38147w;

    /* renamed from: x */
    private boolean f38148x;

    /* renamed from: y */
    private int f38149y;

    /* renamed from: z */
    private int f38150z;

    /* renamed from: a */
    public void mo53219a() {
        int i;
        m58499a(this.f38129e, this.f38141q, this.f38142r, this.f38143s, this.f38132h);
        mo53232e(this.f38147w);
        if (this.f38120E == null) {
            this.f38120E = new C14459a();
            this.f38135k.addOnPageChangeListener(this);
            this.f38135k.setAdapter(this.f38120E);
        }
        int i2 = this.f38133i;
        if (i2 < 0 || i2 >= this.f38136l.size()) {
            this.f38133i = 0;
        }
        if (this.f38130f) {
            i = (this.f38125a / 2) + this.f38133i;
        } else {
            i = this.f38133i;
        }
        m58498a(i, this.f38132h, true);
        if (this.f38131g) {
            mo53222b();
        }
    }

    /* renamed from: b */
    public void mo53222b() {
        removeCallbacks(this.f38137m);
        postDelayed(this.f38137m, (long) this.f38126b);
    }

    /* renamed from: c */
    public void mo53226c() {
        removeCallbacks(this.f38137m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.banner.Banner$a */
    public class C14459a extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            int size = Banner.this.f38136l.size();
            if (size < 2) {
                return size;
            }
            if (Banner.this.f38130f) {
                return Banner.this.f38125a;
            }
            return Banner.this.f38136l.size();
        }

        C14459a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i) {
            if (Banner.this.f38129e.equals("multi-pages")) {
                if (Banner.this.f38134j == 0) {
                    return 1.0f;
                }
                return ((float) Banner.this.f38128d) / ((float) Banner.this.f38134j);
            } else if (Banner.this.f38129e.equals("carousel")) {
                return 0.8f;
            } else {
                return 1.0f;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View a = Banner.this.mo53214a(i, Banner.this.mo53242n(i));
            viewGroup.addView(a);
            return a;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    /* renamed from: d */
    public boolean mo53229d() {
        if (!this.f38122G || !this.f38130f || !"normal".equals(this.f38129e) || this.f38136l.size() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m58501e() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f38135k, new C14460b(this.f38135k.getContext()));
        } catch (Exception e) {
            LLog.m96429e("Banner", e.getMessage());
        }
    }

    /* renamed from: g */
    private void m58503g() {
        try {
            if (this.f38124I == null) {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                this.f38124I = declaredField;
                declaredField.setAccessible(true);
            }
            this.f38124I.set(this.f38135k, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m58502f() {
        if (this.f38120E != null) {
            for (View view : this.f38118C) {
                view.setBackground(m58504o(this.f38116A));
            }
            int i = 0;
            int i2 = this.f38133i;
            if (i2 >= 0 && i2 < this.f38118C.size()) {
                i = this.f38133i;
            }
            if (this.f38118C.size() > 0) {
                this.f38118C.get(i).setBackground(m58504o(this.f38150z));
                this.f38117B = this.f38135k.getCurrentItem();
            }
        }
    }

    /* renamed from: a */
    public Banner mo53215a(int i) {
        this.f38150z = i;
        return this;
    }

    /* renamed from: b */
    public Banner mo53220b(int i) {
        this.f38116A = i;
        return this;
    }

    /* renamed from: c */
    public Banner mo53224c(int i) {
        this.f38149y = i;
        return this;
    }

    /* renamed from: d */
    public Banner mo53228d(boolean z) {
        this.f38146v = z;
        return this;
    }

    /* renamed from: e */
    public Banner mo53231e(int i) {
        this.f38127c = i;
        return this;
    }

    /* renamed from: f */
    public Banner mo53233f(int i) {
        this.f38126b = i;
        return this;
    }

    /* renamed from: j */
    public Banner mo53238j(int i) {
        this.f38128d = i;
        return this;
    }

    /* renamed from: k */
    public Banner mo53239k(int i) {
        this.f38144t = i;
        return this;
    }

    /* renamed from: l */
    public Banner mo53240l(int i) {
        this.f38145u = i;
        return this;
    }

    /* renamed from: m */
    public Banner mo53241m(int i) {
        this.f38134j = i;
        return this;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f38121F = onPageChangeListener;
    }

    public void setTwoItemCircularSwipe(boolean z) {
        this.f38122G = z;
    }

    public Banner(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public Banner mo53221b(boolean z) {
        this.f38148x = z;
        return this;
    }

    /* renamed from: c */
    public Banner mo53225c(boolean z) {
        this.f38131g = z;
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f38121F;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: o */
    private GradientDrawable m58504o(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: e */
    public Banner mo53232e(boolean z) {
        this.f38147w = z;
        BannerViewPager bannerViewPager = this.f38135k;
        if (bannerViewPager != null) {
            bannerViewPager.setScrollable(z);
        }
        return this;
    }

    /* renamed from: f */
    public Banner mo53234f(boolean z) {
        this.f38132h = z;
        m58499a(this.f38129e, this.f38141q, this.f38142r, this.f38143s, z);
        return this;
    }

    /* renamed from: g */
    public Banner mo53235g(int i) {
        this.f38141q = i;
        m58499a(this.f38129e, i, this.f38142r, this.f38143s, this.f38132h);
        return this;
    }

    /* renamed from: h */
    public Banner mo53236h(int i) {
        this.f38142r = i;
        m58499a(this.f38129e, this.f38141q, i, this.f38143s, this.f38132h);
        return this;
    }

    /* renamed from: i */
    public Banner mo53237i(int i) {
        this.f38143s = i;
        m58499a(this.f38129e, this.f38141q, this.f38142r, i, this.f38132h);
        return this;
    }

    /* renamed from: a */
    public Banner mo53218a(boolean z) {
        if (this.f38130f != z) {
            int n = mo53242n(this.f38135k.getCurrentItem());
            this.f38130f = z;
            C14459a aVar = this.f38120E;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
                this.f38135k.setCurrentItem(n);
            }
        }
        return this;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f38131g) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                mo53222b();
            } else if (action == 0) {
                mo53226c();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: p */
    private View m58505p(int i) {
        List<LynxUI> list;
        if (i < 0 || (list = this.f38136l) == null || list.size() == 0 || i >= this.f38136l.size()) {
            return null;
        }
        return this.f38136l.get(i).av();
    }

    /* renamed from: q */
    private View m58506q(int i) {
        List<LynxUI> list;
        View av;
        if (i < 0 || (list = this.f38136l) == null || list.size() == 0 || i >= this.f38136l.size() || (av = this.f38136l.get(i).av()) == null) {
            return null;
        }
        return av.findViewWithTag("swiper_item_mask_tag");
    }

    /* renamed from: d */
    public Banner mo53227d(final int i) {
        C14459a aVar;
        this.f38133i = i;
        if (mo53242n(this.f38135k.getCurrentItem()) == i && (aVar = this.f38120E) != null && aVar.getCount() > 0) {
            return this;
        }
        C14459a aVar2 = this.f38120E;
        if (aVar2 == null || i >= aVar2.getCount()) {
            this.f38135k.postDelayed(new Runnable() {
                /* class com.bytedance.ies.xelement.banner.Banner.RunnableC144572 */

                public void run() {
                    Banner.this.mo53219a();
                }
            }, 200);
        } else {
            this.f38135k.post(new Runnable() {
                /* class com.bytedance.ies.xelement.banner.Banner.RunnableC144561 */

                public void run() {
                    if (Banner.this.f38130f) {
                        int currentItem = Banner.this.f38135k.getCurrentItem();
                        Banner.this.f38135k.setCurrentItem((i + currentItem) - Banner.this.mo53242n(currentItem), Banner.this.f38132h);
                        return;
                    }
                    Banner banner = Banner.this;
                    banner.f38133i = Math.max(Math.min(banner.f38133i, Banner.this.f38136l.size()), 0);
                    Banner.this.f38135k.setCurrentItem(Banner.this.f38133i, Banner.this.f38132h);
                }
            });
        }
        return this;
    }

    /* renamed from: n */
    public int mo53242n(int i) {
        if (this.f38136l.size() == 0 || !this.f38130f) {
            return i;
        }
        int i2 = i - (this.f38125a / 2);
        int abs = Math.abs(i2) % this.f38136l.size();
        if (i2 >= 0 || abs == 0) {
            return abs;
        }
        return this.f38136l.size() - abs;
    }

    /* renamed from: r */
    private View m58507r(int i) {
        List<LynxUI> list;
        View view;
        if (i >= 0 && (list = this.f38136l) != null && list.size() != 0 && i < this.f38136l.size()) {
            int size = this.f38136l.size();
            if (i == 0) {
                view = this.f38136l.get(size - 1).av();
            } else {
                view = this.f38136l.get(i - 1).av();
            }
            if (view != null) {
                return view.findViewWithTag("swiper_item_mask_tag");
            }
        }
        return null;
    }

    /* renamed from: s */
    private View m58508s(int i) {
        List<LynxUI> list;
        View view;
        if (i >= 0 && (list = this.f38136l) != null && list.size() != 0 && i < this.f38136l.size()) {
            if (i == this.f38136l.size() - 1) {
                view = this.f38136l.get(0).av();
            } else {
                view = this.f38136l.get(i + 1).av();
            }
            if (view != null) {
                return view.findViewWithTag("swiper_item_mask_tag");
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo53223b(LynxUI lynxUI) {
        for (LynxUI lynxUI2 : this.f38136l) {
            if (lynxUI2 == lynxUI) {
                this.f38136l.remove(lynxUI);
                if (this.f38146v) {
                    try {
                        this.f38118C.remove(0);
                        LinearLayout linearLayout = this.f38119D;
                        linearLayout.removeView(linearLayout.getChildAt(0));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (this.f38120E != null) {
                    m58503g();
                    this.f38120E.notifyDataSetChanged();
                }
                m58502f();
                return;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f38121F;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(mo53242n(i));
        }
        if (this.f38146v) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f38139o, this.f38140p);
            layoutParams.leftMargin = this.f38138n;
            layoutParams.rightMargin = this.f38138n;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f38139o, this.f38140p);
            layoutParams2.leftMargin = this.f38138n;
            layoutParams2.rightMargin = this.f38138n;
            int n = mo53242n(this.f38117B);
            int n2 = mo53242n(i);
            if (this.f38136l.size() == 0) {
                n2 = 0;
            }
            if (!this.f38118C.isEmpty() && m58500a(n, this.f38118C) && m58500a(n2, this.f38118C)) {
                this.f38118C.get(n).setBackground(m58504o(this.f38116A));
                this.f38118C.get(n).setLayoutParams(layoutParams2);
                this.f38118C.get(n2).setBackground(m58504o(this.f38150z));
                this.f38118C.get(n2).setLayoutParams(layoutParams);
                this.f38117B = i;
            }
        }
    }

    /* renamed from: a */
    public Banner mo53216a(LynxUI lynxUI) {
        if (lynxUI != null) {
            this.f38136l.add(lynxUI);
            if (this.f38146v) {
                View view = new View(getContext());
                view.setClickable(false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f38139o, this.f38140p);
                layoutParams.leftMargin = this.f38138n;
                layoutParams.rightMargin = this.f38138n;
                this.f38119D.addView(view, layoutParams);
                view.setBackground(m58504o(this.f38116A));
                this.f38118C.add(view);
            }
        }
        if (this.f38120E != null) {
            m58503g();
            this.f38120E.notifyDataSetChanged();
        }
        m58502f();
        return this;
    }

    /* renamed from: a */
    public Banner mo53217a(String str) {
        boolean z;
        this.f38129e = str;
        if (str.equals("coverflow") || str.equals("flat-coverflow")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f38148x = true;
            this.f38149y = Color.argb((int) SmActions.ACTION_ONTHECALL_EXIT, 0, 0, 0);
        }
        m58499a(this.f38129e, this.f38141q, this.f38142r, this.f38143s, this.f38132h);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ies.xelement.banner.Banner$b */
    public class C14460b extends Scroller {
        public C14460b(Context context) {
            super(context);
        }

        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, Banner.this.f38127c);
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, Banner.this.f38127c);
        }
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static boolean m58500a(int i, Collection<?> collection) {
        if (i < 0 || i >= collection.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m58497a(int i, View view) {
        View p;
        if ((view instanceof ViewGroup) && view.findViewWithTag("swiper_lynx_view_tag") == null && (p = m58505p(mo53242n(i))) != null) {
            if (p.getParent() instanceof ViewGroup) {
                ((ViewGroup) p.getParent()).removeView(p);
            }
            ((ViewGroup) view).addView(p);
        }
    }

    /* renamed from: a */
    public View mo53214a(int i, int i2) {
        boolean z;
        if (this.f38136l.size() == 0) {
            return new View(getContext());
        }
        LynxUI lynxUI = this.f38136l.get(i2);
        View av = lynxUI.av();
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (av instanceof ViewGroup) {
            if (lynxUI.mo94930M() == 0) {
                z = true;
            } else {
                z = false;
            }
            frameLayout.setClipChildren(z);
        }
        if (av.getParent() instanceof ViewGroup) {
            ((ViewGroup) av.getParent()).removeView(av);
        }
        if (this.f38122G) {
            av.setTag("swiper_lynx_view_tag");
        }
        frameLayout.addView(av);
        View view = new View(getContext());
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        if (!this.f38148x) {
            view.setBackgroundColor(this.f38149y);
            view.setTag("swiper_item_mask_tag");
        }
        if (this.f38122G) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    /* renamed from: a */
    private void m58498a(int i, boolean z, boolean z2) {
        try {
            m58503g();
            if (this.f38123H == null) {
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, Boolean.TYPE, Boolean.TYPE);
                this.f38123H = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.f38123H.invoke(this.f38135k, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2));
        } catch (Throwable th) {
            th.printStackTrace();
            this.f38135k.setCurrentItem(i, z);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (mo53229d()) {
            m58497a(i, findViewWithTag(Integer.valueOf(i)));
            if (f > BitmapDescriptorFactory.HUE_RED) {
                int i3 = i + 1;
                m58497a(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f38121F;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(mo53242n(i), f, i2);
        }
        if (!this.f38148x && this.f38136l != null) {
            int n = mo53242n(i);
            View q = m58506q(n);
            View r = m58507r(n);
            View s = m58508s(n);
            if (q != null) {
                q.setAlpha(f);
            }
            if (r != null) {
                r.setAlpha(1.0f - f);
            }
            if (s != null) {
                s.setAlpha(1.0f - f);
            }
        }
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38125a = 5000;
        this.f38138n = 5;
        this.f38139o = 20;
        this.f38140p = 20;
        this.f38126b = 5000;
        this.f38127c = ParticipantRepo.f117150c;
        this.f38141q = 10;
        this.f38142r = -1;
        this.f38143s = -1;
        this.f38144t = -1;
        this.f38145u = -1;
        this.f38128d = 1;
        this.f38129e = "normal";
        this.f38146v = true;
        this.f38130f = true;
        this.f38131g = true;
        this.f38147w = true;
        this.f38148x = true;
        this.f38132h = true;
        this.f38149y = Color.argb((int) SmActions.ACTION_ONTHECALL_EXIT, 0, 0, 0);
        this.f38150z = Color.argb(255, 255, 255, 255);
        this.f38116A = Color.argb(89, 255, 255, 255);
        this.f38133i = 0;
        this.f38117B = 0;
        this.f38134j = 0;
        this.f38122G = false;
        this.f38136l = new CopyOnWriteArrayList();
        this.f38137m = new Runnable() {
            /* class com.bytedance.ies.xelement.banner.Banner.RunnableC144583 */

            public void run() {
                boolean z;
                if (!Banner.this.f38131g) {
                    return;
                }
                if (Banner.this.f38130f) {
                    if (Banner.this.f38129e.equals("coverflow") || Banner.this.f38129e.equals("flat-coverflow")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size = Banner.this.f38136l.size();
                    int i = 3;
                    if (Banner.this.mo53229d()) {
                        i = 2;
                    }
                    if ((size > 5 || !z) && size >= i) {
                        int currentItem = Banner.this.f38135k.getCurrentItem() + 1;
                        if (currentItem >= Banner.this.f38125a) {
                            Banner.this.f38135k.setCurrentItem(Banner.this.f38125a / 2, false);
                        } else {
                            Banner.this.f38135k.setCurrentItem(currentItem, Banner.this.f38132h);
                        }
                        Banner banner = Banner.this;
                        banner.postDelayed(banner.f38137m, (long) Banner.this.f38126b);
                        return;
                    }
                    return;
                }
                int currentItem2 = Banner.this.f38135k.getCurrentItem() + 1;
                if (currentItem2 >= Banner.this.f38135k.getAdapter().getCount()) {
                    Banner.this.f38135k.setCurrentItem(0, false);
                    Banner banner2 = Banner.this;
                    banner2.postDelayed(banner2.f38137m, (long) Banner.this.f38126b);
                    return;
                }
                Banner.this.f38135k.setCurrentItem(currentItem2, Banner.this.f38132h);
                Banner banner3 = Banner.this;
                banner3.postDelayed(banner3.f38137m, (long) Banner.this.f38126b);
            }
        };
        this.f38118C = new ArrayList();
        View inflate = LayoutInflater.from(context).inflate(R.layout.x_swiper_banner, (ViewGroup) this, true);
        this.f38135k = (BannerViewPager) inflate.findViewById(R.id.bannerViewPager);
        this.f38119D = (LinearLayout) inflate.findViewById(R.id.circleIndicator);
        m58501e();
    }

    /* renamed from: a */
    private void m58499a(String str, int i, int i2, int i3, boolean z) {
        int i4;
        if (str.equals("coverflow") || str.equals("flat-coverflow")) {
            this.f38135k.setClipToPadding(false);
            int i5 = this.f38134j / 5;
            if (i2 < 0 || i3 < 0) {
                this.f38135k.setPadding(i5, 0, i5, 0);
            } else {
                this.f38135k.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.f38135k.setPageMargin(i);
            this.f38135k.setOffscreenPageLimit(2);
            if (str.equals("coverflow")) {
                this.f38135k.setPageTransformer(false, new C14463a());
            }
        } else if (str.equals("multi-pages")) {
            this.f38135k.setClipToPadding(false);
            int i6 = this.f38144t;
            if (i6 >= 0 && (i4 = this.f38145u) >= 0) {
                this.f38135k.setPadding(i6, 0, i4, 0);
            }
            this.f38135k.setPageMargin(i);
            this.f38135k.setOffscreenPageLimit(1);
        } else {
            this.f38135k.setPageMargin(i);
            ViewGroup.LayoutParams layoutParams = this.f38135k.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            this.f38135k.setOffscreenPageLimit(1);
            this.f38135k.setPageTransformer(false, null);
        }
    }
}
