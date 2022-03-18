package com.bytedance.ee.bear.banner;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ee.bear.banner.bean.BannerScene;
import com.bytedance.ee.bear.banner.p248c.AbstractC4335a;
import com.bytedance.ee.bear.banner.p248c.AbstractC4336b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/banner/DocsBannerProxy;", "Lcom/bytedance/ee/bear/banner/IDocsBannerManager;", "()V", "docsBannerManagerV1", "Lcom/bytedance/ee/bear/banner/DocsBannerManager;", "docsBannerManagerV2", "Lcom/bytedance/ee/bear/banner/DocsBannerManagerV2;", "enableUgReach", "", "closeBanner", "", "destroy", "getCurrentBannerManager", "getUserNavigationBannerInterface", "Lcom/bytedance/ee/bear/banner/interfaces/IUserNavigationBannerInterface;", "getUserNavigationBannerListeners", "", "Lcom/bytedance/ee/bear/banner/interfaces/UserNavigationBannerListener;", "init", "bannerContainer", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "loadBanners", "setEnableUgReach", "setScene", "scene", "Lcom/bytedance/ee/bear/banner/bean/BannerScene;", "banner-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.banner.d */
public final class DocsBannerProxy implements AbstractC4339e {

    /* renamed from: a */
    private C4316b f12954a = new C4316b();

    /* renamed from: b */
    private DocsBannerManagerV2 f12955b = new DocsBannerManagerV2();

    /* renamed from: c */
    private boolean f12956c;

    /* renamed from: f */
    private final AbstractC4339e m17888f() {
        AbstractC4339e eVar;
        if (this.f12956c) {
            eVar = this.f12955b;
        } else {
            eVar = this.f12954a;
        }
        return eVar;
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16913a() {
        AbstractC4339e f = m17888f();
        if (f != null) {
            f.mo16913a();
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: b */
    public void mo16918b() {
        AbstractC4339e f = m17888f();
        if (f != null) {
            f.mo16918b();
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: c */
    public void mo16919c() {
        AbstractC4339e f = m17888f();
        if (f != null) {
            f.mo16919c();
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: d */
    public AbstractC4335a mo16920d() {
        AbstractC4339e f = m17888f();
        if (f != null) {
            return f.mo16920d();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: e */
    public List<AbstractC4336b> mo16921e() {
        AbstractC4339e f = m17888f();
        if (f != null) {
            return f.mo16921e();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16917a(boolean z) {
        this.f12956c = z;
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16915a(BannerScene bannerScene) {
        Intrinsics.checkParameterIsNotNull(bannerScene, "scene");
        AbstractC4339e f = m17888f();
        if (f != null) {
            f.mo16915a(bannerScene);
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16914a(ViewGroup viewGroup, Context context) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "bannerContainer");
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC4339e f = m17888f();
        if (f != null) {
            f.mo16914a(viewGroup, context);
        }
    }
}
