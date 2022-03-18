package com.ss.android.lark.vcintegrator.guide;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.BubbleListener;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dto.NewGuideConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J.\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/vcintegrator/guide/GuideBridge;", "", "()V", "TAG", "", "mCoreApi", "Lcom/ss/android/lark/biz/core/api/ICoreApi;", "checkToShow", "", "guideKey", "completeGuide", "", "key", "recordTime", "convertGravity", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;", "gravity", "", "getActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "startGuide", "newGuideConfig", "Lcom/ss/android/vc/dto/NewGuideConfig;", "lifecycleListener", "Lcom/ss/android/vc/dependency/IGuideDependency$IGuideLifecycleListener;", "startVCTabGuide", "leftButtonConfig", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "rightButtonConfig", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.vcintegrator.a.a */
public final class GuideBridge {

    /* renamed from: a */
    public static final GuideBridge f142662a = new GuideBridge();

    /* renamed from: b */
    private static final ICoreApi f142663b;

    /* renamed from: a */
    public final void mo196587a(NewGuideConfig newGuideConfig, ButtonConfig eVar, ButtonConfig eVar2) {
        m224890a(this, newGuideConfig, eVar, eVar2, null, 8, null);
    }

    private GuideBridge() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/vcintegrator/guide/GuideBridge$startGuide$1", "Lcom/ss/android/lark/guide/ui/config/BubbleListener;", "onDismiss", "", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.vcintegrator.a.a$a */
    public static final class C57973a implements BubbleListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60902q.AbstractC60903a f142664a;

        /* renamed from: b */
        final /* synthetic */ NewGuideConfig f142665b;

        public void onDismiss() {
            AbstractC60902q.AbstractC60903a aVar = this.f142664a;
            if (aVar != null) {
                aVar.mo144597c(this.f142665b.mo208762b());
            }
        }

        C57973a(AbstractC60902q.AbstractC60903a aVar, NewGuideConfig newGuideConfig) {
            this.f142664a = aVar;
            this.f142665b = newGuideConfig;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/vcintegrator/guide/GuideBridge$startVCTabGuide$1", "Lcom/ss/android/lark/guide/ui/config/BubbleListener;", "onDismiss", "", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.vcintegrator.a.a$c */
    public static final class C57975c implements BubbleListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60902q.AbstractC60903a f142667a;

        /* renamed from: b */
        final /* synthetic */ NewGuideConfig f142668b;

        public void onDismiss() {
            AbstractC60902q.AbstractC60903a aVar = this.f142667a;
            if (aVar != null) {
                aVar.mo144597c(this.f142668b.mo208762b());
            }
        }

        C57975c(AbstractC60902q.AbstractC60903a aVar, NewGuideConfig newGuideConfig) {
            this.f142667a = aVar;
            this.f142668b = newGuideConfig;
        }
    }

