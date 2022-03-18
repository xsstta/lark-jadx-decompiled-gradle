package com.tt.miniapp.maplocate;

import android.location.Location;
import android.os.Build;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

public class TMALocation extends Location implements Cloneable {

    /* renamed from: a */
    private int f167824a;

    /* renamed from: b */
    private int f167825b;

    /* renamed from: c */
    private String f167826c;

    /* renamed from: d */
    private String f167827d;

    /* renamed from: e */
    private String f167828e;

    /* renamed from: f */
    private String f167829f;

    /* renamed from: g */
    private String f167830g;

    /* renamed from: h */
    private int f167831h;

    /* renamed from: a */
    public int mo232036a() {
        return this.f167824a;
    }

    /* renamed from: b */
    public int mo232039b() {
        return this.f167825b;
    }

    /* renamed from: c */
    public String mo232042c() {
        return this.f167826c;
    }

    /* renamed from: d */
    public String mo232046d() {
        return this.f167830g;
    }

    /* renamed from: e */
    public String mo232048e() {
        return this.f167828e;
    }

    /* renamed from: g */
    public String mo232051g() {
        return this.f167829f;
    }

    /* renamed from: h */
    public String mo232052h() {
        return this.f167827d;
    }

    /* renamed from: i */
    public int mo232053i() {
        return this.f167831h;
    }

    /* renamed from: f */
    public float mo232050f() {
        return getAccuracy();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public Object clone() {
        try {
            return (TMALocation) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String toString() {
        return "TMALocation{mStatusCode=" + this.f167824a + ", mRawImplStatusCode=" + this.f167825b + ", address='" + this.f167826c + '\'' + ", country='" + this.f167827d + '\'' + ", province='" + this.f167828e + '\'' + ", city='" + this.f167829f + '\'' + ", district='" + this.f167830g + '\'' + ", mLocType=" + this.f167831h + '}';
    }

    /* renamed from: j */
    public JSONObject mo232054j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("provider", getProvider());
            jSONObject.putOpt("latitude", Double.valueOf(getLatitude()));
            jSONObject.putOpt("longitude", Double.valueOf(getLongitude()));
            jSONObject.putOpt("loc_time", Long.valueOf(getTime()));
            jSONObject.putOpt("speed", Float.valueOf(getSpeed()));
            jSONObject.putOpt("accuracy", Float.valueOf(getAccuracy()));
            jSONObject.putOpt("altitude", Double.valueOf(getAltitude()));
            jSONObject.putOpt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(mo232036a()));
            jSONObject.putOpt("rawImplStatusCode", Integer.valueOf(mo232039b()));
            jSONObject.putOpt("address", mo232042c());
            jSONObject.putOpt("country", mo232052h());
            jSONObject.putOpt("province", mo232048e());
            jSONObject.putOpt("city", mo232051g());
            jSONObject.putOpt("district", mo232046d());
            jSONObject.putOpt("loctype", Integer.valueOf(mo232053i()));
            float f = BitmapDescriptorFactory.HUE_RED;
            if (Build.VERSION.SDK_INT >= 26) {
                f = getVerticalAccuracyMeters();
            }
            jSONObject.put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, (double) f);
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("TMALocation", "tojson", e);
        }
        return jSONObject;
    }

    public TMALocation(String str) {
        super(str);
    }

    public TMALocation(int i) {
        super("");
        this.f167824a = i;
    }

    /* renamed from: a */
    public void mo232037a(int i) {
        this.f167824a = i;
    }

    /* renamed from: b */
    public void mo232040b(int i) {
        this.f167825b = i;
    }

    /* renamed from: c */
    public void mo232043c(int i) {
        this.f167831h = i;
    }

    /* renamed from: d */
    public void mo232047d(String str) {
        this.f167829f = str;
    }

    /* renamed from: e */
    public void mo232049e(String str) {
        this.f167827d = str;
    }

    /* renamed from: a */
    public static boolean m259831a(TMALocation tMALocation) {
        if (tMALocation == null || tMALocation.mo232036a() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo232041b(String str) {
        this.f167830g = str;
    }

    /* renamed from: c */
    public void mo232044c(String str) {
        this.f167828e = str;
    }

    /* renamed from: a */
    public void mo232038a(String str) {
        this.f167826c = str;
    }

    public TMALocation(TMALocation tMALocation) {
        super(tMALocation);
        mo232037a(tMALocation.mo232036a());
        mo232038a(tMALocation.mo232042c());
        mo232049e(tMALocation.mo232052h());
        setProvider(tMALocation.mo232048e());
        mo232047d(tMALocation.mo232051g());
        mo232041b(tMALocation.mo232046d());
        mo232043c(tMALocation.mo232053i());
    }

    /* renamed from: a */
    public static TMALocation m259830a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        TMALocation tMALocation = new TMALocation(jSONObject.optString("provider"));
        tMALocation.setLatitude(jSONObject.optDouble("latitude"));
        tMALocation.setLongitude(jSONObject.optDouble("longitude"));
        tMALocation.setTime(jSONObject.optLong("loc_time"));
        tMALocation.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
        tMALocation.setAccuracy((float) jSONObject.optDouble("accuracy"));
        tMALocation.setAltitude(jSONObject.optDouble("altitude"));
        tMALocation.mo232037a(jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT));
        tMALocation.mo232040b(jSONObject.optInt("rawImplStatusCode"));
        tMALocation.mo232038a(jSONObject.optString("address"));
        tMALocation.mo232049e(jSONObject.optString("country"));
        tMALocation.mo232044c(jSONObject.optString("province"));
        tMALocation.mo232047d(jSONObject.optString("city"));
        tMALocation.mo232041b(jSONObject.optString("district"));
        tMALocation.mo232043c(jSONObject.optInt("loctype"));
        if (Build.VERSION.SDK_INT >= 26) {
            tMALocation.setVerticalAccuracyMeters(BitmapDescriptorFactory.HUE_RED);
        }
        return tMALocation;
    }
}
