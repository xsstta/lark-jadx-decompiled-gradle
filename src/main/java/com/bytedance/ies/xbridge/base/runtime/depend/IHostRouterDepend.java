package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J0\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007H&J@\u0010\r\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostRouterDepend;", "", "assembleHandlerChain", "Lcom/bytedance/ies/xbridge/base/runtime/depend/AbsRouteOpenHandler;", "contextProviderFactory", "Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;", "closeView", "", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "containerID", "", "animated", "openSchema", "schema", "extraParams", "", "platformType", "context", "Landroid/content/Context;", "provideRouteOpenExceptionHandler", "provideRouteOpenHandlerList", "", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IHostRouterDepend {
    boolean closeView(XContextProviderFactory cVar, XBridgePlatformType xBridgePlatformType, String str, boolean z);

    boolean openSchema(XContextProviderFactory cVar, String str, Map<String, ? extends Object> map, XBridgePlatformType xBridgePlatformType, Context context);

    AbsRouteOpenHandler provideRouteOpenExceptionHandler(XContextProviderFactory cVar);

    List<AbsRouteOpenHandler> provideRouteOpenHandlerList(XContextProviderFactory cVar);
}
