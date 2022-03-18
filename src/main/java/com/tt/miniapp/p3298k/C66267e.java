package com.tt.miniapp.p3298k;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3298k.AbstractC66269f;

/* renamed from: com.tt.miniapp.k.e */
public class C66267e extends AbstractC66269f {
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: a */
    public boolean mo231636a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: b */
    public int mo231637b() {
        return R.layout.microapp_m_favorite_guide_tip;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: d */
    public int mo231639d() {
        return 53;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: e */
    public int mo231640e() {
        return mo231648k();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: f */
    public int mo231641f() {
        return mo231647j();
    }

    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: c */
    public void mo231638c() {
        super.mo231638c();
        this.f167257d.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.p3298k.C66267e.View$OnClickListenerC662681 */

            public void onClick(View view) {
                C66267e.this.mo231655a(true);
            }
        });
    }

    @Override // com.tt.miniapp.p3298k.AbstractC66269f
    /* renamed from: g */
    public ApiResult mo231644g() {
        if (!mo231645h()) {
            return ApiResult.fail("invalid toolbar position");
        }
        return super.mo231644g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo231645h() {
        View i = mo231646i();
        Rect rect = new Rect();
        if (i == null || !i.getGlobalVisibleRect(rect)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo231648k() {
        return this.f167256c.mo231665a().getResources().getDimensionPixelSize(R.dimen.microapp_m_favorite_guide_tip_right_margin);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public View mo231646i() {
        try {
            if (this.f167256c.mo231666b()) {
                return this.f167256c.mo231665a().findViewById(R.id.microapp_m_titlebar_capsule_more);
            }
            return AppbrandApplicationImpl.getInst(this.f167258e).getRenderViewManager().getCurrentIRender().getRootView().findViewById(R.id.microapp_m_titlebar_capsule_more);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("FavoriteGuideTipView", "getMoreView", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo231647j() {
        View view;
        try {
            if (this.f167256c.mo231666b()) {
                view = this.f167256c.mo231665a().findViewById(R.id.microapp_m_titleBar_content);
            } else {
                view = AppbrandApplicationImpl.getInst(this.f167258e).getRenderViewManager().getCurrentIRender().getRootView().findViewById(R.id.microapp_m_titleBar_content);
            }
            Rect rect = new Rect();
            if (view == null) {
                return 0;
            }
            if (!view.getGlobalVisibleRect(rect)) {
                return 0;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int measuredHeight = view.getMeasuredHeight();
            return iArr[1] + measuredHeight + this.f167256c.mo231665a().getResources().getDimensionPixelSize(R.dimen.microapp_m_favorite_guide_tip_top_margin);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("FavoriteGuideTipView", "getTipTopMargin", e);
            return 0;
        }
    }

    public C66267e(C66266d dVar, AbstractC66269f.AbstractC66272a aVar, IAppContext iAppContext) {
        super(dVar, aVar, iAppContext);
    }
}
