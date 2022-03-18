package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.p3335u.C66998c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.util.C67029c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getLocation"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.c */
public class C25207c extends AbstractC65797c {

    /* renamed from: a */
    public float f61545a;

    /* renamed from: b */
    public long f61546b;

    /* renamed from: c */
    public long f61547c;

    /* renamed from: d */
    private String f61548d;

    /* renamed from: e */
    private String f61549e;

    /* renamed from: f */
    private String f61550f;

    /* renamed from: g */
    private long f61551g;

    public C25207c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getLocation");
    }

    /* renamed from: c */
    private void m90607c() {
        final Activity f = mo230475h().mo235051f();
        mo230475h().mo235021a(f, mo230472e(), C66578b.C66579a.m260113b(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25207c.C252081 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                AppBrandLogger.m52830i("GetLocationAsyncHandler", "location permission is granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C25207c.this.mo230475h().mo235022a(f, C25207c.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25207c.C252081.C252091 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        AppBrandLogger.m52830i("GetLocationAsyncHandler", "system permission is granted. cost time:", Long.valueOf(System.currentTimeMillis() - C25207c.this.f61547c));
                        C25207c.this.mo88320b();
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52829e("GetLocationAsyncHandler", "system permission is denied");
                        C25207c.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                AppBrandLogger.m52829e("GetLocationAsyncHandler", "location permission is denied");
                C25207c.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    /* renamed from: b */
    public void mo88320b() {
        String str = "wgs84";
        if (TextUtils.isEmpty(this.f61548d) || this.f61548d.equals("gcj02") || this.f61548d.equals(str)) {
            C66998c.m261128a(mo230473f()).mo233045a(12);
            final long currentTimeMillis = System.currentTimeMillis();
            AppBrandLogger.m52830i("GetLocationAsyncHandler", "start call lark location api: ", Long.valueOf(System.currentTimeMillis() - this.f61547c));
            if (!TextUtils.isEmpty(this.f61548d)) {
                str = this.f61548d;
            }
            this.f61548d = str;
            ((AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class)).mo50443a(mo230475h().mo235051f(), this.f61548d, this.f61545a, this.f61546b, this.f61550f, this.f61551g, new AbstractC67724a.AbstractC67726b() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25207c.C252102 */

                /* renamed from: a */
                int f61555a;

                /* renamed from: b */
                ArrayList<C25225h> f61556b = new ArrayList<>();

                @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67726b
                /* renamed from: a */
                public void mo88297a(String str, int i) {
                    C66998c.m261128a(C25207c.this.mo230473f()).mo233047b(12);
                    AppBrandLogger.m52829e("GetLocationAsyncHandler", "get location from lark fail:", str, Integer.valueOf(i));
                    if (C25207c.this.mo230473f().isDestroyed()) {
                        AppBrandLogger.m52829e("GetLocationAsyncHandler", "get location from lark fail and app context is destroyed:", str, Integer.valueOf(i));
                        return;
                    }
                    C25207c.this.mo88318a(i, str, this.f61555a, currentTimeMillis);
                }

                @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67726b
                /* renamed from: a */
                public void mo88296a(Location location, String str, int i) {
                    C66998c.m261128a(C25207c.this.mo230473f()).mo233047b(12);
                    if (C25207c.this.mo230473f().isDestroyed()) {
                        AppBrandLogger.m52829e("GetLocationAsyncHandler", "get location from lark success and app context is destroyed");
                        AppBrandLogger.m52830i("GetLocationAsyncHandler", "get location from lark success: la:", Double.valueOf(location.getLatitude()), "l", Double.valueOf(location.getLongitude()), AbstractC60044a.f149675a, Float.valueOf(location.getAccuracy()), "type:", str, "located time:", Long.valueOf(System.currentTimeMillis() - C25207c.this.f61547c));
                    } else if (location == null) {
                        C25207c.this.mo88318a(2001, "location is null", this.f61555a, currentTimeMillis);
                    } else {
                        AppBrandLogger.m52830i("GetLocationAsyncHandler", "get location from lark success: la:", Double.valueOf(location.getLatitude()), "l", Double.valueOf(location.getLongitude()), AbstractC60044a.f149675a, Float.valueOf(location.getAccuracy()), "type:", str, "located time:", Long.valueOf(System.currentTimeMillis() - C25207c.this.f61547c));
                        C25207c.this.mo88319a(location, this.f61556b, currentTimeMillis, this.f61555a, i);
                    }
                }

                @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a.AbstractC67726b
                /* renamed from: a */
                public void mo88298a(ArrayList<Location> arrayList, Location location, String str, int i) {
                    String str2;
                    long j;
                    float f;
                    if (C25207c.this.mo230473f().isDestroyed()) {
                        AppBrandLogger.m52829e("GetLocationAsyncHandler", "on location change and app context is destroyed");
                        return;
                    }
                    this.f61555a++;
                    if (C67432a.m262319a(C25207c.this.mo230473f()).getJsBridge() != null) {
                        JSONArray jSONArray = new JSONArray();
                        if (arrayList != null && arrayList.size() > 0) {
                            Iterator<Location> it = arrayList.iterator();
                            while (it.hasNext()) {
                                Location next = it.next();
                                this.f61556b.add(new C25225h(next, System.currentTimeMillis()));
                                jSONArray.put(C25207c.this.mo88317a(next, str));
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (location != null) {
                            jSONObject = C25207c.this.mo88317a(location, str);
                            float accuracy = location.getAccuracy();
                            long time = location.getTime();
                            str2 = location.getProvider();
                            f = accuracy;
                            j = time;
                        } else {
                            j = 0;
                            str2 = null;
                            f = BitmapDescriptorFactory.HUE_RED;
                        }
                        try {
                            jSONObject.put("locations", jSONArray);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        AppBrandLogger.m52830i("GetLocationAsyncHandler", "on location change:", jSONObject.toString(), "type:", str, "time:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        if (C25207c.this.mo230473f().getAppType() == AppType.GadgetAPP) {
                            C25207c.this.mo230475h().mo235028a(C67706e.C67708a.m263377a("onLocationChange", jSONObject).mo235009a());
                        }
                        C67475d.m262453a(C25207c.this.mo230473f(), System.currentTimeMillis() - currentTimeMillis, i, f, j, str2, C25207c.this.f61546b, C25207c.this.f61545a, arrayList);
                    }
                }
            });
            return;
        }
        AppBrandLogger.m52829e("GetLocationAsyncHandler", "params is wrong:", this.f61548d);
        mo230481a(ApiCode.GENERAL_PARAM);
    }

    /* renamed from: a */
    private void m90605a(final Activity activity) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25207c.RunnableC252113 */

            public void run() {
                Activity activity = activity;
                C13351i.m54345a(activity, "", activity.getString(R.string.lark_brand_location_need_open), activity.getString(R.string.microapp_m_brand_title_permission_cancel), activity.getString(R.string.lark_brand_open_location), new C13351i.AbstractC13357a() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25207c.RunnableC252113.C252121 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        AppBrandLogger.m52830i("GetLocationAsyncHandler", "To open button is clicked");
                        activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                        AppBrandLogger.m52830i("GetLocationAsyncHandler", "I got it button is clicked");
                        if (AppbrandContext.getInst().isGame()) {
                            C67029c.m261245a(activity);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private boolean m90606a(Context context) {
        boolean z;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            z = locationManager.isProviderEnabled("gps");
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("GetLocationAsyncHandler", "gps state:", Boolean.valueOf(z));
        return z;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        float f;
        this.f61547c = System.currentTimeMillis();
        this.f61548d = (String) bVar.mo234984a(ShareHitPoint.f121869d);
        String str = (String) bVar.mo234985a("accuracy", "high");
        this.f61549e = str;
        if (TextUtils.equals(str, "best")) {
            f = 20.0f;
        } else {
            f = 100.0f;
        }
        this.f61545a = f;
        this.f61546b = (long) (((Integer) bVar.mo234985a("timeout", 5)).intValue() * 1000);
        this.f61550f = (String) bVar.mo234985a("priority", "");
        this.f61551g = (long) (((Integer) bVar.mo234985a("cacheTimeout", 0)).intValue() * 1000);
        AppBrandLogger.m52830i("GetLocationAsyncHandler", "location args:", bVar.mo234987c().mo234999a());
        C67475d.m262454a(mo230473f(), bVar.mo234987c().mo234999a());
        Activity f2 = mo230475h().mo235051f();
        if (f2 == null) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
            AppBrandLogger.m52829e("GetLocationAsyncHandler", "activity is null");
            return;
        }
        if (!m90606a((Context) f2)) {
            m90605a(f2);
        }
        m90607c();
    }

    public C25207c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    public JSONObject mo88317a(Location location, String str) {
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            try {
                jSONObject.put(ShareHitPoint.f121869d, str).put("latitude", location.getLatitude()).put("longitude", location.getLongitude()).put("accuracy", (double) location.getAccuracy()).put("horizontalAccuracy", (double) location.getAccuracy()).put("timestamp", location.getTime()).put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("GetLocationAsyncHandler", "getLocationjson fail:", e);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo88318a(int i, String str, int i2, long j) {
        int i3;
        int i4;
        boolean z;
        if (mo230473f().getApplicationContext() != null) {
            z = C25224g.m90647c(mo230473f().getApplicationContext());
            i4 = C25224g.m90644a(mo230473f().getApplicationContext());
            i3 = C25224g.m90646b(mo230473f().getApplicationContext());
        } else {
            z = false;
            i4 = 0;
            i3 = 0;
        }
        C67475d.m262455a(mo230473f(), "fail", System.currentTimeMillis() - j, -1, BitmapDescriptorFactory.HUE_RED, 0, null, this.f61546b, this.f61549e, this.f61545a, i, str, i2, "current_location", z, i4, i3, null);
        String str2 = ApiErrorCode.LOCATION_FAIL.msg + ":" + i + ":" + str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("locationCode", i);
            jSONObject.put("locationMsg", str);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("GetLocationAsyncHandler", e);
        }
        mo230483a(ApiCode.GETLOCATION_LOCATION_FAIL, jSONObject, str2);
    }

    /* renamed from: a */
    public void mo88319a(Location location, ArrayList<C25225h> arrayList, long j, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            jSONObject.put("accuracy", (double) location.getAccuracy());
            jSONObject.put("horizontalAccuracy", (double) location.getAccuracy());
            jSONObject.put("timestamp", location.getTime());
            jSONObject.put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("GetLocationAsyncHandler", e);
        }
        mo230492b(jSONObject);
        if (mo230473f().getApplicationContext() != null) {
            boolean c = C25224g.m90647c(mo230473f().getApplicationContext());
            i4 = C25224g.m90644a(mo230473f().getApplicationContext());
            i3 = C25224g.m90646b(mo230473f().getApplicationContext());
            z = c;
        } else {
            z = false;
            i4 = 0;
            i3 = 0;
        }
        C67475d.m262455a(mo230473f(), "success", System.currentTimeMillis() - j, i2, location.getAccuracy(), location.getTime(), location.getProvider(), this.f61546b, this.f61549e, this.f61545a, 0, null, i, "current_location", z, i4, i3, arrayList);
    }
}
