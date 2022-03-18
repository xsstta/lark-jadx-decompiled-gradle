package com.bytedance.ee.larkbrand.p653g;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.view.BaseLaunchLoadingView;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.bytedance.ee.larkbrand.g.c */
public class C13067c extends BaseLaunchLoadingView {

    /* renamed from: a */
    public LottieAnimationView f34732a;

    /* renamed from: b */
    public View f34733b;

    /* renamed from: c */
    public long f34734c;

    /* renamed from: d */
    private TimeMeter f34735d;

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: c */
    public void mo49129c() {
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: b */
    public void mo49128b() {
        super.mo49128b();
        m53589d();
    }

    /* renamed from: d */
    private void m53589d() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
    }

    /* renamed from: a */
    public void mo49123a() {
        C67866g.m264027a(new Runnable() {
            /* class com.bytedance.ee.larkbrand.p653g.C13067c.RunnableC130681 */

            public void run() {
                C13067c.this.f34734c = System.currentTimeMillis();
                C13067c.this.setVisibility(0);
                C13067c.this.f34733b.setVisibility(8);
                C13067c.this.f34732a.setVisibility(0);
                C13067c.this.f34732a.playAnimation();
            }
        });
    }

    public C13067c(Context context) {
        super(context);
        m53588a(context);
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49125a(Activity activity) {
        super.mo49125a(activity);
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    public void setLoadStartTime(TimeMeter timeMeter) {
        this.f34735d = timeMeter;
        mo49123a();
    }

    public void setRetryClickListener(View.OnClickListener onClickListener) {
        View view;
        if (onClickListener != null && (view = this.f34733b) != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49126a(AppInfoEntity appInfoEntity) {
        super.mo49126a(appInfoEntity);
    }

    /* renamed from: a */
    private void m53588a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.lark_brand_h5_gadget_loading, (ViewGroup) this, true);
        this.f34732a = (LottieAnimationView) inflate.findViewById(R.id.lottie_loading_anim);
        this.f34733b = inflate.findViewById(R.id.error_page);
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49124a(int i, int i2) {
        super.mo49124a(i, i2);
    }

    @Override // com.tt.miniapp.view.BaseLaunchLoadingView
    /* renamed from: a */
    public void mo49127a(String str, boolean z, String str2) {
        super.mo49127a(str, z, str2);
        AppBrandLogger.m52829e("TabGadgetLaunchLoadingV", "str:" + str + " canRetry:" + z + " code:" + str2);
        C67866g.m264027a(new Runnable() {
            /* class com.bytedance.ee.larkbrand.p653g.C13067c.RunnableC130692 */

            public void run() {
                C13067c.this.f34733b.setVisibility(0);
                C13067c.this.f34732a.cancelAnimation();
                C13067c.this.f34732a.setVisibility(8);
                AppBrandLogger.m52830i("TabGadgetLaunchLoadingV", "error duration:" + (System.currentTimeMillis() - C13067c.this.f34734c));
            }
        });
    }
}
