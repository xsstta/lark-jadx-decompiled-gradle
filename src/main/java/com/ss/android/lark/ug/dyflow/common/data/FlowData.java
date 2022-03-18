package com.ss.android.lark.ug.dyflow.common.data;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a0\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "", "()V", "flowContext", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "getFlowContext", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "setFlowContext", "(Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;)V", "flowId", "", "getFlowId", "()J", "setFlowId", "(J)V", "flowName", "", "getFlowName", "()Ljava/lang/String;", "setFlowName", "(Ljava/lang/String;)V", "rootStepUri", "getRootStepUri", "setRootStepUri", "steps", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "getSteps", "()Ljava/util/Map;", "setSteps", "(Ljava/util/Map;)V", "getAndRemoveStepData", "stepId", "getStepData", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.data.b */
public final class FlowData {

    /* renamed from: a */
    public static final FlowData f141444a = new FlowData();

    /* renamed from: b */
    public static final Companion f141445b = new Companion(null);

    /* renamed from: c */
    private long f141446c = -1;

    /* renamed from: d */
    private String f141447d;

    /* renamed from: e */
    private Map<String, FlowStepData> f141448e;

    /* renamed from: f */
    private String f141449f;

    /* renamed from: g */
    private FlowContext f141450g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowData$Companion;", "", "()V", "EMPTY", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "getEMPTY", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.data.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final FlowData mo194878a() {
            return FlowData.f141444a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo194869a() {
        return this.f141446c;
    }

    /* renamed from: b */
    public final Map<String, FlowStepData> mo194873b() {
        return this.f141448e;
    }

    /* renamed from: c */
    public final String mo194876c() {
        return this.f141449f;
    }

    /* renamed from: d */
    public final FlowContext mo194877d() {
        return this.f141450g;
    }

    public FlowData() {
        Map<String, FlowStepData> emptyMap = Collections.emptyMap();
        Intrinsics.checkExpressionValueIsNotNull(emptyMap, "Collections.emptyMap()");
        this.f141448e = emptyMap;
        this.f141450g = new FlowContext();
    }

    /* renamed from: a */
    public final void mo194870a(long j) {
        this.f141446c = j;
    }

    /* renamed from: b */
    public final void mo194874b(String str) {
        this.f141449f = str;
    }

    /* renamed from: a */
    public final void mo194871a(String str) {
        this.f141447d = str;
    }

    /* renamed from: c */
    public final FlowStepData mo194875c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "stepId");
        return this.f141448e.get(str);
    }

    /* renamed from: a */
    public final void mo194872a(Map<String, FlowStepData> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.f141448e = map;
    }
}
