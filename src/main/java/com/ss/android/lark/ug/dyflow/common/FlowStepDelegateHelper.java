package com.ss.android.lark.ug.dyflow.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/FlowStepDelegateHelper;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.b */
public final class FlowStepDelegateHelper {

    /* renamed from: a */
    public static final Companion f141398a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/FlowStepDelegateHelper$Companion;", "", "()V", "KEY_FLOW_STEP_BUNDLE", "", "KEY_FLOW_STEP_REF", "getStepDelegate", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate;", "intent", "Landroid/content/Intent;", "bundle", "Landroid/os/Bundle;", "putStepDelegate", "", "step", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IFlowStepDelegate mo194772a(Intent intent) {
            FlowStepDelegateSafeWrapper flowStepDelegateSafeWrapper;
            IBinder binder;
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            Bundle a = m222652a(intent, "key_flow_step_bundle");
            if (a == null || (binder = a.getBinder("key_flow_step_ref")) == null) {
                flowStepDelegateSafeWrapper = null;
            } else {
                Intrinsics.checkExpressionValueIsNotNull(binder, "it");
                flowStepDelegateSafeWrapper = new FlowStepDelegateSafeWrapper(binder);
            }
            return flowStepDelegateSafeWrapper;
        }

        /* renamed from: a */
        public static Bundle m222652a(Intent intent, String str) {
            Bundle bundleExtra = intent.getBundleExtra(str);
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            return bundleExtra;
        }

        /* renamed from: a */
        public final void mo194773a(Intent intent, BaseFlowStep aVar) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            Intrinsics.checkParameterIsNotNull(aVar, "step");
            Bundle bundle = new Bundle();
            bundle.putBinder("key_flow_step_ref", aVar.mo194758a());
            intent.putExtra("key_flow_step_bundle", bundle);
        }

        /* renamed from: a */
        public final void mo194774a(Bundle bundle, BaseFlowStep aVar) {
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            Intrinsics.checkParameterIsNotNull(aVar, "step");
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("key_flow_step_ref", aVar.mo194758a());
            bundle.putBundle("key_flow_step_bundle", bundle2);
        }
    }
}
