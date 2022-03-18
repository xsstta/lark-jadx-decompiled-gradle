package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.view.menu.C0322f;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class ActionBarContextView extends AbstractC0420a {

    /* renamed from: g */
    private CharSequence f1183g;

    /* renamed from: h */
    private CharSequence f1184h;

    /* renamed from: i */
    private View f1185i;

    /* renamed from: j */
    private View f1186j;

    /* renamed from: k */
    private LinearLayout f1187k;

    /* renamed from: l */
    private TextView f1188l;

    /* renamed from: m */
    private TextView f1189m;

    /* renamed from: n */
    private int f1190n;

    /* renamed from: o */
    private int f1191o;

    /* renamed from: p */
    private boolean f1192p;

    /* renamed from: q */
    private int f1193q;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1678d() {
        return this.f1192p;
    }

    public CharSequence getSubtitle() {
        return this.f1184h;
    }

    public CharSequence getTitle() {
        return this.f1183g;
    }

    /* renamed from: b */
    public void mo1676b() {
        if (this.f1185i == null) {
            mo1677c();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    /* renamed from: a */
    public boolean mo1675a() {
        if (this.f1519d != null) {
            return this.f1519d.mo1766e();
        }
        return false;
    }

    /* renamed from: c */
    public void mo1677c() {
        removeAllViews();
        this.f1186j = null;
        this.f1518c = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1519d != null) {
            this.f1519d.mo1767f();
            this.f1519d.mo1769h();
        }
    }

    /* renamed from: e */
    private void m1505e() {
        int i;
        if (this.f1187k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1187k = linearLayout;
            this.f1188l = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1189m = (TextView) this.f1187k.findViewById(R.id.action_bar_subtitle);
            if (this.f1190n != 0) {
                this.f1188l.setTextAppearance(getContext(), this.f1190n);
            }
            if (this.f1191o != 0) {
                this.f1189m.setTextAppearance(getContext(), this.f1191o);
            }
        }
        this.f1188l.setText(this.f1183g);
        this.f1189m.setText(this.f1184h);
        boolean z = !TextUtils.isEmpty(this.f1183g);
        boolean z2 = !TextUtils.isEmpty(this.f1184h);
        TextView textView = this.f1189m;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1187k;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1187k.getParent() == null) {
            addView(this.f1187k);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    public void setContentHeight(int i) {
        this.f1520e = i;
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1184h = charSequence;
        m1505e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1183g = charSequence;
        m1505e();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1192p) {
            requestLayout();
        }
        this.f1192p = z;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1186j;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1186j = view;
        if (!(view == null || (linearLayout = this.f1187k) == null)) {
            removeView(linearLayout);
            this.f1187k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1183g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1674a(final AbstractC0297b bVar) {
        View view = this.f1185i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1193q, (ViewGroup) this, false);
            this.f1185i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1185i);
        }
        this.f1185i.findViewById(R.id.action_mode_close_button).setOnClickListener(new View.OnClickListener() {
            /* class androidx.appcompat.widget.ActionBarContextView.View$OnClickListenerC03481 */

            public void onClick(View view) {
                bVar.mo996c();
            }
        });
        C0322f fVar = (C0322f) bVar.mo993b();
        if (this.f1519d != null) {
            this.f1519d.mo1768g();
        }
        this.f1519d = new ActionMenuPresenter(getContext());
        this.f1519d.mo1762b(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVar.mo1393a(this.f1519d, this.f1517b);
        this.f1518c = (ActionMenuView) this.f1519d.mo1343a(this);
        ViewCompat.m4039a(this.f1518c, (Drawable) null);
        addView(this.f1518c, layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC0420a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0924x mo1673a(int i, long j) {
        return super.mo1673a(i, j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            if (this.f1520e > 0) {
                i3 = this.f1520e;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f1185i;
            if (view != null) {
                int a = mo2460a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1185i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f1518c != null && this.f1518c.getParent() == this) {
                paddingLeft = mo2460a(this.f1518c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1187k;
            if (linearLayout != null && this.f1186j == null) {
                if (this.f1192p) {
                    this.f1187k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1187k.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f1187k;
                    if (z) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    linearLayout2.setVisibility(i5);
                } else {
                    paddingLeft = mo2460a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1186j;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i7 = Math.min(layoutParams.height, i7);
                }
                this.f1186j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i7, i6));
            }
            if (this.f1520e <= 0) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i8) {
                        i8 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i8);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0427af a = C0427af.m1778a(context, attributeSet, new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle}, i, 0);
        ViewCompat.m4039a(this, a.mo2477a(0));
        this.f1190n = a.mo2491g(5, 0);
        this.f1191o = a.mo2491g(4, 0);
        this.f1520e = a.mo2489f(3, 0);
        this.f1193q = a.mo2491g(2, R.layout.abc_action_mode_close_item_material);
        a.mo2482b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = al.m1864a(this);
        if (a) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1185i;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1185i.getLayoutParams();
            if (a) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int a2 = m1754a(i5, i7, a);
            i5 = m1754a(a2 + mo2461a(this.f1185i, a2, paddingTop, paddingTop2, a), i8, a);
        }
        int i9 = i5;
        LinearLayout linearLayout = this.f1187k;
        if (!(linearLayout == null || this.f1186j != null || linearLayout.getVisibility() == 8)) {
            i9 += mo2461a(this.f1187k, i9, paddingTop, paddingTop2, a);
        }
        View view2 = this.f1186j;
        if (view2 != null) {
            mo2461a(view2, i9, paddingTop, paddingTop2, a);
        }
        if (a) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        if (this.f1518c != null) {
            mo2461a(this.f1518c, i6, paddingTop, paddingTop2, !a);
        }
    }
}
