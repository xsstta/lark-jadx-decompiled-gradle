package com.ss.android.lark.ug.dyflow.common.data.parser;

import com.bytedance.lark.pb.onboarding.v1.Element;
import com.bytedance.lark.pb.onboarding.v1.FlowContext;
import com.bytedance.lark.pb.onboarding.v1.PushDynamicFlowStepEvent;
import com.bytedance.lark.pb.onboarding.v1.Step;
import com.ss.android.lark.ug.dyflow.common.data.FlowSlotData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/parser/PushFlowStepDataParser;", "Lcom/ss/android/lark/ug/dyflow/common/data/parser/DataParser;", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "()V", "parse", "any", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.data.a.e */
public final class PushFlowStepDataParser implements DataParser<byte[], FlowStepData> {
    /* renamed from: a */
    public FlowStepData mo194858a(byte[] bArr) {
        HashMap hashMap;
        Collection<FlowSlotData> values;
        Map<String, String> map;
        Intrinsics.checkParameterIsNotNull(bArr, "any");
        PushDynamicFlowStepEvent decode = PushDynamicFlowStepEvent.ADAPTER.decode(bArr);
        if (decode == null) {
            return FlowStepData.CREATOR.mo194850a();
        }
        Step step = decode.step;
        if (step == null) {
            return FlowStepData.CREATOR.mo194850a();
        }
        Map<String, Element> map2 = decode.elements;
        if (map2 == null) {
            map2 = Collections.emptyMap();
            Intrinsics.checkExpressionValueIsNotNull(map2, "Collections.emptyMap()");
        }
        FlowContext flowContext = decode.flow_context;
        FlowStepData a = PbParseUtils.f141443a.mo194863a(step, PbParseUtils.f141443a.mo194866a(map2));
        Long l = decode.flow_suite_id;
        Intrinsics.checkExpressionValueIsNotNull(l, "serverStepEvent.flow_suite_id");
        a.mo194829a(l.longValue());
        com.ss.android.lark.ug.dyflow.common.data.FlowContext aVar = new com.ss.android.lark.ug.dyflow.common.data.FlowContext();
        if (flowContext == null || (map = flowContext.parameters) == null) {
            Map<String, String> emptyMap = Collections.emptyMap();
            Intrinsics.checkExpressionValueIsNotNull(emptyMap, "Collections.emptyMap()");
            hashMap = emptyMap;
        } else {
            hashMap = new HashMap(map);
        }
        aVar.mo194856a(hashMap);
        a.mo194830a(aVar);
        Map<String, FlowSlotData> d = a.mo194839d();
        if (!(d == null || (values = d.values()) == null)) {
            for (T t : values) {
                t.mo194809a(a.mo194828a());
                t.mo194811a(a.mo194834b());
                t.mo194814b(a.mo194837c());
            }
        }
        return a;
    }
}
