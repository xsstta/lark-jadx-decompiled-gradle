package com.ss.android.lark.feed.app.banner.ug_banner;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.feed.app.banner.p1852c.p1854b.C37358a;
import com.ss.android.lark.feed.app.banner.p1852c.p1854b.C37359b;
import com.ss.android.lark.feed.app.banner.p1852c.p1856d.AbstractC37363a;
import com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.BannerMaterial;
import com.ss.android.lark.ug.banner.BannerHandler;
import com.ss.android.lark.ug.banner.BannerReachPoint;
import com.ss.android.lark.ug.facade.UgReachSdk;
import com.ss.android.lark.ug.facade.bean.BizContextProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2;", "Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader;", "()V", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "listener", "Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader$ILoadCompleteListener;", "reachPoint", "Lcom/ss/android/lark/ug/banner/BannerReachPoint;", "tenantChangedListener", "Lcom/ss/android/lark/feed/app/banner/ug_banner/listener/TenantChangedListener;", "bindListenerIfNeed", "", "closeBanner", "initBannerReachPoint", "context", "Landroid/content/Context;", "initHandler", "loadBanner", "tryExpose", "unInit", "updateBanner", "view", "Landroid/view/View;", "notify", "", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.banner.c.b */
public final class FeedBannerLoader2 implements IFeedBannerLoader {

    /* renamed from: b */
    public static final Companion f95872b = new Companion(null);

    /* renamed from: a */
    public BannerMaterial f95873a;

    /* renamed from: d */
    private IFeedBannerLoader.ILoadCompleteListener f95874d;

    /* renamed from: e */
    private BannerReachPoint f95875e;

    /* renamed from: f */
    private AbstractC37363a f95876f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$Companion;", "", "()V", "BIZ_CONTEXT_KEY_NOTIFICATION_AUTH", "", "REACH_POINT_ID", "SCENARIO_ID", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$initBannerReachPoint$1", "Lcom/ss/android/lark/ug/facade/bean/BizContextProvider;", "getBizContext", "", "", "getScenarioId", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$d */
    public static final class C37353d implements BizContextProvider {
        @Override // com.ss.android.lark.ug.facade.bean.BizContextProvider
        /* renamed from: b */
        public String mo130965b() {
            return "SCENE_FEED";
        }

        C37353d() {
        }

