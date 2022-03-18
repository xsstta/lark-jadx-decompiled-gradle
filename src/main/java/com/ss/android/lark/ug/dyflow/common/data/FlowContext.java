package com.ss.android.lark.ug.dyflow.common.data;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "", "()V", "extra", "Landroid/os/Bundle;", "getExtra", "()Landroid/os/Bundle;", "parameters", "", "", "getParameters", "()Ljava/util/Map;", "setParameters", "(Ljava/util/Map;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.data.a */
public final class FlowContext {

    /* renamed from: a */
    private Map<String, String> f141441a = new HashMap();

    /* renamed from: b */
    private final Bundle f141442b = new Bundle();

    /* renamed from: a */
    public final Map<String, String> mo194855a() {
        return this.f141441a;
    }

    /* renamed from: b */
    public final Bundle mo194857b() {
        return this.f141442b;
    }

    /* renamed from: a */
    public final void mo194856a(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.f141441a = map;
    }
}
