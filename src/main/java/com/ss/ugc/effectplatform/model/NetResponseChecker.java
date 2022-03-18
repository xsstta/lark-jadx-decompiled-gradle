package com.ss.ugc.effectplatform.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "T", "", "()V", "checkValue", "", "getResponseData", "()Ljava/lang/Object;", "getResponseMessage", "", "getStatusCode", "", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.f */
public abstract class NetResponseChecker<T> {
    public abstract T getResponseData();

    public abstract String getResponseMessage();

    public abstract int getStatusCode();

    public boolean checkValue() {
        if (getResponseData() != null) {
            return true;
        }
        return false;
    }
}
