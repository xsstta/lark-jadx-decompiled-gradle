package com.ss.ugc.effectplatform.model.algorithm;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/ugc/effectplatform/model/algorithm/SingleAlgorithmModelResponse;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "(Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;)V", "getData", "()Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SingleAlgorithmModelResponse {
    private ModelInfo data;

    public static /* synthetic */ SingleAlgorithmModelResponse copy$default(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ModelInfo modelInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            modelInfo = singleAlgorithmModelResponse.data;
        }
        return singleAlgorithmModelResponse.copy(modelInfo);
    }

    public final ModelInfo component1() {
        return this.data;
    }

    public final SingleAlgorithmModelResponse copy(ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(modelInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return new SingleAlgorithmModelResponse(modelInfo);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SingleAlgorithmModelResponse) && Intrinsics.areEqual(this.data, ((SingleAlgorithmModelResponse) obj).data);
        }
        return true;
    }

    public int hashCode() {
        ModelInfo modelInfo = this.data;
        if (modelInfo != null) {
            return modelInfo.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SingleAlgorithmModelResponse(data=" + this.data + ")";
    }

    public final ModelInfo getData() {
        return this.data;
    }

    public final void setData(ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(modelInfo, "<set-?>");
        this.data = modelInfo;
    }

    public SingleAlgorithmModelResponse(ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(modelInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = modelInfo;
    }
}
