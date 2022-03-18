package com.ss.android.lark.ug.dyflow.common.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ug.dyflow.common.data.FlowData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;", "", "getFlowData", "", "flowId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "reportFlowEvent", "stepId", "", "slotId", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.b.c */
public interface IDyFlowService {
    /* renamed from: a */
    void mo194775a(long j, IGetDataCallback<FlowData> iGetDataCallback);

    /* renamed from: a */
    void mo194776a(long j, String str, String str2);
}
