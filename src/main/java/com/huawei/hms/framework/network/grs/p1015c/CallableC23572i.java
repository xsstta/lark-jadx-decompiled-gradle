package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C23590a;
import com.huawei.hms.framework.network.grs.local.model.C23592c;
import com.huawei.hms.framework.network.grs.p1014b.C23553b;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.framework.network.grs.c.i */
public class CallableC23572i extends C23561b implements Callable<C23568e> {

    /* renamed from: h */
    private static final String f58119h = "i";

    /* renamed from: i */
    private GrsBaseInfo f58120i;

    public CallableC23572i(String str, int i, AbstractC23559a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        super(str, i, aVar, context, str2, grsBaseInfo);
        this.f58120i = grsBaseInfo;
    }

    /* renamed from: h */
    private String m85510h() {
        HashSet<String> hashSet = new HashSet();
        C23590a a = C23553b.m85431a(mo82874b().getPackageName(), this.f58120i).mo82866a();
        if (a == null) {
            Logger.m85375w(f58119h, "get local assets appGrs is null.");
            return "";
        }
        Map<String, C23592c> b = a.mo82945b();
        if (b != null && !b.isEmpty()) {
            for (Map.Entry<String, C23592c> entry : b.entrySet()) {
                hashSet.add(entry.getValue().mo82957b());
            }
            if (hashSet.isEmpty()) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : hashSet) {
                jSONArray.put(str);
            }
            try {
                jSONObject.put("services", jSONArray);
                Logger.m85374v(f58119h, "post service list is:%s,and appName is:%s", jSONObject.toString(), a.mo82942a());
                return jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        return "";
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r0v20, types: [byte[]] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.concurrent.Callable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.huawei.hms.framework.network.grs.p1015c.C23568e call() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p1015c.CallableC23572i.call():com.huawei.hms.framework.network.grs.c.e");
    }
}
