package com.larksuite.rucket.impl.base.request;

import com.bytedance.lark.sdk.StreamDataSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/larksuite/rucket/impl/base/request/RequestStrategy;", "", "(Ljava/lang/String;I)V", "toSource", "Lcom/bytedance/lark/sdk/StreamDataSource;", "NONE", "PREFER_NETWORK", "PREFER_CACHE", "FORCE_LOCAL", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum RequestStrategy {
    NONE,
    PREFER_NETWORK,
    PREFER_CACHE,
    FORCE_LOCAL;

    public final StreamDataSource toSource() {
        int i = C26338c.f64992a[ordinal()];
        if (i == 1) {
            return StreamDataSource.DEFAULT_SMART;
        }
        if (i == 2) {
            return StreamDataSource.ONCE_LOCAL;
        }
        if (i != 3) {
            return null;
        }
        return StreamDataSource.ONCE_NET;
    }
}
