package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
public abstract class AbstractC0420a extends ViewGroup {

    /* renamed from: a */
    protected final C0421a f1516a;

    /* renamed from: b */
    protected final Context f1517b;

    /* renamed from: c */
    protected ActionMenuView f1518c;

    /* renamed from: d */
    protected ActionMenuPresenter f1519d;

    /* renamed from: e */
    protected int f1520e;

    /* renamed from: f */
    protected C0924x f1521f;

    /* renamed from: g */
    private boolean f1522g;

    /* renamed from: h */
    private boolean f1523h;

    /* renamed from: a */
    protected static int m1754a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getContentHeight() {
        return this.f1520e;
    }

    /* renamed from: a */
    public boolean mo1675a() {
        ActionMenuPresenter actionMenuPresenter = this.f1519d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1766e();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        if (this.f1521f != null) {
            return this.f1516a.f1524a;
        }
        return getVisibility();
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0421a implements AbstractC0928y {

        /* renamed from: a */
        int f1524a;

        /* renamed from: c */
        private boolean f1526c;

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: c */
        public void mo2464c(View view) {
            this.f1526c = true;
        }

        protected C0421a() {
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: a */
        public void mo868a(View view) {
            AbstractC0420a.super.setVisibility(0);
            this.f1526c = false;
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            if (!this.f1526c) {
                AbstractC0420a.this.f1521f = null;
                AbstractC0420a.super.setVisibility(this.f1524a);
            }
        }

        /* renamed from: a */
        public C0421a mo2463a(C0924x xVar, int i) {
            AbstractC0420a.this.f1521f = xVar;
            this.f1524a = i;
            return this;
        }
    }

    public void setContentHeight(int i) {
        this.f1520e = i;
        requestLayout();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1522g = false;
        }
        if (!this.f1522g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1522g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1522g = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0924x xVar = this.f1521f;
            if (xVar != null) {
                xVar.mo4730b();
            }
            super.setVisibility(i);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1523h = false;
        }
        if (!this.f1523h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1523h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1523h = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle}, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1519d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1759a(configuration);
        }
    }

    AbstractC0420a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C0924x mo1673a(int i, long j) {
        C0924x xVar = this.f1521f;
        if (xVar != null) {
            xVar.mo4730b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            C0924x a = ViewCompat.m4103r(this).mo4723a(1.0f);
            a.mo4724a(j);
            a.mo4727a(this.f1516a.mo2463a(a, i));
            return a;
        }
        C0924x a2 = ViewCompat.m4103r(this).mo4723a(BitmapDescriptorFactory.HUE_RED);
        a2.mo4724a(j);
        a2.mo4727a(this.f1516a.mo2463a(a2, i));
        return a2;
    }

    AbstractC0420a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1516a = new C0421a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1517b = context;
        } else {
            this.f1517b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2460a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2461a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }
}
