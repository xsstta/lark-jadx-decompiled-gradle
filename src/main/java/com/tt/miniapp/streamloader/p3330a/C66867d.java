package com.tt.miniapp.streamloader.p3330a;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.p3417c.C67746a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.tt.miniapp.streamloader.a.d */
public class C66867d {

    /* renamed from: a */
    public C66865c f168667a;

    /* renamed from: b */
    private File f168668b;

    /* renamed from: c */
    private final C66874g f168669c;

    /* renamed from: d */
    private C66870f f168670d = new C66870f();

    /* renamed from: e */
    private TTAPkgInfo f168671e;

    /* renamed from: f */
    private volatile boolean f168672f;

    /* renamed from: g */
    private HandlerThread f168673g;

    /* renamed from: h */
    private Handler f168674h;

    /* renamed from: i */
    private IAppContext f168675i;

    /* renamed from: a */
    public static HandlerThread m260828a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: b */
    private Handler m260829b() {
        if (this.f168674h == null) {
            this.f168674h = new Handler(this.f168673g.getLooper());
        }
        return this.f168674h;
    }

    /* renamed from: a */
    public void mo232831a() {
        this.f168672f = true;
        this.f168667a.mo232827a();
        this.f168669c.mo232853a();
        this.f168670d.mo232844b();
        HandlerThread handlerThread = this.f168673g;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.f168673g.quitSafely();
        }
        AppBrandLogger.m52830i("tma_DataCenter", "DataCenter is released");
    }

    /* renamed from: a */
    public void mo232834a(TTAPkgInfo tTAPkgInfo) {
        if (!this.f168672f) {
            this.f168671e = tTAPkgInfo;
        }
    }

    /* renamed from: b */
    public InputStream mo232836b(TTAPkgFile tTAPkgFile) {
        try {
            if (this.f168668b != null) {
                byte[] a = mo232835a(tTAPkgFile);
                if (a != null) {
                    return new ByteArrayInputStream(a);
                }
                AppBrandLogger.m52829e("tma_DataCenter", "getOrWait back is null fileName:" + tTAPkgFile.getFileName());
                OPMonitor resultTypeFail = new C67500a(C67746a.f170610K, this.f168675i).mo234325a(this.f168675i.getAppId()).setResultTypeFail();
                resultTypeFail.setErrorMessage("input stream is null from file->" + tTAPkgFile.getFileName()).flush();
                return null;
            }
            InputStream a2 = this.f168670d.mo232842a(tTAPkgFile);
            if (a2 != null) {
                return a2;
            }
            byte[] a3 = mo232835a(tTAPkgFile);
            if (a3 != null) {
                return new ByteArrayInputStream(a3);
            }
            AppBrandLogger.m52829e("tma_DataCenter", "inputStream is null; getOrWait back is null fileName: " + tTAPkgFile.getFileName());
            OPMonitor resultTypeFail2 = new C67500a(C67746a.f170610K, this.f168675i).mo234325a(this.f168675i.getAppId()).setResultTypeFail();
            resultTypeFail2.setErrorMessage("input stream is null->" + tTAPkgFile.getFileName()).flush();
            return a2;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_DataCenter", "getStream error:", e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: a */
    public byte[] mo232835a(TTAPkgFile tTAPkgFile) {
        String fileName = tTAPkgFile.getFileName();
        if (this.f168671e == null) {
            AppBrandLogger.m52829e("tma_DataCenter", "mTTAPkgInfo is null");
        } else if (!TextUtils.isEmpty(fileName)) {
            return this.f168667a.mo232829a(tTAPkgFile);
        } else {
            AppBrandLogger.m52829e("tma_DataCenter", "filename is empty!");
        }
        AppBrandLogger.m52829e("tma_DataCenter", "result is null fileName is:" + fileName);
        return null;
    }

    /* renamed from: a */
    public String mo232830a(String str, byte[] bArr) {
        return this.f168669c.mo232852a(str, bArr);
    }

    /* renamed from: b */
    public void mo232837b(TTAPkgFile tTAPkgFile, byte[] bArr) {
        this.f168670d.mo232841a(tTAPkgFile, bArr);
    }

    /* renamed from: a */
    public void mo232832a(final TTAPkgFile tTAPkgFile, final byte[] bArr) {
        if (!this.f168672f) {
            this.f168670d.mo232845b(tTAPkgFile);
            m260829b().post(new Runnable() {
                /* class com.tt.miniapp.streamloader.p3330a.C66867d.RunnableC668681 */

                public void run() {
                    String fileName = tTAPkgFile.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        C66867d.this.f168667a.mo232828a(fileName, bArr);
                    }
                }
            });
        }
    }

    public C66867d(File file, int i, IAppContext iAppContext) {
        if (file == null || !file.exists()) {
            this.f168667a = new C66865c(this.f168668b, Integer.MAX_VALUE, iAppContext);
        } else {
            this.f168668b = file;
            this.f168667a = new C66865c(file, i, iAppContext);
        }
        this.f168669c = new C66874g();
        HandlerThread a = m260828a("DataCenter");
        this.f168673g = a;
        a.start();
        this.f168675i = iAppContext;
    }

    /* renamed from: a */
    public void mo232833a(TTAPkgFile tTAPkgFile, byte[] bArr, int i, int i2) {
        this.f168670d.mo232843a(tTAPkgFile, bArr, i, i2);
    }
}
