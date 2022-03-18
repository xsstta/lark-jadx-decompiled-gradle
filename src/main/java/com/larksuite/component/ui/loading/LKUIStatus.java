package com.larksuite.component.ui.loading;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LKUIStatus {

    /* renamed from: a */
    public int f62748a = 1;

    /* renamed from: b */
    private final ViewGroup f62749b;

    /* renamed from: c */
    private LKUILoadingView f62750c;

    /* renamed from: d */
    private TextView f62751d;

    /* renamed from: e */
    private ImageView f62752e;

    /* renamed from: f */
    private View f62753f;

    /* renamed from: g */
    private CharSequence f62754g;

    /* renamed from: h */
    private String f62755h;

    /* renamed from: i */
    private CharSequence f62756i;

    /* renamed from: j */
    private int f62757j;

    /* renamed from: k */
    private CharSequence f62758k;

    /* renamed from: l */
    private int f62759l;

    /* renamed from: m */
    private int f62760m;

    /* renamed from: n */
    private double f62761n = 0.33d;

    /* renamed from: o */
    private float f62762o = -1.0f;

    /* renamed from: p */
    private AbstractC25681b f62763p;

    /* renamed from: q */
    private Runnable f62764q = new Runnable() {
        /* class com.larksuite.component.ui.loading.LKUIStatus.RunnableC256781 */

        public void run() {
            if (LKUIStatus.this.f62748a == 3) {
                LKUIStatus.this.mo89837a();
            }
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    /* renamed from: com.larksuite.component.ui.loading.LKUIStatus$b */
    public interface AbstractC25681b {
        /* renamed from: a */
        void mo89864a();

        /* renamed from: b */
        void mo89865b();

        /* renamed from: c */
        void mo89866c();

        /* renamed from: d */
        void mo89867d();
    }

    /* renamed from: e */
    public void mo89848e() {
        mo89849f();
    }

    /* renamed from: a */
    public void mo89837a() {
        mo89842a(this.f62754g, this.f62755h);
    }

    /* renamed from: b */
    public void mo89843b() {
        mo89844b(this.f62756i);
    }

    /* renamed from: c */
    public void mo89845c() {
        mo89846c(this.f62758k);
    }

    /* renamed from: g */
    public boolean mo89850g() {
        if (this.f62748a == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo89851h() {
        if (this.f62748a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo89852i() {
        if (this.f62748a == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: com.larksuite.component.ui.loading.LKUIStatus$a */
    public static class C25680a {

        /* renamed from: a */
        public final ViewGroup f62769a;

        /* renamed from: b */
        public CharSequence f62770b;

        /* renamed from: c */
        public String f62771c;

        /* renamed from: d */
        public CharSequence f62772d;

        /* renamed from: e */
        public int f62773e;

        /* renamed from: f */
        public CharSequence f62774f;

        /* renamed from: g */
        public int f62775g;

        /* renamed from: h */
        public AbstractC25681b f62776h;

        /* renamed from: i */
        public int f62777i = R.color.bg_body;

        /* renamed from: j */
        public double f62778j;

        /* renamed from: k */
        public float f62779k;

        /* renamed from: a */
        public LKUIStatus mo89859a() {
            return new LKUIStatus(this);
        }

        /* renamed from: a */
        public C25680a mo89855a(double d) {
            this.f62778j = d;
            return this;
        }

        /* renamed from: b */
        public C25680a mo89860b(int i) {
            this.f62773e = i;
            return this;
        }

        /* renamed from: c */
        public C25680a mo89862c(int i) {
            this.f62775g = i;
            return this;
        }

        /* renamed from: a */
        public C25680a mo89856a(float f) {
            this.f62779k = f;
            return this;
        }

        /* renamed from: b */
        public C25680a mo89861b(CharSequence charSequence) {
            this.f62772d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C25680a mo89863c(CharSequence charSequence) {
            this.f62774f = charSequence;
            return this;
        }

        public C25680a(ViewGroup viewGroup) {
            this.f62769a = viewGroup;
        }

        /* renamed from: a */
        public C25680a mo89857a(int i) {
            this.f62777i = i;
            return this;
        }

        /* renamed from: a */
        public C25680a mo89858a(CharSequence charSequence) {
            this.f62770b = charSequence;
            return this;
        }
    }

    /* renamed from: d */
    public void mo89847d() {
        LKUILoadingView lKUILoadingView = this.f62750c;
        if (lKUILoadingView != null) {
            lKUILoadingView.setVisibility(8);
            this.f62750c.cancelAnimation();
        }
        View view = this.f62753f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f62748a = 6;
        this.f62749b.removeCallbacks(this.f62764q);
        AbstractC25681b bVar = this.f62763p;
        if (bVar != null) {
            bVar.mo89867d();
        }
    }

    /* renamed from: f */
    public void mo89849f() {
        ViewParent parent;
        LKUILoadingView lKUILoadingView = this.f62750c;
        if (lKUILoadingView != null) {
            lKUILoadingView.setVisibility(8);
            this.f62750c.cancelAnimation();
        }
        View view = this.f62753f;
        if (!(view == null || (parent = view.getParent()) == null)) {
            ((ViewGroup) parent).removeView(this.f62753f);
        }
        this.f62748a = 1;
        this.f62749b.removeCallbacks(this.f62764q);
    }

    /* renamed from: j */
    private void m92093j() {
        if (this.f62753f == null) {
            View inflate = LayoutInflater.from(this.f62749b.getContext()).inflate(R.layout.lkui_loading_status_layout, (ViewGroup) null);
            this.f62753f = inflate;
            View findViewById = inflate.findViewById(R.id.lkui_load_content_ll);
            this.f62750c = (LKUILoadingView) this.f62753f.findViewById(R.id.lkui_loading_view);
            this.f62751d = (TextView) this.f62753f.findViewById(R.id.lkui_load_status_tv);
            this.f62752e = (ImageView) this.f62753f.findViewById(R.id.lkui_load_status_iv);
            m92092a(this.f62749b, findViewById, this.f62762o, this.f62761n);
        }
        if (this.f62753f.getParent() == null) {
            this.f62749b.addView(this.f62753f, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f62753f.setBackgroundResource(this.f62760m);
    }

    /* renamed from: b */
    public void mo89844b(CharSequence charSequence) {
        mo89840a(charSequence, this.f62757j, 4);
        AbstractC25681b bVar = this.f62763p;
        if (bVar != null) {
            bVar.mo89865b();
        }
    }

    /* renamed from: c */
    public void mo89846c(CharSequence charSequence) {
        mo89840a(charSequence, this.f62759l, 5);
        AbstractC25681b bVar = this.f62763p;
        if (bVar != null) {
            bVar.mo89866c();
        }
    }

    /* renamed from: a */
    public void mo89838a(long j) {
        mo89841a(this.f62754g, j);
    }

    /* renamed from: a */
    public void mo89839a(CharSequence charSequence) {
        this.f62754g = charSequence;
        mo89842a(charSequence, this.f62755h);
    }

    LKUIStatus(C25680a aVar) {
        this.f62749b = aVar.f62769a;
        this.f62754g = aVar.f62770b;
        this.f62755h = aVar.f62771c;
        this.f62756i = aVar.f62772d;
        this.f62757j = aVar.f62773e;
        this.f62758k = aVar.f62774f;
        this.f62759l = aVar.f62775g;
        this.f62763p = aVar.f62776h;
        this.f62760m = aVar.f62777i;
        if (aVar.f62778j != 0.0d) {
            this.f62761n = aVar.f62778j;
        }
        this.f62762o = aVar.f62779k;
    }

    /* renamed from: a */
    public void mo89841a(CharSequence charSequence, long j) {
        this.f62754g = charSequence;
        this.f62748a = 3;
        this.f62749b.postDelayed(this.f62764q, j);
    }

    /* renamed from: a */
    public void mo89842a(CharSequence charSequence, String str) {
        m92093j();
        this.f62753f.setVisibility(0);
        if (str != null) {
            this.f62750c.setAnimation(str);
        }
        this.f62750c.setVisibility(0);
        this.f62750c.playAnimation();
        this.f62752e.setVisibility(8);
        if (TextUtils.isEmpty(charSequence)) {
            this.f62751d.setVisibility(8);
        } else {
            this.f62751d.setText(charSequence);
            this.f62751d.setVisibility(0);
        }
        this.f62748a = 2;
        AbstractC25681b bVar = this.f62763p;
        if (bVar != null) {
            bVar.mo89864a();
        }
    }

    /* renamed from: a */
    public void mo89840a(CharSequence charSequence, int i, int i2) {
        this.f62748a = i2;
        this.f62749b.removeCallbacks(this.f62764q);
        m92093j();
        this.f62753f.setVisibility(0);
        this.f62750c.setVisibility(8);
        this.f62750c.cancelAnimation();
        this.f62752e.setVisibility(0);
        this.f62752e.setImageResource(i);
        if (TextUtils.isEmpty(charSequence)) {
            this.f62751d.setVisibility(8);
            return;
        }
        this.f62751d.setText(charSequence);
        this.f62751d.setVisibility(0);
    }

    /* renamed from: a */
    private static void m92092a(View view, final View view2, final float f, final double d) {
        view.post(new Runnable() {
            /* class com.larksuite.component.ui.loading.LKUIStatus.RunnableC256792 */

            public void run() {
                Log.i("LKUIStatus", "setViewOnScreenTranslation translationY =" + f);
                View view = view2;
                if (view != null) {
                    float f = f;
                    if (f > BitmapDescriptorFactory.HUE_RED) {
                        view.setTranslationY(f);
                        return;
                    }
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    view2.setTranslationY(((float) (((double) ((float) C25655d.m91902a(view.getContext()).mo89314b())) * d)) - (((float) iArr[1]) - view2.getTranslationY()));
                }
            }
        });
    }
}
