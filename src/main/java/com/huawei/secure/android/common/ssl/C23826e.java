package com.huawei.secure.android.common.ssl;

import android.content.Context;
import android.os.AsyncTask;
import com.huawei.secure.android.common.ssl.p1028b.AsyncTaskC23819d;
import com.huawei.secure.android.common.ssl.p1028b.C23816a;
import com.huawei.secure.android.common.ssl.p1028b.C23818c;
import com.huawei.secure.android.common.ssl.p1028b.C23821f;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;

/* renamed from: com.huawei.secure.android.common.ssl.e */
public class C23826e {

    /* renamed from: a */
    private static final String f59025a = "e";

    /* renamed from: b */
    private static volatile C23827f f59026b;

    private C23826e() {
    }

    /* renamed from: a */
    public static C23827f m87093a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        Objects.requireNonNull(context, "context is null");
        C23818c.m87066a(context);
        if (f59026b == null) {
            synchronized (C23826e.class) {
                if (f59026b == null) {
                    InputStream b = C23816a.m87055b(context);
                    if (b == null) {
                        C23821f.m87076b(f59025a, "get assets bks");
                        b = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        C23821f.m87076b(f59025a, "get files bks");
                    }
                    f59026b = new C23827f(b, "");
                    new AsyncTaskC23819d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                }
            }
        }
        return f59026b;
    }

    /* renamed from: a */
    public static void m87094a(InputStream inputStream) {
        String str = f59025a;
        C23821f.m87076b(str, "update bks");
        if (inputStream != null && f59026b != null) {
            f59026b = new C23827f(inputStream, "");
            C23825d.m87089a(f59026b);
            C23824c.m87085a(f59026b);
            if (f59026b != null && f59026b.getAcceptedIssuers() != null) {
                C23821f.m87074a(str, "after updata bks , ca size is : " + f59026b.getAcceptedIssuers().length);
            }
        }
    }
}
