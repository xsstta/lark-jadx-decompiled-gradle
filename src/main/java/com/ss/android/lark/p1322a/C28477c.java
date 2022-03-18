package com.ss.android.lark.p1322a;

import android.content.Context;
import android.os.FileObserver;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.a.c */
public class C28477c {

    /* renamed from: a */
    public static FileObserverC28478a f71608a;

    /* renamed from: b */
    private static String f71609b;

    /* renamed from: c */
    private static volatile boolean f71610c;

    /* renamed from: a */
    public static boolean m104353a() {
        return f71610c;
    }

    /* renamed from: b */
    public static int m104354b() {
        long j;
        StringBuilder sb;
        long currentTimeMillis = System.currentTimeMillis();
        int i = -1;
        try {
            f71610c = true;
            Log.m165389i("BoostSpeedProfile", "start execOptCommand for: " + f71609b);
            C28476b.m104347d();
            i = m104350a("cmd package compile -m everything-profile -f " + f71609b);
            f71610c = false;
            j = System.currentTimeMillis() - currentTimeMillis;
            sb = new StringBuilder();
        } catch (IOException unused) {
            Log.m165397w("BoostSpeedProfile", "Fail execOptCommand");
            f71610c = false;
            j = System.currentTimeMillis() - currentTimeMillis;
            sb = new StringBuilder();
        } catch (Throwable th) {
            f71610c = false;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log.m165389i("BoostSpeedProfile", "  execOptCommand:  ret: " + -1 + "   duration:   " + currentTimeMillis2);
            m104351a(-1, currentTimeMillis2);
            throw th;
        }
        sb.append("  execOptCommand:  ret: ");
        sb.append(i);
        sb.append("   duration:   ");
        sb.append(j);
        Log.m165389i("BoostSpeedProfile", sb.toString());
        m104351a(i, j);
        return i;
    }

    /* renamed from: com.ss.android.lark.a.c$a */
    public static class FileObserverC28478a extends FileObserver {
        public FileObserverC28478a(String str) {
            super(str);
        }

        public void onEvent(int i, String str) {
            if (i == 2) {
                Log.m165389i("BoostSpeedProfile", "  FileObserver.MODIFY: ");
                if (C28477c.f71608a != null) {
                    C28477c.f71608a.stopWatching();
                    C28477c.f71608a = null;
                    C28477c.m104354b();
                }
            }
        }
    }

    /* renamed from: a */
    private static int m104350a(String str) {
        Process exec = Runtime.getRuntime().exec(str);
        try {
            exec.waitFor();
            return exec.exitValue();
        } catch (InterruptedException e) {
            Log.m165386e("BoostSpeedProfile", e);
            return -1;
        }
    }

    /* renamed from: a */
    public static void m104352a(Context context) {
        f71609b = context.getPackageName();
        String str = "/data/misc/profiles/cur/0/" + f71609b + "/primary.prof";
        Log.m165389i("BoostSpeedProfile", "  enableProfileOpt  path: " + str);
        FileObserverC28478a aVar = new FileObserverC28478a(str);
        f71608a = aVar;
        aVar.startWatching();
    }

    /* renamed from: a */
    private static void m104351a(int i, long j) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(i, j) {
            /* class com.ss.android.lark.p1322a.$$Lambda$c$8Ud0HCtVyAbsDNq_7qaYsZoxh5s */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ long f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C28477c.lambda$8Ud0HCtVyAbsDNq_7qaYsZoxh5s(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m104355b(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aot_ret", i);
            jSONObject.put("aot_is_release", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aot_duration", j);
            MonitorUtils.monitorEvent("aot_speed_profile", jSONObject, jSONObject2, new JSONObject());
        } catch (JSONException e) {
            Log.m165386e("BoostSpeedProfile", e);
        }
    }
}
