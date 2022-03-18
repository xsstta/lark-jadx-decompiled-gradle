package com.ss.android.lark.ug.dyflow.common;

import com.ss.android.lark.ug.dyflow.common.BaseFlowStep;
import com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\bH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/ug/dyflow/common/BaseFlowStep$stepDelegate$2$1", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate$Stub;", "getFlowParam", "", "key", "getStepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "handleSlotAction", "", "slotName", "mustLink", "notifyExtExit", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "runStep", "uri", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BaseFlowStep$stepDelegate$2$1 extends IFlowStepDelegate.Stub {
    final /* synthetic */ BaseFlowStep.C57422b this$0;

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public FlowStepData getStepData() {
        return this.this$0.this$0.mo194768e();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    BaseFlowStep$stepDelegate$2$1(BaseFlowStep.C57422b bVar) {
        this.this$0 = bVar;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public String getFlowParam(String str) {
        if (str != null) {
            return this.this$0.this$0.mo194764b(str);
        }
        return null;
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public boolean runStep(String str) {
        return this.this$0.this$0.mo194762a(str);
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public void notifyExtExit(int i, String str) {
        this.this$0.this$0.mo194759a(i, str);
    }

    @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
    public boolean handleSlotAction(String str, boolean z) {
        boolean z2;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                return this.this$0.this$0.mo194763a(str, z);
            }
        }
        return false;
    }
}
