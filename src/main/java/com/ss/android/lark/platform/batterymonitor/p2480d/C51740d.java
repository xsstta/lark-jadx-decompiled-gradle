package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.diskmanage.clean.DiskCleanUtils;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.d */
public class C51740d {

    /* renamed from: d */
    private static String f128641d = "DocsTaskLaunchStrategy";

    /* renamed from: a */
    private long f128642a;

    /* renamed from: b */
    private long f128643b = 1200000;

    /* renamed from: c */
    private long f128644c = 1073741824;

    /* renamed from: e */
    private Context f128645e;

    /* renamed from: a */
    private void m200617a() {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.p2480d.$$Lambda$d$jAAiuI3nnuhWdO2wkCftPpXv3Sw */

            public final void run() {
                C51740d.this.m200620c();
            }
        }, 30, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m200620c() {
        Log.m165389i(f128641d, "begin execute docs clean task on condition backgroud + plugin");
        if (C37239a.m146648b().mo136952a("spacekit.mobile.space.clean.webview", false)) {
            m200619b();
        }
    }

    /* renamed from: b */
    private void m200619b() {
        Log.m165389i(f128641d, "cleanWebView start");
        File[] listFiles = this.f128645e.getFilesDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isDirectory()) {
                    String name = file.getName();
                    if (name.startsWith("app_webview") && name.endsWith(":p0")) {
                        m200618a(new File(file, "Default/IndexedDB"));
                        m200618a(new File(file, "IndexedDB"));
                        m200618a(new File(file, "data/IndexedDB"));
                    }
                }
            }
        }
    }

    public C51740d(Context context) {
        this.f128645e = context;
    }

    /* renamed from: a */
    private void m200618a(File file) {
        if (file.isDirectory() && file.exists() && DiskCleanUtils.f94602a.mo135606b(file) > this.f128644c) {
            String str = f128641d;
            Log.m165389i(str, "cleanWebView delete = " + file);
            DiskCleanUtils.f94602a.mo135605a(file);
        }
    }

    /* renamed from: a */
    public void mo177857a(ConditionState conditionState) {
        if (!conditionState.mo177804e() && conditionState.mo177805f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f128642a >= this.f128643b) {
                this.f128642a = currentTimeMillis;
                m200617a();
            }
        }
    }
}
