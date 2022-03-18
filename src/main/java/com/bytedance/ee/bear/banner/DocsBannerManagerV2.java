package com.bytedance.ee.bear.banner;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.banner.bean.BannerScene;
import com.bytedance.ee.bear.banner.p246a.C4313b;
import com.bytedance.ee.bear.banner.p246a.C4315c;
import com.bytedance.ee.bear.banner.p248c.AbstractC4335a;
import com.bytedance.ee.bear.banner.p248c.AbstractC4336b;
import com.bytedance.ee.bear.lynx.api.CCMLynxCardView;
import com.bytedance.ee.bear.lynx.api.CCMLynxEnv;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13742g;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.pb.ug_reach.BannerMaterial;
import com.ss.android.lark.ug.banner.BannerHandler;
import com.ss.android.lark.ug.banner.BannerReachPoint;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import com.ss.android.lark.ug.facade.UgReachSdk;
import com.ss.android.lark.ug.facade.bean.BizContextProvider;
import com.ss.android.lark.ug.plugin.ContainerServiceProvider;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\b\u0010#\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010'\u001a\u00020\u001a2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\rH\u0002J\u0012\u0010/\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/banner/DocsBannerManagerV2;", "Lcom/bytedance/ee/bear/banner/IDocsBannerManager;", "()V", "bannerReachPoint", "Lcom/ss/android/lark/ug/banner/BannerReachPoint;", "enableLynx", "", "handlerMap", "", "", "Lcom/ss/android/lark/ug/banner/BannerHandler;", "mBannerContainerRef", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewGroup;", "mCCMLynxCardView", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView;", "mContextRef", "Landroid/content/Context;", "mUserNavigationBannerInterface", "Lcom/bytedance/ee/bear/banner/interfaces/IUserNavigationBannerInterface;", "sUserNavigationBannerListeners", "", "Lcom/bytedance/ee/bear/banner/interfaces/UserNavigationBannerListener;", "scene", "Lcom/bytedance/ee/bear/banner/bean/BannerScene;", "closeBanner", "", "destroy", "getUserNavigationBannerInterface", "getUserNavigationBannerListeners", "hideLynxBanner", "init", "bannerContainer", "context", "loadBanners", "registerHandler", "setEnableUgReach", "enableUgReach", "setScene", "showLynxBanner", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "startCloseAnim", "bannerView", "Landroid/view/View;", "parent", "updateUgBanner", "Companion", "banner-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.banner.c */
public final class DocsBannerManagerV2 implements AbstractC4339e {

    /* renamed from: g */
    public static final Companion f12929g = new Companion(null);

    /* renamed from: a */
    public BannerReachPoint f12930a;

    /* renamed from: b */
    public WeakReference<ViewGroup> f12931b;

    /* renamed from: c */
    public final List<AbstractC4336b> f12932c = new ArrayList();

    /* renamed from: d */
    public CCMLynxCardView f12933d;

    /* renamed from: e */
    public boolean f12934e;

    /* renamed from: f */
    public Map<String, BannerHandler> f12935f = new LinkedHashMap();

    /* renamed from: h */
    private WeakReference<Context> f12936h;

    /* renamed from: i */
    private AbstractC4335a f12937i;

