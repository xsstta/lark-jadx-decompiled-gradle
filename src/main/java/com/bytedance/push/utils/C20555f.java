package com.bytedance.push.utils;

import android.util.Base64;
import android.util.Log;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.ss.android.ug.bus.C60442b;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.bytedance.push.utils.f */
public class C20555f {

    /* renamed from: com.bytedance.push.utils.f$a */
    public static class C20556a {

        /* renamed from: a */
        public boolean f50130a;

        /* renamed from: b */
        public String f50131b;
    }

    /* renamed from: a */
    public static C20556a m74871a(String str, String str2, String str3) {
        C20556a aVar = new C20556a();
        try {
            C20552c.m74853d("Sign", "c = " + str + ", key = " + str2 + ", sig = " + str3);
            PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)));
            byte[] bytes = str.getBytes("UTF-8");
            byte[] decode = Base64.decode(str3, 8);
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initVerify(generatePublic);
            instance.update(bytes);
            aVar.f50130a = instance.verify(decode);
            if (aVar.f50130a) {
                aVar.f50131b = "success";
            } else {
                aVar.f50131b = "verify failed when call verify method";
            }
        } catch (Throwable th) {
            ((AbstractC20449l) C60442b.m234863a(AbstractC20449l.class)).mo68868a(th);
            aVar.f50131b = "exception : " + Log.getStackTraceString(th);
            aVar.f50130a = false;
        }
        return aVar;
    }
}
