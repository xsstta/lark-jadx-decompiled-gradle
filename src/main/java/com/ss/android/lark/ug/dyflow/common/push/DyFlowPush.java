package com.ss.android.lark.ug.dyflow.common.push;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.data.parser.PushFlowStepDataParser;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J,\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush;", "", "()V", "pushDyFlowStepListeners", "", "Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush$IPushDyFlowStepListener;", "addPushDyFlowStepListener", "", "listener", "onPushDyFlowStep", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "removePushDyFlowStepListener", "Companion", "IPushDyFlowStepListener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.a.a */
public final class DyFlowPush {

    /* renamed from: a */
    public static final Lazy f141393a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57423b.INSTANCE);

    /* renamed from: b */
    public static final Companion f141394b = new Companion(null);

    /* renamed from: c */
    private final List<IPushDyFlowStepListener> f141395c = new CopyOnWriteArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush$IPushDyFlowStepListener;", "", "onPushStepData", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.a.a$c */
    public interface IPushDyFlowStepListener {
        /* renamed from: a */
        void mo194719a(FlowStepData flowStepData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush;", "getInstance", "()Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush;", "instance$delegate", "Lkotlin/Lazy;", "inst", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.a.a$a */
    public static final class Companion {
        /* renamed from: b */
        private final DyFlowPush m222649b() {
            Lazy lazy = DyFlowPush.f141393a;
            Companion aVar = DyFlowPush.f141394b;
            return (DyFlowPush) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final DyFlowPush mo194771a() {
            return m222649b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/dyflow/common/push/DyFlowPush;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.a.a$b */
    static final class C57423b extends Lambda implements Function0<DyFlowPush> {
        public static final C57423b INSTANCE = new C57423b();

        C57423b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DyFlowPush invoke() {
            return new DyFlowPush();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.a.a$d */
    public static final class C57424d implements C53246j.AbstractC53247a {

        /* renamed from: a */
        final /* synthetic */ DyFlowPush f141396a;

        C57424d(DyFlowPush aVar) {
            this.f141396a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_DYNAMIC_FLOW_STEP, new C53248k.AbstractC53250a(this) {
                /* class com.ss.android.lark.ug.dyflow.common.push.DyFlowPush.C57424d.C574251 */

                /* renamed from: a */
                final /* synthetic */ C57424d f141397a;

                {
                    this.f141397a = r1;
                }

                @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                    this.f141397a.f141396a.mo194770a(bArr, str, z, z2);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo194769a(IPushDyFlowStepListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        if (!this.f141395c.contains(cVar)) {
            C53246j.m205910a(this.f141395c, cVar, new C57424d(this));
        }
    }

    /* renamed from: a */
    public final void mo194770a(byte[] bArr, String str, boolean z, boolean z2) {
        if (bArr != null) {
            try {
                FlowStepData a = new PushFlowStepDataParser().mo194858a(bArr);
                for (IPushDyFlowStepListener cVar : this.f141395c) {
                    cVar.mo194719a(a);
                }
            } catch (Exception e) {
                Log.m165384e("DyFlowPush", "PushFlowStepDataParser parse error", e);
            }
        }
    }
}
