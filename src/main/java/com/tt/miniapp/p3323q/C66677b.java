package com.tt.miniapp.p3323q;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.tt.miniapp.q.b */
public class C66677b extends AbstractC66676a {

    /* renamed from: c */
    private int f168325c = -1;

    /* renamed from: d */
    private int f168326d = -1;

    /* renamed from: e */
    private IAppContext f168327e;

    /* renamed from: c */
    private long m260424c() {
        String a = m260423a("/proc/stat");
        if (TextUtils.isEmpty(a)) {
            return -1;
        }
        try {
            String[] split = a.split(" ");
            int length = split.length;
            long j = 0;
            for (int i = 2; i < length; i++) {
                j += Long.parseLong(split[i]);
            }
            return j;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
            return -1;
        }
    }

    /* renamed from: d */
    private long m260425d() {
        int myPid = Process.myPid();
        String a = m260423a("/proc/" + myPid + "/stat");
        if (TextUtils.isEmpty(a)) {
            return -1;
        }
        try {
            String[] split = a.split(" ");
            int length = split.length;
            long j = 0;
            for (int i = 13; i <= 16; i++) {
                j += Long.parseLong(split[i]);
            }
            return j;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.p3323q.AbstractC66676a
    /* renamed from: b */
    public void mo232429b() {
        int round;
        if (!this.f168327e.isDestroyed() && !this.f168327e.isDestroying()) {
            if (Build.VERSION.SDK_INT < 26) {
                long c = m260424c();
                long d = m260425d();
                if (c > 0 && d > 0) {
                    try {
                        Thread.sleep(360);
                        long c2 = m260424c();
                        long d2 = m260425d();
                        if (c2 > 0 && d2 > 0 && (round = Math.round(((((float) (d2 - d)) * 1.0f) / ((float) (c2 - c))) * 100.0f)) > 0) {
                            if (this.f168327e.isDestroyed()) {
                                return;
                            }
                            if (!this.f168327e.isDestroying()) {
                                AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f168327e);
                                if (inst != null) {
                                    C66689h.m260452a(inst.getForeBackgroundManager().mo231961c(), round, this.f168327e);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (InterruptedException e) {
                        AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
                    } catch (Exception e2) {
                        AppBrandLogger.stacktrace(6, "CpuMonitorTask", e2.getStackTrace());
                    }
                }
            }
            int a = mo232430a(Process.myPid());
            if (a >= 0 && !this.f168327e.isDestroyed() && !this.f168327e.isDestroying()) {
                AppbrandApplicationImpl inst2 = AppbrandApplicationImpl.getInst(this.f168327e);
                if (inst2 != null) {
                    C66689h.m260459c(inst2.getForeBackgroundManager().mo231961c(), a, this.f168327e);
                }
                C66689h.m260448a(a, this.f168327e);
            }
        }
    }

    public C66677b(IAppContext iAppContext) {
        super(10000);
        this.f168327e = iAppContext;
    }

    /* renamed from: a */
    private String m260423a(String str) {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        Throwable th;
        Exception e;
        BufferedReader bufferedReader2;
        Throwable th2;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader3;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                inputStreamReader = null;
                bufferedReader2 = null;
                try {
                    AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
                    IOUtils.close(bufferedReader2);
                    IOUtils.close(inputStreamReader);
                    IOUtils.close(fileInputStream);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    IOUtils.close(bufferedReader);
                    IOUtils.close(inputStreamReader);
                    IOUtils.close(fileInputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader2 = null;
                th = th2;
                inputStreamReader = inputStreamReader2;
                bufferedReader = inputStreamReader2;
                IOUtils.close(bufferedReader);
                IOUtils.close(inputStreamReader);
                IOUtils.close(fileInputStream);
                throw th;
            }
            try {
                bufferedReader3 = new BufferedReader(inputStreamReader, 4096);
            } catch (Exception e3) {
                e = e3;
                bufferedReader2 = null;
                AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
                IOUtils.close(bufferedReader2);
                IOUtils.close(inputStreamReader);
                IOUtils.close(fileInputStream);
                return null;
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
                IOUtils.close(bufferedReader);
                IOUtils.close(inputStreamReader);
                IOUtils.close(fileInputStream);
                throw th;
            }
            try {
                String readLine = bufferedReader3.readLine();
                IOUtils.close(bufferedReader3);
                IOUtils.close(inputStreamReader);
                IOUtils.close(fileInputStream);
                return readLine;
            } catch (Exception e4) {
                e = e4;
                bufferedReader2 = bufferedReader3;
                AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
                IOUtils.close(bufferedReader2);
                IOUtils.close(inputStreamReader);
                IOUtils.close(fileInputStream);
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader2 = null;
            AppBrandLogger.stacktrace(6, "CpuMonitorTask", e.getStackTrace());
            IOUtils.close(bufferedReader2);
            IOUtils.close(inputStreamReader);
            IOUtils.close(fileInputStream);
            return null;
        } catch (Throwable th6) {
            th2 = th6;
            fileInputStream = null;
            inputStreamReader2 = null;
            th = th2;
            inputStreamReader = inputStreamReader2;
            bufferedReader = inputStreamReader2;
            IOUtils.close(bufferedReader);
            IOUtils.close(inputStreamReader);
            IOUtils.close(fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public int mo232430a(int i) {
        int i2;
        int i3 = -1;
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"sh", "-c", "top -n 1"}).getInputStream()));
            while (true) {
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                } else if (str.equalsIgnoreCase("quit")) {
                    break;
                } else {
                    AppBrandLogger.m52828d("CpuMonitorTask", str);
                    String[] split = str.replaceAll("\\[\\d[a-zA-Z]", "").trim().split(" +");
                    if (this.f168325c == -1 && this.f168326d == -1) {
                        for (int i4 = 0; i4 < split.length; i4++) {
                            String str2 = split[i4];
                            if (str2.contains("PID")) {
                                this.f168326d = i4;
                            }
                            if (str2.contains("CPU")) {
                                if (str2.substring(0, str2.indexOf("CPU")).contains("S")) {
                                    this.f168325c = i4 + 1;
                                } else {
                                    this.f168325c = i4;
                                }
                            }
                        }
                    } else {
                        int i5 = this.f168326d;
                        if (i5 < split.length && i5 >= 0 && split[i5].equals(String.valueOf(i)) && (i2 = this.f168325c) < split.length && i2 >= 0) {
                            try {
                                i3 = (int) Float.valueOf(split[i2].replaceAll("%", "")).floatValue();
                                break;
                            } catch (Exception e) {
                                AppBrandLogger.m52829e("CpuMonitorTask", "The cmd result is: " + str);
                                AppBrandLogger.eWithThrowable("CPU Motion", "Top shell response format exception:", e);
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "CpuMonitorTask", e2.getStackTrace());
        }
        if (i3 > 2000) {
            AppBrandLogger.m52829e("CpuMonitorTask", "The cmd result is: " + str);
        }
        AppBrandLogger.m52828d("CpuMonitorTask", "result: " + i3);
        return i3;
    }
}
