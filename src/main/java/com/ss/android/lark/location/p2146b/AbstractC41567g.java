package com.ss.android.lark.location.p2146b;

import android.content.Context;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.LocationClientConfig;
import com.ss.android.lark.location.listener.AbstractC41583b;

/* renamed from: com.ss.android.lark.location.b.g */
public interface AbstractC41567g {

    /* renamed from: com.ss.android.lark.location.b.g$a */
    public interface AbstractC41568a {
        void onLocationChange(LarkLocation larkLocation);
    }

    String getApiKey(Context context);

    AbstractC41558b getCalendarMap();

    AbstractC41559c getLittleAppMap();

    boolean getLocation(Context context, AbstractC41568a aVar);

    AbstractC41583b getLocationClient(Context context);

    AbstractC41583b getLocationClient(Context context, LocationClientConfig locationClientConfig);

    AbstractC41561d getLocationMessageMap();

    AbstractC41562e getPOIService();

    AbstractC41569h getPickLocationMap();

    boolean isInHouse(double d, double d2);

    double[] obtainGCJLatLng(double d, double d2);
}
