package com.bytedance.ee.bear.list.homepage.tab;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.title.SubMenuView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import net.lucode.hackware.magicindicator.MagicIndicator;

public class HomeSubMenuView extends LinearLayout implements AbstractC8474e {

    /* renamed from: a */
    public boolean f22916a;

    /* renamed from: b */
    public AbstractC8474e.AbstractC8475a f22917b;

    /* renamed from: c */
    private MagicIndicator f22918c;

    /* renamed from: d */
    private AppCompatImageView f22919d;

    /* renamed from: e */
    private AppCompatImageView f22920e;

    /* renamed from: f */
    private View f22921f;

    /* renamed from: g */
    private String f22922g;

    /* renamed from: h */
    private boolean f22923h;

    /* renamed from: i */
    private ObjectAnimator f22924i;

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33136a(String str) {
    }

    public MagicIndicator getMagicIndicator() {
        return this.f22918c;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33135a() {
        this.f22920e.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: b */
    public void mo33138b() {
        C13479a.m54764b("HomeSubMenuView", "hideFilter()...");
        m35172a(this.f22919d, false);
    }

    /* renamed from: e */
    private void m35173e() {
        this.f22919d.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.homepage.tab.HomeSubMenuView.C84892 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C13479a.m54764b("HomeSubMenuView", "on click iv filter");
                if (HomeSubMenuView.this.f22917b != null) {
                    HomeSubMenuView.this.f22917b.mo30969h();
                }
            }
        });
        this.f22920e.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.homepage.tab.HomeSubMenuView.C84903 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C13479a.m54764b("HomeSubMenuView", "on click grid");
                HomeSubMenuView homeSubMenuView = HomeSubMenuView.this;
                homeSubMenuView.f22916a = !homeSubMenuView.f22916a;
                HomeSubMenuView.this.mo33159d();
                if (HomeSubMenuView.this.f22917b != null) {
                    HomeSubMenuView.this.f22917b.mo30965b(HomeSubMenuView.this.f22916a);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo33158c() {
        C13479a.m54764b("HomeSubMenuView", "showFilter()...");
        m35172a(this.f22919d, true);
        setOffline(this.f22923h);
    }

    /* renamed from: d */
    public void mo33159d() {
        int i;
        AppCompatImageView appCompatImageView = this.f22920e;
        if (this.f22916a) {
            i = R.drawable.ud_icon_disorder_list_outlined;
        } else {
            i = R.drawable.ud_icon_borders_outlined;
        }
        appCompatImageView.setImageResource(i);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13479a.m54764b("HomeSubMenuView", "onDetachedFromWindow()...");
        ObjectAnimator objectAnimator = this.f22924i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f22924i = null;
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setViewDelegate(AbstractC8474e.AbstractC8475a aVar) {
        this.f22917b = aVar;
    }

    public HomeSubMenuView(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setOffline(boolean z) {
        this.f22923h = z;
        mo33157b(this.f22922g);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    /* renamed from: a */
    public void mo33137a(boolean z) {
        C13479a.m54764b("HomeSubMenuView", "showGrid()...isGrid = " + z);
        this.f22916a = z;
        mo33159d();
    }

    /* renamed from: b */
    public void mo33157b(String str) {
        SubMenuView.FilterState filterState;
        C13479a.m54764b("HomeSubMenuView", "showFilterDesc()...desc = " + str);
        this.f22922g = str;
        if (TextUtils.isEmpty(str)) {
            filterState = SubMenuView.FilterState.DEFAULT;
        } else {
            filterState = SubMenuView.FilterState.CHECKED;
        }
        setFilterState(filterState);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e
    public void setFilterState(SubMenuView.FilterState filterState) {
        int i;
        SubMenuView.FilterState filterState2 = SubMenuView.FilterState.DEFAULT;
        int i2 = R.color.icon_disable;
        if (filterState == filterState2) {
            if (!this.f22923h) {
                i2 = R.color.icon_n2;
            }
            this.f22919d.setBackgroundDrawable(null);
        } else {
            if (!this.f22923h) {
                i2 = R.color.space_list_icon_filter_blue;
            }
            this.f22919d.setBackgroundDrawable(getResources().getDrawable(R.drawable.list_filter_icon_offline_bg, null));
            if (this.f22923h) {
                i = R.color.space_list_bg_filter_icon_offline;
            } else {
                i = R.color.space_list_bg_filter_icon_selected;
            }
            C13747j.m55726a((View) this.f22919d, i);
        }
        C13747j.m55728a((ImageView) this.f22919d, i2);
    }

    /* renamed from: a */
    private void m35171a(Context context) {
        int a = C57582a.m223600a(2);
        int a2 = C57582a.m223600a(6);
        int a3 = C57582a.m223600a(20);
        int a4 = C57582a.m223600a(21);
        int a5 = C57582a.m223600a(22);
        setGravity(16);
        setOrientation(0);
        MagicIndicator magicIndicator = new MagicIndicator(context);
        this.f22918c = magicIndicator;
        magicIndicator.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = a2;
        addView(this.f22918c, layoutParams);
        this.f22921f = new View(context);
        addView(this.f22921f, new LinearLayout.LayoutParams(0, -1));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.f22919d = appCompatImageView;
        appCompatImageView.setId(R.id.iv_filter);
        this.f22919d.setImageResource(R.drawable.ud_icon_filter_outlined);
        this.f22919d.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.icon_n2)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a5, a5);
        layoutParams2.leftMargin = a3;
        addView(this.f22919d, layoutParams2);
        this.f22919d.setPadding(a, a, a, a);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        this.f22920e = appCompatImageView2;
        appCompatImageView2.setId(R.id.iv_switch);
        this.f22920e.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.icon_n2)));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a5, a5);
        layoutParams3.leftMargin = a3;
        layoutParams3.rightMargin = a4;
        mo33159d();
        addView(this.f22920e, layoutParams3);
        this.f22920e.setPadding(a, a, a, a);
        m35173e();
    }

    public HomeSubMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35171a(context);
    }

    /* renamed from: a */
    private void m35172a(final View view, final boolean z) {
        float f;
        ObjectAnimator objectAnimator = this.f22924i;
        if (objectAnimator != null) {
            if (objectAnimator.isRunning()) {
                this.f22924i.cancel();
            }
            this.f22924i = null;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        if (z) {
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        this.f22924i = ofFloat;
        ofFloat.setDuration(250L);
        this.f22924i.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.list.homepage.tab.HomeSubMenuView.C84881 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                C13479a.m54764b("HomeSubMenuView", "onAnimationCancel()...");
            }

            public void onAnimationEnd(Animator animator) {
                int i;
                C13479a.m54764b("HomeSubMenuView", "onAnimationEnd()...");
                View view = view;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        });
        this.f22924i.start();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.onMeasure(i, i2);
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            measureChildWithMargins(getChildAt(i7), i, 0, i2, 0);
        }
        if (this.f22920e.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22920e.getLayoutParams();
            i3 = this.f22920e.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        if (this.f22919d.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f22919d.getLayoutParams();
            i4 = this.f22919d.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        } else {
            i4 = 0;
        }
        if (this.f22918c.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f22918c.getLayoutParams();
            i5 = this.f22918c.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
        } else {
            i5 = 0;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i8 = (measuredWidth - i3) - i4;
        if (i5 > i8) {
            i5 = i8;
        } else {
            i6 = i8 - i5;
        }
        this.f22918c.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f22918c.getMeasuredHeight(), 1073741824));
        this.f22921f.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f22921f.getMeasuredHeight(), 1073741824));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
