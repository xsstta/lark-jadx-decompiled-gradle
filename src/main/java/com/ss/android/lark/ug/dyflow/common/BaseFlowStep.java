package com.ss.android.lark.ug.dyflow.common;

import android.content.Context;
import android.os.IBinder;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate;
import com.ss.android.lark.ug.dyflow.common.data.FlowContext;
import com.ss.android.lark.ug.dyflow.common.data.FlowSlotData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 .2\u00020\u0001:\u0001.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0004J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H&J\u0006\u0010\r\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001aH\u0004J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0004J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0004J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u0014H\u0004J\u001e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006/"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "flow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "(Lcom/ss/android/lark/ug/dyflow/common/IFlow;Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "getFlow", "()Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "getStepData", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "stepDelegate", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate$Stub;", "getStepDelegate", "()Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate$Stub;", "stepDelegate$delegate", "Lkotlin/Lazy;", "getFlowExtra", "Landroid/os/Bundle;", "getFlowParam", "", "key", "getMustKeys", "", "Landroid/os/IBinder;", "handleSlotAction", "", "slotName", "mustLink", "isDataValid", "notifyExExit", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "reportSlotEvent", "slotData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowSlotData;", "runStep", "uri", "startActivity", "context", "Landroid/content/Context;", "actClazz", "Ljava/lang/Class;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.a */
public abstract class BaseFlowStep implements IFlowStep {

    /* renamed from: a */
    public static final Companion f141389a = new Companion(null);

    /* renamed from: b */
    private final Lazy f141390b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new C57422b(this));

    /* renamed from: c */
    private final IFlow f141391c;

    /* renamed from: d */
    private final FlowStepData f141392d;

    /* renamed from: g */
    private final IFlowStepDelegate.Stub m222635g() {
        return (IFlowStepDelegate.Stub) this.f141390b.getValue();
    }

    /* renamed from: c */
    public abstract List<String> mo194766c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final IFlow mo194767d() {
        return this.f141391c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final FlowStepData mo194768e() {
        return this.f141392d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/ug/dyflow/common/BaseFlowStep$stepDelegate$2$1", "invoke", "()Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep$stepDelegate$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.a$b */
    static final class C57422b extends Lambda implements Function0<BaseFlowStep$stepDelegate$2$1> {
        final /* synthetic */ BaseFlowStep this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57422b(BaseFlowStep aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseFlowStep$stepDelegate$2$1 invoke() {
            return new BaseFlowStep$stepDelegate$2$1(this);
        }
    }

    /* renamed from: a */
    public final IBinder mo194758a() {
        return m222635g();
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStep
    /* renamed from: b */
    public boolean mo194765b() {
        List<String> c = mo194766c();
        if (c.isEmpty()) {
            return true;
        }
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            if (!this.f141392d.mo194848j(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo194764b(String str) {
        Map<String, String> a;
        Intrinsics.checkParameterIsNotNull(str, "key");
        FlowContext b = this.f141391c.mo194743b();
        if (b == null || (a = b.mo194855a()) == null) {
            return null;
        }
        return a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo194761a(FlowSlotData flowSlotData) {
        Intrinsics.checkParameterIsNotNull(flowSlotData, "slotData");
        if (flowSlotData.mo194822g()) {
            IFlow dVar = this.f141391c;
            String b = this.f141392d.mo194834b();
            String str = "";
            if (b == null) {
                b = str;
            }
            String d = flowSlotData.mo194817d();
            if (d != null) {
                str = d;
            }
            dVar.mo194738a(b, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo194762a(String str) {
        return this.f141391c.mo194742a(str);
    }

    /* renamed from: a */
    public final void mo194760a(Context context, Class<? extends BaseFlowAct> cls) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cls, "actClazz");
        BaseFlowAct.f141376a.mo194724a(context, cls, this);
    }

    public BaseFlowStep(IFlow dVar, FlowStepData flowStepData) {
        Intrinsics.checkParameterIsNotNull(dVar, "flow");
        Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
        this.f141391c = dVar;
        this.f141392d = flowStepData;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo194759a(int i, String str) {
        this.f141391c.mo194739a(this.f141392d.mo194834b(), this.f141392d.mo194837c(), i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo194763a(String str, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(str, "slotName");
        FlowSlotData c = this.f141392d.mo194836c(str);
        if (c != null) {
            mo194761a(c);
            String f = c.mo194821f();
            if (f == null || f.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return mo194762a(c.mo194821f());
            }
            String str2 = "step_" + getClass() + ", stepUri is null, flowId=" + c.mo194808a() + ", stepName=" + c.mo194815c() + ", slotId=" + c.mo194817d();
            Log.m165389i("DyFlow", str2);
            if (z) {
                mo194759a(-1, str2);
            }
            return false;
        }
        String str3 = "step_" + getClass() + ", slotData is null, flowId=" + this.f141392d.mo194828a() + ", stepName=" + this.f141392d.mo194837c();
        Log.m165389i("DyFlow", str3);
        mo194759a(3, str3);
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m222634a(BaseFlowStep aVar, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo194763a(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSlotAction");
    }
}
