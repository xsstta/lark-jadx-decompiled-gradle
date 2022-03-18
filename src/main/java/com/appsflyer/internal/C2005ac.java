package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.appsflyer.internal.ac */
public final class C2005ac {

    /* renamed from: ı */
    final Context f6852;

    /* renamed from: ι */
    public final String mo10056() {
        String str;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            str = (String) newSingleThreadExecutor.submit(new Callable<String>() {
                /* class com.appsflyer.internal.C2005ac.CallableC20063 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ String call() throws Exception {
                    ProviderInfo resolveContentProvider = C2005ac.this.f6852.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", SmActions.ACTION_ONTHECALL_EXIT);
                    String str = null;
                    if (resolveContentProvider != null) {
                        Signature[] signatureArr = C2005ac.this.f6852.getPackageManager().getPackageInfo(((PackageItemInfo) resolveContentProvider).packageName, 64).signatures;
                        MessageDigest instance = MessageDigest.getInstance("SHA1");
                        instance.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
                        if (Base64.encodeToString(instance.digest(), 2).equals("ijxLJi1yGs1JpL+X1SExmchvork=")) {
                            Cursor query = C2005ac.this.f6852.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
                            if (query != null && query.moveToFirst()) {
                                str = query.getString(query.getColumnIndex("aid"));
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                    return str;
                }
            }).get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            str = null;
        }
        newSingleThreadExecutor.shutdown();
        return str;
    }

    public C2005ac(Context context) {
        this.f6852 = context;
    }
}