        @Override // com.ss.android.lark.ug.facade.bean.BizContextProvider
        /* renamed from: a */
        public Map<String, String> mo130964a() {
            return MapsKt.mapOf(TuplesKt.to("notificationAuth", "true"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u001e\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$initBannerReachPoint$2", "Lcom/ss/android/lark/ug/banner/BannerReachPoint$BannerReachPointDelegate;", "getContext", "Landroid/content/Context;", "onHide", "", "bannerInfo", "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "Lcom/ss/android/lark/ug/banner/BannerInfo;", "manual", "onShow", "bannerView", "Landroid/view/View;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$e */
    public static final class C37354e implements BannerReachPoint.BannerReachPointDelegate {

        /* renamed from: a */
        final /* synthetic */ FeedBannerLoader2 f95879a;

        /* renamed from: b */
        final /* synthetic */ Context f95880b;

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public Context mo16938a() {
            return this.f95880b;
        }

        C37354e(FeedBannerLoader2 bVar, Context context) {
            this.f95879a = bVar;
            this.f95880b = context;
        }

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public boolean mo16940a(BannerMaterial bannerMaterial, boolean z) {
            this.f95879a.mo137208a((View) null, !z);
            return true;
        }

        @Override // com.ss.android.lark.ug.banner.BannerReachPoint.BannerReachPointDelegate
        /* renamed from: a */
        public boolean mo16939a(View view, BannerMaterial bannerMaterial) {
            Intrinsics.checkParameterIsNotNull(bannerMaterial, "bannerInfo");
            this.f95879a.f95873a = bannerMaterial;
            this.f95879a.mo137208a(view, true);
            this.f95879a.mo137209b();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "getView", "com/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$updateBanner$bannerPreview$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$h */
    public static final class C37357h implements AbstractC37366e {

        /* renamed from: a */
        final /* synthetic */ View f95883a;

        C37357h(View view) {
            this.f95883a = view;
        }

        @Override // com.ss.android.lark.feed.app.banner.p1852c.AbstractC37366e
        /* renamed from: a */
        public final View mo137175a() {
            return this.f95883a;
        }
    }

    /* renamed from: c */
    public final void mo137210c() {
        BannerReachPoint fVar = this.f95875e;
        if (fVar != null) {
            fVar.mo195217k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"com/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$initHandler$1", "Lcom/ss/android/lark/ug/banner/BannerHandler;", "inviteHandler", "Lcom/ss/android/lark/feed/app/banner/ug_banner/handler/InviteBannerHandler;", "getInviteHandler", "()Lcom/ss/android/lark/feed/app/banner/ug_banner/handler/InviteBannerHandler;", "onBannerClick", "", "view", "Landroid/view/View;", "url", "", "onBannerClose", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$f */
    public static final class C37355f implements BannerHandler {

        /* renamed from: a */
        private final C37358a f95881a = new C37358a();

        C37355f() {
        }

        @Override // com.ss.android.lark.ug.banner.BannerHandler
        /* renamed from: a */
        public boolean mo16910a(View view) {
            return this.f95881a.mo16929a(view);
        }

        @Override // com.ss.android.lark.ug.banner.BannerHandler
        /* renamed from: a */
        public boolean mo16911a(View view, String str) {
            return this.f95881a.mo16930a(view, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"com/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$initHandler$upgradeTeamHandler$1", "Lcom/ss/android/lark/ug/banner/BannerHandler;", "upgradeTeamHandler", "Lcom/ss/android/lark/feed/app/banner/ug_banner/handler/UpgradeTeamBannerHandler;", "getUpgradeTeamHandler", "()Lcom/ss/android/lark/feed/app/banner/ug_banner/handler/UpgradeTeamBannerHandler;", "onBannerClick", "", "view", "Landroid/view/View;", "url", "", "onBannerClose", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$g */
    public static final class C37356g implements BannerHandler {

        /* renamed from: a */
        private final C37359b f95882a = new C37359b();

        C37356g() {
        }

        @Override // com.ss.android.lark.ug.banner.BannerHandler
        /* renamed from: a */
        public boolean mo16910a(View view) {
            return this.f95882a.mo16929a(view);
        }

        @Override // com.ss.android.lark.ug.banner.BannerHandler
        /* renamed from: a */
        public boolean mo16911a(View view, String str) {
            return this.f95882a.mo16930a(view, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoader2$bindListenerIfNeed$1", "Lcom/ss/android/lark/feed/app/banner/ug_banner/listener/TenantChangedListener;", "onChangedToStandard", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$b */
    public static final class C37351b extends AbstractC37363a {

        /* renamed from: a */
        final /* synthetic */ FeedBannerLoader2 f95877a;

        /* renamed from: b */
        final /* synthetic */ Function0 f95878b;

        @Override // com.ss.android.lark.feed.app.banner.p1852c.p1856d.AbstractC37363a
        /* renamed from: a */
        public void mo137199a() {
            if (((Boolean) this.f95878b.invoke()).booleanValue()) {
                this.f95877a.mo137210c();
            }
        }

        C37351b(FeedBannerLoader2 bVar, Function0 function0) {
            this.f95877a = bVar;
            this.f95878b = function0;
        }
    }

    /* renamed from: d */
    private final void m147039d() {
        Log.m165389i("IFeedBannerLoader", "tryExpose");
        UgReachSdk.tryExpose$default(UgReachSdk.INSTANCE, "SCENE_FEED", (BizContextProvider) null, 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.b$c */
    public static final class C37352c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ FeedBannerLoader2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37352c(FeedBannerLoader2 bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            String str;
            BannerMaterial bannerMaterial = this.this$0.f95873a;
            String str2 = null;
            if (bannerMaterial != null) {
                str = bannerMaterial.mbanner_name;
            } else {
                str = null;
            }
            if (!TextUtils.equals(r0, str)) {
                BannerMaterial bannerMaterial2 = this.this$0.f95873a;
                if (bannerMaterial2 != null) {
                    str2 = bannerMaterial2.mbanner_name;
                }
                if (TextUtils.equals(r0, str2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo137209b() {
        C37352c cVar = new C37352c(this);
        if (this.f95876f == null && ((Boolean) cVar.invoke()).booleanValue()) {
            C37351b bVar = new C37351b(this, cVar);
            this.f95876f = bVar;
            if (bVar != null) {
                bVar.mo137215b();
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader
    /* renamed from: a */
    public void mo137171a() {
        AbstractC37363a aVar = this.f95876f;
        if (aVar != null) {
            aVar.mo137216c();
        }
        this.f95876f = null;
        BannerReachPoint fVar = this.f95875e;
        if (fVar != null) {
            UgReachSdk.INSTANCE.recycleReachPoint(fVar);
        }
        this.f95875e = null;
    }

    /* renamed from: a */
    private final void m147038a(BannerReachPoint fVar) {
        fVar.mo194538a("InviteMember", new C37355f());
        C37356g gVar = new C37356g();
        fVar.mo194538a("VCUpgradetoTeam", gVar);
        fVar.mo194538a("UpgradetoTeamV2", gVar);
    }

    /* renamed from: a */
    private final void m147037a(Context context) {
        if (this.f95875e == null) {
            BannerReachPoint fVar = (BannerReachPoint) UgReachSdk.INSTANCE.obtainReachPointById("RP_FEED_TOP", BannerReachPoint.class, new C37353d());
            this.f95875e = fVar;
            if (fVar != null) {
                m147038a(fVar);
                fVar.mo194535a(new C37354e(this, context));
                return;
            }
            Log.m165383e("IFeedBannerLoader", "ReachPoint.obtain return null");
        }
    }

    @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader
    /* renamed from: a */
    public void mo137173a(Context context, IFeedBannerLoader.ILoadCompleteListener bVar) {
        if (context != null) {
            this.f95874d = bVar;
            m147037a(context);
            m147039d();
        }
    }

    /* renamed from: a */
    public final void mo137208a(View view, boolean z) {
        if (view == null) {
            IFeedBannerLoader.ILoadCompleteListener bVar = this.f95874d;
            if (bVar != null) {
                bVar.mo137214a(null, z);
                return;
            }
            return;
        }
        UGBannerPreview uGBannerPreview = new UGBannerPreview();
        uGBannerPreview.setUgBannerView(new C37357h(view));
        IFeedBannerLoader.ILoadCompleteListener bVar2 = this.f95874d;
        if (bVar2 != null) {
            bVar2.mo137214a(uGBannerPreview, true);
        }
        Log.m165389i("IFeedBannerLoader", "BannerReachPoint banner show");
    }
}
