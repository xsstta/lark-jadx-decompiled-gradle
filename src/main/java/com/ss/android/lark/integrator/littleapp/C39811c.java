package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
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
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.littleapp.c */
public class C39811c {

    /* renamed from: a */
    private boolean f101396a;

    /* renamed from: b */
    private boolean f101397b;

    /* renamed from: c */
    private AbstractC41583b f101398c;

    /* renamed from: d */
    private AbstractC41584c f101399d;

    /* renamed from: e */
    private LocationRequestOption f101400e;

    /* renamed from: f */
    private ICoreApi f101401f;

    /* renamed from: g */
    private final List<AbstractC41371j.AbstractC41380i> f101402g;

    /* renamed from: com.ss.android.lark.integrator.littleapp.c$a */
    private static class C39813a {

        /* renamed from: a */
        public static C39811c f101403a = new C39811c();
    }

    /* renamed from: a */
    public static C39811c m158045a() {
        return C39813a.f101403a;
    }

    /* renamed from: d */
    private AbstractC41584c m158051d() {
        AbstractC41584c cVar = this.f101399d;
        if (cVar != null) {
            return cVar;
        }
        $$Lambda$c$Kv1UOulGxRswLIoigtePi10Dzno r0 = new AbstractC41584c() {
            /* class com.ss.android.lark.integrator.littleapp.$$Lambda$c$Kv1UOulGxRswLIoigtePi10Dzno */

            @Override // com.ss.android.lark.location.listener.AbstractC41584c
            public final void onLocationChange(LarkLocation larkLocation, List list) {
                C39811c.lambda$Kv1UOulGxRswLIoigtePi10Dzno(C39811c.this, larkLocation, list);
            }
        };
        this.f101399d = r0;
        return r0;
    }

    private C39811c() {
        this.f101401f = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        this.f101402g = new ArrayList();
    }

    /* renamed from: e */
    private void m158052e() {
        for (AbstractC41371j.AbstractC41380i iVar : this.f101402g) {
            iVar.mo142998a();
        }
    }

    /* renamed from: b */
    public void mo144311b() {
        this.f101398c.mo149532b(this.f101399d);
        if (!this.f101402g.isEmpty()) {
            m158052e();
            this.f101402g.clear();
            this.f101396a = false;
            this.f101397b = false;
        }
    }

    /* renamed from: c */
    private int m158050c() {
        String b = C25534a.m91180a().mo88676b();
        AppBrandLogger.m52830i("LittleAppLocationManager", "Location downGrade config str:" + b);
        if (!TextUtils.isEmpty(b)) {
            try {
                return new JSONObject(b).getInt("locationUseSDKType");
            } catch (JSONException e) {
                AppBrandLogger.m52829e("LittleAppLocationManager", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private void m158046a(Context context) {
        if (!this.f101396a) {
            if (this.f101398c == null) {
                LocationClientConfig locationClientConfig = new LocationClientConfig();
                boolean z = false;
                AppBrandLogger.m52830i("LittleAppLocationManager", "location use location manager");
                if (m158050c() == 1) {
                    z = true;
                }
                locationClientConfig.mo149627a(z);
                this.f101398c = this.f101401f.getLocationClient(context, locationClientConfig);
            }
            if (this.f101399d == null) {
                this.f101399d = m158051d();
            }
            this.f101396a = true;
        }
    }

    /* renamed from: a */
    private void m158048a(String str, int i) {
        for (AbstractC41371j.AbstractC41380i iVar : this.f101402g) {
            iVar.mo143000a(str, i);
        }
    }

    /* renamed from: a */
    private void m158047a(LarkLocation larkLocation, List<Location> list) {
        if (!this.f101402g.isEmpty()) {
            LarkLocation a = C41586e.m165036a(larkLocation, this.f101400e);
            ArrayList<Location> arrayList = new ArrayList<>();
            if (list == null || list.size() <= 0) {
                arrayList.add(a);
            } else {
                for (Location location : list) {
                    arrayList.add(C39817f.m158077a(location, this.f101400e));
                }
            }
            for (AbstractC41371j.AbstractC41380i iVar : this.f101402g) {
                iVar.mo143001a(arrayList, a, C39817f.m158079a(a), a.mo149621h());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m158049b(LarkLocation larkLocation, List list) {
        if (larkLocation == null) {
            Log.m165389i("GetLocation", "onLocationChange location is null");
        } else if (larkLocation.mo149620g() != 0) {
            m158048a(larkLocation.mo149622i(), larkLocation.mo149620g());
            Log.m165383e("LittleAppLocationManager", "error code:" + larkLocation.mo149620g() + "msg:" + larkLocation.mo149622i());
        } else if (larkLocation.getLatitude() == 0.0d && larkLocation.getLongitude() == 0.0d) {
            m158048a(larkLocation.mo149622i(), larkLocation.mo149620g());
            Log.m165383e("LittleAppLocationManager", "error code:" + larkLocation.mo149620g() + "::location:0,0");
        } else {
            Log.m165389i("LittleAppLocationManager", "location result:\n" + larkLocation.toString());
            m158047a(larkLocation, list);
        }
    }

    /* renamed from: a */
    public void mo144310a(Context context, String str, AbstractC41371j.AbstractC41380i iVar) {
        m158046a(context);
        this.f101400e = C39817f.m158078a(str, "");
        if (!this.f101402g.contains(iVar)) {
            this.f101402g.add(iVar);
        }
        if (this.f101397b) {
            return;
        }
        if (!this.f101398c.mo149528a(this.f101399d, 2000, this.f101400e)) {
            Log.m165383e("LittleAppLocationManager", "lark permission deny or google service not available");
            iVar.mo143000a("location not available", 2003);
            return;
        }
        this.f101397b = true;
    }
}
