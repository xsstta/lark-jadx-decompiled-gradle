package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class EventDataCollector {

    /* renamed from: ı */
    private final Context f6842;

    public long bootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public String disk() {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            long blockSizeLong = statFs.getBlockSizeLong();
            j2 = statFs.getAvailableBlocksLong() * blockSizeLong;
            j = statFs.getBlockCountLong() * blockSizeLong;
        } else {
            int blockSize = statFs.getBlockSize();
            j2 = (long) (statFs.getAvailableBlocks() * blockSize);
            j = (long) (statFs.getBlockCount() * blockSize);
        }
        double pow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (((double) j2) / pow));
        sb.append("/");
        sb.append((long) (((double) j) / pow));
        return sb.toString();
    }

    public String signature() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        Signature[] signatureArr = this.f6842.getPackageManager().getPackageInfo(this.f6842.getPackageName(), 64).signatures;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        instance.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format("%032X", new BigInteger(1, instance.digest()));
    }

    public EventDataCollector(Context context) {
        this.f6842 = context;
    }
}
