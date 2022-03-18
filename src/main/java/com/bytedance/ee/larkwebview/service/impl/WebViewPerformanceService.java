package com.bytedance.ee.larkwebview.service.impl;

import com.bytedance.ee.larkwebview.base.C13407f;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.ee.larkwebview.p667a.C13390c;
import com.bytedance.ee.larkwebview.p667a.C13393d;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceListener;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceService;
import com.bytedance.ee.larkwebview.quality.stable.IStableListener;
import com.bytedance.ee.larkwebview.quality.stable.IStableService;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/larkwebview/service/impl/WebViewPerformanceService;", "Lcom/bytedance/ee/larkwebview/quality/performance/IPerformanceService;", "()V", "mLarkWebView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "mListeners", "", "Lcom/bytedance/lynx/webview/glue/IWebViewExtension$PerformanceTimingListener;", "mPerformanceListener", "Lcom/bytedance/ee/larkwebview/quality/performance/IPerformanceListener;", "mPerformanceTimingListener", "getMPerformanceTimingListener", "()Lcom/bytedance/lynx/webview/glue/IWebViewExtension$PerformanceTimingListener;", "mPerformanceTimingListener$delegate", "Lkotlin/Lazy;", "mTTWebViewExtension", "Lcom/bytedance/lynx/webview/extension/TTWebViewExtension;", "detach", "", "getPerformanceListener", "init", "larkWebView", "onGetPagePerformance", "url", "", "setPerformanceListener", "listener", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.service.a.e */
public final class WebViewPerformanceService implements IPerformanceService {

    /* renamed from: d */
    public static final Companion f35505d = new Companion(null);

    /* renamed from: a */
    public LarkWebView f35506a;

    /* renamed from: b */
    public IPerformanceListener f35507b;

    /* renamed from: c */
    public final Set<IWebViewExtension.PerformanceTimingListener> f35508c = new CopyOnWriteArraySet();

    /* renamed from: e */
    private TTWebViewExtension f35509e;

    /* renamed from: f */
    private final Lazy f35510f = LazyKt.lazy(new C13464b(this));

