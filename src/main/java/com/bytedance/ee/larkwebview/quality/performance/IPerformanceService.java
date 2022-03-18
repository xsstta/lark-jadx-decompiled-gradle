package com.bytedance.ee.larkwebview.quality.performance;

import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.service.AbstractC13474i;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/larkwebview/quality/performance/IPerformanceService;", "Lcom/bytedance/ee/larkwebview/service/IWebService;", "getPerformanceListener", "Lcom/bytedance/ee/larkwebview/quality/performance/IPerformanceListener;", "init", "", "larkWebView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "onGetPagePerformance", "url", "", "setPerformanceListener", "listener", "Lcom/bytedance/lynx/webview/glue/IWebViewExtension$PerformanceTimingListener;", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.d.a.b */
public interface IPerformanceService extends AbstractC13474i {
    /* renamed from: a */
    void mo49814a(LarkWebView larkWebView);

    /* renamed from: a */
    void mo49815a(IPerformanceListener aVar);

    /* renamed from: a */
    void mo49816a(IWebViewExtension.PerformanceTimingListener performanceTimingListener);
}
