package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IReportADLogResultCallback;", "", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IReportADLogResultCallback {
    void onFailure(int i, String str);

    void onSuccess(XDefaultResultModel bVar, String str);
}
