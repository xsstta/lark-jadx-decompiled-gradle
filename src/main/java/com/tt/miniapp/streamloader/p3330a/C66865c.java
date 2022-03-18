package com.tt.miniapp.streamloader.p3330a;

import android.os.SystemClock;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.p3417c.C67746a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.streamloader.a.c */
public class C66865c {

    /* renamed from: a */
    private volatile boolean f168661a;

    /* renamed from: b */
    private final File f168662b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C66866a> f168663c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private IAppContext f168664d;

    /* renamed from: a */
    public void mo232827a() {
        this.f168661a = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.streamloader.a.c$a */
    public class C66866a {

        /* renamed from: a */
        volatile byte[] f168665a;

        C66866a() {
        }
    }

    /* renamed from: b */
    private byte[] m260824b(TTAPkgFile tTAPkgFile) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e;
        byte[] bArr = new byte[tTAPkgFile.getSize()];
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(this.f168662b, "r");
            try {
                randomAccessFile.seek((long) tTAPkgFile.getOffset());
                randomAccessFile.read(bArr, 0, tTAPkgFile.getSize());
            } catch (IOException e2) {
                e = e2;
                try {
                    AppBrandLogger.m52829e("ContentCache", "readFromDisk exception:", "fileName:", tTAPkgFile.getFileName(), e);
                    IOUtils.close(randomAccessFile);
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                }
            }
        } catch (IOException e3) {
            randomAccessFile = null;
            e = e3;
            AppBrandLogger.m52829e("ContentCache", "readFromDisk exception:", "fileName:", tTAPkgFile.getFileName(), e);
            IOUtils.close(randomAccessFile);
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            IOUtils.close(randomAccessFile2);
            throw th;
        }
        IOUtils.close(randomAccessFile);
        return bArr;
    }

    /* renamed from: a */
    public byte[] mo232829a(TTAPkgFile tTAPkgFile) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C66869e eVar = new C66869e();
        eVar.f168679a = tTAPkgFile.getFileName();
        try {
            return m260823a(tTAPkgFile, eVar);
        } finally {
            eVar.f168682d = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
            eVar.f168681c = "success";
            eVar.mo232839a(this.f168664d);
        }
    }

    /* renamed from: a */
    public void mo232828a(String str, byte[] bArr) {
        C66866a putIfAbsent;
        C66866a aVar = this.f168663c.get(str);
        if (aVar == null && (putIfAbsent = this.f168663c.putIfAbsent(str, (aVar = new C66866a()))) != null) {
            aVar = putIfAbsent;
        }
        aVar.f168665a = bArr;
        synchronized (aVar) {
            aVar.notifyAll();
        }
    }

    /* renamed from: a */
    private byte[] m260823a(TTAPkgFile tTAPkgFile, C66869e eVar) {
        C66866a putIfAbsent;
        String fileName = tTAPkgFile.getFileName();
        boolean z = true;
        AppBrandLogger.m52830i("ContentCache", "getOrWait_Request: " + fileName);
        C66866a aVar = this.f168663c.get(fileName);
        if (aVar == null && (putIfAbsent = this.f168663c.putIfAbsent(fileName, (aVar = new C66866a()))) != null) {
            aVar = putIfAbsent;
        }
        if (aVar.f168665a != null) {
            AppBrandLogger.m52830i("ContentCache", "getOrWait_Got1: " + fileName);
            eVar.f168680b = "memory";
            if (HostDependManager.getInst().shouldInterceptRpx2Px(fileName)) {
                aVar.f168665a = HostDependManager.getInst().interceptRpx2Px(aVar.f168665a);
            }
            return aVar.f168665a;
        }
        synchronized (aVar) {
            if (aVar.f168665a != null) {
                AppBrandLogger.m52830i("ContentCache", "getOrWait_Got2: " + fileName);
                eVar.f168680b = "memory_locked";
                if (HostDependManager.getInst().shouldInterceptRpx2Px(fileName)) {
                    aVar.f168665a = HostDependManager.getInst().interceptRpx2Px(aVar.f168665a);
                }
                return aVar.f168665a;
            } else if (this.f168662b != null) {
                aVar.f168665a = m260824b(tTAPkgFile);
                if (HostDependManager.getInst().shouldInterceptRpx2Px(fileName)) {
                    aVar.f168665a = HostDependManager.getInst().interceptRpx2Px(aVar.f168665a);
                }
                Object[] objArr = new Object[3];
                objArr[0] = "getOrWait_Got3: " + fileName;
                objArr[1] = "byte is null:";
                if (aVar.f168665a != null) {
                    z = false;
                }
                objArr[2] = Boolean.valueOf(z);
                AppBrandLogger.m52830i("ContentCache", objArr);
                eVar.f168680b = "disk_locked";
                return aVar.f168665a;
            } else {
                eVar.f168680b = "wait";
                while (aVar.f168665a == null) {
                    try {
                        aVar.wait(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (aVar.f168665a == null) {
                        eVar.f168681c = "timeout";
                        eVar.f168683e = this.f168661a;
                        TimeLogger.getInstance(this.f168664d).logError("ContentCache_getOrWait_timeout", String.valueOf(fileName));
                        eVar.mo232839a(this.f168664d);
                        OPMonitor resultTypeFail = new C67500a(C67746a.f170606G, this.f168664d).mo234325a(this.f168664d.getAppId()).setResultTypeFail();
                        resultTypeFail.setErrorMessage("GetOrWait time out->" + fileName).flush();
                    }
                }
                AppBrandLogger.m52830i("ContentCache", "getOrWait_Got4: " + fileName);
                return aVar.f168665a;
            }
        }
    }

    public C66865c(File file, int i, IAppContext iAppContext) {
        this.f168662b = file;
        this.f168664d = iAppContext;
    }
}
