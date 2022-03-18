package com.bytedance.ee.bear.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.C0942e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BaseTitleBar extends LinearLayout {

    /* renamed from: A */
    private LayoutInflater f31688A;

    /* renamed from: B */
    private int f31689B;

    /* renamed from: a */
    public boolean f31690a;

    /* renamed from: b */
    private View.OnClickListener f31691b;

    /* renamed from: c */
    private final List<AbstractC11800a> f31692c;

    /* renamed from: d */
    private TextView f31693d;

    /* renamed from: e */
    private LinearLayout f31694e;

    /* renamed from: f */
    private ViewGroup f31695f;

    /* renamed from: g */
    private LinearLayout f31696g;

    /* renamed from: h */
    private RelativeLayout f31697h;

    /* renamed from: i */
    private TextView f31698i;

    /* renamed from: j */
    private TextView f31699j;

    /* renamed from: k */
    private View f31700k;

    /* renamed from: l */
    private boolean f31701l;

    /* renamed from: m */
    private int f31702m;

    /* renamed from: n */
    private int f31703n;

    /* renamed from: o */
    private int f31704o;

    /* renamed from: p */
    private boolean f31705p;

    /* renamed from: q */
    private String f31706q;

    /* renamed from: r */
    private ImageView f31707r;

    /* renamed from: s */
    private String f31708s;

    /* renamed from: t */
    private int f31709t;

    /* renamed from: u */
    private int f31710u;

    /* renamed from: v */
    private int f31711v;

    /* renamed from: w */
    private int f31712w;

    /* renamed from: x */
    private boolean f31713x;

    /* renamed from: y */
    private float f31714y;

    /* renamed from: z */
    private boolean f31715z;

    /* renamed from: com.bytedance.ee.bear.widgets.BaseTitleBar$a */
    public interface AbstractC11800a {
        /* renamed from: a */
        String mo45143a();

        /* renamed from: a */
        void mo16854a(View view);

        /* renamed from: b */
        boolean mo45144b();
    }

    /* renamed from: com.bytedance.ee.bear.widgets.BaseTitleBar$b */
    public static class C11801b implements AbstractC11800a {

        /* renamed from: a */
        private String f31718a;

        /* renamed from: b */
        private BadgeStyle f31719b;

        /* renamed from: c */
        private int f31720c;

        /* renamed from: d */
        private boolean f31721d = true;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a
        /* renamed from: a */
        public void mo16854a(View view) {
        }

        /* renamed from: c */
        public int mo45149c() {
            return 0;
        }

        /* renamed from: d */
        public CharSequence mo45150d() {
            return null;
        }

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a
        /* renamed from: b */
        public boolean mo45144b() {
            return this.f31721d;
        }

        /* renamed from: e */
        public BadgeStyle mo45151e() {
            return this.f31719b;
        }

        /* renamed from: f */
        public int mo45152f() {
            return this.f31720c;
        }

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a
        /* renamed from: a */
        public String mo45143a() {
            if (TextUtils.isEmpty(this.f31718a)) {
                this.f31718a = String.format(Locale.US, "Action#%d", Integer.valueOf(View.generateViewId()));
            }
            return this.f31718a;
        }

        /* renamed from: a */
        public void mo45145a(int i) {
            this.f31720c = i;
        }

        /* renamed from: a */
        public void mo45146a(BadgeStyle badgeStyle) {
            this.f31719b = badgeStyle;
        }

        /* renamed from: a */
        public void mo45147a(String str) {
            this.f31718a = str;
        }

        /* renamed from: a */
        public void mo45148a(boolean z) {
            this.f31721d = z;
        }
    }

    /* renamed from: com.bytedance.ee.bear.widgets.BaseTitleBar$d */
    public static class C11803d extends C11801b {

        /* renamed from: a */
        private int f31722a;

        /* renamed from: b */
        private Drawable f31723b;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: c */
        public int mo45149c() {
            return this.f31722a;
        }

        /* renamed from: g */
        public Drawable mo45153g() {
            return this.f31723b;
        }

        public C11803d(int i) {
            this.f31722a = i;
        }

        public C11803d(Drawable drawable) {
            this.f31723b = drawable;
        }
    }

    /* renamed from: com.bytedance.ee.bear.widgets.BaseTitleBar$e */
    public static class C11804e extends C11801b {

        /* renamed from: a */
        private CharSequence f31724a;

        /* renamed from: b */
        private int f31725b = -1;

        /* renamed from: c */
        public int f31726c = 17;

        /* renamed from: d */
        private ColorStateList f31727d;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: d */
        public CharSequence mo45150d() {
            return this.f31724a;
        }

        /* renamed from: g */
        public int mo45154g() {
            return this.f31725b;
        }

        /* renamed from: h */
        public ColorStateList mo45155h() {
            return this.f31727d;
        }

        public C11804e(CharSequence charSequence) {
            this.f31724a = charSequence;
        }

        public C11804e(CharSequence charSequence, int i) {
            this.f31724a = charSequence;
            this.f31725b = i;
        }

        public C11804e(CharSequence charSequence, ColorStateList colorStateList) {
            this.f31724a = charSequence;
            this.f31727d = colorStateList;
        }
    }

    /* renamed from: com.bytedance.ee.bear.widgets.BaseTitleBar$f */
    public static class C11805f extends C11801b {

        /* renamed from: a */
        private View f31728a;

        /* renamed from: g */
        public View mo45156g() {
            return this.f31728a;
        }
    }

    public View.OnClickListener getLeftExtraClickListener() {
        return this.f31691b;
    }

    public ImageView getLeftImage() {
        return this.f31707r;
    }

    public TextView getLeftText() {
        return this.f31693d;
    }

    /* renamed from: a */
    public void mo45080a(CharSequence charSequence, ViewGroup.LayoutParams layoutParams) {
        if (charSequence != null && layoutParams != null) {
            this.f31693d.setLayoutParams(layoutParams);
            this.f31693d.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo45075a(int i, int i2) {
        C13747j.m55729a(this.f31707r, i, i2);
    }

    /* renamed from: a */
    public void mo45074a(float f, float f2, float f3, float f4) {
        this.f31696g.setPadding(C13749l.m55737a(f), C13749l.m55737a(f2), C13749l.m55737a(f3), C13749l.m55737a(f4));
    }

    /* renamed from: a */
    public void mo45081a(CharSequence charSequence, boolean z) {
        if (charSequence != null) {
            if (z) {
                this.f31697h.removeAllViews();
                this.f31697h.addView(this.f31698i);
                this.f31697h.addView(this.f31699j);
            }
            int indexOf = charSequence.toString().indexOf("\n");
            if (indexOf > 0) {
                m48900a(charSequence.subSequence(0, indexOf), charSequence.subSequence(indexOf + 1, charSequence.length()), 1);
                return;
            }
            int indexOf2 = charSequence.toString().indexOf("\t");
            if (indexOf2 > 0) {
                CharSequence subSequence = charSequence.subSequence(0, indexOf2);
                m48900a(subSequence, " " + ((Object) charSequence.subSequence(indexOf2 + 1, charSequence.length())), 0);
                return;
            }
            this.f31698i.setText(charSequence);
            this.f31699j.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m48900a(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.f31698i.setText(charSequence);
        this.f31699j.setText(charSequence2);
        this.f31699j.setVisibility(0);
    }

    /* renamed from: a */
    public void mo45078a(View view, ViewGroup.LayoutParams layoutParams) {
        this.f31694e.removeAllViews();
        this.f31694e.addView(view, layoutParams);
    }

    /* renamed from: a */
    public void mo45076a(int i, int i2, int i3, int i4) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31697h.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i3;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
        }
        this.f31697h.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo45077a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f31696g.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public void mo45073a() {
        this.f31696g.removeAllViews();
        this.f31692c.clear();
    }

    /* renamed from: a */
    public View mo45071a(String str) {
        ViewGroup[] viewGroupArr = {this.f31695f, this.f31696g};
        for (int i = 0; i < 2; i++) {
            ViewGroup viewGroup = viewGroupArr[i];
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                Object tag = childAt.getTag();
                if ((tag instanceof AbstractC11800a) && ((AbstractC11800a) tag).mo45143a().equals(str)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public TextView mo45072a(int i) {
        View b = mo45082b(i);
        if (b instanceof TextView) {
            return (TextView) b;
        }
        return null;
    }

    /* renamed from: a */
    public void mo45079a(AbstractC11800a aVar, View view) {
        View findViewById;
        if ((aVar instanceof C11803d) && (findViewById = view.findViewById(R.id.widgetTitleMenuBadgePoint)) != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(8);
        }
    }

    public ColorStateList getLeftIconTint() {
        return this.f31707r.getImageTintList();
    }

    public TextView getRightText() {
        return mo45072a(0);
    }

    public static int getStatusBarHeight() {
        return m48892a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: b */
    public void mo45084b() {
        this.f31695f.removeAllViews();
    }

    public Drawable getLeftDrawable() {
        return this.f31693d.getCompoundDrawables()[0];
    }

    public boolean getLeftIconVisibility() {
        if (this.f31707r.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public View getCustomTitleView() {
        if (this.f31697h.getChildCount() == 0) {
            return null;
        }
        return this.f31697h.getChildAt(0);
    }

    /* renamed from: d */
    private LinearLayout m48905d() {
        LinearLayout linearLayout = (LinearLayout) this.f31688A.inflate(R.layout.widget_title_bar_left, (ViewGroup) this, false);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.widgets.$$Lambda$BaseTitleBar$hlE8JV7oNAGqM7oBVIHYcddchfw */

            public final void onClick(View view) {
                BaseTitleBar.this.m48903b((BaseTitleBar) view);
            }
        });
        this.f31707r = (ImageView) linearLayout.findViewById(R.id.title_bar_back);
        this.f31693d = (TextView) linearLayout.findViewById(R.id.title_bar_left_title);
        setLeftText(this.f31708s);
        this.f31695f = (ViewGroup) linearLayout.findViewById(R.id.title_bar_left_actions);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public int getRightVisibleIconCount() {
        boolean z;
        if (this.f31696g.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = this.f31696g.getChildCount();
        if (!z || childCount <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f31696g.getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r4 > 0) goto L_0x0049;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45087c() {
        /*
            r8 = this;
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131166975(0x7f0706ff, float:1.794821E38)
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            android.content.res.Resources r1 = r8.getResources()
            r2 = 2131166974(0x7f0706fe, float:1.7948208E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            android.content.res.Resources r2 = r8.getResources()
            r3 = 2131166973(0x7f0706fd, float:1.7948206E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            int r3 = r8.getLeftVisibleIconCount()
            int r4 = r8.getRightVisibleIconCount()
            boolean r5 = r8.f31705p
            r6 = 0
            if (r5 == 0) goto L_0x0039
            if (r3 <= 0) goto L_0x0035
            r1 = r0
            goto L_0x0036
        L_0x0035:
            r1 = r2
        L_0x0036:
            if (r4 <= 0) goto L_0x0048
            goto L_0x0049
        L_0x0039:
            if (r3 != 0) goto L_0x003d
            r0 = r1
            goto L_0x0041
        L_0x003d:
            r5 = 1
            if (r3 != r5) goto L_0x0041
            r0 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x0047
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x0049
        L_0x0047:
            r1 = r0
        L_0x0048:
            r0 = r2
        L_0x0049:
            r8.mo45076a(r1, r6, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.BaseTitleBar.mo45087c():void");
    }

    /* access modifiers changed from: protected */
    public int getLeftVisibleIconCount() {
        boolean z;
        int i;
        int i2 = 0;
        if (this.f31694e.getVisibility() != 0) {
            return 0;
        }
        if (this.f31695f.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int childCount = this.f31695f.getChildCount();
        if (!z || childCount <= 0) {
            i = 0;
        } else {
            i = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f31695f.getChildAt(i3);
                if (childAt != null && childAt.getVisibility() == 0) {
                    i++;
                }
            }
        }
        if (this.f31707r.getVisibility() == 0) {
            i2 = 1;
        }
        return i + i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widgets.BaseTitleBar$c */
    public static class C11802c extends Exception {
        private C11802c(String str) {
            super(str);
        }
    }

    public void setLeftExtraClickListener(View.OnClickListener onClickListener) {
        this.f31691b = onClickListener;
    }

    public void setLeftImageTint(int i) {
        m48906d(i);
    }

    public void setSupportAutoRemoveBadgePoint(boolean z) {
        this.f31690a = z;
    }

    public BaseTitleBar(Context context) {
        this(context, null, 0);
    }

    /* renamed from: c */
    private void m48904c(int i) {
        m48907e(i);
        m48908f(i);
    }

    /* renamed from: d */
    private void m48906d(int i) {
        m48899a(this.f31707r, i);
    }

    /* renamed from: a */
    public View mo45070a(AbstractC11800a aVar) {
        return m48894a(aVar, true);
    }

    /* renamed from: b */
    public View mo45083b(AbstractC11800a aVar) {
        return m48894a(aVar, false);
    }

    public void setActionIconTint(int i) {
        this.f31689B = i;
        m48904c(i);
    }

    public void setCenterClickListener(View.OnClickListener onClickListener) {
        this.f31697h.setOnClickListener(onClickListener);
    }

    public void setCenterViewVisible(int i) {
        this.f31697h.setVisibility(i);
    }

    public void setDivider(int i) {
        this.f31700k.setBackgroundResource(i);
    }

    public void setDividerColor(int i) {
        this.f31700k.setBackgroundColor(i);
    }

    public void setIsCenterAlways(boolean z) {
        this.f31705p = z;
        invalidate();
    }

    public void setLeftImageResource(int i) {
        C13747j.m55729a(this.f31707r, i, this.f31712w);
    }

    public void setLeftText(int i) {
        this.f31693d.setText(i);
    }

    public void setLeftTextBackground(int i) {
        this.f31693d.setBackgroundResource(i);
    }

    public void setLeftTextColor(int i) {
        this.f31693d.setTextColor(i);
    }

    public void setLeftTextSize(float f) {
        this.f31693d.setTextSize(f);
    }

    public void setMainTitleBackground(int i) {
        this.f31698i.setBackgroundResource(i);
    }

    public void setMainTitleColor(int i) {
        this.f31698i.setTextColor(i);
    }

    public void setMainTitleSize(float f) {
        this.f31698i.setTextSize(f);
    }

    public void setSubTitleBackground(int i) {
        this.f31699j.setBackgroundResource(i);
    }

    public void setSubTitleColor(int i) {
        this.f31699j.setTextColor(i);
    }

    public void setSubTitleSize(float f) {
        this.f31699j.setTextSize(f);
    }

    public void setTitle(CharSequence charSequence) {
        mo45081a(charSequence, false);
    }

    public void setTitleMaxEms(int i) {
        this.f31698i.setMaxEms(i);
    }

    /* renamed from: c */
    public View mo45086c(AbstractC11800a aVar) {
        if (aVar == null) {
            return null;
        }
        return mo45071a(aVar.mo45143a());
    }

    public void setCustomLeftView(View view) {
        mo45078a(view, new LinearLayout.LayoutParams(-2, -1));
    }

    public void setCustomRightView(View view) {
        mo45085b(view, new LinearLayout.LayoutParams(-2, -1));
    }

    public void setDividerHeight(int i) {
        this.f31700k.getLayoutParams().height = i;
    }

    public void setDividerVisible(boolean z) {
        int i;
        View view = this.f31700k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setHeight(int i) {
        this.f31704o = i;
        setMeasuredDimension(getMeasuredWidth(), this.f31704o);
    }

    public void setImmersive(boolean z) {
        this.f31701l = z;
        if (z) {
            this.f31702m = getStatusBarHeight();
        } else {
            this.f31702m = 0;
        }
    }

    public void setLeftClickListener(View.OnClickListener onClickListener) {
        this.f31694e.setOnClickListener(new View.OnClickListener(onClickListener) {
            /* class com.bytedance.ee.bear.widgets.$$Lambda$BaseTitleBar$kfAaw3SyVJXd3wqzKWy9Wtsi0Q */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                BaseTitleBar.this.m48898a((BaseTitleBar) this.f$1, (View.OnClickListener) view);
            }
        });
    }

    public void setLeftImageResourceWithoutTint(int i) {
        this.f31707r.setImageResource(i);
        C0942e.m4551a(this.f31707r, (ColorStateList) null);
    }

    public void setLeftText(CharSequence charSequence) {
        if (charSequence != null) {
            this.f31693d.setText(charSequence);
        }
    }

    public void setLeftTextColor(ColorStateList colorStateList) {
        this.f31693d.setTextColor(colorStateList);
    }

    public void setLeftVisible(boolean z) {
        int i;
        LinearLayout linearLayout = this.f31694e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public void setMainTitleVisible(boolean z) {
        int i;
        TextView textView = this.f31698i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setRightVisible(boolean z) {
        int i;
        LinearLayout linearLayout = this.f31696g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public void setSubTitle(int i) {
        setSubTitle(getResources().getString(i));
    }

    public void setSubTitleVisible(boolean z) {
        int i;
        TextView textView = this.f31699j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setTitle(int i) {
        setTitle(getResources().getString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m48903b(View view) {
        View.OnClickListener onClickListener = this.f31691b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).finish();
        }
    }

    /* renamed from: e */
    private void m48907e(int i) {
        for (int i2 = 0; i2 < this.f31695f.getChildCount(); i2++) {
            m48899a((ImageView) this.f31695f.getChildAt(i2).findViewById(R.id.widgetTitleMenuImg), i);
        }
    }

    /* renamed from: f */
    private void m48908f(int i) {
        for (int i2 = 0; i2 < this.f31696g.getChildCount(); i2++) {
            m48899a((ImageView) this.f31696g.getChildAt(i2).findViewById(R.id.widgetTitleMenuImg), i);
        }
    }

    private void setDefaultTextStyle(TextView textView) {
        textView.setTextColor(getResources().getColor(R.color.text_title));
        textView.setSingleLine();
        textView.setGravity(16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setCustomTitleView(View view) {
        this.f31697h.removeAllViews();
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(14, -1);
            this.f31697h.addView(view, layoutParams);
        }
    }

    public void setSubTitle(String str) {
        if (this.f31699j.getVisibility() != 0) {
            this.f31699j.setVisibility(0);
        }
        this.f31699j.setText(str);
    }

    /* renamed from: a */
    private int m48893a(View view) {
        int i;
        int i2 = this.f31703n;
        if (view == null) {
            return i2;
        }
        if (view.getVisibility() == 8) {
            i = this.f31703n;
        } else {
            i = view.getMeasuredWidth();
        }
        return i;
    }

    /* renamed from: b */
    public View mo45082b(int i) {
        AbstractC11800a aVar;
        if (i < 0 || i >= this.f31692c.size() || (aVar = this.f31692c.get(i)) == null) {
            return null;
        }
        return mo45086c(aVar);
    }

    public void setLeftIconVisibility(boolean z) {
        int i;
        int i2;
        ImageView imageView = this.f31707r;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31707r.getLayoutParams();
        if (z) {
            i2 = 0;
        } else {
            i2 = layoutParams.getMarginStart();
        }
        this.f31694e.setPadding(i2, 0, 0, 0);
    }

    public void setTitleRightViewBottom(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(1, this.f31698i.getId());
        layoutParams.addRule(8, this.f31698i.getId());
        this.f31697h.addView(view, layoutParams);
    }

    /* renamed from: b */
    private void m48902b(Context context) {
        setTag("BaseTitleBar");
        setOrientation(0);
        setGravity(16);
        setBackgroundColor(this.f31709t);
        this.f31694e = m48905d();
        this.f31697h = new RelativeLayout(context);
        this.f31696g = new LinearLayout(context);
        this.f31700k = new View(context);
        TextView textView = new TextView(context);
        this.f31698i = textView;
        textView.setId(R.id.title_bar_center_text);
        this.f31699j = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f31697h.setGravity(16);
        this.f31697h.addView(this.f31698i, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, this.f31698i.getId());
        layoutParams2.addRule(14);
        this.f31697h.addView(this.f31699j, layoutParams2);
        setDefaultTextStyle(this.f31698i);
        setDefaultTextStyle(this.f31699j);
        this.f31698i.setTextSize(18.0f);
        this.f31698i.setTextColor(this.f31710u);
        this.f31698i.setGravity(17);
        this.f31698i.getPaint().setFakeBoldText(this.f31715z);
        this.f31699j.setTextSize(12.0f);
        this.f31699j.setTextColor(this.f31710u);
        this.f31699j.setGravity(17);
        this.f31699j.getPaint().setFakeBoldText(this.f31715z);
        this.f31696g.setGravity(17);
        this.f31700k.setBackgroundColor(context.getResources().getColor(R.color.line_divider_default));
        addView(this.f31694e, -2, -1);
        addView(this.f31697h, -2, -1);
        addView(this.f31696g, -2, -1);
        addView(this.f31700k, new LinearLayout.LayoutParams(-1, (int) this.f31714y));
        setTitle(this.f31706q);
        mo45075a(this.f31711v, this.f31712w);
        setDividerVisible(this.f31713x);
    }

    /* renamed from: a */
    private View m48896a(C11804e eVar) {
        TextView textView = new TextView(getContext());
        setDefaultTextStyle(textView);
        textView.setText(eVar.mo45150d());
        textView.setTextSize((float) eVar.f31726c);
        if (eVar.mo45155h() != null) {
            textView.setTextColor(eVar.mo45155h());
        } else if (eVar.mo45154g() != -1) {
            textView.setTextColor(getResources().getColorStateList(eVar.mo45154g()));
        } else {
            textView.setTextColor(getResources().getColorStateList(R.color.widget_black_c2_c3_selector));
        }
        int dimension = (int) getResources().getDimension(R.dimen.widget_menu_half_margin);
        textView.setPadding(dimension, 0, dimension, 0);
        return textView;
    }

    /* renamed from: a */
    private void m48897a(Context context) {
        this.f31688A = LayoutInflater.from(context);
        if (this.f31701l) {
            this.f31702m = getStatusBarHeight();
        } else {
            this.f31702m = 0;
        }
        this.f31703n = C13749l.m55738a(10);
        this.f31704o = context.getResources().getDimensionPixelSize(R.dimen.widget_widgets_title_height);
        m48902b(context);
    }

    public BaseTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48898a(View.OnClickListener onClickListener, View view) {
        View.OnClickListener onClickListener2 = this.f31691b;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: a */
    private static int m48892a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public void mo45088c(View view, ViewGroup.LayoutParams layoutParams) {
        mo45077a(view, -1, layoutParams);
    }

    /* renamed from: a */
    private View m48894a(AbstractC11800a aVar, boolean z) {
        if (aVar == null) {
            return null;
        }
        View a = mo45071a(aVar.mo45143a());
        if (a != null) {
            return a;
        }
        try {
            View b = m48901b(aVar, z);
            if (z) {
                this.f31692c.add(aVar);
                this.f31696g.addView(b);
            } else {
                this.f31695f.addView(b);
            }
            int i = this.f31689B;
            if (i != 0) {
                m48904c(i);
            }
            return b;
        } catch (C11802c e) {
            C13479a.m54761a("BaseTitleBar", e);
            return null;
        }
    }

    /* renamed from: b */
    private View m48901b(final AbstractC11800a aVar, boolean z) throws C11802c {
        View view;
        if (aVar instanceof C11803d) {
            view = m48895a((C11803d) aVar, z);
        } else if (aVar instanceof C11804e) {
            view = m48896a((C11804e) aVar);
        } else if (aVar instanceof C11805f) {
            view = ((C11805f) aVar).mo45156g();
        } else {
            view = null;
        }
        if (view != null) {
            view.setTag(aVar);
            view.setEnabled(aVar.mo45144b());
            view.setContentDescription(aVar.mo45143a());
            view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.widgets.BaseTitleBar.C117991 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    aVar.mo16854a(view);
                    if (BaseTitleBar.this.f31690a) {
                        BaseTitleBar.this.mo45079a(aVar, view);
                    }
                }
            });
            return view;
        }
        throw new C11802c("action:" + aVar);
    }

    /* renamed from: a */
    private View m48895a(C11803d dVar, boolean z) {
        ViewGroup viewGroup;
        LayoutInflater layoutInflater = this.f31688A;
        if (z) {
            viewGroup = this.f31696g;
        } else {
            viewGroup = this.f31695f;
        }
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.widget_image_menu, viewGroup, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.widgetTitleMenuImg);
        if (dVar.mo45153g() != null) {
            appCompatImageView.setImageDrawable(dVar.mo45153g());
        } else {
            appCompatImageView.setImageResource(dVar.mo45149c());
        }
        View findViewById = inflate.findViewById(R.id.widgetTitleMenuBadgePoint);
        UDBadgeView uDBadgeView = (UDBadgeView) inflate.findViewById(R.id.widgetTitleMenuBadgeNumFrame);
        int f = dVar.mo45152f();
        BadgeStyle e = dVar.mo45151e();
        if (e == null) {
            findViewById.setVisibility(8);
            uDBadgeView.setVisibility(8);
        } else if (e == BadgeStyle.point) {
            uDBadgeView.setVisibility(8);
            if (f <= 0) {
                i = 8;
            }
            findViewById.setVisibility(i);
        } else if (e == BadgeStyle.num) {
            findViewById.setVisibility(8);
            if (f > 0) {
                uDBadgeView.setVisibility(0);
                uDBadgeView.setText(String.valueOf(Math.min(f, 99)));
                uDBadgeView.mo90238b();
            } else {
                uDBadgeView.setVisibility(8);
            }
        }
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int i4 = this.f31704o;
            i3 = this.f31702m + i4;
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            i3 = View.MeasureSpec.getSize(i2) + this.f31702m;
        }
        int size = View.MeasureSpec.getSize(i);
        measureChild(this.f31694e, i, i2);
        measureChild(this.f31696g, i, i2);
        int measuredWidth = this.f31694e.getMeasuredWidth();
        int measuredWidth2 = this.f31696g.getMeasuredWidth();
        int i5 = 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31697h.getLayoutParams();
        if (layoutParams != null) {
            i5 = 0 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        if (!this.f31705p) {
            this.f31697h.measure(View.MeasureSpec.makeMeasureSpec(((size - m48893a(this.f31694e)) - m48893a(this.f31696g)) - i5, 1073741824), i2);
        } else if (measuredWidth > measuredWidth2) {
            this.f31697h.measure(View.MeasureSpec.makeMeasureSpec((size - (measuredWidth * 2)) - i5, 1073741824), i2);
        } else {
            this.f31697h.measure(View.MeasureSpec.makeMeasureSpec((size - (measuredWidth2 * 2)) - i5, 1073741824), i2);
        }
        measureChild(this.f31700k, i, i2);
        setMeasuredDimension(size, i3);
    }

    /* renamed from: b */
    public void mo45085b(View view, ViewGroup.LayoutParams layoutParams) {
        this.f31696g.removeAllViews();
        this.f31696g.setPadding(0, 0, 0, 0);
        this.f31696g.addView(view, layoutParams);
    }

    /* renamed from: a */
    private void m48899a(ImageView imageView, int i) {
        ColorStateList colorStateList;
        if (imageView != null) {
            if (i == 0) {
                colorStateList = null;
            } else {
                colorStateList = getResources().getColorStateList(i);
            }
            imageView.setImageTintList(colorStateList);
        }
    }

    public BaseTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31692c = new ArrayList();
        this.f31705p = true;
        this.f31689B = 0;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.widget_widgets_tb_action_fakeBoldText, R.attr.widget_widgets_tb_action_padding, R.attr.widget_widgets_tb_back_icon, R.attr.widget_widgets_tb_back_tint, R.attr.widget_widgets_tb_background, R.attr.widget_widgets_tb_divider_height, R.attr.widget_widgets_tb_divider_visible, R.attr.widget_widgets_tb_left_title, R.attr.widget_widgets_tb_title, R.attr.widget_widgets_tb_title_color});
        this.f31706q = obtainStyledAttributes.getString(8);
        this.f31709t = obtainStyledAttributes.getColor(4, resources.getColor(R.color.bg_body));
        this.f31710u = obtainStyledAttributes.getColor(9, resources.getColor(R.color.text_title));
        this.f31711v = obtainStyledAttributes.getResourceId(2, R.drawable.ud_icon_left_outlined);
        this.f31712w = obtainStyledAttributes.getResourceId(3, R.color.facade_selector_icon_n1);
        this.f31713x = obtainStyledAttributes.getBoolean(6, true);
        this.f31714y = obtainStyledAttributes.getDimension(5, (float) C13749l.m55738a(1));
        this.f31708s = obtainStyledAttributes.getString(7);
        this.f31715z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        m48897a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        LinearLayout linearLayout = this.f31694e;
        linearLayout.layout(0, this.f31702m, linearLayout.getMeasuredWidth(), this.f31694e.getMeasuredHeight() + this.f31702m);
        this.f31696g.layout(getWidth() - this.f31696g.getMeasuredWidth(), this.f31702m, getWidth(), this.f31696g.getMeasuredHeight() + this.f31702m);
        int measuredWidth = this.f31694e.getMeasuredWidth();
        int measuredWidth2 = this.f31696g.getMeasuredWidth();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31697h.getLayoutParams();
        if (layoutParams != null) {
            i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i6 = 0;
            i5 = 0;
        }
        if (!this.f31705p) {
            this.f31697h.layout(m48893a(this.f31694e) + i5, this.f31702m, (getWidth() - m48893a(this.f31696g)) - i6, getMeasuredHeight());
        } else if (measuredWidth > measuredWidth2) {
            this.f31697h.layout(i5 + measuredWidth, this.f31702m, (getWidth() - measuredWidth) - i6, getMeasuredHeight());
        } else {
            this.f31697h.layout(i5 + measuredWidth2, this.f31702m, (getWidth() - measuredWidth2) - i6, getMeasuredHeight());
        }
        this.f31700k.layout(0, getMeasuredHeight() - this.f31700k.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }
}
