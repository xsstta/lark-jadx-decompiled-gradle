package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Process;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.ae.C51677a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PreloadModuleTask extends AsyncLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SpInitorTask.class);
        arrayList.add(ModuleDependencyInitorTask.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        int threadPriority = Process.getThreadPriority(Process.myTid());
        Process.setThreadPriority(-1);
        C51677a.m200443a().mo148569c().mo148556a();
        new BfdIssueTracker().mo102759a(context);
        Process.setThreadPriority(threadPriority);
    }

    public static class BfdIssueTracker {
        /* renamed from: a */
        public void mo102759a(Context context) {
            m106306a(context, new Date().getTime() + TimeUnit.HOURS.toMillis(10));
        }

        /* renamed from: a */
        private String m106305a(Context context, String str) {
            return context.getDir("webview", 0).getAbsolutePath().concat("/").concat(str);
        }

        /* renamed from: a */
        private void m106306a(Context context, long j) {
            try {
                File file = new File(m106305a(context, "variations_stamp"));
                if (!file.exists()) {
                    file.createNewFile();
                }
                long lastModified = file.lastModified();
                file.setLastModified(j);
                m106307b(context, lastModified);
            } catch (Exception unused) {
                Log.m165383e("BfdIssueTracker", "Failed to update StampTime");
            }
        }

        /* renamed from: b */
        private void m106307b(Context context, long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateStampTime last modified:");
            sb.append(j);
            String[] strArr = {"variations_seed_new", "variations_seed"};
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                File file = new File(m106305a(context, str));
                sb.append(" [");
                sb.append(str);
                sb.append("] exist:");
                if (file.exists()) {
                    sb.append(file.lastModified());
                } else {
                    sb.append(false);
                }
            }
            Log.m165389i("BfdIssueTracker", sb.toString());
        }
    }
}
