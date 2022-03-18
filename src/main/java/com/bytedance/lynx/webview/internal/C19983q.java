package com.bytedance.lynx.webview.internal;

import android.util.Base64;
import com.bytedance.lynx.webview.util.C20048g;
import java.io.PrintStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.bytedance.lynx.webview.internal.q */
public class C19983q {
    /* renamed from: a */
    public static boolean m72877a(String str, String str2) {
        boolean z;
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJ9Z9a6Yn/vYSp7bytaE0ILOke8/0czT69fnKC5hmTQ5P3SLYRqdhC0Lvv6Jt2UHzw6MQsSI7Zqp59gpFK4GDiMCAwEAAQ==", 0)));
            PrintStream printStream = System.out;
            printStream.println("CheckWithRsa = " + str2);
            z = m72878a(str, Base64.decode(str2, 0), generatePublic);
        } catch (Throwable th) {
            C20048g.m73164d("CheckWithRsa", th.toString());
            z = false;
        }
        C20048g.m73161a("CheckWithRsa ret is = " + z);
        return z;
    }

    /* renamed from: a */
    public static boolean m72878a(String str, byte[] bArr, PublicKey publicKey) throws Exception {
        Signature instance = Signature.getInstance("SHA1withRSA");
        instance.initVerify(publicKey);
        instance.update(str.getBytes());
        return instance.verify(bArr);
    }
}
