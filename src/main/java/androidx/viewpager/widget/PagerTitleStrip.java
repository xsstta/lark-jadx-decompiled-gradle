package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: n */
    private static final int[] f5495n = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: o */
    private static final int[] f5496o = {16843660};

    /* renamed from: a */
    ViewPager f5497a;

    /* renamed from: b */
    TextView f5498b;

    /* renamed from: c */
    TextView f5499c;

    /* renamed from: d */
    TextView f5500d;

    /* renamed from: e */
    float f5501e;

    /* renamed from: f */
    int f5502f;

    /* renamed from: g */
    private int f5503g;

    /* renamed from: h */
    private int f5504h;

    /* renamed from: i */
    private int f5505i;

    /* renamed from: j */
    private boolean f5506j;

    /* renamed from: k */
    private boolean f5507k;

    /* renamed from: l */
    private final C1569a f5508l;

    /* renamed from: m */
    private WeakReference<PagerAdapter> f5509m;

    /* renamed from: p */
    private int f5510p;

    public int getTextSpacing() {
        return this.f5504h;
    }

    public void requestLayout() {
        if (!this.f5506j) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f5497a;
        if (viewPager != null) {
            mo8143a(viewPager.getAdapter(), (PagerAdapter) null);
            this.f5497a.setInternalPageChangeListener(null);
            this.f5497a.removeOnAdapterChangeListener(this.f5508l);
            this.f5497a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C1569a extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.AbstractC1578c {

        /* renamed from: b */
        private int f5512b;

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo8142a(pagerTitleStrip.f5497a.getCurrentItem(), PagerTitleStrip.this.f5497a.getAdapter());
            float f = PagerTitleStrip.this.f5501e;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (f >= BitmapDescriptorFactory.HUE_RED) {
                f2 = PagerTitleStrip.this.f5501e;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.mo8125a(pagerTitleStrip2.f5497a.getCurrentItem(), f2, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f5512b = i;
        }

        C1569a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f5512b == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo8142a(pagerTitleStrip.f5497a.getCurrentItem(), PagerTitleStrip.this.f5497a.getAdapter());
                float f = PagerTitleStrip.this.f5501e;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    f2 = PagerTitleStrip.this.f5501e;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.mo8125a(pagerTitleStrip2.f5497a.getCurrentItem(), f2, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578c
        /* renamed from: a */
        public void mo8153a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.mo8143a(pagerAdapter, pagerAdapter2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo8125a(i, f, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        PagerAdapter pagerAdapter;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f5508l);
            viewPager.addOnAdapterChangeListener(this.f5508l);
            this.f5497a = viewPager;
            WeakReference<PagerAdapter> weakReference = this.f5509m;
            if (weakReference != null) {
                pagerAdapter = weakReference.get();
            } else {
                pagerAdapter = null;
            }
            mo8143a(pagerAdapter, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    public void setGravity(int i) {
        this.f5505i = i;
        requestLayout();
    }

    public void setTextSpacing(int i) {
        this.f5504h = i;
        requestLayout();
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C1570b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f5513a;

        C1570b(Context context) {
            this.f5513a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f5513a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1570b(textView.getContext()));
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f5510p = i;
        int i2 = (i << 24) | (this.f5502f & 16777215);
        this.f5498b.setTextColor(i2);
        this.f5500d.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f5502f = i;
        this.f5499c.setTextColor(i);
        int i2 = (this.f5510p << 24) | (this.f5502f & 16777215);
        this.f5498b.setTextColor(i2);
        this.f5500d.setTextColor(i2);
    }

    /* renamed from: a */
    public void mo8141a(int i, float f) {
        this.f5498b.setTextSize(i, f);
        this.f5499c.setTextSize(i, f);
        this.f5500d.setTextSize(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8143a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.f5508l);
            this.f5509m = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.f5508l);
            this.f5509m = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.f5497a;
        if (viewPager != null) {
            this.f5503g = -1;
            this.f5501e = -1.0f;
            mo8142a(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f5498b.measure(childMeasureSpec2, childMeasureSpec);
            this.f5499c.measure(childMeasureSpec2, childMeasureSpec);
            this.f5500d.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f5499c.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f5499c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5503g = -1;
        this.f5501e = -1.0f;
        this.f5508l = new C1569a();
        TextView textView = new TextView(context);
        this.f5498b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f5499c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f5500d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5495n);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.m4490a(this.f5498b, resourceId);
            TextViewCompat.m4490a(this.f5499c, resourceId);
            TextViewCompat.m4490a(this.f5500d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo8141a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f5498b.setTextColor(color);
            this.f5499c.setTextColor(color);
            this.f5500d.setTextColor(color);
        }
        this.f5505i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f5502f = this.f5499c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f5498b.setEllipsize(TextUtils.TruncateAt.END);
        this.f5499c.setEllipsize(TextUtils.TruncateAt.END);
        this.f5500d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f5496o);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f5498b);
            setSingleLineAllCaps(this.f5499c);
            setSingleLineAllCaps(this.f5500d);
        } else {
            this.f5498b.setSingleLine();
            this.f5499c.setSingleLine();
            this.f5500d.setSingleLine();
        }
        this.f5504h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8142a(int i, PagerAdapter pagerAdapter) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (pagerAdapter != null) {
            i2 = pagerAdapter.getCount();
        } else {
            i2 = 0;
        }
        this.f5506j = true;
        CharSequence charSequence3 = null;
        if (i < 1 || pagerAdapter == null) {
            charSequence = null;
        } else {
            charSequence = pagerAdapter.getPageTitle(i - 1);
        }
        this.f5498b.setText(charSequence);
        TextView textView = this.f5499c;
        if (pagerAdapter == null || i >= i2) {
            charSequence2 = null;
        } else {
            charSequence2 = pagerAdapter.getPageTitle(i);
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && pagerAdapter != null) {
            charSequence3 = pagerAdapter.getPageTitle(i3);
        }
        this.f5500d.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f5498b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5499c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5500d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f5503g = i;
        if (!this.f5507k) {
            mo8125a(i, this.f5501e, false);
        }
        this.f5506j = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8125a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f5503g) {
            mo8142a(i, this.f5497a.getAdapter());
        } else if (!z && f == this.f5501e) {
            return;
        }
        this.f5507k = true;
        int measuredWidth = this.f5498b.getMeasuredWidth();
        int measuredWidth2 = this.f5499c.getMeasuredWidth();
        int measuredWidth3 = this.f5500d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (((float) i8) * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f5498b.getBaseline();
        int baseline2 = this.f5499c.getBaseline();
        int baseline3 = this.f5500d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.f5498b.getMeasuredHeight() + i11, this.f5499c.getMeasuredHeight() + i12), this.f5500d.getMeasuredHeight() + i13);
        int i14 = this.f5505i & SmEvents.EVENT_NE_RR;
        if (i14 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i14 != 80) {
            i4 = i11 + paddingTop;
            i2 = i12 + paddingTop;
            i3 = paddingTop + i13;
            TextView textView = this.f5499c;
            textView.layout(i9, i2, i10, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i9 - this.f5504h) - measuredWidth);
            TextView textView2 = this.f5498b;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f5504h);
            TextView textView3 = this.f5500d;
            textView3.layout(max3, i3, max3 + measuredWidth3, textView3.getMeasuredHeight() + i3);
            this.f5501e = f;
            this.f5507k = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i11 + i5;
        i2 = i12 + i5;
        i3 = i5 + i13;
        TextView textView4 = this.f5499c;
        textView4.layout(i9, i2, i10, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i9 - this.f5504h) - measuredWidth);
        TextView textView22 = this.f5498b;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f5504h);
        TextView textView32 = this.f5500d;
        textView32.layout(max32, i3, max32 + measuredWidth3, textView32.getMeasuredHeight() + i3);
        this.f5501e = f;
        this.f5507k = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5497a != null) {
            float f = this.f5501e;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            mo8125a(this.f5503g, f, true);
        }
    }
}
