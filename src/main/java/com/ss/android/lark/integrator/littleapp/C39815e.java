package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25534a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.LocationClientConfig;
import com.ss.android.lark.location.listener.AbstractC41583b;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.tt.miniapp.settings.v2.handler.C66755a;
import com.tt.miniapphost.process.C67556a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.littleapp.e */
public class C39815e {

    /* renamed from: a */
    public int f101410a = 2004;

    /* renamed from: b */
    public String f101411b = "location timeout";

    /* renamed from: c */
    private HandlerThread f101412c;

    /* renamed from: d */
    private Handler f101413d;

    /* renamed from: e */
    private AbstractC41583b f101414e;

    /* renamed from: f */
    private LarkLocation f101415f;

    /* renamed from: g */
    private LarkLocation f101416g;

    /* renamed from: h */
    private long f101417h;

    /* renamed from: i */
    private ArrayList<Location> f101418i;

    /* renamed from: j */
    private ArrayList<C39814d> f101419j = new ArrayList<>();

    /* renamed from: k */
    private AbstractC41584c f101420k = null;

    /* renamed from: l */
    private boolean f101421l = false;

    /* renamed from: m */
    private long f101422m;

    /* renamed from: n */
    private boolean f101423n = false;

    /* renamed from: o */
    private boolean f101424o;

    /* renamed from: p */
    private boolean f101425p;

    /* renamed from: q */
    private boolean f101426q;

    /* renamed from: r */
    private boolean f101427r;

    /* renamed from: s */
    private boolean f101428s;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.littleapp.e$a */
    public static class C39816a {

        /* renamed from: a */
        public static C39815e f101429a = new C39815e();
    }

    /* renamed from: a */
    public static HandlerThread m158059a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static C39815e m158060a() {
        return C39816a.f101429a;
    }

