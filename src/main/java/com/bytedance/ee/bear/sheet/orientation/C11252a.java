package com.bytedance.ee.bear.sheet.orientation;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.bytedance.ee.bear.document.selection.AbstractC6124a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.orientation.a */
public class C11252a implements AbstractC6124a {

    /* renamed from: a */
    private AbstractC11255a f30272a;

    /* renamed from: b */
    private C11256b f30273b;

    /* renamed from: c */
    private boolean f30274c = true;

    /* renamed from: d */
    private boolean f30275d;

    /* renamed from: com.bytedance.ee.bear.sheet.orientation.a$a */
    public interface AbstractC11255a {
        /* renamed from: a */
        void mo43122a();

        /* renamed from: a */
        void mo43123a(boolean z);

        /* renamed from: b */
        void mo43124b();
    }

    /* renamed from: f */
    private void m46793f() {
        AbstractC11255a aVar = this.f30272a;
        if (aVar != null) {
            aVar.mo43124b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m46795h() {
        this.f30272a.mo43122a();
    }

    /* renamed from: e */
    private boolean m46792e() {
        C11256b bVar = this.f30273b;
        if (bVar == null || bVar.f30279a.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractC6124a
    public void onDestroyActionMode() {
        if (this.f30275d) {
            this.f30273b.f30279a.setVisibility(0);
            this.f30275d = false;
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractC6124a
    public void onPrepareActionMode() {
        if (m46792e()) {
            mo43126a();
            this.f30275d = true;
        }
    }

    /* renamed from: g */
    private void m46794g() {
        this.f30273b.f30279a.startAnimation(AnimationUtils.loadAnimation(this.f30273b.f30279a.getContext(), R.anim.sheet_fade_in));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo43129b() {
        if (!this.f30274c) {
            this.f30274c = true;
            C11256b bVar = this.f30273b;
            if (bVar != null && this.f30275d) {
                bVar.f30279a.setVisibility(0);
                this.f30275d = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo43131c() {
        if (this.f30274c) {
            this.f30274c = false;
            if (m46792e()) {
                mo43126a();
                this.f30275d = true;
            }
        }
    }

    /* renamed from: d */
    public void mo43133d() {
        C11256b bVar;
        if (this.f30272a != null && (bVar = this.f30273b) != null) {
            bVar.f30279a.setVisibility(8);
            this.f30273b.f30279a.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.orientation.$$Lambda$a$cCb6oP0DEPhO9JcSZ9ycwgqNB5o */

                public final void run() {
                    C11252a.this.m46795h();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43126a() {
        if (m46792e()) {
            this.f30273b.f30279a.startAnimation(AnimationUtils.loadAnimation(this.f30273b.f30279a.getContext(), R.anim.sheet_fade_out));
            this.f30273b.f30279a.setVisibility(8);
        }
        this.f30275d = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m46791d(boolean z) {
        this.f30272a.mo43123a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43127a(View view) {
        this.f30273b = new C11256b(view);
    }

    C11252a(AbstractC11255a aVar) {
        this.f30272a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43128a(final boolean z) {
        m46790a(z, R.dimen.sheet_switch_landscape_tip_margin_top, R.dimen.sheet_orientation_tip_margin_horizontal, new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.orientation.C11252a.C112531 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C11252a.this.mo43132c(z);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo43130b(boolean z) {
        m46790a(!z, R.dimen.sheet_switch_portrait_tip_margin_top, R.dimen.sheet_orientation_tip_margin_horizontal, new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.orientation.C11252a.C112542 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C11252a.this.mo43133d();
            }
        });
    }

    /* renamed from: c */
    public void mo43132c(boolean z) {
        C11256b bVar;
        if (this.f30272a != null && (bVar = this.f30273b) != null) {
            bVar.f30279a.setVisibility(8);
            this.f30273b.f30279a.post(new Runnable(z) {
                /* class com.bytedance.ee.bear.sheet.orientation.$$Lambda$a$7LUwEW0FJoWTMozqw0H2i4Wr_Q */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C11252a.this.m46791d(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.orientation.a$b */
    public class C11256b {

        /* renamed from: a */
        View f30279a;

        /* renamed from: b */
        View f30280b;

        C11256b(View view) {
            this.f30279a = view;
            this.f30280b = view.findViewById(R.id.orientation_tip);
        }
    }

    /* renamed from: a */
    private void m46790a(boolean z, int i, int i2, AbstractView$OnClickListenerC11839e eVar) {
        float f;
        float f2;
        if (this.f30274c && this.f30273b != null) {
            m46793f();
            Resources resources = this.f30273b.f30279a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sheet_orientation_tip_size);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(i2);
            this.f30273b.f30279a.setVisibility(0);
            View view = this.f30273b.f30280b;
            if (z) {
                f = -90.0f;
            } else {
                f = 90.0f;
            }
            view.setRotation(f);
            View view2 = this.f30273b.f30280b;
            if (z) {
                f2 = (float) dimensionPixelSize3;
            } else {
                f2 = (float) ((C13749l.m55736a() - dimensionPixelSize) - dimensionPixelSize3);
            }
            view2.setTranslationX(f2);
            this.f30273b.f30280b.setTranslationY((float) dimensionPixelSize2);
            this.f30273b.f30280b.setOnClickListener(eVar);
            m46794g();
        }
    }
}
