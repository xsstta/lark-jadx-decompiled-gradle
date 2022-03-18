package com.bytedance.ee.bear.quoto;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.quoto.BusinessInfoRequester;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.quoto.-$$Lambda$aIgKJZSHrklM0PVuhD2f5UQhIL4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$aIgKJZSHrklM0PVuhD2f5UQhIL4 implements Function {
    public static final /* synthetic */ $$Lambda$aIgKJZSHrklM0PVuhD2f5UQhIL4 INSTANCE = new $$Lambda$aIgKJZSHrklM0PVuhD2f5UQhIL4();

    private /* synthetic */ $$Lambda$aIgKJZSHrklM0PVuhD2f5UQhIL4() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return (BusinessInfoRequester.BusinessInfoResult) ((NetService.Result) obj).getData();
    }
}
