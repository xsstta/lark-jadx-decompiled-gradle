package com.ss.android.lark.app.task;

import com.bytedance.geckox.statistic.AbstractC14328a;
import com.ss.android.lark.applogbridge.AppLogProxy;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.app.task.-$$Lambda$InitGeckoTask$wCQUBEAYKw6VaaeP-57LHeAkQso  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$InitGeckoTask$wCQUBEAYKw6VaaeP57LHeAkQso implements AbstractC14328a {
    public static final /* synthetic */ $$Lambda$InitGeckoTask$wCQUBEAYKw6VaaeP57LHeAkQso INSTANCE = new $$Lambda$InitGeckoTask$wCQUBEAYKw6VaaeP57LHeAkQso();

    private /* synthetic */ $$Lambda$InitGeckoTask$wCQUBEAYKw6VaaeP57LHeAkQso() {
    }

    @Override // com.bytedance.geckox.statistic.AbstractC14328a
    public final void upload(String str, JSONObject jSONObject) {
        AppLogProxy.onEventV3(str, jSONObject);
    }
}
