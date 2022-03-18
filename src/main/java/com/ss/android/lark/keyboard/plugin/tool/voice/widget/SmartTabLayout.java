package com.ss.android.lark.keyboard.plugin.tool.voice.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SmartTabLayout extends HorizontalScrollView {

    /* renamed from: a */
    protected final C41098b f104726a;

    /* renamed from: b */
    public ViewPager f104727b;

    /* renamed from: c */
    public ViewPager.OnPageChangeListener f104728c;

    /* renamed from: d */
    public AbstractC41091d f104729d;

    /* renamed from: e */
    private int f104730e;

    /* renamed from: f */
    private int f104731f;

    /* renamed from: g */
    private boolean f104732g;

    /* renamed from: h */
    private ColorStateList f104733h;

    /* renamed from: i */
    private float f104734i;

    /* renamed from: j */
    private int f104735j;

    /* renamed from: k */
    private int f104736k;

    /* renamed from: l */
    private AbstractC41090c f104737l;

    /* renamed from: m */
    private AbstractC41094g f104738m;

    /* renamed from: n */
    private View$OnClickListenerC41088a f104739n;

    /* renamed from: o */
    private boolean f104740o;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$c */
    public interface AbstractC41090c {
        /* renamed from: a */
        void mo148196a(int i, int i2);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$d */
    public interface AbstractC41091d {
        /* renamed from: a */
        void mo148197a(int i);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$f */
    public interface AbstractC41093f {
        /* renamed from: a */
        int mo148198a(int i);

        /* renamed from: b */
        int mo148199b(int i);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$g */
    public interface AbstractC41094g {
        View createTabView(ViewGroup viewGroup, int i, PagerAdapter pagerAdapter);
    }

    /* renamed from: a */
    private void m162925a() {
        View view;
        PagerAdapter adapter = this.f104727b.getAdapter();
        for (int i = 0; i < adapter.getCount(); i++) {
            AbstractC41094g gVar = this.f104738m;
            if (gVar == null) {
                view = mo148177a(adapter.getPageTitle(i));
            } else {
                view = gVar.createTabView(this.f104726a, i, adapter);
            }
            if (view != null) {
                if (this.f104740o) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                }
                View$OnClickListenerC41088a aVar = this.f104739n;
                if (aVar != null) {
                    view.setOnClickListener(aVar);
                }
                this.f104726a.addView(view);
                if (i == this.f104727b.getCurrentItem()) {
                    view.setSelected(true);
                }
            } else {
                throw new IllegalStateException("tabView is null.");
            }
        }
    }

    public void setCustomTabView(AbstractC41094g gVar) {
        this.f104738m = gVar;
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f104733h = colorStateList;
    }

    public void setDistributeEvenly(boolean z) {
        this.f104740o = z;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f104728c = onPageChangeListener;
    }

    public void setOnScrollChangeListener(AbstractC41090c cVar) {
        this.f104737l = cVar;
    }

    public void setOnTabClickListener(AbstractC41091d dVar) {
        this.f104729d = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$a */
    public class View$OnClickListenerC41088a implements View.OnClickListener {
        private View$OnClickListenerC41088a() {
        }

        public void onClick(View view) {
            for (int i = 0; i < SmartTabLayout.this.f104726a.getChildCount(); i++) {
                if (view == SmartTabLayout.this.f104726a.getChildAt(i)) {
                    if (SmartTabLayout.this.f104729d != null) {
                        SmartTabLayout.this.f104729d.mo148197a(i);
                    }
                    SmartTabLayout.this.f104727b.setCurrentItem(i);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$b */
    public class C41089b implements ViewPager.OnPageChangeListener {

        /* renamed from: b */
        private int f104743b;

        private C41089b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f104743b = i;
            if (SmartTabLayout.this.f104728c != null) {
                SmartTabLayout.this.f104728c.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            if (this.f104743b == 0) {
                SmartTabLayout.this.f104726a.mo148203a(i, BitmapDescriptorFactory.HUE_RED);
                SmartTabLayout.this.mo148178a(i, BitmapDescriptorFactory.HUE_RED);
            }
            int childCount = SmartTabLayout.this.f104726a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SmartTabLayout.this.f104726a.getChildAt(i2);
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
            if (SmartTabLayout.this.f104728c != null) {
                SmartTabLayout.this.f104728c.onPageSelected(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            int childCount = SmartTabLayout.this.f104726a.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                SmartTabLayout.this.f104726a.mo148203a(i, f);
                SmartTabLayout.this.mo148178a(i, f);
                if (SmartTabLayout.this.f104728c != null) {
                    SmartTabLayout.this.f104728c.onPageScrolled(i, f, i2);
                }
            }
        }
    }

    public SmartTabLayout(Context context) {
        this(context, null);
    }

    public void setCustomTabColorizer(AbstractC41093f fVar) {
        this.f104726a.mo148204a(fVar);
    }

    public void setDefaultTabTextColor(int i) {
        this.f104733h = ColorStateList.valueOf(i);
    }

    public void setDividerColors(int... iArr) {
        this.f104726a.mo148209b(iArr);
    }

    public void setIndicationInterpolator(AbstractC41095a aVar) {
        this.f104726a.mo148205a(aVar);
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f104726a.mo148206a(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f104726a.removeAllViews();
        this.f104727b = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            viewPager.addOnPageChangeListener(new C41089b());
            m162925a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public TextView mo148177a(CharSequence charSequence) {
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setTextColor(this.f104733h);
        textView.setTextSize(0, this.f104734i);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        int i = this.f104731f;
        if (i != -1) {
            textView.setBackgroundResource(i);
        } else {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            textView.setAllCaps(this.f104732g);
        }
        int i2 = this.f104735j;
        textView.setPadding(i2, 0, i2, 0);
        int i3 = this.f104736k;
        if (i3 > 0) {
            textView.setMinWidth(i3);
        }
        return textView;
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo148179a(int i, int i2) {
        this.f104738m = new C41092e(getContext(), i, i2);
    }

    /* renamed from: a */
    public void mo148178a(int i, float f) {
        int i2;
        int i3;
        int i4;
        int i5;
        int childCount = this.f104726a.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            boolean l = C41101c.m162973l(this);
            View childAt = this.f104726a.getChildAt(i);
            int b = (int) (((float) (C41101c.m162962b(childAt) + C41101c.m162972k(childAt))) * f);
            if (this.f104726a.mo148207a()) {
                if (BitmapDescriptorFactory.HUE_RED < f && f < 1.0f) {
                    View childAt2 = this.f104726a.getChildAt(i + 1);
                    b = Math.round(f * ((float) ((C41101c.m162962b(childAt) / 2) + C41101c.m162971j(childAt) + (C41101c.m162962b(childAt2) / 2) + C41101c.m162970i(childAt2))));
                }
                View childAt3 = this.f104726a.getChildAt(0);
                if (l) {
                    int b2 = C41101c.m162962b(childAt3) + C41101c.m162971j(childAt3);
                    int b3 = C41101c.m162962b(childAt) + C41101c.m162971j(childAt);
                    i5 = (C41101c.m162966e(childAt) - C41101c.m162971j(childAt)) - b;
                    i4 = (b2 - b3) / 2;
                } else {
                    int b4 = C41101c.m162962b(childAt3) + C41101c.m162970i(childAt3);
                    int b5 = C41101c.m162962b(childAt) + C41101c.m162970i(childAt);
                    i5 = (C41101c.m162965d(childAt) - C41101c.m162970i(childAt)) + b;
                    i4 = (b4 - b5) / 2;
                }
                scrollTo(i5 - i4, 0);
                return;
            }
            int i6 = this.f104730e;
            if (i6 == -1) {
                if (BitmapDescriptorFactory.HUE_RED < f && f < 1.0f) {
                    View childAt4 = this.f104726a.getChildAt(i + 1);
                    b = Math.round(f * ((float) ((C41101c.m162962b(childAt) / 2) + C41101c.m162971j(childAt) + (C41101c.m162962b(childAt4) / 2) + C41101c.m162970i(childAt4))));
                }
                if (l) {
                    i2 = (((-C41101c.m162964c(childAt)) / 2) + (getWidth() / 2)) - C41101c.m162967f(this);
                } else {
                    i2 = ((C41101c.m162964c(childAt) / 2) - (getWidth() / 2)) + C41101c.m162967f(this);
                }
            } else if (l) {
                if (i <= 0 && f <= BitmapDescriptorFactory.HUE_RED) {
                    i6 = 0;
                }
                i2 = i6;
            } else if (i > 0 || f > BitmapDescriptorFactory.HUE_RED) {
                i2 = -i6;
            } else {
                i2 = 0;
            }
            int d = C41101c.m162965d(childAt);
            int i7 = C41101c.m162970i(childAt);
            if (l) {
                i3 = (((d + i7) - b) - getWidth()) + C41101c.m162969h(this);
            } else {
                i3 = (d - i7) + b;
            }
            scrollTo(i2 + i3, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout$e */
    public static class C41092e implements AbstractC41094g {

        /* renamed from: a */
        private final LayoutInflater f104744a;

        /* renamed from: b */
        private final int f104745b;

        /* renamed from: c */
        private final int f104746c;

        private C41092e(Context context, int i, int i2) {
            this.f104744a = LayoutInflater.from(context);
            this.f104745b = i;
            this.f104746c = i2;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout.AbstractC41094g
        public View createTabView(ViewGroup viewGroup, int i, PagerAdapter pagerAdapter) {
            View view;
            int i2 = this.f104745b;
            TextView textView = null;
            if (i2 != -1) {
                view = this.f104744a.inflate(i2, viewGroup, false);
            } else {
                view = null;
            }
            int i3 = this.f104746c;
            if (!(i3 == -1 || view == null)) {
                textView = (TextView) view.findViewById(i3);
            }
            if (textView == null && TextView.class.isInstance(view)) {
                textView = (TextView) view;
            }
            if (textView != null) {
                textView.setText(pagerAdapter.getPageTitle(i));
            }
            return view;
        }
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.stl_clickable, R.attr.stl_customTabTextLayoutId, R.attr.stl_customTabTextViewId, R.attr.stl_defaultTabBackground, R.attr.stl_defaultTabTextAllCaps, R.attr.stl_defaultTabTextColor, R.attr.stl_defaultTabTextHorizontalPadding, R.attr.stl_defaultTabTextMinWidth, R.attr.stl_defaultTabTextSize, R.attr.stl_distributeEvenly, R.attr.stl_dividerColor, R.attr.stl_dividerColors, R.attr.stl_dividerThickness, R.attr.stl_drawDecorationAfterTab, R.attr.stl_indicatorAlwaysInCenter, R.attr.stl_indicatorColor, R.attr.stl_indicatorColors, R.attr.stl_indicatorCornerRadius, R.attr.stl_indicatorGravity, R.attr.stl_indicatorInFront, R.attr.stl_indicatorInterpolation, R.attr.stl_indicatorThickness, R.attr.stl_indicatorWidth, R.attr.stl_indicatorWithoutPadding, R.attr.stl_overlineColor, R.attr.stl_overlineThickness, R.attr.stl_titleOffset, R.attr.stl_underlineColor, R.attr.stl_underlineThickness}, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        boolean z = obtainStyledAttributes.getBoolean(4, true);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        float dimension = obtainStyledAttributes.getDimension(8, applyDimension);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, (int) (16.0f * f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, (int) (BitmapDescriptorFactory.HUE_RED * f));
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(2, -1);
        boolean z2 = obtainStyledAttributes.getBoolean(9, false);
        boolean z3 = obtainStyledAttributes.getBoolean(0, true);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(26, (int) (f * 24.0f));
        obtainStyledAttributes.recycle();
        this.f104730e = layoutDimension;
        this.f104731f = resourceId;
        this.f104732g = z;
        this.f104733h = colorStateList == null ? ColorStateList.valueOf(-67108864) : colorStateList;
        this.f104734i = dimension;
        this.f104735j = dimensionPixelSize;
        this.f104736k = dimensionPixelSize2;
        this.f104739n = z3 ? new View$OnClickListenerC41088a() : null;
        this.f104740o = z2;
        if (resourceId2 != -1) {
            mo148179a(resourceId2, resourceId3);
        }
        C41098b bVar = new C41098b(context, attributeSet);
        this.f104726a = bVar;
        if (!z2 || !bVar.mo148207a()) {
            setFillViewport(!bVar.mo148207a());
            addView(bVar, -1, -1);
            return;
        }
        throw new UnsupportedOperationException("'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support");
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC41090c cVar = this.f104737l;
        if (cVar != null) {
            cVar.mo148196a(i, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f104726a.mo148207a() && this.f104726a.getChildCount() > 0) {
            View childAt = this.f104726a.getChildAt(0);
            C41098b bVar = this.f104726a;
            View childAt2 = bVar.getChildAt(bVar.getChildCount() - 1);
            int a = ((i - C41101c.m162960a(childAt)) / 2) - C41101c.m162970i(childAt);
            int a2 = ((i - C41101c.m162960a(childAt2)) / 2) - C41101c.m162971j(childAt2);
            C41098b bVar2 = this.f104726a;
            bVar2.setMinimumWidth(bVar2.getMeasuredWidth());
            ViewCompat.m4058b(this, a, getPaddingTop(), a2, getPaddingBottom());
            setClipToPadding(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewPager viewPager;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (viewPager = this.f104727b) != null) {
            mo148178a(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED);
        }
    }
}
