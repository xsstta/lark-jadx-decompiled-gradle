package com.ss.android.lark.map;

import android.content.Context;
import android.location.Location;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.LocationClientConfig;
import com.ss.android.lark.location.listener.AbstractC41583b;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.p2145a.AbstractC41553b;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.location.p2146b.C41574i;
import com.ss.android.lark.map.p2237a.C44559a;
import java.util.List;

@ClaymoreImpl(AbstractC41567g.class)
public class MapModule implements AbstractC41567g {
    AbstractC41583b mLocationService;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public String getApiKey(Context context) {
        return "";
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public boolean isInHouse(double d, double d2) {
        return false;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41558b getCalendarMap() {
        return C44559a.m176791a();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41559c getLittleAppMap() {
        return C44559a.m176792b();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41561d getLocationMessageMap() {
        return C44559a.m176793c();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41562e getPOIService() {
        return C44559a.m176794d();
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41569h getPickLocationMap() {
        return C44559a.m176795e();
    }

    public static AbstractC41553b getDependency() {
        return (AbstractC41553b) ClaymoreServiceLoader.loadFirstOrNull(AbstractC41553b.class);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41583b getLocationClient(Context context) {
        if (this.mLocationService == null) {
            synchronized (this) {
                if (this.mLocationService == null) {
                    this.mLocationService = C44559a.m176790a(context);
                }
            }
        }
        return this.mLocationService;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public boolean getLocation(Context context, final AbstractC41567g.AbstractC41568a aVar) {
        return getLocationClient(context).mo149526a(new AbstractC41584c() {
            /* class com.ss.android.lark.map.MapModule.C445581 */

            @Override // com.ss.android.lark.location.listener.AbstractC41584c
            public void onLocationChange(LarkLocation larkLocation, List<Location> list) {
                AbstractC41567g.AbstractC41568a aVar = aVar;
                if (aVar != null) {
                    aVar.onLocationChange(larkLocation);
                }
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public double[] obtainGCJLatLng(double d, double d2) {
        return C41586e.m165040a(getDependency().getContext(), d, d2);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41567g
    public AbstractC41583b getLocationClient(Context context, LocationClientConfig locationClientConfig) {
        if (locationClientConfig == null || !locationClientConfig.mo149628a()) {
            AbstractC41583b locationClient = getLocationClient(context);
            this.mLocationService = locationClient;
            return locationClient;
        }
        AbstractC41583b bVar = this.mLocationService;
        if (bVar instanceof C41574i) {
            return bVar;
        }
        if (bVar == null) {
            synchronized (this) {
                if (this.mLocationService == null) {
                    this.mLocationService = new C41574i(context.getApplicationContext());
                }
            }
        }
        return this.mLocationService;
    }
}
