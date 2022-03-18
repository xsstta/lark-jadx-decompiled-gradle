package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.f */
public class C14070f extends DispatchStrategy {

    /* renamed from: a */
    private static final String f36965a = "f";

    /* renamed from: b */
    private Map<String, String> f36966b = new HashMap();

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    /* renamed from: a */
    public boolean mo51741a() {
        return false;
    }

    public C14070f(JSONObject jSONObject) {
        super(DispatchStrategy.DispatchStrategyType.STATIC_DISPATCH_STRATEGY);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    this.f36966b.put(next, optString);
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy
    /* renamed from: a */
    public String mo51740a(Uri uri) {
        String host = uri.getHost();
        String uri2 = uri.toString();
        String str = this.f36966b.get(host);
        if (TextUtils.isEmpty(str)) {
            return uri2;
        }
        String str2 = f36965a;
        Logger.m15167d(str2, "replace host " + str + " for " + host);
        return uri2.replaceFirst(host, str);
    }
}
