package com.tt.miniapp.p3298k;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3289g.C66180a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;

/* renamed from: com.tt.miniapp.k.f */
public abstract class AbstractC66269f {

    /* renamed from: a */
    protected C66266d f167254a;

    /* renamed from: b */
    protected C66262a f167255b;

    /* renamed from: c */
    protected AbstractC66272a f167256c;

    /* renamed from: d */
    protected View f167257d;

    /* renamed from: e */
    protected IAppContext f167258e;

    /* renamed from: f */
    private final Runnable f167259f = new Runnable() {
        /* class com.tt.miniapp.p3298k.AbstractC66269f.RunnableC662701 */

        public void run() {
            AbstractC66269f.this.mo231655a(false);
        }
    };

    /* renamed from: g */
    private long f167260g = -1;

    /* renamed from: com.tt.miniapp.k.f$a */
    public interface AbstractC66272a {
        /* renamed from: a */
        Activity mo231665a();

        /* renamed from: b */
        boolean mo231666b();

        /* renamed from: c */
        void mo231667c();

        /* renamed from: d */
        void mo231668d();
    }

    /* renamed from: a */
    public abstract boolean mo231636a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo231637b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo231639d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo231640e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo231641f();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public long mo231657m() {
        if (mo231636a()) {
            return 3000;
        }
        return 10000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo231660p() {
        return C66180a.m259141b("MiniAppSpData", mo231650a("showCount"), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public long mo231661q() {
        return C66180a.m259142b("MiniAppSpData", mo231650a("lastShowTime"), 0L);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public long mo231662r() {
        if (mo231636a()) {
            return this.f167255b.f167247d;
        }
        return this.f167255b.f167248e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo231656l() {
        if (!this.f167255b.f167245b) {
            return this.f167255b.f167244a;
        }
        if (TextUtils.isEmpty(this.f167254a.f167251b)) {
            return this.f167255b.f167244a;
        }
        return this.f167254a.f167251b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public long mo231658n() {
        long j;
        if (this.f167260g < 0) {
            j = 0;
        } else {
            j = System.currentTimeMillis() - this.f167260g;
        }
        if (j < 0) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo231659o() {
        mo231652a(mo231660p() + 1);
        long currentTimeMillis = System.currentTimeMillis();
        this.f167260g = currentTimeMillis;
        mo231653a(currentTimeMillis);
        C66263b.m259268a(mo231636a(), mo231656l(), this.f167258e);
    }

    /* renamed from: c */
    public void mo231638c() {
        FrameLayout frameLayout = (FrameLayout) this.f167256c.mo231665a().findViewById(R.id.microapp_m_top_container);
        View inflate = LayoutInflater.from(this.f167256c.mo231665a()).inflate(mo231637b(), (ViewGroup) frameLayout, false);
        this.f167257d = inflate;
        ((TextView) inflate.findViewById(R.id.text_view)).setText(C66282h.m259343a(mo231656l(), 12));
        ((ImageView) this.f167257d.findViewById(R.id.close_button)).setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3298k.AbstractC66269f.View$OnClickListenerC662712 */

            public void onClick(View view) {
                AbstractC66269f.this.mo231655a(true);
            }
        });
        this.f167257d.postDelayed(this.f167259f, mo231657m());
        mo231654a(frameLayout, mo231639d(), mo231640e(), mo231641f());
        mo231659o();
    }

    /* renamed from: g */
    public ApiResult mo231644g() {
        AppInfoEntity appInfo = C67432a.m262319a(this.f167258e).getAppInfo();
        if (appInfo != null && !TextUtils.isEmpty(appInfo.versionType) && ("current".equals(appInfo.versionType) || "audit".equals(appInfo.versionType))) {
            if (mo231660p() >= 2) {
                return ApiResult.fail("reach the maximum show count limit");
            }
            if (System.currentTimeMillis() - mo231661q() <= mo231662r()) {
                return ApiResult.fail("unreach the minimum show time interval limit");
            }
        }
        return ApiResult.success();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo231650a(String str) {
        return mo231651a(str, mo231636a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231652a(int i) {
        C66180a.m259138a("MiniAppSpData", mo231650a("showCount"), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231653a(long j) {
        C66180a.m259139a("MiniAppSpData", mo231650a("lastShowTime"), j);
    }

    /* renamed from: a */
    public void mo231655a(boolean z) {
        View view = this.f167257d;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f167257d);
                this.f167256c.mo231667c();
                C66263b.m259269a(z, mo231636a(), mo231658n(), mo231656l(), this.f167258e);
            }
            this.f167257d.removeCallbacks(this.f167259f);
        }
    }

    /* renamed from: a */
    public String mo231651a(String str, boolean z) {
        String str2;
        String str3 = AppbrandApplicationImpl.getInst(this.f167258e).getAppInfo().appId;
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(":");
        sb.append(str);
        sb.append(":");
        if (z) {
            str2 = "tip";
        } else {
            str2 = "bar";
        }
        sb.append(str2);
        return sb.toString();
    }

    public AbstractC66269f(C66266d dVar, AbstractC66272a aVar, IAppContext iAppContext) {
        this.f167254a = dVar;
        this.f167256c = aVar;
        this.f167255b = C66262a.m259263a();
        this.f167258e = iAppContext;
    }

    /* renamed from: a */
    public void mo231654a(FrameLayout frameLayout, int i, int i2, int i3) {
        View view;
        if (frameLayout != null && (view = this.f167257d) != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            frameLayout.addView(view);
            ViewGroup.LayoutParams layoutParams = this.f167257d.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (i == 0) {
                    i = 51;
                }
                layoutParams2.gravity = i;
                if ((i & 3) == 3) {
                    layoutParams2.leftMargin = i2;
                }
                if ((i & 5) == 5) {
                    layoutParams2.rightMargin = i2;
                }
                if ((i & 48) == 48) {
                    layoutParams2.topMargin = i3;
                }
                if ((i & 80) == 80) {
                    layoutParams2.bottomMargin = i3;
                }
            }
            this.f167257d.setLayoutParams(layoutParams);
        }
    }
}
