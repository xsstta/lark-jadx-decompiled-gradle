package com.ss.android.lark.ug.dyflow.common.data.parser;

import com.bytedance.lark.pb.onboarding.v1.Flow;
import com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowResponse;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.common.data.FlowData;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/parser/GetFlowDataParser;", "Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "()V", "parse", "any", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.data.a.c */
public final class GetFlowDataParser implements DataParser<byte[], FlowData> {
    /* renamed from: a */
    public FlowData mo194858a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "any");
        Flow flow = GetDynamicFlowResponse.ADAPTER.decode(bArr).flow;
        if (flow == null) {
            return FlowData.f141445b.mo194878a();
        }
        Intrinsics.checkExpressionValueIsNotNull(flow, "GetDynamicFlowResponse.A… ?: return FlowData.EMPTY");
        AbstractC57392a a = C57345a.m222261a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
        if (C26284k.m95186b(a.mo194672d())) {
            Log.m165389i("DyFlow", flow.toString());
        }
        return PbParseUtils.f141443a.mo194864a(flow);
    }
}
