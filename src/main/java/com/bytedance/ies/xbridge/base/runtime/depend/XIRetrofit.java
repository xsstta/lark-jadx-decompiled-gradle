package com.bytedance.ies.xbridge.base.runtime.depend;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/XIRetrofit;", "", "create", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface XIRetrofit {
    <T> T create(Class<T> cls);
}
