package com.ss.android.lark.browser.biz.messenger.jsapi.location;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.openapi.jsapi.entity.response.geolocation.LocationInfoBean;

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.location.b */
public class C29854b {
    /* renamed from: a */
    public static LocationInfoBean m110378a(Context context, IBrowserModuleDependency.ILocationDependency.LarkLocation larkLocation) {
        LocationInfoBean locationInfoBean = new LocationInfoBean();
        if (!(larkLocation == null || context == null)) {
            locationInfoBean.setAccuracy((double) larkLocation.getAccuracy());
            locationInfoBean.setAddress(larkLocation.mo107639a());
            locationInfoBean.setCity(larkLocation.mo107646c());
            locationInfoBean.setDistrict(larkLocation.mo107648d());
            locationInfoBean.setErrorCode(larkLocation.mo107654g());
            locationInfoBean.setFromMock(larkLocation.mo107656i());
            locationInfoBean.setGpsEnabled(larkLocation.mo107655h());
            locationInfoBean.setLatitude(larkLocation.getLatitude());
            locationInfoBean.setLongitude(larkLocation.getLongitude());
            locationInfoBean.setMobileEnabled(NetworkUtils.m153075h(context));
            locationInfoBean.setOperatorType(C26284k.m95187c(context));
            locationInfoBean.setProvince(larkLocation.mo107643b());
            locationInfoBean.setNetType(NetworkUtils.m153067a(context));
            String e = larkLocation.mo107650e();
            String f = larkLocation.mo107652f();
            String str = "";
            if (!TextUtils.isEmpty(e)) {
                StringBuilder sb = new StringBuilder();
                sb.append(e);
                if (!TextUtils.isEmpty(f)) {
                    f = str;
                }
                sb.append(f);
                str = sb.toString();
            }
            locationInfoBean.setRoad(str);
            locationInfoBean.setWifiEnabled(NetworkUtils.m153069b(context));
            locationInfoBean.setTime(larkLocation.getTime());
        }
        return locationInfoBean;
    }
}
