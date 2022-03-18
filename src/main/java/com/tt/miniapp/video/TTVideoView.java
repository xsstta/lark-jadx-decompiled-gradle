package com.tt.miniapp.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.RelativeLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.video.base.ITTVideoController;
import com.tt.miniapp.video.core.C67093a;
import com.tt.miniapp.video.p3341d.p3342a.AbstractC67099e;
import com.tt.miniapp.video.p3341d.p3344c.p3345a.C67106b;
import com.tt.miniapp.video.p3341d.p3344c.p3346b.C67111b;
import com.tt.miniapp.video.p3341d.p3344c.p3347c.C67120e;

public class TTVideoView extends RelativeLayout {

    /* renamed from: a */
    private C67093a f169075a;

    public C67093a getVideoController() {
        return this.f169075a;
    }

    /* renamed from: b */
    public void mo233190b() {
        if (m261429a("startVideo")) {
            this.f169075a.mo233267g();
        }
    }

    /* renamed from: c */
    public void mo233193c() {
        if (m261429a("pauseVideo")) {
            this.f169075a.mo233268h();
        }
    }

    /* renamed from: d */
    public void mo233195d() {
        if (m261429a("stopVideo")) {
            this.f169075a.mo233269i();
        }
    }

    /* renamed from: e */
    public void mo233196e() {
        if (m261429a("requestFullScreen") && !this.f169075a.mo233275o()) {
            this.f169075a.mo230777c();
        }
    }

    /* renamed from: f */
    public void mo233197f() {
        if (m261429a("exitFullScreen") && this.f169075a.mo233275o()) {
            this.f169075a.mo230778d();
        }
    }

    public TextureView getRenderView() {
        if (m261429a("getRenderView")) {
            return this.f169075a.mo233298E();
        }
        return null;
    }

    /* renamed from: b */
    public void mo233192b(IAppContext iAppContext) {
        mo233194c(iAppContext);
    }

    public TTVideoView(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C67093a mo230764a(IAppContext iAppContext) {
        return new C67093a(iAppContext);
    }

    /* renamed from: a */
    public void mo233187a(ITTVideoController.ShowStateEntity showStateEntity) {
        if (m261429a("updateShowState")) {
            this.f169075a.mo233253a(showStateEntity);
        }
    }

    /* renamed from: a */
    private boolean m261429a(String str) {
        if (this.f169075a != null) {
            return true;
        }
        AppBrandLogger.m52829e("tma_TTVideoView", str, " videoController is null");
        return false;
    }

    /* renamed from: b */
    public void mo233191b(int i) {
        if (m261429a("seek")) {
            this.f169075a.mo233262c(i);
        }
    }

    /* renamed from: a */
    public void mo233188a(ITTVideoController.C67083a aVar) {
        if (m261429a("play")) {
            this.f169075a.mo233254a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo233194c(IAppContext iAppContext) {
        C67093a a = mo230764a(iAppContext);
        this.f169075a = a;
        a.mo233313a(new C67111b());
        this.f169075a.mo233313a(new C67120e(iAppContext));
        this.f169075a.mo233313a(new C67106b());
        this.f169075a.mo233303a(getContext(), this);
    }

    /* renamed from: a */
    public void mo233189a(AbstractC67099e eVar) {
        if (m261429a("notifyVideoEvent")) {
            this.f169075a.mo233255a(eVar);
        }
    }

    public TTVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
