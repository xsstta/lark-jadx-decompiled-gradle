package com.ss.android.lark.utils.statistics;

import android.os.SystemClock;
import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

public class BasePerfMonitor {

    /* renamed from: b */
    public static long f142499b = SystemClock.elapsedRealtime();

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlatformType {
    }

    /* renamed from: com.ss.android.lark.utils.statistics.BasePerfMonitor$a */
    public interface AbstractC57879a {
        /* renamed from: a */
        String mo142416a(int i);

        /* renamed from: a */
        void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

        boolean aG_();

        /* renamed from: b */
        boolean mo142426b(int i);
    }

    /* renamed from: com.ss.android.lark.utils.statistics.BasePerfMonitor$b */
    public static abstract class AbstractC57880b implements AbstractC57879a {

        /* renamed from: m */
        protected long f142500m;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return i == 2;
        }

        public void aF_() {
            this.f142500m = SystemClock.elapsedRealtime();
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        public boolean aG_() {
            if (this.f142500m > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo187680c() {
            this.f142500m = SystemClock.elapsedRealtime() - this.f142500m;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            try {
                jSONObject.put("time", this.f142500m);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m224592a(AbstractC57879a aVar) {
        JSONObject jSONObject = new JSONObject();
        aVar.mo142423a(jSONObject, jSONObject, jSONObject);
        Statistics.sendEvent(aVar.mo142416a(2), jSONObject);
        Log.m165379d("CommonPerfMonitor", "start reportToTea");
    }

    /* renamed from: b */
    public static void m224593b(AbstractC57879a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.utils.statistics.$$Lambda$BasePerfMonitor$VB6A8zih2EKN4Mz6MTgKYLw93I */

            public final void run() {
                BasePerfMonitor.m224594c(BasePerfMonitor.AbstractC57879a.this);
            }
        });
        Log.m165379d("CommonPerfMonitor", "start reportToSlardar");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m224594c(AbstractC57879a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        aVar.mo142423a(jSONObject, jSONObject2, jSONObject3);
        ApmAgent.monitorEvent(aVar.mo142416a(1), jSONObject2, jSONObject, jSONObject3);
    }
}
