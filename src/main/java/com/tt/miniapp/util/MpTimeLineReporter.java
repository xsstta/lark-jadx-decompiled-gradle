package com.tt.miniapp.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.LifeCycleManager;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.manager.AppbrandBroadcastService;
import com.tt.miniapphost.AppbrandContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MpTimeLineReporter extends AppbrandServiceManager.ServiceBase implements Handler.Callback {
    private final int WHAT_ADD_POINT = 20;
    private final int WHAT_COLLECT_FLUSH = 21;
    private boolean isStarted;
    private AtomicInteger mGroupIndex = new AtomicInteger(0);
    private volatile Handler mH;
    private HandlerThread mHt;
    private int mPointCount = 0;
    private final String mUniqueId = AppbrandContext.getInst().getUniqueId();
    private ArrayList<C67016b> pointList = new ArrayList<>();

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_SHOW})
    public void onAppShow() {
        addPoint("enter_foreground");
    }

    /* renamed from: com.tt.miniapp.util.MpTimeLineReporter$a */
    public static class C67015a {

        /* renamed from: a */
        Map<String, Object> f168978a = new HashMap();

        /* renamed from: a */
        public JSONObject mo233115a() {
            return new JSONObject(this.f168978a);
        }

        /* renamed from: a */
        public C67015a mo233114a(String str, Object obj) {
            this.f168978a.put(str, obj);
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.util.MpTimeLineReporter$b */
    public static class C67016b {

        /* renamed from: a */
        public boolean f168979a;

        /* renamed from: b */
        private String f168980b;

        /* renamed from: c */
        private long f168981c;

        /* renamed from: d */
        private long f168982d;

        /* renamed from: e */
        private JSONObject f168983e;

        public String toString() {
            return mo233116a().toString();
        }

        /* renamed from: a */
        public JSONObject mo233116a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.f168980b);
                jSONObject.put("timestamp", this.f168981c);
                if (this.f168979a) {
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<String> keys = this.f168983e.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, this.f168983e.opt(next));
                    }
                    jSONObject2.put("cpu_time", this.f168982d);
                    jSONObject.put("extra", jSONObject2);
                } else {
                    jSONObject.put("extra", this.f168983e);
                }
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("MpTimeLineReporter", "", e);
            }
            return jSONObject;
        }

        public C67016b(String str, long j, long j2, JSONObject jSONObject, boolean z) {
            this.f168980b = str;
            this.f168981c = j;
            this.f168982d = j2;
            this.f168983e = jSONObject == null ? new JSONObject() : jSONObject;
            this.f168979a = z;
        }
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_HIDE})
    public void onAppHide() {
        addPoint("enter_background");
        this.mH.sendEmptyMessage(21);
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_CREATE})
    public void onAppCreate() {
        C670141 r0 = new AppbrandBroadcastService.AbstractC66358b() {
            /* class com.tt.miniapp.util.MpTimeLineReporter.C670141 */

            @Override // com.tt.miniapp.manager.AppbrandBroadcastService.AbstractC66358b
            /* renamed from: a */
            public void mo231876a(int i, Context context, Intent intent) {
                if (i == 0) {
                    MpTimeLineReporter.this.addPoint("throw_exception_log", System.currentTimeMillis(), SystemClock.elapsedRealtime(), new C67015a().mo233114a("reason", 2).mo233115a());
                } else if (i == 1) {
                    MpTimeLineReporter.this.addPoint("throw_exception_log", System.currentTimeMillis(), SystemClock.elapsedRealtime(), new C67015a().mo233114a("reason", 1).mo233115a());
                }
            }
        };
        AppbrandBroadcastService appbrandBroadcastService = (AppbrandBroadcastService) this.mApp.getService(AppbrandBroadcastService.class);
        appbrandBroadcastService.registerReceiver(0, r0);
        appbrandBroadcastService.registerReceiver(1, r0);
    }

    private void start() {
        synchronized (this) {
            if (!this.isStarted) {
                HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("MpTimeLineReporter");
                this.mHt = new_android_os_HandlerThread_by_knot;
                new_android_os_HandlerThread_by_knot.start();
                this.mH = new Handler(this.mHt.getLooper(), this);
                this.isStarted = true;
            }
        }
    }

    public void sendPointsDirectly(String str) {
        report(str);
        this.mH.sendEmptyMessage(21);
    }

    private void addPoint(C67016b bVar) {
        if (!this.isStarted) {
            start();
        }
        this.mH.obtainMessage(20, bVar).sendToTarget();
    }

    private MpTimeLineReporter(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    private void report(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("points", str);
            jSONObject.put("unique_id", this.mUniqueId);
            jSONObject.put("index", this.mGroupIndex.getAndIncrement());
            jSONObject.put("cpu_time", SystemClock.elapsedRealtime());
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("MpTimeLineReporter", "", e);
        }
        LarkInnerEventHelper.mpLoadTimeline(jSONObject, this.mApp.getiAppContext());
    }

    public void addPoint(String str) {
        addPoint(new C67016b(str, System.currentTimeMillis(), SystemClock.elapsedRealtime(), null, false));
    }

    public boolean handleMessage(Message message) {
        if (message.what == 20) {
            C67016b bVar = (C67016b) message.obj;
            if (!bVar.f168979a) {
                int i = this.mPointCount + 1;
                this.mPointCount = i;
                if (i % 10 == 5) {
                    bVar.f168979a = true;
                }
            }
            this.pointList.add(bVar);
            if (this.pointList.size() >= 50) {
                this.mH.sendEmptyMessage(21);
            }
            return true;
        } else if (message.what != 21) {
            return false;
        } else {
            this.mH.removeMessages(21);
            if (this.pointList.isEmpty()) {
                return true;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<C67016b> it = this.pointList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo233116a());
            }
            report(jSONArray.toString());
            this.pointList.clear();
            return true;
        }
    }

    public void addPoint(String str, JSONObject jSONObject) {
        addPoint(new C67016b(str, System.currentTimeMillis(), SystemClock.elapsedRealtime(), jSONObject, false));
    }

    public void addPoint(String str, long j, long j2, JSONObject jSONObject) {
        addPoint(new C67016b(str, j, j2, jSONObject, true));
    }

    public void addPoint(String str, long j, long j2, JSONObject jSONObject, boolean z) {
        addPoint(new C67016b(str, j, j2, jSONObject, z));
    }
}
