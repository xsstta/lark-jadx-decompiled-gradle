package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.base.runtime.model.XReportADLogParams;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0011H&J&\u0010\u0012\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostLogDepend;", "", "handleReportADLog", "", "contextProviderFactory", "Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;", "name", "", "params", "Lcom/bytedance/ies/xbridge/base/runtime/model/XReportADLogParams;", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/depend/IReportADLogResultCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "onEventV3Map", "eventName", "map", "", "putCommonParams", "isApi", "", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IHostLogDepend {
    void handleReportADLog(XContextProviderFactory cVar, String str, XReportADLogParams aVar, IReportADLogResultCallback iReportADLogResultCallback, XBridgePlatformType xBridgePlatformType);

    void onEventV3Map(String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);
}
