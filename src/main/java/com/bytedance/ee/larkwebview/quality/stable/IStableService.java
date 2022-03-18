package com.bytedance.ee.larkwebview.quality.stable;

import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.service.AbstractC13476k;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/larkwebview/quality/stable/IStableService;", "Lcom/bytedance/ee/larkwebview/service/IWebViewMonitorService;", "checkBlank", "", "result", "Lcom/bytedance/ee/larkwebview/quality/stable/IBlankCheckResult;", "getStableListener", "Lcom/bytedance/ee/larkwebview/quality/stable/IStableListener;", "init", "extension", "Lcom/bytedance/lynx/webview/extension/TTWebViewExtension;", "larkWebView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "setStableListener", "listener", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.d.d.c */
public interface IStableService extends AbstractC13476k {
    /* renamed from: a */
    IStableListener mo49841a();

    /* renamed from: a */
    void mo49842a(IStableListener bVar);

    /* renamed from: a */
    void mo49843a(TTWebViewExtension tTWebViewExtension, LarkWebView larkWebView);
}
