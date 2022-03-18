package com.ss.android.lark.reaction.widget.detailwindow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.widget.detailwindow.C52991a;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.C53009e;
import com.ss.android.lark.reaction.widget.detailwindow.bean.C53006a;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53031a;
import com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53039i;
import com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53040j;
import com.ss.android.lark.reaction.widget.detailwindow.scroller.C53035e;
import com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.List;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.e */
public class C53009e implements C52991a.AbstractC52993b {

    /* renamed from: a */
    public static final Double f130950a = Double.valueOf(0.67d);

    /* renamed from: b */
    ScrollableLayout f130951b;

    /* renamed from: c */
    View f130952c;

    /* renamed from: d */
    ViewGroup f130953d;

    /* renamed from: e */
    ViewGroup f130954e;

    /* renamed from: f */
    View f130955f;

    /* renamed from: g */
    ViewGroup f130956g;

    /* renamed from: h */
    MagicIndicator f130957h;

    /* renamed from: i */
    ViewPager f130958i;

    /* renamed from: j */
    View f130959j;

    /* renamed from: k */
    ViewGroup f130960k;

    /* renamed from: l */
    View f130961l;

    /* renamed from: m */
    public AbstractC53019d f130962m;

    /* renamed from: n */
    public Context f130963n;

    /* renamed from: o */
    public List<C53006a> f130964o;

    /* renamed from: p */
    private Fragment f130965p;

    /* renamed from: q */
    private LayoutInflater f130966q;

    /* renamed from: r */
    private String f130967r;

    /* renamed from: s */
    private int f130968s;

    /* renamed from: t */
    private RecyclerView f130969t;

