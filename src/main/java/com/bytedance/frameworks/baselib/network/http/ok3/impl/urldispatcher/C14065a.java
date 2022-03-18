package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.a */
public class C14065a extends DispatchStrategy {
    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    /* renamed from: a */
    public boolean mo51741a() {
        return false;
    }

    public C14065a() {
        super(DispatchStrategy.DispatchStrategyType.UNKNOWN_DISPATCH_STRATEGY);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    /* renamed from: a */
    public String mo51740a(Uri uri) {
        return uri.toString();
    }
}
