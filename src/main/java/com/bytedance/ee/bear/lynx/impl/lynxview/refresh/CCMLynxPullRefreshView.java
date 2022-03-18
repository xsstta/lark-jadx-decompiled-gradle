package com.bytedance.ee.bear.lynx.impl.lynxview.refresh;

import android.content.Context;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.location.LocationRequest;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.p1216a.C26546b;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27138b;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import com.scwang.smartrefresh.layout.p1236c.C27142f;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0007H\u0007J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0007H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/lynxview/refresh/CCMLynxPullRefreshView;", "Lcom/lynx/tasm/behavior/ui/UIGroup;", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "mEnableLoadMore", "", "mEnableRefresh", "autoStartRefresh", "", "params", "Lcom/lynx/react/bridge/ReadableMap;", "createView", "Landroid/content/Context;", "finishLoadMore", "finishRefresh", "insertChild", "child", "Lcom/lynx/tasm/behavior/ui/LynxBaseUI;", "index", "", "needCustomLayout", "removeChild", "setEnableLoadMore", "enable", "setEnableRefresh", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class CCMLynxPullRefreshView extends UIGroup<SmartRefreshLayout> {

    /* renamed from: a */
    public static final Companion f23794a = new Companion(null);

    /* renamed from: b */
    private boolean f23795b = true;

    /* renamed from: c */
    private boolean f23796c = true;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/lynxview/refresh/CCMLynxPullRefreshView$Companion;", "", "()V", "BIND_START_HEADER_RELEASED", "", "BIND_START_LOAD_MORE", "BIND_START_REFRESH", "TAG", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxPullRefreshView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/lynx/impl/lynxview/refresh/CCMLynxPullRefreshView$createView$1$3", "Lcom/scwang/smartrefresh/layout/listener/SimpleMultiPurposeListener;", "onHeaderFinish", "", "header", "Lcom/scwang/smartrefresh/layout/api/RefreshHeader;", "success", "", "onHeaderReleased", "headerHeight", "", "maxDragHeight", "onHeaderStartAnimator", "footerHeight", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxPullRefreshView$d */
    public static final class C8844d extends C27142f {

        /* renamed from: a */
        final /* synthetic */ CCMLynxPullRefreshView f23799a;

        C8844d(CCMLynxPullRefreshView cCMLynxPullRefreshView) {
            this.f23799a = cCMLynxPullRefreshView;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27138b, com.scwang.smartrefresh.layout.p1236c.C27142f
        /* renamed from: a */
        public void mo33949a(AbstractC27126e eVar, boolean z) {
            C13479a.m54772d("CCMLynxPullRefreshView", "MultiPurposeListener -> onHeaderFinish");
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27138b, com.scwang.smartrefresh.layout.p1236c.C27142f
        /* renamed from: b */
        public void mo33950b(AbstractC27126e eVar, int i, int i2) {
            C13479a.m54772d("CCMLynxPullRefreshView", "MultiPurposeListener -> onHeaderStartAnimator");
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27138b, com.scwang.smartrefresh.layout.p1236c.C27142f
        /* renamed from: a */
        public void mo33948a(AbstractC27126e eVar, int i, int i2) {
            EventEmitter i3;
            C13479a.m54772d("CCMLynxPullRefreshView", "MultiPurposeListener -> onHeaderReleased");
            AbstractC26684l u = this.f23799a.mo95039u();
            if (u != null && (i3 = u.mo94687i()) != null) {
                i3.mo94075a(new C26546b(this.f23799a.mo94576q(), "headerreleased"));
            }
        }
    }

    public CCMLynxPullRefreshView(AbstractC26684l lVar) {
        super(lVar);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33939a(LynxBaseUI lynxBaseUI) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        if (lynxBaseUI instanceof LynxUI) {
            this.f66242w.remove(lynxBaseUI);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onRefresh", "com/bytedance/ee/bear/lynx/impl/lynxview/refresh/CCMLynxPullRefreshView$createView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxPullRefreshView$b */
    public static final class C8842b implements AbstractC27139c {

        /* renamed from: a */
        final /* synthetic */ CCMLynxPullRefreshView f23797a;

        C8842b(CCMLynxPullRefreshView cCMLynxPullRefreshView) {
            this.f23797a = cCMLynxPullRefreshView;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
        public final void onRefresh(AbstractC27129h hVar) {
            EventEmitter i;
            C13479a.m54764b("CCMLynxPullRefreshView", "OnRefreshListener -> start refresh");
            AbstractC26684l u = this.f23797a.mo95039u();
            if (u != null && (i = u.mo94687i()) != null) {
                i.mo94075a(new C26546b(this.f23797a.mo94576q(), "startrefresh"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "kotlin.jvm.PlatformType", "onLoadmore", "com/bytedance/ee/bear/lynx/impl/lynxview/refresh/CCMLynxPullRefreshView$createView$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.refresh.CCMLynxPullRefreshView$c */
    public static final class C8843c implements AbstractC27137a {

        /* renamed from: a */
        final /* synthetic */ CCMLynxPullRefreshView f23798a;

        C8843c(CCMLynxPullRefreshView cCMLynxPullRefreshView) {
            this.f23798a = cCMLynxPullRefreshView;
        }

        @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
        public final void onLoadmore(AbstractC27129h hVar) {
            EventEmitter i;
            C13479a.m54764b("CCMLynxPullRefreshView", "OnLoadMoreListener -> start load more");
            AbstractC26684l u = this.f23798a.mo95039u();
            if (u != null && (i = u.mo94687i()) != null) {
                i.mo94075a(new C26546b(this.f23798a.mo94576q(), "startloadmore"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SmartRefreshLayout mo33942b(Context context) {
        if (context == null) {
            return null;
        }
        this.f23795b = true;
        this.f23796c = true;
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(context);
        smartRefreshLayout.mo96413l(this.f23795b);
        setEnableLoadMore(this.f23796c);
        smartRefreshLayout.mo96369b(new C8842b(this));
        smartRefreshLayout.mo96368b(new C8843c(this));
        smartRefreshLayout.mo96348a((AbstractC27138b) new C8844d(this));
        return smartRefreshLayout;
    }

    @LynxUIMethod
    public void autoStartRefresh(ReadableMap readableMap) {
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        C13479a.m54764b("CCMLynxPullRefreshView", "autoStartRefresh -> params = " + readableMap);
        ((SmartRefreshLayout) this.f66253Z).mo96360a(0, LocationRequest.PRIORITY_INDOOR, 1.0f);
    }

    @LynxUIMethod
    public void finishLoadMore(ReadableMap readableMap) {
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        C13479a.m54764b("CCMLynxPullRefreshView", "finishLoadMore -> params = " + readableMap);
        if (readableMap.getBoolean("has_more", true)) {
            ((SmartRefreshLayout) this.f66253Z).mo96416n();
        } else {
            ((SmartRefreshLayout) this.f66253Z).mo96417o();
        }
    }

    @LynxUIMethod
    public void finishRefresh(ReadableMap readableMap) {
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        C13479a.m54764b("CCMLynxPullRefreshView", "finishRefresh -> params = " + readableMap);
        ((SmartRefreshLayout) this.f66253Z).mo96435x();
    }

    @LynxProp(defaultBoolean = true, name = "enable-loadmore")
    public final void setEnableLoadMore(boolean z) {
        C13479a.m54772d("CCMLynxPullRefreshView", "enable-loadmore:" + z);
        this.f23796c = z;
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f66253Z;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96415m(z);
        }
    }

    @LynxProp(defaultBoolean = true, name = "enable-refresh")
    public final void setEnableRefresh(boolean z) {
        C13479a.m54772d("CCMLynxPullRefreshView", "enable-refresh:" + z);
        this.f23795b = z;
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.f66253Z;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96413l(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: a */
    public void mo33940a(LynxBaseUI lynxBaseUI, int i) {
        Intrinsics.checkParameterIsNotNull(lynxBaseUI, "child");
        C13479a.m54772d("CCMLynxPullRefreshView", "insertChild " + lynxBaseUI + ' ' + i);
        mo95130c(lynxBaseUI, i);
        if (lynxBaseUI instanceof CCMLynxRefreshHeader) {
            ((SmartRefreshLayout) this.f66253Z).mo96346a((AbstractC27126e) new CircleRefreshHeader(mo95039u()), -1, C57582a.m223600a(60));
        } else if (lynxBaseUI instanceof CCMLynxRefreshFooter) {
            AbstractC26684l u = mo95039u();
            Intrinsics.checkExpressionValueIsNotNull(u, "this.lynxContext");
            ((SmartRefreshLayout) this.f66253Z).mo96367b((AbstractC27125d) new LoadMoreFooter(u));
        } else if (lynxBaseUI instanceof LynxUI) {
            ((SmartRefreshLayout) this.f66253Z).mo96352a(((LynxUI) lynxBaseUI).av());
        }
    }
}
