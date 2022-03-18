package com.huawei.hms.framework.network.grs.p1018d.p1020b;

import android.content.Context;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.huawei.hms.framework.network.grs.d.b.a */
public class C23580a {
    /* renamed from: a */
    public static SSLSocketFactory m85549a(Context context) {
        try {
            return C23582c.m85558a(context, "grs_sp.bks");
        } catch (IOException e) {
            throw new AssertionError(e);
        } catch (CertificateException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (KeyStoreException e5) {
            throw new AssertionError(e5);
        } catch (KeyManagementException e6) {
            throw new AssertionError(e6);
        }
    }
}
