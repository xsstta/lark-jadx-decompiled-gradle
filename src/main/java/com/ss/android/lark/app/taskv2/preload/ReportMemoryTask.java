package com.ss.android.lark.app.taskv2.preload;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.app.taskv2.preload.ReportMemoryTask;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class ReportMemoryTask extends AsyncLaunchTask {

    /* renamed from: a */
    public Context f72820a;

    public class ReportMemoryRunnable implements Runnable {
        public void run() {
            CoreThreadPool.getDefault().getSingleScheduledThreadPool("ReportMemory").execute(new Runnable() {
                /* class com.ss.android.lark.app.taskv2.preload.$$Lambda$ReportMemoryTask$ReportMemoryRunnable$cJNODio7ApARuM9YisJwTw1sA8 */

                public final void run() {
                    ReportMemoryTask.ReportMemoryRunnable.m270265lambda$cJNODio7ApARuM9YisJwTw1sA8(ReportMemoryTask.ReportMemoryRunnable.this);
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m106864a() {
            ActivityManager activityManager;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
            try {
                Object systemService = ReportMemoryTask.this.f72820a.getSystemService("activity");
                if (!(systemService == null || (runningAppProcesses = (activityManager = (ActivityManager) systemService).getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
                    ArrayList<ProcMemory> arrayList = new ArrayList();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.processName.startsWith(ReportMemoryTask.this.f72820a.getPackageName())) {
                            arrayList.add(new ProcMemory(runningAppProcessInfo.pid, runningAppProcessInfo.processName));
                        }
                    }
                    if (arrayList.size() != 0) {
                        int[] iArr = new int[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            iArr[i] = ((ProcMemory) arrayList.get(i)).f72821a;
                        }
                        Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
                        if (arrayList.size() == processMemoryInfo.length) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                int i6 = processMemoryInfo[i5].dalvikPss;
                                ((ProcMemory) arrayList.get(i5)).f72823c = i6;
                                i2 += i6;
                                int i7 = processMemoryInfo[i5].nativePss;
                                ((ProcMemory) arrayList.get(i5)).f72824d = i7;
                                i3 += i7;
                                int totalPss = processMemoryInfo[i5].getTotalPss();
                                ((ProcMemory) arrayList.get(i5)).f72825e = totalPss;
                                i4 += totalPss;
                                ((ProcMemory) arrayList.get(i5)).f72826f = currentTimeMillis;
                            }
                            ProcMemory procMemory = new ProcMemory(-1, "app", i2, i3, i4);
                            procMemory.f72826f = currentTimeMillis;
                            arrayList.add(procMemory);
                            for (ProcMemory procMemory2 : arrayList) {
                                JSONObject a = procMemory2.mo103109a();
                                Log.m165389i("ReportMemoryTask", a.toString());
                                ApmAgent.monitorEvent("app_proc_memory", null, a, null);
                            }
                            CoreThreadPool.getDefault().getScheduleThreadPool().schedule(this, 60, TimeUnit.SECONDS);
                            return;
                        }
                    }
                }
                CoreThreadPool.getDefault().getScheduleThreadPool().schedule(this, 60, TimeUnit.SECONDS);
            } catch (Throwable th) {
                CoreThreadPool.getDefault().getScheduleThreadPool().schedule(this, 60, TimeUnit.SECONDS);
                throw th;
            }
        }

        private ReportMemoryRunnable() {
            ReportMemoryTask.this = r1;
        }
    }

    public static final class ProcMemory {

        /* renamed from: a */
        public int f72821a;

        /* renamed from: b */
        public String f72822b;

        /* renamed from: c */
        public int f72823c;

        /* renamed from: d */
        public int f72824d;

        /* renamed from: e */
        public int f72825e;

        /* renamed from: f */
        public long f72826f;

        /* renamed from: a */
        public JSONObject mo103109a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pid", this.f72821a);
            jSONObject.put("processName", this.f72822b);
            jSONObject.put("dalvikPss", this.f72823c);
            jSONObject.put("nativePss", this.f72824d);
            jSONObject.put("totalPss", this.f72825e);
            jSONObject.put("reportTime", this.f72826f);
            return jSONObject;
        }

        public ProcMemory(int i, String str) {
            this.f72821a = i;
            this.f72822b = str;
        }

        public ProcMemory(int i, String str, int i2, int i3, int i4) {
            this.f72821a = i;
            this.f72822b = str;
            this.f72823c = i2;
            this.f72824d = i3;
            this.f72825e = i4;
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        this.f72820a = context;
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new ReportMemoryRunnable(), 60, TimeUnit.SECONDS);
    }
}
