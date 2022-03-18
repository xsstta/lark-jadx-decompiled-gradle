package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Handler;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.apm.ApmAgent;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.app.task.ScheduleUploadNetLogTask;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

public class ScheduleUploadNetLogTask extends AsyncLaunchTask {

    /* renamed from: a */
    public Handler f72644a = CoreThreadPool.getBackgroundHandler();

    /* renamed from: b */
    public ScheduledExecutorService f72645b = CoreThreadPool.getDefault().getSingleScheduledThreadPool("ScheduleUploadNetLogTask");

    /* renamed from: c */
    private int f72646c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface INTERVAL {
    }

    public static class NetworkLog implements Serializable {
        private static final long serialVersionUID = 5736494204477911203L;
        public long duration;
        public String extra;
        public String log_id;
        public String log_type;
        public int status;
        public long timestamp;
        public String uri;

        public String toString() {
            return JSONObject.toJSONString(this);
        }
    }

    /* access modifiers changed from: private */
    public class uploadNetLogRunnable implements Runnable {
        public void run() {
            ScheduleUploadNetLogTask.this.f72645b.execute(new Runnable() {
                /* class com.ss.android.lark.app.task.$$Lambda$ScheduleUploadNetLogTask$uploadNetLogRunnable$neXl0gImD9u2xfOnfo5Fq_1GoM */

                public final void run() {
                    ScheduleUploadNetLogTask.uploadNetLogRunnable.this.m106317a();
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m106317a() {
            ScheduleUploadNetLogTask.this.mo102761h();
            ScheduleUploadNetLogTask.this.f72644a.postDelayed(this, (long) ScheduleUploadNetLogTask.this.mo102760g());
        }

        private uploadNetLogRunnable() {
        }
    }

    /* renamed from: g */
    public int mo102760g() {
        if (this.f72646c == 0) {
            return 600000;
        }
        return 3600000;
    }

    public ScheduleUploadNetLogTask() {
    }

    /* renamed from: h */
    public void mo102761h() {
        Object obj;
        Log.m165389i("ScheduleUploadNetLogTask", "uploadNetLog start");
        byte[] _getTTNetRequestLogs = Sdk._getTTNetRequestLogs();
        StringBuilder sb = new StringBuilder();
        sb.append("uploadNetLog data:");
        if (_getTTNetRequestLogs != null) {
            obj = Integer.valueOf(_getTTNetRequestLogs.length);
        } else {
            obj = "null";
        }
        sb.append(obj);
        Log.m165389i("ScheduleUploadNetLogTask", sb.toString());
        while (_getTTNetRequestLogs != null && _getTTNetRequestLogs.length > 0) {
            String str = new String(_getTTNetRequestLogs, StandardCharsets.UTF_8);
            if (!str.startsWith("[")) {
                str = "[" + str + "]";
            }
            JSONArray parseArray = JSONArray.parseArray(str);
            ArrayList arrayList = new ArrayList(parseArray.size());
            for (int i = 0; i < parseArray.size(); i++) {
                JSONObject jSONObject = (JSONObject) parseArray.get(i);
                NetworkLog networkLog = (NetworkLog) jSONObject.toJavaObject(NetworkLog.class);
                if (networkLog != null) {
                    networkLog.extra = jSONObject.toJSONString();
                    arrayList.add(networkLog);
                }
            }
            m106313a(arrayList);
            _getTTNetRequestLogs = Sdk._getTTNetRequestLogs();
        }
    }

    public ScheduleUploadNetLogTask(int i) {
        this.f72646c = i;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Log.m165389i("ScheduleUploadNetLogTask", "ScheduleUploadNetLogTask start");
        if (C26284k.m95185a(context)) {
            Log.m165383e("ScheduleUploadNetLogTask", "not upload in debug mode");
        } else {
            this.f72644a.postDelayed(new uploadNetLogRunnable(), 600000);
        }
    }

    /* renamed from: a */
    private void m106313a(List<NetworkLog> list) {
        Log.m165379d("ScheduleUploadNetLogTask", "reportToSlardar:" + list.size());
        try {
            for (NetworkLog networkLog : list) {
                Log.m165379d("ScheduleUploadNetLogTask", "log:" + networkLog.log_type);
                ApmAgent.monitorCommonLog(networkLog.log_type, new org.json.JSONObject(networkLog.extra));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
