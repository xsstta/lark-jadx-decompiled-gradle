package com.ss.android.lark.passport.infra.util.p2440b;

import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.io.BufferedReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.passport.infra.util.b.b */
public class C49161b {
    /* renamed from: a */
    public static String m193860a(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(sb.toString().replace("-----BEGIN RSA PUBLIC KEY-----", "").replace("-----END RSA PUBLIC KEY-----", "").replaceAll("\\s+", ""), 2)));
                    Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
                    instance.init(1, generatePublic, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
                    String encodeToString = Base64.encodeToString(instance.doFinal(str2.getBytes(StandardCharsets.UTF_8)), 2);
                    PassportLog a = PassportLog.f123351c.mo171474a();
                    a.mo171461a("RSA", "encryptBytes=" + encodeToString);
                    return encodeToString;
                }
            }
        } catch (Exception e) {
            PassportLog a2 = PassportLog.f123351c.mo171474a();
            a2.mo171471d("RSA", "encrypt: " + e.toString());
            throw e;
        }
    }
}
