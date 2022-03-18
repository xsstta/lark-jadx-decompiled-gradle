package com.tt.miniapphost.data;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.multitask.task.EventTracker;
import com.tt.miniapp.event.C66020b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tt/miniapphost/data/MiniAppMultitaskEventTracker;", "Lcom/ss/android/lark/multitask/task/EventTracker;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "sendEvent", "", "name", "", "params", "Lorg/json/JSONObject;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapphost.data.f */
public final class MiniAppMultitaskEventTracker implements EventTracker {

    /* renamed from: a */
    private final IAppContext f170204a;

    public MiniAppMultitaskEventTracker(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        this.f170204a = iAppContext;
    }

    @Override // com.ss.android.lark.multitask.task.EventTracker
    /* renamed from: a */
    public void mo169219a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        C66020b.C66021a aVar = new C66020b.C66021a(str, this.f170204a);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkExpressionValueIsNotNull(keys, "json.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                aVar.mo231090a(next, jSONObject.get(next));
            }
        }
        aVar.mo231092a();
    }
}
