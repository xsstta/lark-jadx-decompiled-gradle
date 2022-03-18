package com.tt.miniapp.map.p3306b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.map.p3305a.C66481a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.map.b.a */
public class C66482a {
    /* renamed from: b */
    public static String m259827b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "MapUtils", e.getStackTrace());
            return "";
        }
    }

    /* renamed from: a */
    public static List<String> m259824a(Context context) {
        ArrayList arrayList = new ArrayList(4);
        if (m259826a(context, "com.baidu.BaiduMap")) {
            arrayList.add(context.getResources().getString(R.string.microapp_m_map_dialog_baidu));
        }
        if (m259826a(context, "com.autonavi.minimap")) {
            arrayList.add(context.getResources().getString(R.string.microapp_m_map_dialog_gaode));
        }
        if (m259826a(context, "com.tencent.map")) {
            arrayList.add(context.getResources().getString(R.string.microapp_m_map_dialog_tencent));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m259826a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            AppBrandLogger.stacktrace(6, "MapUtils", e.getStackTrace());
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m259825a(Context context, C66481a aVar, C66481a aVar2) {
        if (aVar != null && aVar2 != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("amapuri://route/plan/?sourceApplication=" + m259827b(context) + "&sname=" + aVar.mo232034a() + "&slat=" + aVar.mo232035b().mo234901a() + "&slon=" + aVar.mo232035b().mo234903b() + "&dname=" + aVar2.mo232034a() + "&dlat=" + aVar2.mo232035b().mo234901a() + "&dlon=" + aVar2.mo232035b().mo234903b() + "&dev=0&t=2")));
        }
    }

    /* renamed from: b */
    public static void m259828b(Context context, C66481a aVar, C66481a aVar2) {
        if (aVar != null && aVar2 != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("baidumap://map/direction?origin_region=" + aVar.mo232034a() + "&origin=name:" + aVar.mo232034a() + "|latlng:" + aVar.mo232035b().mo234901a() + "," + aVar.mo232035b().mo234903b() + "&destination_region=" + aVar2.mo232034a() + "&destination=name:" + aVar2.mo232034a() + "|latlng:" + aVar2.mo232035b().mo234901a() + "," + aVar2.mo232035b().mo234903b() + "&mode=walking")));
        }
    }

    /* renamed from: c */
    public static void m259829c(Context context, C66481a aVar, C66481a aVar2) {
        if (aVar != null && aVar2 != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("qqmap://map/routeplan?referer=" + m259827b(context) + "&type=walk&from=" + aVar.mo232034a() + "&fromcoord=" + aVar.mo232035b().mo234901a() + "," + aVar.mo232035b().mo234903b() + "&to=" + aVar2.mo232034a() + "&tocoord=" + aVar2.mo232035b().mo234901a() + "," + aVar2.mo232035b().mo234903b() + "&policy=0")));
        }
    }
}