    /* renamed from: j */
    private BannerScene f12938j = BannerScene.COMMON;

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16917a(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/banner/DocsBannerManagerV2$Companion;", "", "()V", "TAG", "", "banner-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u001e\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/banner/DocsBannerManagerV2$init$1", "Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDependency;", "getContext", "Landroid/content/Context;", "onHide", "", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "manual", "onShow", "bannerView", "Landroid/view/View;", "banner-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$d */
    public static final class C4329d implements BannerReachPoint.BannerReachPointDependency {

        /* renamed from: a */
        final /* synthetic */ DocsBannerManagerV2 f12941a;

        /* renamed from: b */
        final /* synthetic */ Context f12942b;

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public Context mo16938a() {
            return this.f12942b;
        }

        C4329d(DocsBannerManagerV2 cVar, Context context) {
            this.f12941a = cVar;
            this.f12942b = context;
        }

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public boolean mo16939a(View view, BannerMaterial bannerMaterial) {
            Intrinsics.checkParameterIsNotNull(bannerMaterial, "bannerInfo");
            C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "bannerReachPoint#onShow()...enableLynx:" + this.f12941a.f12934e);
            if (this.f12941a.f12934e) {
                this.f12941a.mo16935a(bannerMaterial);
                return true;
            }
            this.f12941a.mo16933a(view);
            return true;
        }

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public boolean mo16940a(BannerMaterial bannerMaterial, boolean z) {
            C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "bannerReachPoint#onHide()... manual = " + z);
            if (this.f12941a.f12934e) {
                this.f12941a.mo16936f();
                return true;
            }
            this.f12941a.mo16933a((View) null);
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: e */
    public List<AbstractC4336b> mo16921e() {
        return this.f12932c;
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: b */
    public void mo16918b() {
        BannerReachPoint fVar = this.f12930a;
        if (fVar != null) {
            fVar.mo195217k();
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: d */
    public AbstractC4335a mo16920d() {
        if (this.f12937i == null) {
            this.f12937i = new C4327b(this);
        }
        return this.f12937i;
    }

    /* renamed from: f */
    public final void mo16936f() {
        C13742g.m55705a(new RunnableC4328c(this));
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16913a() {
        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "loadBanners()...");
        UgReachSdk.tryExpose$default(UgReachSdk.INSTANCE, this.f12938j.getScenarioId(), (BizContextProvider) null, 2, (Object) null);
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: c */
    public void mo16919c() {
        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "destroy()...");
        BannerReachPoint fVar = this.f12930a;
        if (fVar != null) {
            UgReachSdk.INSTANCE.recycleReachPoint(fVar);
        }
        this.f12930a = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$c */
    public static final class RunnableC4328c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocsBannerManagerV2 f12940a;

        RunnableC4328c(DocsBannerManagerV2 cVar) {
            this.f12940a = cVar;
        }

        public final void run() {
            CCMLynxCardView cCMLynxCardView = this.f12940a.f12933d;
            if (cCMLynxCardView != null) {
                cCMLynxCardView.mo33878b();
            }
            ViewGroup viewGroup = null;
            this.f12940a.f12933d = null;
            WeakReference<ViewGroup> weakReference = this.f12940a.f12931b;
            if (weakReference != null) {
                viewGroup = weakReference.get();
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$e */
    public static final class RunnableC4330e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocsBannerManagerV2 f12943a;

        /* renamed from: b */
        final /* synthetic */ Context f12944b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f12945c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f12946d;

        RunnableC4330e(DocsBannerManagerV2 cVar, Context context, ViewGroup viewGroup, Ref.ObjectRef objectRef) {
            this.f12943a = cVar;
            this.f12944b = context;
            this.f12945c = viewGroup;
            this.f12946d = objectRef;
        }

        public final void run() {
            if (this.f12944b == null || this.f12945c == null) {
                C13479a.m54775e("DocsBanner_DocsBannerManagerV2", "context or container is null");
                return;
            }
            CCMLynxCardView cCMLynxCardView = this.f12943a.f12933d;
            if (cCMLynxCardView != null) {
                cCMLynxCardView.mo33878b();
            }
            this.f12943a.f12933d = (CCMLynxCardView) KoinJavaComponent.m268612a(CCMLynxCardView.class, null, new Function0<DefinitionParameters>(this) {
                /* class com.bytedance.ee.bear.banner.DocsBannerManagerV2.RunnableC4330e.C43311 */
                final /* synthetic */ RunnableC4330e this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final DefinitionParameters invoke() {
                    return C70039b.m268661a(this.this$0.f12944b);
                }
            });
            CCMLynxCardView cCMLynxCardView2 = this.f12943a.f12933d;
            if (cCMLynxCardView2 != null) {
                cCMLynxCardView2.mo33877a(new CCMLynxCardView.LynxViewEventListener(this) {
                    /* class com.bytedance.ee.bear.banner.DocsBannerManagerV2.RunnableC4330e.C43322 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC4330e f12947a;

                    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView.LynxViewEventListener
                    /* renamed from: a */
                    public void mo16942a() {
                        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "mCCMLynxCardView#closeContainer()");
                        BannerReachPoint fVar = this.f12947a.f12943a.f12930a;
                        if (fVar != null) {
                            fVar.mo194531a((View) null);
                        }
                        this.f12947a.f12943a.mo16936f();
                    }

                    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView.LynxViewEventListener
                    /* renamed from: b */
                    public void mo16944b() {
                        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "mCCMLynxCardView#onShow()");
                        BannerReachPoint fVar = this.f12947a.f12943a.f12930a;
                        if (fVar != null) {
                            fVar.mo194537a(new BaseBannerView(this.f12947a.f12944b, null, 2, null));
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f12947a = r1;
                    }

                    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView.LynxViewEventListener
                    /* renamed from: a */
                    public void mo16943a(Map<String, String> map) {
                        String str;
                        String str2;
                        boolean z;
                        WeakReference<ContainerServiceProvider> j;
                        ContainerServiceProvider bVar;
                        BannerHandler dVar;
                        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "mCCMLynxCardView#onClick()");
                        if (map != null) {
                            str = map.get("url");
                        } else {
                            str = null;
                        }
                        if (map != null) {
                            str2 = map.get("name");
                        } else {
                            str2 = null;
                        }
                        BannerReachPoint fVar = this.f12947a.f12943a.f12930a;
                        if (fVar != null) {
                            fVar.mo194532a((View) null, str);
                        }
                        String str3 = str2;
                        if (str3 == null || str3.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || (dVar = this.f12947a.f12943a.f12935f.get(str2)) == null || !dVar.mo16911a(this.f12947a.f12945c, str)) {
                            BannerReachPoint fVar2 = this.f12947a.f12943a.f12930a;
                            if (fVar2 != null && (j = fVar2.mo195216j()) != null && (bVar = j.get()) != null) {
                                bVar.mo195235a(str);
                                return;
                            }
                            return;
                        }
                        C13479a.m54764b("onOpen", "handle consume");
                    }
                });
            }
            CCMLynxCardView cCMLynxCardView3 = this.f12943a.f12933d;
            if (cCMLynxCardView3 != null) {
                cCMLynxCardView3.mo33875a(this.f12945c, 1000, MapsKt.mapOf(TuplesKt.to("dataStr", this.f12946d.element)), new ViewGroup.LayoutParams(-1, -2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$g */
    public static final class RunnableC4334g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocsBannerManagerV2 f12950a;

        /* renamed from: b */
        final /* synthetic */ Context f12951b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f12952c;

        /* renamed from: d */
        final /* synthetic */ View f12953d;

        RunnableC4334g(DocsBannerManagerV2 cVar, Context context, ViewGroup viewGroup, View view) {
            this.f12950a = cVar;
            this.f12951b = context;
            this.f12952c = viewGroup;
            this.f12953d = view;
        }

        public final void run() {
            ViewGroup viewGroup;
            if (this.f12951b != null && (viewGroup = this.f12952c) != null) {
                if (viewGroup.getChildCount() > 0) {
                    if (this.f12953d == null) {
                        DocsBannerManagerV2 cVar = this.f12950a;
                        View childAt = this.f12952c.getChildAt(0);
                        Intrinsics.checkExpressionValueIsNotNull(childAt, "bannerContainer.getChildAt(0)");
                        cVar.mo16934a(childAt, this.f12952c);
                    } else {
                        this.f12952c.removeAllViews();
                    }
                }
                if (this.f12953d != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.topMargin = C57582a.m223600a(4);
                    marginLayoutParams.bottomMargin = C57582a.m223600a(8);
                    this.f12952c.addView(this.f12953d, marginLayoutParams);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m17864g() {
        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "registerHandler()...");
        this.f12935f.put("OldUserNavigation", new C4313b());
        this.f12935f.put("MobileTemplRecommendationV1", new C4315c());
        this.f12935f.put("SingleProductTemplRecommendationV1", new C4315c());
        for (Map.Entry<String, BannerHandler> entry : this.f12935f.entrySet()) {
            BannerReachPoint fVar = this.f12930a;
            if (fVar != null) {
                fVar.mo194538a(entry.getKey(), entry.getValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/banner/DocsBannerManagerV2$getUserNavigationBannerInterface$1", "Lcom/bytedance/ee/bear/banner/interfaces/IUserNavigationBannerInterface;", "registerUserNavigationBannerListener", "", "listener", "Lcom/bytedance/ee/bear/banner/interfaces/UserNavigationBannerListener;", "unregisterUserNavigationBannerListener", "banner-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$b */
    public static final class C4327b implements AbstractC4335a {

        /* renamed from: a */
        final /* synthetic */ DocsBannerManagerV2 f12939a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4327b(DocsBannerManagerV2 cVar) {
            this.f12939a = cVar;
        }

        @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4335a
        /* renamed from: a */
        public void mo16924a(AbstractC4336b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            this.f12939a.f12932c.add(bVar);
        }

        @Override // com.bytedance.ee.bear.banner.p248c.AbstractC4335a
        /* renamed from: b */
        public void mo16925b(AbstractC4336b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            this.f12939a.f12932c.remove(bVar);
        }
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16915a(BannerScene bannerScene) {
        Intrinsics.checkParameterIsNotNull(bannerScene, "scene");
        this.f12938j = bannerScene;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.c$f */
    public static final class C4333f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f12948a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f12949b;

        C4333f(View view, ViewGroup viewGroup) {
            this.f12948a = view;
            this.f12949b = viewGroup;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkParameterIsNotNull(valueAnimator, "animation");
            ViewGroup.LayoutParams layoutParams = this.f12948a.getLayoutParams();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) ((Float) animatedValue).floatValue();
                this.f12948a.setLayoutParams(layoutParams);
                if (layoutParams.height == 0) {
                    this.f12948a.setVisibility(8);
                    this.f12949b.removeView(this.f12948a);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public final void mo16933a(View view) {
        Context context;
        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "updateBanner()... ");
        WeakReference<Context> weakReference = this.f12936h;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        WeakReference<ViewGroup> weakReference2 = this.f12931b;
        if (weakReference2 != null) {
            viewGroup = weakReference2.get();
        }
        C13742g.m55705a(new RunnableC4334g(this, context, viewGroup, view));
    }

    /* renamed from: a */
    public final void mo16935a(BannerMaterial bannerMaterial) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = (T) JSON.toJSONString(bannerMaterial, JSON.DEFAULT_GENERATE_FEATURE & (~SerializerFeature.WriteEnumUsingToString.mask), new SerializerFeature[0]);
        Intrinsics.checkExpressionValueIsNotNull(t, "JSON.toJSONString(\n     …ring.mask.inv()\n        )");
        objectRef.element = t;
        WeakReference<ViewGroup> weakReference = this.f12931b;
        if (weakReference == null) {
            Intrinsics.throwNpe();
        }
        ViewGroup viewGroup = weakReference.get();
        WeakReference<Context> weakReference2 = this.f12936h;
        if (weakReference2 == null) {
            Intrinsics.throwNpe();
        }
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        ((CCMLynxEnv) KoinJavaComponent.m268613a(CCMLynxEnv.class, null, null, 6, null)).mo33880a(application);
        C13742g.m55705a(new RunnableC4330e(this, weakReference2.get(), viewGroup, objectRef));
    }

    /* renamed from: a */
    public final void mo16934a(View view, ViewGroup viewGroup) {
        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "startCloseAnim()...");
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) view.getMeasuredHeight(), 0.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "closeTranslationAnim");
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new C4333f(view, viewGroup));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "closeAlphaAnim");
        ofFloat2.setDuration(250L);
        ofFloat.start();
        ofFloat2.start();
    }

    @Override // com.bytedance.ee.bear.banner.AbstractC4339e
    /* renamed from: a */
    public void mo16914a(ViewGroup viewGroup, Context context) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "bannerContainer");
        Intrinsics.checkParameterIsNotNull(context, "context");
        C13479a.m54764b("DocsBanner_DocsBannerManagerV2", "init()...");
        this.f12931b = new WeakReference<>(viewGroup);
        this.f12936h = new WeakReference<>(context);
        this.f12934e = C4211a.m17514a().mo16536a("spacekit.mobile.ug.reach.lynx_banner.enable", false);
        BannerReachPoint fVar = (BannerReachPoint) UgReachSdk.obtainReachPointById$default(UgReachSdk.INSTANCE, this.f12938j.getReachId(), BannerReachPoint.class, null, 4, null);
        this.f12930a = fVar;
        if (fVar != null) {
            fVar.mo194536a((BannerReachPoint.BannerReachPointDependency) new C4329d(this, context));
        }
        m17864g();
    }
}
