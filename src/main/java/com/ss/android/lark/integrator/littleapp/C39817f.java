package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import android.location.Location;
import android.os.CountDownTimer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.littleapp.f */
public class C39817f {

    /* renamed from: a */
    public static ICoreApi f101430a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: com.ss.android.lark.integrator.littleapp.f$2 */
    static /* synthetic */ class C398202 {

        /* renamed from: a */
        static final /* synthetic */ int[] f101442a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.location.dto.LarkLocation$CoordinateSystem[] r0 = com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.integrator.littleapp.C39817f.C398202.f101442a = r0
                com.ss.android.lark.location.dto.LarkLocation$CoordinateSystem r1 = com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.GCJ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.integrator.littleapp.C39817f.C398202.f101442a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.location.dto.LarkLocation$CoordinateSystem r1 = com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.WGS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.littleapp.C39817f.C398202.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m158079a(LarkLocation larkLocation) {
        int i = C398202.f101442a[LarkLocation.CoordinateSystem.forNumber(larkLocation.mo149625l().getNumber()).ordinal()];
        if (i == 1) {
            return "gcj02";
        }
        if (i == 2) {
            return "wgs84";
        }
        Log.m165383e("LittleAppLocationUtil", "error type:" + larkLocation.mo149625l().getNumber());
        return "wgs84";
    }

    /* renamed from: a */
    public static Location m158077a(Location location, LocationRequestOption locationRequestOption) {
        if (locationRequestOption.mo149697a() == LarkLocation.CoordinateSystem.DEFAULT || locationRequestOption.mo149697a() != LarkLocation.CoordinateSystem.GCJ) {
            return location;
        }
        Location location2 = new Location(location);
        double[] a = C41586e.m165039a(location2.getLatitude(), location2.getLongitude());
        location2.setLatitude(a[0]);
        location2.setLongitude(a[1]);
        return location2;
    }

    /* renamed from: a */
    public static LocationRequestOption m158078a(String str, String str2) {
        LocationRequestOption locationRequestOption = new LocationRequestOption();
        str.hashCode();
        if (str.equals("gcj02")) {
            locationRequestOption.mo149698a(LarkLocation.CoordinateSystem.GCJ);
        } else if (!str.equals("wgs84")) {
            locationRequestOption.mo149698a(LarkLocation.CoordinateSystem.WGS);
        } else {
            locationRequestOption.mo149698a(LarkLocation.CoordinateSystem.WGS);
        }
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1186512138:
                if (str2.equals("high_accuracy")) {
                    c = 0;
                    break;
                }
                break;
            case -687751078:
                if (str2.equals("low_power")) {
                    c = 1;
                    break;
                }
                break;
            case -335269104:
                if (str2.equals("device_sensors")) {
                    c = 2;
                    break;
                }
                break;
            case -46201078:
                if (str2.equals("balanced_power_accuracy")) {
                    c = 3;
                    break;
                }
                break;
            case 990897415:
                if (str2.equals("no_power")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY);
                break;
            case 1:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_LOW_POWER);
                break;
            case 2:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.DEVICE_SENSORS);
                break;
            case 3:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_BALANCED_POWER_ACCURACY);
                break;
            case 4:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_NO_POWER);
                break;
            default:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY);
                break;
        }
        return locationRequestOption;
    }

    /* renamed from: a */
    public static void m158080a(Context context, String str, float f, long j, String str2, long j2, AbstractC41371j.AbstractC41380i iVar) {
        float f2;
        LocationRequestOption locationRequestOption = new LocationRequestOption();
        str.hashCode();
        if (str.equals("gcj02")) {
            locationRequestOption.mo149698a(LarkLocation.CoordinateSystem.GCJ);
        } else if (!str.equals("wgs84")) {
            locationRequestOption.mo149698a(LarkLocation.CoordinateSystem.WGS);
        } else {
            locationRequestOption.mo149698a(LarkLocation.CoordinateSystem.WGS);
        }
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1186512138:
                if (str2.equals("high_accuracy")) {
                    c = 0;
                    break;
                }
                break;
            case -687751078:
                if (str2.equals("low_power")) {
                    c = 1;
                    break;
                }
                break;
            case -335269104:
                if (str2.equals("device_sensors")) {
                    c = 2;
                    break;
                }
                break;
            case -46201078:
                if (str2.equals("balanced_power_accuracy")) {
                    c = 3;
                    break;
                }
                break;
            case 990897415:
                if (str2.equals("no_power")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY);
                break;
            case 1:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_LOW_POWER);
                break;
            case 2:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.DEVICE_SENSORS);
                break;
            case 3:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_BALANCED_POWER_ACCURACY);
                break;
            case 4:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_NO_POWER);
                break;
            default:
                locationRequestOption.mo149699a(LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY);
                break;
        }
        if (j <= 0) {
            j = 5000;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            f2 = 100.0f;
        } else {
            f2 = f;
        }
        if (!f101430a.getLocationClient(context).mo149528a(new AbstractC41584c(j, context, iVar, str, f2) {
            /* class com.ss.android.lark.integrator.littleapp.C39817f.C398181 */

            /* renamed from: a */
            boolean f101431a;

            /* renamed from: b */
            LarkLocation f101432b;

            /* renamed from: c */
            LarkLocation f101433c;

            /* renamed from: d */
            int f101434d = 2004;

            /* renamed from: e */
            CountDownTimer f101435e;

            /* renamed from: f */
            final /* synthetic */ long f101436f;

            /* renamed from: g */
            final /* synthetic */ Context f101437g;

            /* renamed from: h */
            final /* synthetic */ AbstractC41371j.AbstractC41380i f101438h;

            /* renamed from: i */
            final /* synthetic */ String f101439i;

            /* renamed from: j */
            final /* synthetic */ float f101440j;

            /* renamed from: a */
            public void mo144317a(String str) {
                LarkLocation larkLocation;
                C39817f.f101430a.getLocationClient(this.f101437g).mo149532b(this);
                if (!this.f101431a) {
                    if (this.f101432b == null && (larkLocation = this.f101433c) != null) {
                        this.f101432b = larkLocation;
                    }
                    LarkLocation larkLocation2 = this.f101432b;
                    if (larkLocation2 != null) {
                        this.f101438h.mo142999a(larkLocation2, this.f101439i, larkLocation2.mo149621h());
                        Log.m165389i("GetLocation", "location timeout return: acc" + this.f101432b.getAccuracy());
                    } else {
                        Log.m165383e("GetLocation", "location timeout error");
                        this.f101438h.mo143000a(str, this.f101434d);
                    }
                    this.f101431a = true;
                }
            }

            @Override // com.ss.android.lark.location.listener.AbstractC41584c
            public void onLocationChange(LarkLocation larkLocation, List<Location> list) {
                String str;
                if (larkLocation != null) {
                    if (larkLocation.mo149620g() != 0) {
                        this.f101434d = larkLocation.mo149620g();
                    }
                    int i = C398202.f101442a[LarkLocation.CoordinateSystem.forNumber(larkLocation.mo149625l().getNumber()).ordinal()];
                    if (i == 1) {
                        str = "gcj02";
                    } else if (i != 2) {
                        Log.m165383e("GetLocation", "error type:" + larkLocation.mo149625l().getNumber());
                        return;
                    } else {
                        str = "wgs84";
                    }
                    if (larkLocation.getLatitude() == 0.0d && larkLocation.getLongitude() == 0.0d) {
                        Log.m165383e("GetLocation", "errorcode:" + larkLocation.mo149620g() + "::location:0,0");
                        return;
                    }
                    Log.m165389i("GetLocation", "location result:\n" + larkLocation.toString() + "\ntime: " + larkLocation.getTime() + "\nspeed:" + larkLocation.getSpeed() + "\nElapsedRealtime:" + larkLocation.getElapsedRealtimeNanos());
                    ArrayList<Location> arrayList = new ArrayList<>();
                    if (list == null || list.size() <= 0) {
                        arrayList.add(larkLocation);
                    } else {
                        arrayList = (ArrayList) list;
                    }
                    this.f101438h.mo143001a(arrayList, larkLocation, str, larkLocation.mo149621h());
                    this.f101433c = larkLocation;
                    if (larkLocation.getTime() + 300000 < System.currentTimeMillis()) {
                        Log.m165389i("GetLocation", "location result timeout:\n" + larkLocation.toString() + "\ntime: " + larkLocation.getTime() + "\nspeed:" + larkLocation.getSpeed() + "\nElapsedRealtime:" + larkLocation.getElapsedRealtimeNanos());
                        return;
                    }
                    LarkLocation larkLocation2 = this.f101432b;
                    if (larkLocation2 == null || larkLocation2.getAccuracy() > larkLocation.getAccuracy()) {
                        this.f101432b = larkLocation;
                    }
                    if (larkLocation.getAccuracy() > this.f101440j || this.f101431a) {
                        Log.m165389i("GetLocation", "accuracy not fit:" + larkLocation.getAccuracy());
                        return;
                    }
                    this.f101438h.mo142999a(larkLocation, str, larkLocation.mo149621h());
                    this.f101431a = true;
                    C39817f.f101430a.getLocationClient(this.f101437g).mo149532b(this);
                    CountDownTimer countDownTimer = this.f101435e;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                        this.f101435e = null;
                    }
                    Log.m165389i("GetLocation", "location return:" + larkLocation.getAccuracy());
                }
            }

            {
                this.f101436f = r7;
                this.f101437g = r9;
                this.f101438h = r10;
                this.f101439i = r11;
                this.f101440j = r12;
                this.f101435e = new CountDownTimer(r7, 1000) {
                    /* class com.ss.android.lark.integrator.littleapp.C39817f.C398181.CountDownTimerC398191 */

                    public void onFinish() {
                        Log.m165389i("GetLocation", "location timeout:has call back" + C398181.this.f101431a);
                        C398181.this.mo144317a("location timeout");
                    }

                    public void onTick(long j) {
                        Log.m165389i("GetLocation", "timer:" + j);
                        if (C398181.this.f101431a && C398181.this.f101435e != null) {
                            C398181.this.f101435e.cancel();
                            C398181.this.f101435e = null;
                        }
                    }
                }.start();
            }
        }, 1000, locationRequestOption)) {
            Log.m165383e("GetLocation", "lark permission deny or google service not available");
        }
    }
}
