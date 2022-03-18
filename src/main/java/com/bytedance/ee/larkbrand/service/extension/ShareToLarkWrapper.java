package com.bytedance.ee.larkbrand.service.extension;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&JP\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/larkbrand/service/extension/ShareToLarkWrapper;", "", "enableShare", "", "share", "", "olderShare", HiAnalyticsConstant.HaKey.BI_KEY_APPID, "", "title", "content", "path", "appLink", "hasPcShare", "imageToken", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.service.extension.o */
public interface ShareToLarkWrapper {
    /* renamed from: a */
    void mo49613a(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, IAppContext iAppContext);

    /* renamed from: i */
    boolean mo49614i();
}
