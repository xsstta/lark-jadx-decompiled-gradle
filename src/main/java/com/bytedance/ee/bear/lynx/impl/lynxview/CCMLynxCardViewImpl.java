package com.bytedance.ee.bear.lynx.impl.lynxview;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.lynx.api.CCMLynxCardView;
import com.bytedance.ee.bear.lynx.api.CCMLynxEnv;
import com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxPullRefreshView;
import com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxRefreshFooter;
import com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxRefreshHeader;
import com.bytedance.ee.bear.lynx.impl.route.TemplateUrlUtils;
import com.bytedance.ee.bear.lynx.impl.utli.LynxImageUrlUtils;
import com.bytedance.ee.bear.lynx.impl.utli.ServiceDependence;
import com.bytedance.ee.bear.lynx.impl.xbridge.XBridgeRegistryHelper;
import com.bytedance.ee.bear.lynx.impl.xelement.CCMXELottieView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ies.bullet.service.base.api.BaseServiceContext;
import com.bytedance.ies.bullet.service.base.api.BaseServiceToken;
import com.bytedance.ies.bullet.service.base.api.IServiceContext;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.lynx.ILynxKitService;
import com.bytedance.ies.bullet.service.base.lynx.ILynxViewDelegate;
import com.bytedance.kit.nglynx.LynxKitInitParams;
import com.bytedance.kit.nglynx.model.LynxInitData;
import com.bytedance.kit.nglynx.model.LynxModuleWrapper;
import com.bytedance.lark.lynxlib.widget.empty.LynxEmptyStateView;
import com.bytedance.lark.lynxlib.widget.udtabs.LynxTabBarView;
import com.bytedance.lark.lynxlib.widget.udtabs.LynxViewPager;
import com.bytedance.lark.lynxlib.widget.udtabs.childitem.LynxViewpagerItem;
import com.bytedance.sdk.bridge.lynx.DefaultLynxProvider;
import com.bytedance.sdk.bridge.lynx.ILynxViewProvider;
import com.bytedance.sdk.bridge.lynx.LynxDelegateBridgeModule;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.lynx.devtoolwrapper.AbstractC26493d;
import com.lynx.devtoolwrapper.C26494e;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010\u001a\u001a\u00020\u00142\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\fH\u0016J8\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J8\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001c\u0010(\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl;", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView;", "activityContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lynxKitDelegate", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxViewDelegate;", "lynxProvider", "Lcom/bytedance/sdk/bridge/lynx/DefaultLynxProvider;", "lynxViewEventListener", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView$LynxViewEventListener;", "serviceContext", "Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "serviceToken", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "xBridgeRegistryHelper", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/XBridgeRegistryHelper;", "checkInitParam", "", "destroy", "getContainerId", "", "getLynxBid", "getLynxContainerEventListener", "initLynxKitView", "templateData", "", "", "setLynxContainerEventListener", "lst", "showCardAtContainer", "viewContainer", "Landroid/view/ViewGroup;", "viewType", "", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "templateUrl", "updateContent", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a */
public final class CCMLynxCardViewImpl implements CCMLynxCardView {

    /* renamed from: c */
    public static final Companion f23781c = new Companion(null);

    /* renamed from: a */
    public final IServiceContext f23782a;

    /* renamed from: b */
    public ILynxViewDelegate f23783b;

    /* renamed from: d */
    private final IServiceToken f23784d;

    /* renamed from: e */
    private DefaultLynxProvider f23785e;

    /* renamed from: f */
    private CCMLynxCardView.LynxViewEventListener f23786f;

    /* renamed from: g */
    private final AtomicBoolean f23787g = new AtomicBoolean(false);

    /* renamed from: h */
    private final XBridgeRegistryHelper f23788h = new XBridgeRegistryHelper();

    /* renamed from: i */
    private final Context f23789i;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "open"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$k */
    public static final class C8841k implements AbstractC26493d {

        /* renamed from: a */
        final /* synthetic */ CCMLynxCardViewImpl f23791a;

        C8841k(CCMLynxCardViewImpl aVar) {
            this.f23791a = aVar;
        }
    }

    /* renamed from: c */
    private final void m37038c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView
    /* renamed from: a */
    public CCMLynxCardView.LynxViewEventListener mo33874a() {
        return this.f23786f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$2$2", "Lcom/lynx/tasm/LynxViewClient;", "onFirstScreen", "", "onLoadSuccess", "onPageStart", "url", "", "shouldRedirectImageUrl", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$b */
    public static final class C8832b extends AbstractC26911n {

        /* renamed from: a */
        final /* synthetic */ CCMLynxCardViewImpl f23790a;

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: a */
        public void mo11457a() {
            super.mo11457a();
            C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "onLoadSuccess");
        }

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: b */
        public void mo11461b() {
            super.mo11461b();
            C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "onFirstScreen");
        }

        C8832b(CCMLynxCardViewImpl aVar) {
            this.f23790a = aVar;
        }

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: a */
        public void mo11460a(String str) {
            super.mo11460a(str);
            C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "onPageStart");
        }

        @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
        /* renamed from: b */
        public String mo33934b(String str) {
            Context context;
            LynxImageUrlUtils aVar = LynxImageUrlUtils.f23764a;
            IServiceContext iVar = this.f23790a.f23782a;
            if (iVar != null) {
                context = iVar.mo52655c();
            } else {
                context = null;
            }
            return aVar.mo33915a(context, str);
        }
    }

    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView
    /* renamed from: b */
    public void mo33878b() {
        C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "destroy");
        ILynxViewDelegate cVar = this.f23783b;
        if (cVar != null) {
            cVar.mo52664b();
        }
        this.f23788h.mo33969b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$1", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$c */
    public static final class C8833c extends C26622a {
        C8833c(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new CCMXELottieView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$2", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$d */
    public static final class C8834d extends C26622a {
        C8834d(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new CCMLynxPullRefreshView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$3", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$e */
    public static final class C8835e extends C26622a {
        C8835e(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new CCMLynxRefreshHeader(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$4", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$f */
    public static final class C8836f extends C26622a {
        C8836f(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new CCMLynxRefreshFooter(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$5", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$g */
    public static final class C8837g extends C26622a {
        C8837g(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new LynxEmptyStateView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$6", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$h */
    public static final class C8838h extends C26622a {
        C8838h(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            if (lVar == null) {
                Intrinsics.throwNpe();
            }
            return new LynxViewpagerItem(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$7", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$i */
    public static final class C8839i extends C26622a {
        C8839i(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            if (lVar == null) {
                Intrinsics.throwNpe();
            }
            return new LynxViewPager(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxCardViewImpl$initLynxKitView$1$2$8", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.a$j */
    public static final class C8840j extends C26622a {
        C8840j(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            if (lVar == null) {
                Intrinsics.throwNpe();
            }
            return new LynxTabBarView(lVar);
        }
    }

    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView
    /* renamed from: a */
    public void mo33877a(CCMLynxCardView.LynxViewEventListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "lst");
        C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "setLynxContainerEventListener");
        this.f23786f = aVar;
    }

    public CCMLynxCardViewImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "activityContext");
        this.f23789i = context;
        BaseServiceContext aVar = new BaseServiceContext(context, C13616d.m55261a());
        this.f23782a = aVar;
        this.f23784d = new BaseServiceToken("ccm-lynx-bid", aVar);
        m37038c();
    }

    /* renamed from: a */
    private final void m37037a(Map<String, ? extends Object> map) {
        String str;
        String str2;
        if (this.f23787g.compareAndSet(false, true)) {
            C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "initLynxKitView");
            ILynxViewDelegate cVar = null;
            Application application = C13615c.f35773a;
            Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
            ((CCMLynxEnv) KoinJavaComponent.m268613a(CCMLynxEnv.class, null, null, 6, null)).mo33880a(application);
            this.f23785e = new DefaultLynxProvider();
            LynxKitInitParams cVar2 = new LynxKitInitParams(null, null, null, null, null, 31, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            DefaultLynxProvider aVar = this.f23785e;
            if (aVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(ILynxViewProvider.class, aVar);
                linkedHashMap.put("bridge", new LynxModuleWrapper(LynxDelegateBridgeModule.class, hashMap));
            }
            cVar2.mo53729b(linkedHashMap);
            cVar2.mo53724a(LynxInitData.f38605b.mo53807a(map));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C8833c("ccm-lottie-view"));
            arrayList.add(new C8834d("ccm-refresh-view"));
            arrayList.add(new C8835e("ccm-refresh-header"));
            arrayList.add(new C8836f("ccm-refresh-footer"));
            arrayList.add(new C8837g("ud-empty"));
            arrayList.add(new C8838h("ud-viewpager-item"));
            arrayList.add(new C8839i("ud-viewpager"));
            arrayList.add(new C8840j("ud-tabbar"));
            cVar2.mo53726a(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str3 = "true";
            if (C13616d.m55261a()) {
                str = str3;
            } else {
                str = "false";
            }
            linkedHashMap2.put("appIsDebug", str);
            if (UDUiModeUtils.m93319a(this.f23789i)) {
                str2 = "dark";
            } else {
                str2 = "light";
            }
            linkedHashMap2.put("brightness", str2);
            linkedHashMap2.put("containerId", this.f23788h.mo33966a());
            if (!((al) ServiceDependence.f23778b.mo33929a(al.class)).mo17343D()) {
                str3 = "false";
            }
            linkedHashMap2.put("isUSPackage", str3);
            cVar2.mo53727a(linkedHashMap2);
            cVar2.mo53725a(new C8832b(this));
            this.f23782a.mo52654b().mo52633a(LynxKitInitParams.class, cVar2);
            ILynxKitService bVar = (ILynxKitService) this.f23784d.mo52657a(ILynxKitService.class);
            if (bVar != null) {
                cVar = bVar.mo52665a(this.f23784d);
            }
            this.f23783b = cVar;
            if (C13616d.m55261a()) {
                C26494e.m96054a().mo93943a(new C8841k(this));
            }
            CCMLynxViewRecord.f23792a.mo33937a(this.f23788h.mo33966a(), this);
        }
    }

    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView
    /* renamed from: a */
    public void mo33875a(ViewGroup viewGroup, int i, Map<String, ? extends Object> map, ViewGroup.LayoutParams layoutParams) {
        String str;
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewContainer");
        if (i != 1000) {
            str = "";
        } else {
            str = TemplateUrlUtils.m37006a(TemplateUrlUtils.f23758a, i, false, 2, null);
        }
        mo33876a(viewGroup, str, map, layoutParams);
    }

    @Override // com.bytedance.ee.bear.lynx.api.CCMLynxCardView
    /* renamed from: a */
    public void mo33876a(ViewGroup viewGroup, String str, Map<String, ? extends Object> map, ViewGroup.LayoutParams layoutParams) {
        Object obj;
        View a;
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewContainer");
        Intrinsics.checkParameterIsNotNull(str, "templateUrl");
        try {
            Result.Companion aVar = Result.Companion;
            CCMLynxCardViewImpl aVar2 = this;
            aVar2.m37037a(map);
            ILynxViewDelegate cVar = aVar2.f23783b;
            Unit unit = null;
            if (!(cVar == null || (a = cVar.mo52662a()) == null)) {
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                }
                viewGroup.addView(a, layoutParams);
                aVar2.f23788h.mo33967a(aVar2.f23789i, a);
                DefaultLynxProvider aVar3 = aVar2.f23785e;
                if (aVar3 != null) {
                    if (a != null) {
                        aVar3.mo69741a((LynxView) a);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.lynx.tasm.LynxView");
                    }
                }
                C13479a.m54764b("ccm-lynx: CCMLynxCardViewImpl", "showCardAtContainer load templateUrl: " + str);
                cVar.mo52663a(str);
                unit = Unit.INSTANCE;
            }
            obj = Result.m271569constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion aVar4 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r5 = Result.m271572exceptionOrNullimpl(obj);
        if (r5 != null) {
            C13479a.m54761a("ccm-lynx: CCMLynxCardViewImpl", r5);
        }
    }
}
