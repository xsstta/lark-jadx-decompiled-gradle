package com.bytedance.ee.larkwebview.base;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.webview.AbstractC2690c;
import com.bytedance.android.monitor.webview.C2710h;
import com.bytedance.android.monitor.webview.C2711i;
import com.bytedance.ee.larkwebview.bridge.Bridge;
import com.bytedance.ee.larkwebview.bridge.p669a.AbstractC13415b;
import com.bytedance.ee.larkwebview.bridge.p669a.C13416c;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.ee.larkwebview.monitor.webview.LarkWebViewMonitorParams;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitor;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.ee.larkwebview.p668b.AbstractC13397a;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceListener;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceService;
import com.bytedance.ee.larkwebview.quality.safe.ISafeService;
import com.bytedance.ee.larkwebview.quality.stable.IStableListener;
import com.bytedance.ee.larkwebview.quality.stable.IStableService;
import com.bytedance.ee.larkwebview.service.AbstractC13470e;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.bytedance.ee.larkwebview.service.AbstractC13473h;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.ee.larkwebview.service.impl.WebViewPerformanceService;
import com.bytedance.ee.larkwebview.service.impl.WebViewSafeService;
import com.bytedance.ee.larkwebview.service.impl.WebViewStableService;
import com.bytedance.ee.larkwebview.service.p681a.C13459a;
import com.bytedance.ee.larkwebview.service.p681a.C13460b;
import com.bytedance.ee.larkwebview.service.p681a.C13463d;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.utils.LarkContext;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 X2\u00020\u0001:\u0001XB\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\u0006\u0010)\u001a\u00020\u001eJ\n\u0010*\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\u0006\u0010,\u001a\u00020\u000eJ\u0016\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010.H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0000H\u0016J\b\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u0005H\u0002J\b\u00105\u001a\u00020\u001eH\u0002J\u0012\u00106\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u00010\u0011H\u0016J(\u00106\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u00010\u00112\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010.H\u0016J\b\u00109\u001a\u00020\u001eH\u0014J\b\u0010:\u001a\u00020\u001eH\u0016J\b\u0010;\u001a\u00020\u001eH\u0016J\b\u0010<\u001a\u00020\u001eH\u0016J(\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020?H\u0014J\u0006\u0010C\u001a\u00020\u001eJ\u000e\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020FJ\u0018\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020JH\u0016J\u001e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010N\u001a\u00020J2\u0006\u0010 \u001a\u00020OJ\u000e\u0010P\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010Q\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010SJ\u0010\u0010T\u001a\u00020\u001e2\b\u0010U\u001a\u0004\u0018\u00010\u0019J\u0010\u0010V\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010WR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R7\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "Lcom/bytedance/ee/larkwebview/base/BaseWebView;", "context", "Landroid/content/Context;", ShareHitPoint.f121869d, "Lcom/bytedance/ee/larkwebview/monitor/webview/BizType;", "(Landroid/content/Context;Lcom/bytedance/ee/larkwebview/monitor/webview/BizType;)V", "set", "Landroid/util/AttributeSet;", "bizType", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/bytedance/ee/larkwebview/monitor/webview/BizType;)V", "coreTarget", "Lcom/larksuite/framework/apiplugin/core/LKCoreTarget;", "mBridge", "Lcom/bytedance/ee/larkwebview/bridge/Bridge;", "mCommonParams", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getMCommonParams", "()Ljava/util/HashMap;", "mCommonParams$delegate", "Lkotlin/Lazy;", "mPermissionChecker", "Lcom/bytedance/ee/larkwebview/bridge/permission/IPermissionChecker;", "mTracingId", "mTracingSpan", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", "afterInitServiceManager", "", "checkBlank", "callback", "Lcom/bytedance/ee/larkwebview/quality/stable/IBlankCheckResult;", "createErrorMonitor", "Lcom/bytedance/ee/larkwebview/monitor/webview/WebMonitor;", "event", "monitorCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "createNormalMonitor", "destroy", "enableVConsole", "getBaseTraceSpan", "getBizType", "getBridge", "getCommonParams", "", "getServiceManager", "Lcom/bytedance/ee/larkwebview/service/ServiceManager;", "getWebView", "goBack", "initHybrid", "webBizType", "initTracing", "loadUrl", "url", "additionalHttpHeaders", "onAttachedToWindow", "onDestroy", "onPause", "onResume", "onScrollChanged", "left", "", "top", "oldLeft", "oldTop", "recycle", "registerPlugin", "lkPlugin", "Lcom/larksuite/framework/apiplugin/LKPlugin;", "reportEvent", "eventName", "eventJson", "Lorg/json/JSONObject;", "sendEvent", "Lcom/larksuite/framework/apiplugin/entity/LKBasePluginResult;", "api", "params", "Lcom/larksuite/framework/apiplugin/api/LKEventCallback;", "setBizType", "setPerformListener", "listener", "Lcom/bytedance/ee/larkwebview/quality/performance/IPerformanceListener;", "setPermissionChecker", "checker", "setStableListener", "Lcom/bytedance/ee/larkwebview/quality/stable/IStableListener;", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
public class LarkWebView extends BaseWebView {

    /* renamed from: x */
    public static final Companion f35320x = new Companion(null);

    /* renamed from: a */
    private TracingCoreSpan f35321a;

    /* renamed from: b */
    private Bridge f35322b;

    /* renamed from: c */
    private AbstractC25922a f35323c;

    /* renamed from: d */
    private final Lazy f35324d;

    /* renamed from: u */
    public String f35325u;

    /* renamed from: v */
    public AbstractC13415b f35326v;

    /* renamed from: w */
    public BizType f35327w;

    public LarkWebView(Context context) {
        this(context, null, null, 6, null);
    }

    public LarkWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4, null);
    }

    private final HashMap<String, Object> getMCommonParams() {
        return (HashMap) this.f35324d.getValue();
    }

    @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
    public LarkWebView getWebView() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/larkwebview/base/LarkWebView$Companion;", "", "()V", "TAG", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.base.LarkWebView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
    public TracingCoreSpan getBaseTraceSpan() {
        return this.f35321a;
    }

    public final Bridge getBridge() {
        return this.f35322b;
    }

    @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
    public C13477l getServiceManager() {
        return this.f35318s;
    }

    @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
    public String getBizType() {
        BizType cVar = this.f35327w;
        if (cVar == null) {
            cVar = BizType.f35444h.mo49865f();
        }
        return cVar.mo49859a();
    }

    public void goBack() {
        C2711i.m11480a().mo11589o(this);
        super.goBack();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    public void onAttachedToWindow() {
        C2711i.m11480a().mo11590q(this);
        super.onAttachedToWindow();
    }

    public void onPause() {
        WebMonitorManager.f35486a.mo49885f(this, getUrl());
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        WebMonitorManager.f35486a.mo49883e(this, getUrl());
    }

    @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
    public Map<String, Object> getCommonParams() {
        getMCommonParams().put("event_time", Long.valueOf(System.currentTimeMillis()));
        return getMCommonParams();
    }

    /* renamed from: a */
    private final void mo19616a() {
        OPTrace a = OPTraceService.m192757a();
        this.f35321a = a;
        if (a != null) {
            if (a == null) {
                Intrinsics.throwNpe();
            }
            String tracingID = a.getTracingID();
            Intrinsics.checkExpressionValueIsNotNull(tracingID, "mTracingSpan!!.tracingID");
            this.f35325u = tracingID;
            return;
        }
        Log.m165383e("LarkWebView", "tracingSpan is null");
    }

    public void destroy() {
        C2711i.m11480a().mo11588l(this);
        super.destroy();
        this.f35322b.mo49775c();
        AbstractC25922a aVar = this.f35323c;
        if (aVar != null) {
            aVar.ah_();
        }
        Log.m165389i("LarkWebView", "larkwebview destroy");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.base.LarkWebView$c */
    static final class C13400c extends Lambda implements Function0<HashMap<String, Object>> {
        final /* synthetic */ LarkWebView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13400c(LarkWebView larkWebView) {
            super(0);
            this.this$0 = larkWebView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<String, Object> invoke() {
            HashMap<String, Object> hashMap = new HashMap<>();
            BizType cVar = this.this$0.f35327w;
            if (cVar == null) {
                cVar = BizType.f35444h.mo49865f();
            }
            hashMap.put("biz_type", cVar.mo49859a());
            hashMap.put("os", "Android");
            String str = this.this$0.f35325u;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            hashMap.put("trace_id", str);
            hashMap.put("webview_type", LarkWebViewMonitorParams.BASE.f35432a.mo49853a(this.this$0.mo49721r()));
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.base.LarkWebView$b */
    public static final class RunnableC13399b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LarkWebView f35328a;

        /* renamed from: b */
        final /* synthetic */ BizType f35329b;

        RunnableC13399b(LarkWebView larkWebView, BizType cVar) {
            this.f35328a = larkWebView;
            this.f35329b = cVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            String str;
            AbstractC13397a a = C13398b.m54466a();
            if (a != null) {
                z = a.mo22591a("openplatform.larkwebview.hybridmonitor");
            } else {
                z = false;
            }
            Log.m165389i("LarkWebView", "hybrid monitor fg is : " + z + " , bizType = " + this.f35329b.mo49859a());
            if (!z) {
                Log.m165389i("LarkWebView", "hybrid monitor fg not open so return");
                return;
            }
            AbstractC13397a a2 = C13398b.m54466a();
            if (a2 != null) {
                z2 = a2.mo22591a("openplatform.larkwebview.hybridjssdk");
            } else {
                z2 = false;
            }
            Log.m165389i("LarkWebView", "shouldInjectJSSDk " + z2);
            HybridMonitor.getInstance().init(LarkContext.getApplication());
            C2711i.m11480a().mo11592a(true);
            AbstractC2690c.C2691a e = C2711i.m11480a().mo11572e();
            AbstractC2690c.C2691a a3 = e.mo11594a(new C2710h()).mo11597a(true);
            BizType cVar = this.f35329b;
            if (cVar != null) {
                str = cVar.mo49859a();
            } else {
                str = null;
            }
            a3.mo11596a("biz_type", str).mo11601d(true).mo11598a(this.f35328a).mo11599b(z2).mo11600c(true);
            C2711i.m11480a().mo11571a(e);
            C2711i.m11480a().mo11587j(this.f35328a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    /* renamed from: q */
    public void mo49720q() {
        TTWebViewExtension tTWebViewExtension;
        if (mo49721r()) {
            this.f35318s.mo49930a(C13460b.class);
            this.f35318s.mo49930a(C13459a.class);
            ((AbstractC13471f) this.f35318s.mo49931b(AbstractC13471f.class)).mo49911a(this);
            ((AbstractC13470e) this.f35318s.mo49931b(AbstractC13470e.class)).mo49906a(this);
        }
        this.f35318s.mo49930a(WebViewStableService.class);
        IStableService cVar = (IStableService) this.f35318s.mo49931b(IStableService.class);
        AbstractC13471f fVar = (AbstractC13471f) this.f35318s.mo49931b(AbstractC13471f.class);
        if (fVar != null) {
            tTWebViewExtension = fVar.mo49910a();
        } else {
            tTWebViewExtension = null;
        }
        cVar.mo49843a(tTWebViewExtension, this);
        this.f35318s.mo49930a(WebViewPerformanceService.class);
        ((IPerformanceService) this.f35318s.mo49931b(IPerformanceService.class)).mo49814a(this);
        this.f35318s.mo49930a(WebViewSafeService.class);
        ((ISafeService) this.f35318s.mo49931b(ISafeService.class)).mo49835a(this);
        this.f35318s.mo49930a(C13463d.class);
    }

    public final void setPermissionChecker(AbstractC13415b bVar) {
        this.f35326v = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/larkwebview/base/LarkWebView$registerPlugin$tempPlugin$1", "Lcom/bytedance/ee/larkwebview/base/LarkPlugin;", "addEvents", "", "filter", "Lcom/larksuite/framework/apiplugin/api/LKEventFilter;", "handleEvent", "Lcom/larksuite/framework/apiplugin/entity/LKPluginHandleResult;", "event", "Lcom/larksuite/framework/apiplugin/LKEvent;", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.base.LarkWebView$d */
    public static final class C13401d extends C13403b {

        /* renamed from: a */
        final /* synthetic */ LarkWebView f35330a;

        /* renamed from: b */
        final /* synthetic */ AbstractC25937e f35331b;

        @Override // com.bytedance.ee.larkwebview.base.C13403b, com.larksuite.framework.apiplugin.AbstractC25937e
        public void addEvents(AbstractC25896g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "filter");
            this.f35331b.addEvents(gVar);
        }

        @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
        public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
            C13416c cVar;
            Context context;
            if (this.f35330a.f35326v != null) {
                AbstractC13415b bVar = this.f35330a.f35326v;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                if (bVar.mo49784a()) {
                    AbstractC13415b bVar2 = this.f35330a.f35326v;
                    if (bVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    String str = null;
                    if (lKEvent != null) {
                        context = lKEvent.mo92145l();
                    } else {
                        context = null;
                    }
                    if (lKEvent != null) {
                        str = lKEvent.mo92146m();
                    }
                    cVar = bVar2.mo49783a(context, str, this.f35330a.getUrl());
                    Intrinsics.checkExpressionValueIsNotNull(cVar, "mPermissionChecker!!.che…t, event?.eventName, url)");
                } else {
                    cVar = new C13416c();
                }
                if (!cVar.mo49782a()) {
                    LKPluginHandleResult lKPluginHandleResult = LKPluginHandleResult.f64251d;
                    Intrinsics.checkExpressionValueIsNotNull(lKPluginHandleResult, "LKPluginHandleResult.NOT_HANDLE");
                    return lKPluginHandleResult;
                }
            }
            LKPluginHandleResult handleEvent = this.f35331b.handleEvent(lKEvent);
            Intrinsics.checkExpressionValueIsNotNull(handleEvent, "lkPlugin.handleEvent(event)");
            return handleEvent;
        }

        C13401d(LarkWebView larkWebView, AbstractC25937e eVar) {
            this.f35330a = larkWebView;
            this.f35331b = eVar;
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    public void loadUrl(String str) {
        C2711i.m11480a().mo11586f(this, str);
        super.loadUrl(str);
    }

    /* renamed from: a */
    private final void m54481a(BizType cVar) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getScheduleThreadPool().execute(new RunnableC13399b(this, cVar));
    }

    public final void setBizType(BizType cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, ShareHitPoint.f121869d);
        this.f35327w = cVar;
        HashMap<String, Object> mCommonParams = getMCommonParams();
        BizType cVar2 = this.f35327w;
        if (cVar2 == null) {
            cVar2 = BizType.f35444h.mo49865f();
        }
        mCommonParams.put("biz_type", cVar2.mo49859a());
        m54481a(cVar);
    }

    public final void setPerformListener(IPerformanceListener aVar) {
        boolean z;
        C13477l serviceManager;
        IPerformanceService bVar;
        if (!(aVar == null || (serviceManager = getServiceManager()) == null || (bVar = (IPerformanceService) serviceManager.mo49931b(IPerformanceService.class)) == null)) {
            bVar.mo49815a(aVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setPerformListener result = ");
        if (aVar == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("LarkWebView", sb.toString());
    }

    public final void setStableListener(IStableListener bVar) {
        boolean z;
        C13477l serviceManager;
        IStableService cVar;
        if (!(bVar == null || (serviceManager = getServiceManager()) == null || (cVar = (IStableService) serviceManager.mo49931b(IStableService.class)) == null)) {
            cVar.mo49842a(bVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setStableListener result = ");
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("LarkWebView", sb.toString());
    }

    /* renamed from: a */
    public final void mo49728a(AbstractC25937e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "lkPlugin");
        this.f35323c.mo92183u().mo92199a(new C13401d(this, eVar));
    }

    public LarkWebView(Context context, BizType cVar) {
        this(context, null, cVar);
    }

    @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
    /* renamed from: a */
    public WebMonitor mo49726a(String str, OPMonitorCode oPMonitorCode) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        return new WebMonitor(str, oPMonitorCode, this);
    }

    @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
    /* renamed from: b */
    public WebMonitor mo49730b(String str, OPMonitorCode oPMonitorCode) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        return mo49726a(str, oPMonitorCode);
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView, android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(str, map);
        C2711i.m11480a().mo11586f(this, str);
    }

    @Override // com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency
    /* renamed from: a */
    public void mo49729a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(jSONObject, "eventJson");
        AbstractC13397a a = C13398b.m54466a();
        if (a != null) {
            a.mo22590a(str, jSONObject);
        } else {
            Log.m165389i("LarkWebView", "host not setDependency");
        }
    }

    public LarkWebView(Context context, AttributeSet attributeSet, BizType cVar) {
        super(context, attributeSet);
        this.f35327w = cVar;
        new C13406e(context);
        BizType cVar2 = this.f35327w;
        m54481a(cVar2 == null ? BizType.f35444h.mo49865f() : cVar2);
        this.f35325u = "";
        this.f35322b = new Bridge(this);
        this.f35323c = new C13406e(getContext());
        this.f35324d = LazyKt.lazy(new C13400c(this));
        mo19616a();
        C13407f fVar = this.f35319t;
        Intrinsics.checkExpressionValueIsNotNull(fVar, "mWebTimeHelper");
        WebMonitorManager.f35486a.mo49876b(this, fVar.mo49750a());
    }

    /* renamed from: a */
    public final LKBasePluginResult mo49727a(String str, JSONObject jSONObject, AbstractC25894e eVar) {
        Intrinsics.checkParameterIsNotNull(str, "api");
        Intrinsics.checkParameterIsNotNull(jSONObject, "params");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        LKBasePluginResult a = this.f35323c.mo92243a(getContext(), str, jSONObject, eVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "coreTarget.sendEvent(con…t, api, params, callback)");
        return a;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        AbstractC13473h hVar;
        super.onScrollChanged(i, i2, i3, i4);
        C13477l lVar = this.f35318s;
        if (lVar != null && (hVar = (AbstractC13473h) lVar.mo49931b(AbstractC13473h.class)) != null) {
            hVar.mo49914a(i, i2, i3, i4);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LarkWebView(Context context, AttributeSet attributeSet, BizType cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? BizType.f35444h.mo49865f() : cVar);
    }
}
