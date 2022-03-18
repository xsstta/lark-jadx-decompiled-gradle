package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.C0296a;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.widget.y */
public class C0481y extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: l */
    private static final Interpolator f1741l = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1742a;

    /* renamed from: b */
    LinearLayoutCompat f1743b;

    /* renamed from: c */
    int f1744c;

    /* renamed from: d */
    int f1745d;

    /* renamed from: e */
    protected ViewPropertyAnimator f1746e;

    /* renamed from: f */
    protected final C0486d f1747f = new C0486d();

    /* renamed from: g */
    private View$OnClickListenerC0484b f1748g;

    /* renamed from: h */
    private Spinner f1749h;

    /* renamed from: i */
    private boolean f1750i;

    /* renamed from: j */
    private int f1751j;

    /* renamed from: k */
    private int f1752k;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$c */
    public class C0485c extends LinearLayout {

        /* renamed from: b */
        private final int[] f1758b;

        /* renamed from: c */
        private ActionBar.AbstractC0218b f1759c;

        /* renamed from: d */
        private TextView f1760d;

        /* renamed from: e */
        private ImageView f1761e;

        /* renamed from: f */
        private View f1762f;

        /* renamed from: b */
        public ActionBar.AbstractC0218b mo2762b() {
            return this.f1759c;
        }

        /* renamed from: a */
        public void mo2760a() {
            ActionBar.AbstractC0218b bVar = this.f1759c;
            View c = bVar.mo716c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f1762f = c;
                TextView textView = this.f1760d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1761e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1761e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1762f;
            if (view != null) {
                removeView(view);
                this.f1762f = null;
            }
            Drawable a = bVar.mo714a();
            CharSequence b = bVar.mo715b();
            if (a != null) {
                if (this.f1761e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1761e = appCompatImageView;
                }
                this.f1761e.setImageDrawable(a);
                this.f1761e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1761e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1761e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f1760d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1760d = appCompatTextView;
                }
                this.f1760d.setText(b);
                this.f1760d.setVisibility(0);
            } else {
                TextView textView2 = this.f1760d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1760d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1761e;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.mo718e());
            }
            if (!z) {
                charSequence = bVar.mo718e();
            }
            C0431ah.m1845a(this, charSequence);
        }

        /* renamed from: a */
        public void mo2761a(ActionBar.AbstractC0218b bVar) {
            this.f1759c = bVar;
            mo2760a();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0481y.this.f1744c > 0 && getMeasuredWidth() > C0481y.this.f1744c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0481y.this.f1744c, 1073741824), i2);
            }
        }

        public C0485c(Context context, ActionBar.AbstractC0218b bVar, boolean z) {
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f1758b = iArr;
            this.f1759c = bVar;
            C0427af a = C0427af.m1778a(context, null, iArr, R.attr.actionBarTabStyle, 0);
            if (a.mo2492g(0)) {
                setBackgroundDrawable(a.mo2477a(0));
            }
            a.mo2482b();
            if (z) {
                setGravity(8388627);
            }
            mo2760a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$a */
    public class C0483a extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        public int getCount() {
            return C0481y.this.f1743b.getChildCount();
        }

        C0483a() {
        }

        public Object getItem(int i) {
            return ((C0485c) C0481y.this.f1743b.getChildAt(i)).mo2762b();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0481y.this.mo2743a((ActionBar.AbstractC0218b) getItem(i), true);
            }
            ((C0485c) view).mo2761a((ActionBar.AbstractC0218b) getItem(i));
            return view;
        }
    }

    /* renamed from: a */
    private boolean m2144a() {
        Spinner spinner = this.f1749h;
        if (spinner == null || spinner.getParent() != this) {
            return false;
        }
        return true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1742a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1742a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: e */
    private Spinner m2148e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    private boolean m2146c() {
        if (!m2144a()) {
            return false;
        }
        removeView(this.f1749h);
        addView(this.f1743b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1749h.getSelectedItemPosition());
        return false;
    }

    /* renamed from: d */
    private LinearLayoutCompat m2147d() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: b */
    private void m2145b() {
        if (!m2144a()) {
            if (this.f1749h == null) {
                this.f1749h = m2148e();
            }
            removeView(this.f1743b);
            addView(this.f1749h, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1749h.getAdapter() == null) {
                this.f1749h.setAdapter((SpinnerAdapter) new C0483a());
            }
            Runnable runnable = this.f1742a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1742a = null;
            }
            this.f1749h.setSelection(this.f1752k);
        }
    }

    /* renamed from: androidx.appcompat.widget.y$d */
    protected class C0486d extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f1764b;

        /* renamed from: c */
        private int f1765c;

        public void onAnimationCancel(Animator animator) {
            this.f1764b = true;
        }

        protected C0486d() {
        }

        public void onAnimationStart(Animator animator) {
            C0481y.this.setVisibility(0);
            this.f1764b = false;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1764b) {
                C0481y.this.f1746e = null;
                C0481y.this.setVisibility(this.f1765c);
            }
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f1750i = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$b */
    public class View$OnClickListenerC0484b implements View.OnClickListener {
        View$OnClickListenerC0484b() {
        }

        public void onClick(View view) {
            boolean z;
            ((C0485c) view).mo2762b().mo717d();
            int childCount = C0481y.this.f1743b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0481y.this.f1743b.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setContentHeight(int i) {
        this.f1751j = i;
        requestLayout();
    }

    /* renamed from: a */
    public void mo2744a(int i) {
        final View childAt = this.f1743b.getChildAt(i);
        Runnable runnable = this.f1742a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC04821 r0 = new Runnable() {
            /* class androidx.appcompat.widget.C0481y.RunnableC04821 */

            public void run() {
                C0481y.this.smoothScrollTo(childAt.getLeft() - ((C0481y.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0481y.this.f1742a = null;
            }
        };
        this.f1742a = r0;
        post(r0);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0296a a = C0296a.m1150a(getContext());
        setContentHeight(a.mo1155e());
        this.f1745d = a.mo1157g();
    }

    public C0481y(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C0296a a = C0296a.m1150a(context);
        setContentHeight(a.mo1155e());
        this.f1745d = a.mo1157g();
        LinearLayoutCompat d = m2147d();
        this.f1743b = d;
        addView(d, new ViewGroup.LayoutParams(-2, -1));
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f1752k = i;
        int childCount = this.f1743b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f1743b.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                mo2744a(i);
            }
        }
        Spinner spinner = this.f1749h;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0485c mo2743a(ActionBar.AbstractC0218b bVar, boolean z) {
        C0485c cVar = new C0485c(getContext(), bVar, z);
        if (z) {
            cVar.setBackgroundDrawable(null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1751j));
        } else {
            cVar.setFocusable(true);
            if (this.f1748g == null) {
                this.f1748g = new View$OnClickListenerC0484b();
            }
            cVar.setOnClickListener(this.f1748g);
        }
        return cVar;
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f1743b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1744c = -1;
        } else {
            if (childCount > 2) {
                this.f1744c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1744c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1744c = Math.min(this.f1744c, this.f1745d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1751j, 1073741824);
        if (z || !this.f1750i) {
            z2 = false;
        }
        if (z2) {
            this.f1743b.measure(0, makeMeasureSpec);
            if (this.f1743b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2145b();
            } else {
                m2146c();
            }
        } else {
            m2146c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1752k);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0485c) view).mo2762b().mo717d();
    }
}
