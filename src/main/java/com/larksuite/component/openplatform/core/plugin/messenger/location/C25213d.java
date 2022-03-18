package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13320j;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.util.C67029c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.d */
public class C25213d extends ApiHandler {

    /* renamed from: a */
    public float f61562a;

    /* renamed from: b */
    public long f61563b;

    /* renamed from: c */
    public long f61564c;

    /* renamed from: d */
    private String f61565d;

    /* renamed from: e */
    private String f61566e;

    /* renamed from: f */
    private String f61567f;

    /* renamed from: g */
    private long f61568g;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getLocation";
    }

    public C25213d() {
    }

    /* renamed from: b */
    private void m90625b() {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235103a(currentActivity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d.C252141 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "location permission is granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d.C252141.C252151 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "system permission is granted. cost time:", Long.valueOf(System.currentTimeMillis() - C25213d.this.f61564c));
                        C25213d.this.mo88323a();
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "system permission is denied");
                        C25213d.this.callbackExtraInfoMsg(false, "system permission denied");
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "location permission is denied");
                C25213d dVar = C25213d.this;
                dVar.callbackExtraInfoMsg(false, C66578b.m260105a(dVar.getActionName()));
            }
        });
    }

    /* renamed from: a */
    public void mo88323a() {
        String str = "wgs84";
        if (TextUtils.isEmpty(this.f61565d) || this.f61565d.equals("gcj02") || this.f61565d.equals(str)) {
            final long currentTimeMillis = System.currentTimeMillis();
            AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "start call lark location api: ", Long.valueOf(System.currentTimeMillis() - this.f61564c));
            if (!TextUtils.isEmpty(this.f61565d)) {
                str = this.f61565d;
            }
            this.f61565d = str;
            LarkExtensionManager.getInstance().getExtension().mo49594a(getAppContext().getCurrentActivity(), this.f61565d, this.f61562a, this.f61563b, this.f61567f, this.f61568g, new AbstractC13320j.AbstractC13321a() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d.C252162 */

                /* renamed from: a */
                int f61572a;

                /* renamed from: b */
                ArrayList<C25225h> f61573b = new ArrayList<>();

                @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j.AbstractC13321a
                /* renamed from: a */
                public void mo48854a(String str, int i) {
                    AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "get location from lark fail:", str, Integer.valueOf(i));
                    C25213d.this.mo88324a(i, str, this.f61572a, currentTimeMillis);
                }

                @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j.AbstractC13321a
                /* renamed from: a */
                public void mo48853a(Location location, String str, int i) {
                    if (location == null) {
                        C25213d.this.mo88324a(2001, "location is null", this.f61572a, currentTimeMillis);
                        return;
                    }
                    AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "get location from lark success: la:", Double.valueOf(location.getLatitude()), "l", Double.valueOf(location.getLongitude()), AbstractC60044a.f149675a, Float.valueOf(location.getAccuracy()), "type:", str, "located time:", Long.valueOf(System.currentTimeMillis() - C25213d.this.f61564c));
                    C25213d.this.mo88325a(location, this.f61573b, currentTimeMillis, this.f61572a, i);
                }

                @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j.AbstractC13321a
                /* renamed from: a */
                public void mo48855a(ArrayList<Location> arrayList, Location location, String str, int i) {
                    String str2;
                    long j;
                    float f;
                    this.f61572a++;
                    if (C67432a.m262319a(C25213d.this.getAppContext()).getJsBridge() != null) {
                        JSONArray jSONArray = new JSONArray();
                        if (arrayList != null && arrayList.size() > 0) {
                            Iterator<Location> it = arrayList.iterator();
                            while (it.hasNext()) {
                                Location next = it.next();
                                this.f61573b.add(new C25225h(next, System.currentTimeMillis()));
                                jSONArray.put(C25213d.this.mo88322a(next, str));
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (location != null) {
                            jSONObject = C25213d.this.mo88322a(location, str);
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
                        AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "on location change:", jSONObject.toString(), "type:", str, "time:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        C67432a.m262319a(C25213d.this.getAppContext()).getJsBridge().sendMsgToJsCore("onLocationChange", jSONObject.toString());
                        C13377u.m54410a(System.currentTimeMillis() - currentTimeMillis, i, f, j, str2, C25213d.this.f61563b, C25213d.this.f61562a, arrayList, C25213d.this.getAppContext());
                    }
                }
            });
            return;
        }
        AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "params is wrong:", this.f61565d);
        callbackExtraInfoMsg(false, " params wrong");
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        float f;
        this.f61564c = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f61565d = jSONObject.optString(ShareHitPoint.f121869d);
            String optString = jSONObject.optString("accuracy", "high");
            this.f61566e = optString;
            if (TextUtils.equals(optString, "best")) {
                f = 20.0f;
            } else {
                f = 100.0f;
            }
            this.f61562a = f;
            this.f61563b = (long) (jSONObject.optInt("timeout", 5) * 1000);
            this.f61567f = jSONObject.optString("priority");
            this.f61568g = (long) (jSONObject.optInt("cacheTimeout") * 1000);
            AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "location args:", this.mArgs);
            Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity == null) {
                callbackExtraInfoMsg(false, "activity is null");
                AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "activity is null");
                return;
            }
            if (!m90624a((Context) currentActivity)) {
                m90623a(currentActivity);
            }
            m90625b();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "parse params error:", e);
            callbackExtraInfoMsg(false, " params wrong");
        }
    }

    /* renamed from: a */
    private void m90623a(final Activity activity) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d.RunnableC252173 */

            public void run() {
                final Dialog dialog = new Dialog(activity);
                dialog.requestWindowFeature(1);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.microapp_m_dialog_permission);
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(R.color.color_transparent);
                    window.findViewById(R.id.microapp_m_permission_title).setVisibility(8);
                    window.findViewById(R.id.microapp_m_title).setVisibility(8);
                    ((TextView) window.findViewById(R.id.microapp_m_msg)).setText(R.string.lark_brand_location_need_open);
                    TextView textView = (TextView) window.findViewById(R.id.microapp_m_button1);
                    textView.setText(R.string.lark_brand_open_location);
                    textView.setOnClickListener(new View.OnClickListener() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d.RunnableC252173.View$OnClickListenerC252181 */

                        public void onClick(View view) {
                            AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "To open button is clicked");
                            dialog.dismiss();
                            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                            if (AppbrandContext.getInst().isGame()) {
                                C67029c.m261245a(activity);
                            }
                        }
                    });
                    TextView textView2 = (TextView) window.findViewById(R.id.microapp_m_button2);
                    textView2.setText(R.string.lark_brand_got_it);
                    textView2.setOnClickListener(new View.OnClickListener() {
                        /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25213d.RunnableC252173.View$OnClickListenerC252192 */

                        public void onClick(View view) {
                            AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "I got it button is clicked");
                            dialog.dismiss();
                            if (AppbrandContext.getInst().isGame()) {
                                C67029c.m261245a(activity);
                            }
                        }
                    });
                    if (TextUtils.equals(Build.BRAND.toLowerCase(), "huawei")) {
                        AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "is huawei phone");
                        window.setFlags(67108864, 67108864);
                    }
                    if (!activity.isFinishing()) {
                        dialog.show();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m90624a(Context context) {
        boolean z;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            z = locationManager.isProviderEnabled("gps");
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("LarkApiGetLocationCtrl", "gps state:", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public JSONObject mo88322a(Location location, String str) {
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            try {
                jSONObject.put(ShareHitPoint.f121869d, str).put("latitude", location.getLatitude()).put("longitude", location.getLongitude()).put("accuracy", (double) location.getAccuracy()).put("horizontalAccuracy", (double) location.getAccuracy()).put("timestamp", location.getTime()).put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("LarkApiGetLocationCtrl", "getLocationjson fail:", e);
            }
        }
        return jSONObject;
    }

    public C25213d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public void mo88324a(int i, String str, int i2, long j) {
        C13377u.m54413a("fail", System.currentTimeMillis() - j, -1, BitmapDescriptorFactory.HUE_RED, 0, null, this.f61563b, this.f61566e, this.f61562a, i, str, i2, "current_location", null, getAppContext());
        callbackExtraInfoMsg(false, str);
    }

    /* renamed from: a */
    public void mo88325a(Location location, ArrayList<C25225h> arrayList, long j, int i, int i2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("latitude", Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", Double.valueOf(location.getLongitude()));
        hashMap.put("accuracy", Float.valueOf(location.getAccuracy()));
        hashMap.put("horizontalAccuracy", Float.valueOf(location.getAccuracy()));
        hashMap.put("timestamp", Long.valueOf(location.getTime()));
        hashMap.put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0);
        callbackMsg(true, hashMap, null);
        C13377u.m54413a("success", System.currentTimeMillis() - j, i2, location.getAccuracy(), location.getTime(), location.getProvider(), this.f61563b, this.f61566e, this.f61562a, 0, null, i, "current_location", arrayList, getAppContext());
    }
}
