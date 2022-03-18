package com.bytedance.ee.larkwebview.monitor.webview;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/LarkWebViewMonitorParams;", "", "()V", "BASE", "BIZ", "HTML_TAG", "RESULT", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LarkWebViewMonitorParams {

    /* renamed from: a */
    public static final LarkWebViewMonitorParams f35431a = new LarkWebViewMonitorParams();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/LarkWebViewMonitorParams$BIZ;", "", "(Ljava/lang/String;I)V", "DEFAULT", "DOC", "GADGET", "MAIL", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum BIZ {
        DEFAULT,
        DOC,
        GADGET,
        MAIL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/LarkWebViewMonitorParams$BASE;", "", "()V", "OS_Android", "", "WB_TYPE_SYS", "WB_TYPE_TT", "getWebType", "isTT", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.monitor.webview.LarkWebViewMonitorParams$a */
    public static final class BASE {

        /* renamed from: a */
        public static final BASE f35432a = new BASE();

        /* renamed from: a */
        public final String mo49853a(boolean z) {
            return z ? "tt_webview" : "sys_webview";
        }

        private BASE() {
        }
    }

    private LarkWebViewMonitorParams() {
    }
}
