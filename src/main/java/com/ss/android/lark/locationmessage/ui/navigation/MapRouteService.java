package com.ss.android.lark.locationmessage.ui.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.p2149b.C41595f;
import com.ss.android.lark.locationmessage.statistics.NavigateHitPoint;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class MapRouteService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface MapCustomRouteURI {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MapPackageName {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MapRouteURI {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MapType {
    }

    /* renamed from: com.ss.android.lark.locationmessage.ui.navigation.MapRouteService$a */
    private static class C41620a {

        /* renamed from: a */
        public static final MapRouteService f105734a = new MapRouteService();
    }

    /* renamed from: a */
    public static MapRouteService m165178a() {
        return C41620a.f105734a;
    }

    /* renamed from: b */
    public C41637c mo149737b() {
        Context a = C41597c.m165069a().mo143908a();
        C41637c cVar = new C41637c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m165179a(a, "com.autonavi.minimap")) {
            C41636b bVar = new C41636b();
            bVar.mo149766a(0);
            bVar.mo149767a(a.getString(R.string.Lark_Chat_MessageLocationMapGaode));
            bVar.mo149769b("com.autonavi.minimap");
            bVar.mo149771c("amapuri://route/plan/?dlat=%1$s&dlon=%2$s&dname=%3$s&dev=0&t=0");
            bVar.mo149773d("androidamap://keywordNavi?keyword=%1$s&style=0");
            arrayList.add(a.getString(R.string.Lark_Chat_MessageLocationMapGaode));
            arrayList2.add(bVar);
        }
        if (m165179a(a, "com.baidu.BaiduMap")) {
            C41636b bVar2 = new C41636b();
            bVar2.mo149766a(1);
            bVar2.mo149767a(a.getString(R.string.Lark_Chat_MessageLocationMapBaidu));
            bVar2.mo149769b("com.baidu.BaiduMap");
            bVar2.mo149771c("baidumap://map/direction?destination=name:%1$s|latlng:%2$s,%3$s&coord_type=gcj02&mode=driving");
            bVar2.mo149773d("baidumap://map/direction?destination=%1$s&mode=driving");
            arrayList.add(a.getString(R.string.Lark_Chat_MessageLocationMapBaidu));
            arrayList2.add(bVar2);
        }
        if (m165179a(a, "com.tencent.map")) {
            C41636b bVar3 = new C41636b();
            bVar3.mo149766a(2);
            bVar3.mo149767a(a.getString(R.string.Lark_Chat_MessageLocationMapTencent));
            bVar3.mo149769b("com.tencent.map");
            bVar3.mo149771c("qqmap://map/routeplan?type=drive&to=%1$s&tocoord=%2$s,%3$s");
            bVar3.mo149773d("qqmap://map/search?type=drive&keyword=%1$s");
            arrayList.add(a.getString(R.string.Lark_Chat_MessageLocationMapTencent));
            arrayList2.add(bVar3);
        }
        if (m165179a(a, "com.google.android.apps.maps")) {
            C41636b bVar4 = new C41636b();
            bVar4.mo149766a(3);
            bVar4.mo149767a(a.getString(R.string.Lark_Chat_MessageLocationMapGoogle));
            bVar4.mo149769b("com.google.android.apps.maps");
            bVar4.mo149771c("https://www.google.com/maps/dir/?api=1&destination=%1$s/%2$s&travelmode=drive");
            bVar4.mo149773d("https://www.google.com/maps/search/?api=1&query=%1$s");
            arrayList.add(a.getString(R.string.Lark_Chat_MessageLocationMapGoogle));
            arrayList2.add(bVar4);
        }
        if (m165179a(a, "com.waze")) {
            C41636b bVar5 = new C41636b();
            bVar5.mo149766a(4);
            bVar5.mo149767a(a.getString(R.string.Lark_Chat_MessageLocationMapWaze));
            bVar5.mo149769b("com.waze");
            bVar5.mo149771c("https://waze.com/ul?ll=%1$s,%2$s&navigate=yes");
            bVar5.mo149773d("https://waze.com/ul?q=%1$s&navigate=yes");
            arrayList.add(a.getString(R.string.Lark_Chat_MessageLocationMapWaze));
            arrayList2.add(bVar5);
        }
        cVar.mo149782c(arrayList2);
        cVar.mo149779b(arrayList);
        return cVar;
    }

    /* renamed from: a */
    private static boolean m165179a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.m165383e("MapRouteService", "isInstalled called, e:" + e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo149736a(Context context, C41636b bVar, String str, String str2, String str3) {
        String str4;
        NavigateHitPoint.m165174a("message_location_navigation", bVar.mo149765a());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(bVar.mo149768b());
        intent.addCategory("android.intent.category.DEFAULT");
        if (C41595f.m165064a(str2) == 360.0d || C41595f.m165064a(str3) == 360.0d) {
            str4 = String.format(bVar.mo149772d(), str);
        } else {
            str4 = String.format(bVar.mo149770c(), str2, str3, str);
            if (bVar.mo149774e() || bVar.mo149775f()) {
                str4 = String.format(bVar.mo149770c(), str, str2, str3);
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            intent.setData(Uri.parse(str4));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            } else if (DesktopUtil.m144307b()) {
                intent.addFlags(402653184);
            }
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            }
        }
    }
}