    /* renamed from: a */
    private final IWebViewExtension.PerformanceTimingListener m54714a() {
        return (IWebViewExtension.PerformanceTimingListener) this.f35510f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/larkwebview/service/impl/WebViewPerformanceService$Companion;", "", "()V", "TAG", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.service.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/bytedance/ee/larkwebview/service/impl/WebViewPerformanceService$mPerformanceTimingListener$2$1", "invoke", "()Lcom/bytedance/ee/larkwebview/service/impl/WebViewPerformanceService$mPerformanceTimingListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.service.a.e$b */
    static final class C13464b extends Lambda implements Function0<C134651> {
        final /* synthetic */ WebViewPerformanceService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13464b(WebViewPerformanceService eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C134651 invoke() {
            return new IWebViewExtension.PerformanceTimingListener(this) {
                /* class com.bytedance.ee.larkwebview.service.impl.WebViewPerformanceService.C13464b.C134651 */

                /* renamed from: a */
                final /* synthetic */ C13464b f35511a;

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onBodyParsing() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onCustomTagNotify(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "json");
                }

                @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                public void onDOMContentLoaded() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onFirstImagePaint() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public /* synthetic */ void onGetJavaScriptStackTrace(String str) {
                    IPerformanceTimingListenersdk113.CC.$default$onGetJavaScriptStackTrace(this, str);
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onIframeLoaded(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "url");
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onNetFinish() {
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onReceivedResponse(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "json");
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onReceivedSpecialEvent(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "json");
                }

                @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                public void onFirstMeaningfulPaint() {
                    Log.m165389i("WebViewPerformanceService", "onFirstMeaningfulPaint   --- v2");
                    Iterator<T> it = this.f35511a.this$0.f35508c.iterator();
                    while (it.hasNext()) {
                        it.next().onFirstMeaningfulPaint();
                    }
                }

                @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                public void onFirstScreenPaint() {
                    String str;
                    Log.m165389i("WebViewPerformanceService", "onFirstScreenPaint");
                    LarkWebView larkWebView = this.f35511a.this$0.f35506a;
                    if (larkWebView != null) {
                        str = larkWebView.getUrl();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        this.f35511a.this$0.mo49916a(str);
                    }
                    Set<IWebViewExtension.PerformanceTimingListener> set = this.f35511a.this$0.f35508c;
                    if (set != null) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().onFirstScreenPaint();
                        }
                    }
                }

                @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                public void onFirstContentfulPaint() {
                    String str;
                    long j;
                    C13407f webTimeHelper;
                    Long a;
                    LarkWebView larkWebView = this.f35511a.this$0.f35506a;
                    if (larkWebView != null) {
                        str = larkWebView.getUrl();
                    } else {
                        str = null;
                    }
                    LarkWebView larkWebView2 = this.f35511a.this$0.f35506a;
                    if (larkWebView2 == null || (webTimeHelper = larkWebView2.getWebTimeHelper()) == null || (a = webTimeHelper.mo49751a(str)) == null) {
                        j = 0;
                    } else {
                        j = a.longValue();
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    Log.m165389i("WebViewPerformanceService", "fcp_time  , cost  " + currentTimeMillis + " , startTime = " + j);
                    IPerformanceListener aVar = this.f35511a.this$0.f35507b;
                    if (aVar != null) {
                        aVar.mo49055a();
                    }
                    WebMonitorManager.f35486a.mo49868a(this.f35511a.this$0.f35506a, currentTimeMillis);
                    Iterator<T> it = this.f35511a.this$0.f35508c.iterator();
                    while (it.hasNext()) {
                        it.next().onFirstContentfulPaint();
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f35511a = r1;
                }

                @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                public void onJSError(String str) {
                    C13477l serviceManager;
                    IStableService cVar;
                    IStableListener a;
                    Intrinsics.checkParameterIsNotNull(str, "json");
                    Log.m165379d("WebViewPerformanceService", "onJSError : " + str);
                    LarkWebView larkWebView = this.f35511a.this$0.f35506a;
                    if (!(larkWebView == null || (serviceManager = larkWebView.getServiceManager()) == null || (cVar = (IStableService) serviceManager.mo49931b(IStableService.class)) == null || (a = cVar.mo49841a()) == null)) {
                        a.mo49840a(str);
                    }
                    WebMonitorManager.f35486a.mo49871a(this.f35511a.this$0.f35506a, str);
                }
            };
        }
    }

    @Override // com.bytedance.ee.larkwebview.quality.performance.IPerformanceService
    /* renamed from: a */
    public void mo49815a(IPerformanceListener aVar) {
        this.f35507b = aVar;
    }

    @Override // com.bytedance.ee.larkwebview.quality.performance.IPerformanceService
    /* renamed from: a */
    public void mo49816a(IWebViewExtension.PerformanceTimingListener performanceTimingListener) {
        Intrinsics.checkParameterIsNotNull(performanceTimingListener, "listener");
        this.f35508c.add(performanceTimingListener);
    }

    @Override // com.bytedance.ee.larkwebview.quality.performance.IPerformanceService
    /* renamed from: a */
    public void mo49814a(LarkWebView larkWebView) {
        TTWebViewExtension tTWebViewExtension;
        C13477l serviceManager;
        AbstractC13471f fVar;
        this.f35506a = larkWebView;
        if (larkWebView == null || (serviceManager = larkWebView.getServiceManager()) == null || (fVar = (AbstractC13471f) serviceManager.mo49931b(AbstractC13471f.class)) == null) {
            tTWebViewExtension = null;
        } else {
            tTWebViewExtension = fVar.mo49910a();
        }
        this.f35509e = tTWebViewExtension;
        if (tTWebViewExtension != null) {
            tTWebViewExtension.setPerformanceTimingListener(m54714a());
        }
    }

    /* renamed from: a */
    public void mo49916a(String str) {
        LarkWebView larkWebView;
        C13390c webViewConfig;
        C13393d c;
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "url");
        LarkWebView larkWebView2 = this.f35506a;
        if (larkWebView2 != null && larkWebView2.mo49721r() && (larkWebView = this.f35506a) != null && (webViewConfig = larkWebView.getWebViewConfig()) != null && (c = webViewConfig.mo49696c()) != null && c.mo49699a()) {
            TTWebViewExtension tTWebViewExtension = this.f35509e;
            if (tTWebViewExtension != null) {
                str2 = tTWebViewExtension.getPerformanceTiming();
            } else {
                str2 = null;
            }
            Log.m165379d("WebViewPerformanceService", "load " + str + " , performance : " + str2);
            IPerformanceListener aVar = this.f35507b;
            if (aVar != null) {
                aVar.mo49056a(str, str2);
            }
            WebMonitorManager.f35486a.mo49877b(this.f35506a, str2);
        }
    }
}
