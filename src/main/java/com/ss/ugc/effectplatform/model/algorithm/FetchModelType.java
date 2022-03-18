package com.ss.ugc.effectplatform.model.algorithm;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "", "(Ljava/lang/String;I)V", "fromValue", "value", "", "ORIGIN", "ZIP", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum FetchModelType {
    ORIGIN,
    ZIP;

    public FetchModelType fromValue(int i) {
        FetchModelType[] values = values();
        for (FetchModelType fetchModelType : values) {
            if (fetchModelType.ordinal() == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }
}
