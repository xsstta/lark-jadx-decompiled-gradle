package com.tt.miniapp.component.nativeview.picker.p3274a.p3275a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.larkbrand.utils.C13344e;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.component.nativeview.picker.a.a.b */
public abstract class AbstractC65914b<V extends View> extends AbstractDialogInterface$OnDismissListenerC65912a<View> {

    /* renamed from: A */
    protected View f166331A;

    /* renamed from: B */
    protected View f166332B;

    /* renamed from: C */
    protected View f166333C;

    /* renamed from: D */
    private AbstractC65917a f166334D;

    /* renamed from: d */
    protected boolean f166335d = true;

    /* renamed from: e */
    protected int f166336e = R.color.line_divider_default;

    /* renamed from: f */
    protected int f166337f = 1;

    /* renamed from: g */
    protected int f166338g = R.color.bg_body;

    /* renamed from: h */
    protected int f166339h = 40;

    /* renamed from: i */
    protected int f166340i = 15;

    /* renamed from: j */
    protected int f166341j;

    /* renamed from: k */
    protected int f166342k;

    /* renamed from: l */
    protected boolean f166343l = true;

    /* renamed from: m */
    protected CharSequence f166344m = "";

    /* renamed from: n */
    protected CharSequence f166345n = "";

    /* renamed from: o */
    protected CharSequence f166346o = "";

    /* renamed from: p */
    protected int f166347p = R.color.primary_pri_500;

    /* renamed from: q */
    protected int f166348q = R.color.primary_pri_500;

    /* renamed from: r */
    protected int f166349r = R.color.primary_pri_500;

    /* renamed from: s */
    protected int f166350s = R.color.primary_pri_500;

    /* renamed from: t */
    protected int f166351t = 17;

    /* renamed from: u */
    protected int f166352u = 17;

    /* renamed from: v */
    protected int f166353v;

    /* renamed from: w */
    protected int f166354w = R.color.bg_body;

    /* renamed from: x */
    protected TextView f166355x;

    /* renamed from: y */
    protected TextView f166356y;

    /* renamed from: z */
    protected View f166357z;

    /* renamed from: com.tt.miniapp.component.nativeview.picker.a.a.b$a */
    public interface AbstractC65917a {
        /* renamed from: a */
        void mo49482a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract V mo230804j();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo230806l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public View mo230805k() {
        View view = this.f166333C;
        if (view != null) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo230807m() {
        AbstractC65917a aVar = this.f166334D;
        if (aVar != null) {
            aVar.mo49482a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractDialogInterface$OnDismissListenerC65912a
    /* renamed from: a */
    public final View mo230787a() {
        int i;
        int i2;
        LinearLayout linearLayout = new LinearLayout(this.f166322a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(C13344e.m54321a(this.f166354w, mo230798h()));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, 0, 0, 0);
        linearLayout.setClipToPadding(false);
        View i3 = mo230803i();
        if (i3 != null) {
            linearLayout.addView(i3);
        }
        if (this.f166335d) {
            View view = new View(this.f166322a);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f166337f));
            view.setBackgroundColor(C13344e.m54321a(this.f166336e, mo230798h()));
            linearLayout.addView(view);
        }
        if (this.f166332B == null) {
            this.f166332B = mo230804j();
        }
        if (this.f166341j > 0) {
            i = (int) C67590h.m263065a(this.f166322a, (float) this.f166341j);
        } else {
            i = 0;
        }
        if (this.f166342k > 0) {
            i2 = (int) C67590h.m263065a(this.f166322a, (float) this.f166342k);
        } else {
            i2 = 0;
        }
        this.f166332B.setPadding(i, i2, i, i2);
        ViewGroup viewGroup = (ViewGroup) this.f166332B.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f166332B);
        }
        linearLayout.addView(this.f166332B, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        View k = mo230805k();
        if (k != null) {
            linearLayout.addView(k);
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public View mo230803i() {
        int i;
        View view = this.f166331A;
        if (view != null) {
            return view;
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f166322a);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C67590h.m263065a(this.f166322a, (float) this.f166339h)));
        relativeLayout.setBackgroundColor(C13344e.m54321a(this.f166338g, mo230798h()));
        relativeLayout.setGravity(16);
        TextView textView = new TextView(this.f166322a);
        this.f166355x = textView;
        if (this.f166343l) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.f166355x.setLayoutParams(layoutParams);
        this.f166355x.setBackgroundColor(0);
        this.f166355x.setGravity(17);
        int a = (int) C67590h.m263065a(this.f166322a, (float) this.f166340i);
        this.f166355x.setPadding(a, 0, a, 0);
        if (!TextUtils.isEmpty(this.f166344m)) {
            this.f166355x.setText(this.f166344m);
        }
        this.f166355x.setTextColor(C67590h.m263070a(C13344e.m54321a(this.f166347p, mo230798h()), C13344e.m54321a(this.f166350s, mo230798h())));
        int i2 = this.f166351t;
        if (i2 != 0) {
            this.f166355x.setTextSize((float) i2);
        }
        this.f166355x.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.View$OnClickListenerC659151 */

            public void onClick(View view) {
                AbstractC65914b.this.mo230795e();
                AbstractC65914b.this.mo230807m();
            }
        });
        relativeLayout.addView(this.f166355x);
        if (this.f166357z == null) {
            TextView textView2 = new TextView(this.f166322a);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            int a2 = (int) C67590h.m263065a(this.f166322a, (float) this.f166340i);
            layoutParams2.leftMargin = a2;
            layoutParams2.rightMargin = a2;
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(15, -1);
            textView2.setLayoutParams(layoutParams2);
            textView2.setGravity(17);
            if (!TextUtils.isEmpty(this.f166346o)) {
                textView2.setText(this.f166346o);
            }
            textView2.setTextColor(C13344e.m54321a(this.f166349r, mo230798h()));
            int i3 = this.f166353v;
            if (i3 != 0) {
                textView2.setTextSize((float) i3);
            }
            this.f166357z = textView2;
        }
        relativeLayout.addView(this.f166357z);
        this.f166356y = new TextView(this.f166322a);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(11, -1);
        layoutParams3.addRule(15, -1);
        this.f166356y.setLayoutParams(layoutParams3);
        this.f166356y.setBackgroundColor(0);
        this.f166356y.setGravity(17);
        this.f166356y.setPadding(a, 0, a, 0);
        if (!TextUtils.isEmpty(this.f166345n)) {
            this.f166356y.setText(this.f166345n);
        }
        this.f166356y.setTextColor(C67590h.m263070a(C13344e.m54321a(this.f166348q, mo230798h()), C13344e.m54321a(this.f166350s, mo230798h())));
        int i4 = this.f166352u;
        if (i4 != 0) {
            this.f166356y.setTextSize((float) i4);
        }
        this.f166356y.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b.View$OnClickListenerC659162 */

            public void onClick(View view) {
                AbstractC65914b.this.mo230795e();
                AbstractC65914b.this.mo230806l();
            }
        });
        relativeLayout.addView(this.f166356y);
        return relativeLayout;
    }

    /* renamed from: a */
    public void mo230802a(AbstractC65917a aVar) {
        this.f166334D = aVar;
    }

    public AbstractC65914b(Activity activity) {
        super(activity);
        this.f166344m = activity.getString(R.string.microapp_m_permission_cancel);
        this.f166345n = activity.getString(R.string.microapp_m_determine);
    }
}
