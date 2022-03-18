package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostOpenDepend;", "", "scanCode", "", "contextProviderFactory", "Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;", "cameraOnly", "", "scanResultCallback", "Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostOpenDepend$IScanResultCallback;", "IScanResultCallback", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IHostOpenDepend {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostOpenDepend$IScanResultCallback;", "", "onFailure", "", "msg", "", "onSuccess", "result", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend$a */
    public interface IScanResultCallback {
    }

    void scanCode(XContextProviderFactory cVar, boolean z, IScanResultCallback aVar);
}
