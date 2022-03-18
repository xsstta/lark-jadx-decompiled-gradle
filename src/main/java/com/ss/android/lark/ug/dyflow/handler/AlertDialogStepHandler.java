package com.ss.android.lark.ug.dyflow.handler;

import android.text.TextUtils;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.feat.GuideDialogManager;
import com.ss.android.lark.ug.dyflow.handler.SingleStepDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/handler/AlertDialogStepHandler;", "Lcom/ss/android/lark/ug/dyflow/handler/SingleStepDispatcher$SingleStepHandler;", "()V", "onHandle", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.b.a */
public final class AlertDialogStepHandler implements SingleStepDispatcher.SingleStepHandler {

    /* renamed from: a */
    public static final Companion f141370a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/handler/AlertDialogStepHandler$Companion;", "", "()V", "STEP_NAME", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.handler.SingleStepDispatcher.SingleStepHandler
    /* renamed from: a */
    public boolean mo194715a(FlowStepData flowStepData) {
        Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
        if (!TextUtils.equals(flowStepData.mo194837c(), "alert_dialog")) {
            return false;
        }
        GuideDialogManager.f141497b.mo194951a().mo194949a(flowStepData);
        return true;
    }
}