    static {
        Object api = ApiUtils.getApi(ICoreApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICoreApi::class.java)");
        f142663b = (ICoreApi) api;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/vcintegrator/guide/GuideBridge$startGuide$lifecycle$1", "Lcom/ss/android/lark/guidemgr/engine/callback/IGuideTaskLifecycle;", "onGuideDidAppear", "", "guideKey", "", "onGuideDidClose", "onGuideWillAppear", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.vcintegrator.a.a$b */
    public static final class C57974b implements AbstractC38707a {

        /* renamed from: a */
        final /* synthetic */ AbstractC60902q.AbstractC60903a f142666a;

        C57974b(AbstractC60902q.AbstractC60903a aVar) {
            this.f142666a = aVar;
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: a */
        public void mo129837a(String str) {
            AbstractC60902q.AbstractC60903a aVar = this.f142666a;
            if (aVar != null) {
                aVar.mo144597c(str);
            }
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: b */
        public void mo129838b(String str) {
            AbstractC60902q.AbstractC60903a aVar = this.f142666a;
            if (aVar != null) {
                aVar.mo144595a(str);
            }
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: c */
        public void mo129839c(String str) {
            AbstractC60902q.AbstractC60903a aVar = this.f142666a;
            if (aVar != null) {
                aVar.mo144596b(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/vcintegrator/guide/GuideBridge$startVCTabGuide$lifecycle$1", "Lcom/ss/android/lark/guidemgr/engine/callback/IGuideTaskLifecycle;", "onGuideDidAppear", "", "guideKey", "", "onGuideDidClose", "onGuideWillAppear", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.vcintegrator.a.a$d */
    public static final class C57976d implements AbstractC38707a {

        /* renamed from: a */
        final /* synthetic */ AbstractC60902q.AbstractC60903a f142669a;

        C57976d(AbstractC60902q.AbstractC60903a aVar) {
            this.f142669a = aVar;
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: a */
        public void mo129837a(String str) {
            AbstractC60902q.AbstractC60903a aVar = this.f142669a;
            if (aVar != null) {
                aVar.mo144597c(str);
            }
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: b */
        public void mo129838b(String str) {
            AbstractC60902q.AbstractC60903a aVar = this.f142669a;
            if (aVar != null) {
                aVar.mo144595a(str);
            }
        }

        @Override // com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a
        /* renamed from: c */
        public void mo129839c(String str) {
            AbstractC60902q.AbstractC60903a aVar = this.f142669a;
            if (aVar != null) {
                aVar.mo144596b(str);
            }
        }
    }

    /* renamed from: a */
    private final Activity m224888a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m224888a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: a */
    private final AnchorConfig.AnchorGravity m224889a(int i) {
        if (i == 48) {
            return AnchorConfig.AnchorGravity.TOP;
        }
        if (i == 80) {
            return AnchorConfig.AnchorGravity.BOTTOM;
        }
        if (i == 8388611) {
            return AnchorConfig.AnchorGravity.START;
        }
        if (i != 8388613) {
            return AnchorConfig.AnchorGravity.TOP;
        }
        return AnchorConfig.AnchorGravity.END;
    }

    /* renamed from: a */
    public final boolean mo196591a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        boolean checkToShow = f142663b.checkToShow(str);
        Log.m165389i("GuideBridge", "checkToShow: " + str + " = " + checkToShow);
        return checkToShow;
    }

    /* renamed from: a */
    public final void mo196589a(NewGuideConfig newGuideConfig, AbstractC60902q.AbstractC60903a aVar) {
        Intrinsics.checkParameterIsNotNull(newGuideConfig, "newGuideConfig");
        Log.m165389i("GuideBridge", "startGuide: " + newGuideConfig);
        View a = newGuideConfig.mo208761a();
        if (a == null || a.getContext() == null) {
            Log.m165397w("GuideBridge", "startGuide: anchorView is null.");
            return;
        }
        Activity a2 = m224888a(a.getContext());
        if (a2 != null) {
            AnchorConfig anchorConfig = new AnchorConfig(a, m224889a(newGuideConfig.mo208766e()), null, 4, null);
            MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, null, null, null, 31, null);
            String c = newGuideConfig.mo208763c();
            String d = newGuideConfig.mo208765d();
            Intrinsics.checkExpressionValueIsNotNull(d, "newGuideConfig.content");
            TextBubbleConfig kVar = new TextBubbleConfig(anchorConfig, maskConfig, c, d);
            C57974b bVar = new C57974b(aVar);
            kVar.mo141756a(new C57973a(aVar, newGuideConfig));
            f142663b.startGuide(newGuideConfig.mo208762b(), new C38708a(a2, bVar, kVar));
        }
    }

    /* renamed from: a */
    public final void mo196590a(String str, boolean z) {
        Log.m165389i("GuideBridge", "completeGuide: key=" + str + ", recordTime=" + z);
        f142663b.completeGuide(str);
    }

    /* renamed from: a */
    public final void mo196588a(NewGuideConfig newGuideConfig, ButtonConfig eVar, ButtonConfig eVar2, AbstractC60902q.AbstractC60903a aVar) {
        Intrinsics.checkParameterIsNotNull(newGuideConfig, "newGuideConfig");
        Intrinsics.checkParameterIsNotNull(eVar2, "rightButtonConfig");
        Log.m165389i("GuideBridge", "startGuide: " + newGuideConfig);
        View a = newGuideConfig.mo208761a();
        if (a == null || a.getContext() == null) {
            Log.m165397w("GuideBridge", "startGuide: anchorView is null.");
            return;
        }
        Activity a2 = m224888a(a.getContext());
        if (a2 != null) {
            AnchorConfig anchorConfig = new AnchorConfig(a, m224889a(newGuideConfig.mo208766e()), null, 4, null);
            MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, null, null, null, 31, null);
            String c = newGuideConfig.mo208763c();
            String d = newGuideConfig.mo208765d();
            Intrinsics.checkExpressionValueIsNotNull(d, "newGuideConfig.content");
            ButtonBubbleConfig dVar = new ButtonBubbleConfig(anchorConfig, maskConfig, c, d, eVar, eVar2);
            C57976d dVar2 = new C57976d(aVar);
            dVar.mo141756a(new C57975c(aVar, newGuideConfig));
            f142663b.startGuide(newGuideConfig.mo208762b(), new C38708a(a2, dVar2, dVar));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m224890a(GuideBridge aVar, NewGuideConfig newGuideConfig, ButtonConfig eVar, ButtonConfig eVar2, AbstractC60902q.AbstractC60903a aVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            aVar2 = null;
        }
        aVar.mo196588a(newGuideConfig, eVar, eVar2, aVar2);
    }
}