    /* renamed from: a */
    public synchronized void mo144315a(Context context, String str, float f, long j, String str2, long j2, AbstractC41371j.AbstractC41380i iVar) {
        long j3 = j;
        synchronized (this) {
            AppBrandLogger.m52830i("GetLocation", "getContinueLocation start");
            this.f101428s = !C57765ac.m224187a(context);
            LocationRequestOption a = C39817f.m158078a(str, str2);
            if (this.f101421l || this.f101416g == null || System.currentTimeMillis() - this.f101417h >= j2) {
                m158064a(context);
                if (!this.f101421l) {
                    Log.m165389i("GetLocation", "start location: " + j3);
                    this.f101422m = System.currentTimeMillis();
                    if (!this.f101414e.mo149528a(this.f101420k, 1000, a)) {
                        Log.m165383e("GetLocation", "lark permission deny or google service not available");
                        iVar.mo143000a("location not available", 2003);
                        return;
                    }
                    this.f101421l = true;
                    m158074c();
                    Log.m165389i("GetLocation", "request Location done");
                    mo144316a("location_start", (LarkLocation) null, false);
                }
                if (j3 <= 0) {
                    j3 = 5000;
                }
                this.f101413d.sendEmptyMessageDelayed(1, j3);
                C39814d dVar = new C39814d(iVar, a, f <= BitmapDescriptorFactory.HUE_RED ? 100.0f : f, j2);
                Log.m165389i("GetLocation", "add task: " + j3);
                m158065a(dVar);
                return;
            }
            Log.m165389i("GetLocation", "get location from cache: locationtime:" + this.f101417h + "cachetimeout:" + j2);
            this.f101416g.setProvider("cache");
            ArrayList<Location> a2 = m158062a(this.f101418i, this.f101416g, a);
            String a3 = C39817f.m158079a(this.f101416g);
            LarkLocation larkLocation = this.f101416g;
            iVar.mo143001a(a2, larkLocation, a3, larkLocation.mo149621h());
            LarkLocation larkLocation2 = this.f101416g;
            iVar.mo142999a(larkLocation2, a3, larkLocation2.mo149621h());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m158069a(Message message) {
        if (message.what != 1) {
            return false;
        }
        m158068a(true);
        Log.m165383e("GetLocation", "location timeout stop:" + (System.currentTimeMillis() - this.f101422m));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo144316a(String str, LarkLocation larkLocation, boolean z) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1473767726:
                if (str.equals("first_timeout")) {
                    c = 0;
                    break;
                }
                break;
            case -1469297008:
                if (str.equals("first_received")) {
                    c = 1;
                    break;
                }
                break;
            case -832797452:
                if (str.equals("first_callback")) {
                    c = 2;
                    break;
                }
                break;
            case 139160408:
                if (str.equals("location_start")) {
                    c = 3;
                    break;
                }
                break;
            case 1487864918:
                if (str.equals("first_accepted")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (this.f101427r) {
                    m158073b(str, larkLocation, z);
                    this.f101427r = false;
                    return;
                }
                return;
            case 1:
                if (this.f101424o) {
                    m158073b(str, larkLocation, z);
                    this.f101424o = false;
                    return;
                }
                return;
            case 2:
                if (this.f101426q) {
                    m158073b(str, larkLocation, z);
                    this.f101426q = false;
                    return;
                }
                return;
            case 3:
                m158073b(str, larkLocation, z);
                return;
            case 4:
                if (this.f101425p) {
                    m158073b(str, larkLocation, z);
                    this.f101425p = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private synchronized boolean m158070a(LarkLocation larkLocation) {
        ArrayList<C39814d> arrayList = this.f101419j;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                boolean z = false;
                Log.m165389i("GetLocation", "mLocationTaskList size:" + this.f101419j.size());
                Iterator<C39814d> it = this.f101419j.iterator();
                while (it.hasNext()) {
                    if (it.next().mo144314a(larkLocation)) {
                        z = true;
                    }
                }
                return z;
            }
        }
        Log.m165389i("GetLocation", "notifyLocationTaskUpdate but mLocationTaskList is empty");
        return true;
    }

    /* renamed from: c */
    private void m158074c() {
        this.f101425p = true;
        this.f101424o = true;
        this.f101426q = true;
        this.f101427r = true;
    }

    /* renamed from: b */
    private int m158071b() {
        String b = C25534a.m91180a().mo88676b();
        AppBrandLogger.m52830i("GetLocation", "get Location downGrade config str:" + b);
        if (!TextUtils.isEmpty(b)) {
            try {
                return new JSONObject(b).getInt("locationUseSDKType");
            } catch (JSONException e) {
                AppBrandLogger.m52829e("GetLocation", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private AbstractC41584c m158061a(long j) {
        AbstractC41584c cVar = this.f101420k;
        if (cVar != null) {
            return cVar;
        }
        $$Lambda$e$Lvj54x1TwpvS2nlftPrjgvMA r0 = new AbstractC41584c(j) {
            /* class com.ss.android.lark.integrator.littleapp.$$Lambda$e$Lvj54x1TwpvS2nlftPrjgvMA */
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.location.listener.AbstractC41584c
            public final void onLocationChange(LarkLocation larkLocation, List list) {
                C39815e.this.m158063a((C39815e) this.f$1, (long) larkLocation, (LarkLocation) list);
            }
        };
        this.f101420k = r0;
        return r0;
    }

    /* renamed from: b */
    private void m158072b(LarkLocation larkLocation) {
        Log.m165389i("GetLocation", "update backup location");
        if (this.f101415f == null) {
            this.f101415f = larkLocation;
        } else if (larkLocation.getTime() > this.f101415f.getTime()) {
            this.f101415f = larkLocation;
        }
    }

    /* renamed from: a */
    private synchronized void m158065a(C39814d dVar) {
        this.f101419j.add(dVar);
        AppBrandLogger.m52830i("GetLocation", "task list size:" + this.f101419j.size());
    }

    /* renamed from: a */
    private void m158064a(Context context) {
        if (this.f101423n) {
            Log.m165389i("GetLocation", "inited:true");
            return;
        }
        long j = 300;
        String b = C66755a.m260582a().mo232661b();
        if (!TextUtils.isEmpty(b)) {
            try {
                j = (long) new JSONObject(b).optInt("maxLocationCacheTime", LocationRequest.PRIORITY_INDOOR);
                Log.m165389i("GetLocation", "config:" + b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        long j2 = j * 1000;
        if (this.f101414e == null) {
            LocationClientConfig locationClientConfig = new LocationClientConfig();
            boolean z = false;
            AppBrandLogger.m52830i("GetLocation", "location use location manager");
            if (m158071b() == 1) {
                z = true;
            }
            locationClientConfig.mo149627a(z);
            this.f101414e = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocationClient(context, locationClientConfig);
        }
        if (this.f101412c == null) {
            HandlerThread a = m158059a("location");
            this.f101412c = a;
            a.start();
        }
        if (this.f101420k == null) {
            this.f101420k = m158061a(j2);
        }
        if (this.f101413d == null) {
            this.f101413d = new Handler(this.f101412c.getLooper(), new Handler.Callback() {
                /* class com.ss.android.lark.integrator.littleapp.$$Lambda$e$LiWKS8On8AHlUzkFtKNGOq5ooQ */

                public final boolean handleMessage(Message message) {
                    return C39815e.this.m158069a(message);
                }
            });
        }
        this.f101423n = true;
    }

    /* renamed from: a */
    private void m158068a(boolean z) {
        boolean z2;
        boolean z3;
        Log.m165389i("GetLocation", " stop location start timeout:" + z);
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("stop location mRecentLocation is null ? ");
            if (this.f101416g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            Log.m165389i("GetLocation", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("stop location mBackupLocation is null ? ");
            if (this.f101415f == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            sb2.append(z3);
            Log.m165389i("GetLocation", sb2.toString());
        }
        synchronized (this) {
            this.f101413d.removeMessages(1);
            Iterator<C39814d> it = this.f101419j.iterator();
            while (it.hasNext()) {
                C39814d next = it.next();
                if (!next.f101406c) {
                    if (next.f101404a == null) {
                        if (this.f101416g == null || System.currentTimeMillis() - this.f101417h > next.f101405b) {
                            LarkLocation larkLocation = this.f101415f;
                            if (larkLocation != null) {
                                next.f101404a = larkLocation;
                                Log.m165389i("GetLocation", " stop location use mBackupLocation: " + this.f101417h);
                            }
                        } else {
                            next.f101404a = this.f101416g;
                            Log.m165389i("GetLocation", " stop location use mRecentLocation: " + this.f101417h);
                        }
                    }
                    next.mo144313a(z);
                }
            }
            this.f101419j.clear();
            this.f101421l = false;
            this.f101415f = null;
            this.f101411b = "location timeout";
            this.f101410a = 2004;
        }
        this.f101414e.mo149532b(this.f101420k);
    }

    /* renamed from: a */
    private void m158066a(LarkLocation larkLocation, ArrayList<Location> arrayList) {
        this.f101417h = System.currentTimeMillis();
        if (this.f101416g == null) {
            this.f101416g = larkLocation;
            this.f101418i = arrayList;
            Log.m165389i("GetLocation", "update null manager location " + this.f101417h);
        } else if (System.currentTimeMillis() - this.f101417h > 5000) {
            this.f101416g = larkLocation;
            this.f101418i = arrayList;
            Log.m165389i("GetLocation", "update 5s manager location " + this.f101417h);
        } else if (larkLocation.getAccuracy() <= this.f101416g.getAccuracy() || larkLocation.distanceTo(this.f101416g) >= this.f101416g.getAccuracy()) {
            this.f101416g = larkLocation;
            this.f101418i = arrayList;
            Log.m165389i("GetLocation", "update manager location");
        } else {
            Log.m165389i("GetLocation", "do not need update manager location");
        }
    }

    /* renamed from: a */
    private synchronized void m158067a(LarkLocation larkLocation, List<Location> list) {
        ArrayList<C39814d> arrayList = this.f101419j;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                Iterator<C39814d> it = this.f101419j.iterator();
                while (it.hasNext()) {
                    it.next().mo144312a(larkLocation, list);
                }
            }
        }
    }

    /* renamed from: a */
    private ArrayList<Location> m158062a(ArrayList<Location> arrayList, LarkLocation larkLocation, LocationRequestOption locationRequestOption) {
        C41586e.m165036a(larkLocation, locationRequestOption);
        ArrayList<Location> arrayList2 = new ArrayList<>();
        if (arrayList == null || arrayList.size() <= 0) {
            arrayList2.add(larkLocation);
        } else {
            Iterator<Location> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C39817f.m158077a(it.next(), locationRequestOption));
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    private void m158073b(String str, LarkLocation larkLocation, boolean z) {
        if (this.f101428s) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.f101422m);
                jSONObject.put("result_type", str);
                jSONObject.put("api_time", System.currentTimeMillis());
                jSONObject.put("isTimeout", z);
                if (larkLocation != null) {
                    jSONObject.put("location_time", larkLocation.getTime());
                    jSONObject.put("accuracy", (double) larkLocation.getAccuracy());
                    jSONObject.put("provider", larkLocation.getProvider());
                    jSONObject.put("location_type", larkLocation.mo149621h());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C67556a.m262937a("mp_location_sdk", jSONObject, 6);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m158063a(long j, LarkLocation larkLocation, List list) {
        if (larkLocation == null) {
            Log.m165389i("GetLocation", "onLocationChange location is null");
        } else if (larkLocation.mo149620g() != 0) {
            Log.m165389i("GetLocation", "mLocationCallback location error != 0 errorCode=" + larkLocation.mo149620g() + "errorMsg:" + larkLocation.mo149622i());
            this.f101410a = larkLocation.mo149620g();
            this.f101411b = larkLocation.mo149622i();
        } else if (larkLocation.getLatitude() == 0.0d && larkLocation.getLongitude() == 0.0d) {
            Log.m165383e("GetLocation", "errorcode:" + larkLocation.mo149620g() + "::location:0,0");
            this.f101410a = 2005;
            this.f101411b = "location is null";
        } else {
            Log.m165389i("GetLocation", "location result:\n" + larkLocation.toString() + "\ntime: " + larkLocation.getTime() + "\nspeed:" + larkLocation.getSpeed() + "\nElapsedRealtime:" + larkLocation.getElapsedRealtimeNanos());
            m158067a(larkLocation, list);
            m158072b(larkLocation);
            mo144316a("first_received", larkLocation, false);
            if (System.currentTimeMillis() - larkLocation.getTime() > j) {
                Log.m165389i("GetLocation", "location result timeout:\n" + larkLocation.toString() + "\ntime: " + larkLocation.getTime() + "\nspeed:" + larkLocation.getSpeed() + "\nElapsedRealtime:" + larkLocation.getElapsedRealtimeNanos());
                return;
            }
            Log.m165389i("GetLocation", "location return:" + larkLocation.getAccuracy());
            m158066a(larkLocation, (ArrayList) list);
            mo144316a("first_accepted", larkLocation, false);
            if (m158070a(larkLocation)) {
                m158068a(false);
            }
        }
    }
}