    /* renamed from: u */
    private AbstractC69621a f130970u = new AbstractC69621a() {
        /* class com.ss.android.lark.reaction.widget.detailwindow.C53009e.C530101 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            return null;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return C53009e.this.f130964o.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            C69628b bVar = new C69628b(C53009e.this.f130963n);
            bVar.setContentView(R.layout.layout_reaction_detail_pager_title);
            C53009e.this.mo181085a(bVar, i);
            return bVar;
        }
    };

    /* renamed from: v */
    private C53002b.AbstractC53005b f130971v = new C53002b.AbstractC53005b() {
        /* class com.ss.android.lark.reaction.widget.detailwindow.C53009e.C530112 */

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
        public void onItemClicked(String str) {
            if (C53009e.this.f130962m != null) {
                C53009e.this.f130962m.mo181050a(str);
            }
        }
    };

    /* renamed from: w */
    private C53002b.AbstractC53004a f130972w = new C53002b.AbstractC53004a() {
        /* class com.ss.android.lark.reaction.widget.detailwindow.C53009e.C530123 */

        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53004a
        /* renamed from: a */
        public ReactionDetailViewModel mo166647a(String str) {
            if (C53009e.this.f130962m != null) {
                return C53009e.this.f130962m.mo181051b(str);
            }
            return null;
        }
    };

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.e$a */
    public interface AbstractC53016a {
        void makeChange(int i);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.e$d */
    public interface AbstractC53019d {
        /* renamed from: a */
        void mo181048a();

        /* renamed from: a */
        void mo181049a(C53009e eVar);

        /* renamed from: a */
        void mo181050a(String str);

        /* renamed from: b */
        ReactionDetailViewModel mo181051b(String str);

        /* renamed from: b */
        void mo181052b();
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52993b
    /* renamed from: b */
    public void mo181025b() {
    }

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.e$c */
    private static class C53018c extends C53035e {
        private C53018c() {
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53032b, com.ss.android.lark.reaction.widget.detailwindow.scroller.C53035e
        /* renamed from: a */
        public int mo181087a(ScrollableLayout scrollableLayout, int i, int i2) {
            int i3 = i2 / 4;
            if (i > i2 - i3) {
                return i2;
            }
            if (i < i3) {
                return 0;
            }
            return Double.valueOf(((double) i2) * C53009e.f130950a.doubleValue()).intValue();
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53032b, com.ss.android.lark.reaction.widget.detailwindow.scroller.C53035e
        /* renamed from: a */
        public int mo181088a(ScrollableLayout scrollableLayout, boolean z, int i, int i2, int i3) {
            int intValue = Double.valueOf(((double) i3) * C53009e.f130950a.doubleValue()).intValue();
            if (!z) {
                return super.mo181088a(scrollableLayout, false, i, i2, i3);
            }
            if (i < intValue) {
                return super.mo181088a(scrollableLayout, true, i, i2, i3);
            }
            return intValue;
        }
    }

    /* renamed from: a */
    public void mo181085a(C69628b bVar, int i) {
        ViewGroup viewGroup = (ViewGroup) bVar.findViewById(R.id.reaction_title_wrapper);
        C52977a.m205190a().mo180995a((ImageView) bVar.findViewById(R.id.reaction_icon), this.f130964o.get(i).f130943b);
        ((TextView) bVar.findViewById(R.id.reaction_count)).setText(String.valueOf(this.f130964o.get(i).f130944c));
        bVar.setOnPagerTitleChangeListener(new C53017b(viewGroup));
        m205300a(bVar.getChildAt(0), i);
        viewGroup.setOnClickListener(new View.OnClickListener(i) {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$7L518xsFu82aVOCodnS3qRHgd9g */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C53009e.lambda$7L518xsFu82aVOCodnS3qRHgd9g(C53009e.this, this.f$1, view);
            }
        });
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52993b
    /* renamed from: a */
    public void mo181024a(List<C53006a> list, String str) {
        this.f130964o = list;
        m205302a(list);
        this.f130967r = str;
        this.f130958i.setAdapter(new FragmentPagerAdapter(this.f130965p.getChildFragmentManager()) {
            /* class com.ss.android.lark.reaction.widget.detailwindow.C53009e.C530145 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getItemPosition(Object obj) {
                return -2;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return C53009e.this.f130964o.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return C53009e.this.f130964o.get(i).f130942a;
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public long getItemId(int i) {
                return (long) C53009e.this.f130964o.get(i).hashCode();
            }
        });
        m205308d();
        this.f130958i.post(new Runnable() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$A7GxrLz5U1NdvdxiqjApR34I0s */

            public final void run() {
                C53009e.m270924lambda$A7GxrLz5U1NdvdxiqjApR34I0s(C53009e.this);
            }
        });
    }

    /* renamed from: i */
    private void m205313i() {
        m205296a(this.f130951b.getScrollY(), 0, new AbstractC53016a() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$kiOOyerSs_HgZpi5lU0lPx8PERE */

            @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53016a
            public final void makeChange(int i) {
                C53009e.lambda$kiOOyerSs_HgZpi5lU0lPx8PERE(C53009e.this, i);
            }
        });
    }

    /* renamed from: c */
    private void m205305c() {
        m205314j();
        m205311g();
        this.f130958i.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.C53009e.C530134 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                C53009e.this.mo181084a(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                C53009e.this.mo181084a(i);
            }
        });
    }

    /* renamed from: d */
    private void m205308d() {
        C69619a aVar = new C69619a(this.f130963n);
        aVar.setAdapter(this.f130970u);
        this.f130957h.setNavigator(aVar);
        C69634c.m267483a(this.f130957h, this.f130958i);
    }

    /* renamed from: g */
    private void m205311g() {
        if (!DesktopUtil.m144307b()) {
            this.f130959j.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$9tUb4Mgh8iRCzAKnDrV3a4Bj60I */

                public final void onClick(View view) {
                    C53009e.lambda$9tUb4Mgh8iRCzAKnDrV3a4Bj60I(C53009e.this, view);
                }
            });
        } else {
            this.f130961l.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$mI7FVVWcSK6Ng1Q5D2K1nCDXlM */

                public final void onClick(View view) {
                    C53009e.m270928lambda$mI7FVVWcSK6Ng1Q5D2K1nCDXlM(C53009e.this, view);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m205309e() {
        int size = this.f130964o.size();
        for (int i = 0; i < size; i++) {
            if (this.f130964o.get(i).f130943b.equals(this.f130967r)) {
                this.f130958i.setCurrentItem(i);
                return;
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m205310f() {
        if (this.f130968s < this.f130964o.size()) {
            this.f130958i.setCurrentItem(this.f130968s);
            return;
        }
        int size = this.f130964o.size();
        for (int i = 0; i < size; i++) {
            if (this.f130964o.get(i).f130943b.equals(this.f130967r)) {
                this.f130958i.setCurrentItem(i);
                return;
            }
        }
    }

    /* renamed from: h */
    private void m205312h() {
        this.f130951b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.C53009e.ViewTreeObserver$OnGlobalLayoutListenerC530156 */

            public void onGlobalLayout() {
                int height = C53009e.this.f130952c.getHeight();
                if (height != 0) {
                    C53009e.this.f130951b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    C53009e.this.f130951b.setMaxScrollY(height);
                    C53009e.this.f130951b.setCloseUpAlgorithm(new C53018c());
                    C53009e.m205296a(0, Double.valueOf(((double) height) * C53009e.f130950a.doubleValue()).intValue(), new AbstractC53016a() {
                        /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$6$YPC5WVHVOcGCqL9UFSdc4RuJYwQ */

                        @Override // com.ss.android.lark.reaction.widget.detailwindow.C53009e.AbstractC53016a
                        public final void makeChange(int i) {
                            C53009e.ViewTreeObserver$OnGlobalLayoutListenerC530156.lambda$YPC5WVHVOcGCqL9UFSdc4RuJYwQ(C53009e.ViewTreeObserver$OnGlobalLayoutListenerC530156.this, i);
                        }
                    });
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m205325a(int i) {
                C53009e.this.f130951b.scrollTo(0, i);
            }
        });
        this.f130951b.setDraggableView(this.f130954e);
        this.f130951b.setCanScrollVerticallyDelegate(new AbstractC53031a() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$GyeifJ2danbyQCBjICiQxT_nWDM */

            @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53031a
            public final boolean canScrollVertically(int i) {
                return C53009e.lambda$GyeifJ2danbyQCBjICiQxT_nWDM(C53009e.this, i);
            }
        });
        this.f130951b.setOnFlingOverListener(new AbstractC53039i() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$E7ME48ax6SRNmpavkCdQyPInXBs */

            @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53039i
            public final void onFlingOver(int i, long j) {
                C53009e.lambda$E7ME48ax6SRNmpavkCdQyPInXBs(C53009e.this, i, j);
            }
        });
        this.f130951b.mo181091a(new AbstractC53040j() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$h_KbkIM8ynaW0SXKjZLsmtg0SE */

            @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractC53040j
            public final void onScrollChanged(int i, int i2, int i3) {
                C53009e.m270926lambda$h_KbkIM8ynaW0SXKjZLsmtg0SE(C53009e.this, i, i2, i3);
            }
        });
        this.f130952c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$U6WfiaQpBAmWYP818lpZDVEI1U */

            public final void onClick(View view) {
                C53009e.m270925lambda$U6WfiaQpBAmWYP818lpZDVEI1U(C53009e.this, view);
            }
        });
    }

    /* renamed from: j */
    private void m205314j() {
        if (DesktopUtil.m144307b()) {
            this.f130952c.setVisibility(8);
            this.f130960k.setVisibility(0);
            this.f130954e.setVisibility(8);
            return;
        }
        this.f130960k.setVisibility(8);
        this.f130954e.setVisibility(0);
        m205312h();
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52993b
    /* renamed from: a */
    public void mo181023a() {
        this.f130962m.mo181049a(this);
        m205305c();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m205299a(View view) {
        m205313i();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m205306c(View view) {
        m205313i();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m205303b(int i) {
        this.f130951b.scrollTo(0, i);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m205304b(View view) {
        this.f130962m.mo181048a();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ boolean m205307c(int i) {
        RecyclerView recyclerView = this.f130969t;
        if (recyclerView == null) {
            return false;
        }
        return recyclerView.canScrollVertically(i);
    }

    /* renamed from: a */
    private void m205302a(List<C53006a> list) {
        for (C53006a aVar : list) {
            aVar.f130942a.mo181034a(this.f130971v);
            aVar.f130942a.mo181033a(this.f130972w);
        }
    }

    /* renamed from: a */
    public void mo181084a(int i) {
        this.f130968s = i;
        this.f130969t = this.f130964o.get(i).f130942a.mo181032a();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m205298a(int i, View view) {
        this.f130958i.setCurrentItem(i);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m205297a(int i, long j) {
        RecyclerView recyclerView = this.f130969t;
        if (recyclerView != null) {
            recyclerView.smoothScrollBy(0, i);
        }
    }

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.e$b */
    public class C53017b implements C69628b.AbstractC69630b {

        /* renamed from: b */
        private ViewGroup f130980b;

        /* renamed from: c */
        private TextView f130981c;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: a */
        public void mo16700a(int i, int i2, float f, boolean z) {
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: b */
        public void mo16702b(int i, int i2, float f, boolean z) {
        }

        public C53017b(ViewGroup viewGroup) {
            C53009e.this = r1;
            this.f130980b = viewGroup;
            this.f130981c = (TextView) viewGroup.findViewById(R.id.reaction_count);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: a */
        public void mo16699a(int i, int i2) {
            this.f130980b.setBackgroundResource(R.drawable.reaction_pager_title_color_selected);
            this.f130981c.setTextColor(C52990a.m205239c(C53009e.this.f130963n, R.color.static_white));
            C53009e.this.f130958i.setCurrentItem(i);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69628b.AbstractC69630b
        /* renamed from: b */
        public void mo16701b(int i, int i2) {
            this.f130980b.setBackgroundResource(R.drawable.reaction_pager_title_color_unselected);
            this.f130981c.setTextColor(C52990a.m205239c(C53009e.this.f130963n, R.color.text_caption));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m205301a(AbstractC53016a aVar, ValueAnimator valueAnimator) {
        aVar.makeChange(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // com.ss.android.lark.reaction.widget.detailwindow.C52991a.AbstractC52993b
    /* renamed from: b */
    public void mo181026b(List<C53006a> list, String str) {
        this.f130964o = list;
        m205302a(list);
        this.f130967r = str;
        if (this.f130958i.getAdapter() != null) {
            this.f130958i.getAdapter().notifyDataSetChanged();
        }
        this.f130970u.mo243218b();
        this.f130958i.post(new Runnable() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$H_fKYztahCTpeig0pK94YAEew */

            public final void run() {
                C53009e.m270923lambda$H_fKYztahCTpeig0pK94YAEew(C53009e.this);
            }
        });
    }

    /* renamed from: a */
    private void m205300a(View view, int i) {
        if (i == 0) {
            view.setPadding(C52990a.m205224a(this.f130963n, 16.0f), 0, 0, 0);
        } else if (i == this.f130964o.size() - 1) {
            view.setPadding(0, 0, C52990a.m205224a(this.f130963n, 4.0f), 0);
        }
    }

    /* renamed from: a */
    public static void m205296a(int i, int i2, AbstractC53016a aVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.$$Lambda$e$ilTiKHyN3hW4Aa3dg82ZZNkfkg */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C53009e.m270927lambda$ilTiKHyN3hW4Aa3dg82ZZNkfkg(C53009e.AbstractC53016a.this, valueAnimator);
            }
        });
        ofInt.start();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m205295a(int i, int i2, int i3) {
        float f;
        if (i < i3) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = (float) (i - i3);
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i3);
        float f4 = f3 * f3;
        this.f130952c.setAlpha(f4);
        this.f130955f.setAlpha(f4);
        this.f130953d.setTranslationY(f);
        int i4 = i3 / 4;
        if (i < i4) {
            float f5 = f2 / ((float) i4);
            this.f130956g.setAlpha(f5);
            this.f130953d.setAlpha(f5);
        } else {
            this.f130956g.setAlpha(1.0f);
            this.f130953d.setAlpha(1.0f);
        }
        if (i == 0) {
            this.f130962m.mo181052b();
        }
    }

    public C53009e(AbstractC53019d dVar, Context context, Fragment fragment, LayoutInflater layoutInflater) {
        this.f130962m = dVar;
        this.f130963n = context;
        this.f130965p = fragment;
        this.f130966q = layoutInflater;
    }
}
