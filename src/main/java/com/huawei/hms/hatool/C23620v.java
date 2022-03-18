package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.hatool.v */
public class C23620v {
    /* renamed from: a */
    public static c1 m85931a(String str, String str2) {
        c1 c1Var = new c1();
        c1Var.mo83124a(x0.m85956a().mo83176a(str, str2));
        return c1Var;
    }

    /* renamed from: a */
    public static d1 m85932a(String str, String str2, String str3, String str4) {
        d1 d1Var = new d1();
        d1Var.mo83127a(str);
        d1Var.mo83128b(AbstractC23596b.m85615c());
        d1Var.mo83131e(str2);
        d1Var.mo83129c(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        d1Var.mo83130d(stringBuffer.toString());
        return d1Var;
    }

    /* renamed from: a */
    public static e1 m85933a(String str, String str2, String str3) {
        e1 e1Var = new e1();
        e1Var.mo83138c(AbstractC23596b.m85620g());
        e1Var.mo83140e(AbstractC23596b.m85622i());
        e1Var.mo83136a(str3);
        e1Var.mo83137b(x0.m85956a().mo83179b(str2, str));
        return e1Var;
    }

    /* renamed from: a */
    public static C23616r m85934a() {
        C23625y.m85977c("hmsSdk", "generate UploadData EventModelHandlerBase");
        C23622x.m85946f().mo83170d();
        if (!TextUtils.isEmpty(C23622x.m85946f().mo83167a())) {
            return new C23616r(C23622x.m85946f().mo83169c());
        }
        C23625y.m85982f("hmsSdk", "event chifer is empty");
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m85935b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", AbstractC23596b.m85615c());
        hashMap.put("App-Ver", AbstractC23596b.m85617d());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.2.0.308");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("servicetag", str);
        C23625y.m85972a("hmsSdk", "sendData RequestId : %s", str2);
        hashMap.put("Request-Id", str2);
        return hashMap;
    }
}
