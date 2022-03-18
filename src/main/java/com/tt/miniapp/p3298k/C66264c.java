package com.tt.miniapp.p3298k;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3298k.AbstractC66269f;
import com.tt.miniapphost.entity.C67533i;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.p3255a.C65678c;

/* renamed from: com.tt.miniapp.k.c */
public class C66264c extends AbstractC66269f {
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: a */
    public boolean mo231636a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: b */
    public int mo231637b() {
        return R.layout.microapp_m_favorite_guide_bar;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: d */
    public int mo231639d() {
        return 81;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: e */
    public int mo231640e() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: f */
    public int mo231641f() {
        return m259272h();
    }

    /* renamed from: h */
    private int m259272h() {
        int i;
        if ("overtab".equals(this.f167254a.f167252c)) {
            i = R.dimen.microapp_m_favorite_guide_bar_overtab;
        } else {
            i = R.dimen.microapp_m_favorite_guide_bar_bottom;
        }
        return this.f167256c.mo231665a().getResources().getDimensionPixelSize(i);
    }

    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: c */
    public void mo231638c() {
        super.mo231638c();
        TextView textView = (TextView) this.f167257d.findViewById(R.id.add_button);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3298k.C66264c.View$OnClickListenerC662651 */

            public void onClick(View view) {
                C66264c.this.mo231655a(false);
                C66263b.m259266a(C66264c.this.mo231657m(), C66264c.this.f167258e);
                C66264c.this.f167256c.mo231668d();
            }
        });
        m259270a((ImageView) this.f167257d.findViewById(R.id.app_icon));
        m259271a(textView);
    }

    /* renamed from: a */
    private void m259270a(ImageView imageView) {
        try {
            HostDependManager.getInst().loadImage(this.f167256c.mo231665a(), new C65678c(Uri.parse(AppbrandApplicationImpl.getInst(this.f167258e).getAppInfo().icon)).mo229919a(R.drawable.microapp_m_default_image).mo229924b(R.drawable.microapp_m_default_image).mo229922a(imageView));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("FavoriteGuideBarView", "loadAppIcon", e);
        }
    }

    /* renamed from: a */
    private void m259271a(TextView textView) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) this.f167256c.mo231665a().getResources().getDimensionPixelSize(R.dimen.microapp_m_favorite_guide_bar_radius));
            gradientDrawable.setColor(Color.parseColor(C67533i.m262676a().mo234522b()));
            textView.setBackground(gradientDrawable);
        } catch (Resources.NotFoundException e) {
            AppBrandLogger.eWithThrowable("FavoriteGuideBarView", "setAddButtonBackground", e);
        }
    }

    public C66264c(C66266d dVar, AbstractC66269f.AbstractC66272a aVar, IAppContext iAppContext) {
        super(dVar, aVar, iAppContext);
    }
}
