package com.ss.android.ad.splash.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.TouchDelegate;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.text.C0835f;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.AbstractC27469t;
import com.ss.android.ad.splash.core.C27275c;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27319h;
import com.ss.android.ad.splash.core.C27368t;
import com.ss.android.ad.splash.core.C27375v;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27338f;
import com.ss.android.ad.splash.core.model.C27340h;
import com.ss.android.ad.splash.core.model.C27342j;
import com.ss.android.ad.splash.core.model.C27343k;
import com.ss.android.ad.splash.core.model.C27349o;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.video2.AbstractC27436f;
import com.ss.android.ad.splash.core.video2.BDASplashVideoAsyncController;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.C27431d;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.p1244b.C27234a;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.utils.h */
public class C27478h {

    /* renamed from: a */
    private static final Map<String, String> f68694a;

    /* renamed from: b */
    private static final Set<String> f68695b;

    /* renamed from: a */
    public static boolean m100355a(long j, long j2) {
        return j2 > j;
    }

    /* renamed from: a */
    public static boolean m100360a(C27368t tVar) {
        int t = tVar.mo97689t();
        return t > 0 && tVar.mo97693x() >= t;
    }

    /* renamed from: a */
    public static String m100340a(C27338f fVar) {
        List<String> a;
        if (fVar == null || (a = fVar.mo97534a()) == null || a.isEmpty()) {
            return null;
        }
        String str = a.get(0);
        if (!C27480i.m100385a(str) || a.size() < 2) {
            return str;
        }
        String str2 = a.get(1);
        return (!C27480i.m100385a(str2) || a.size() < 3) ? str2 : a.get(2);
    }

    /* renamed from: a */
    public static String m100341a(C27349o oVar) {
        if (oVar == null || oVar.mo97574c() == null || oVar.mo97574c().isEmpty()) {
            return null;
        }
        return C27482k.m100388a(oVar.mo97574c().get(0));
    }

    /* renamed from: a */
    public static void m100353a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: a */
    public static boolean m100362a(int[] iArr, long j, long j2) {
        C27471a.m100287b(", is skippable: ");
        boolean z = true;
        if (iArr != null && iArr.length >= 2) {
            long a = m100334a(j);
            long j3 = (((long) iArr[0]) * 1000) + a;
            if (j2 > a + (((long) iArr[1]) * 1000) || j2 < j3) {
                z = false;
            }
            C27471a.m100287b(" whether first-show-timegap opportunity has been consumed : " + z);
        }
        return z;
    }

    /* renamed from: a */
    public static String m100344a(boolean z) {
        C27275c i = C27287e.m99267i();
        i.mo97273a(false);
        HashMap<String, String> S = C27287e.m99220S();
        if (i == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            String B = C27368t.m99732a().mo97641B();
            sb.append("/api/ad/v1/splash/stock/");
            sb.append("?_unused=0");
            sb.append((CharSequence) m100378f());
            sb.append(i.toString());
            if (S != null) {
                sb.append(m100343a(S));
            }
            if (z) {
                sb.append("&show_limit=1");
            } else {
                sb.append("&show_limit=0");
            }
            if (!TextUtils.isEmpty(B)) {
                sb.append(B);
            }
            int z2 = C27368t.m99732a().mo97695z();
            C27471a.m100287b(" sending stop request, current refresh time is " + z2);
            sb.append("&refresh_num=");
            sb.append(z2);
            if (C27287e.ah() != -1) {
                sb.append("&is_cold_start=");
                sb.append(C27287e.ah());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m100357a(C27331b bVar) {
        if (bVar == null) {
            return false;
        }
        return bVar.mo97503q() || bVar.mo97502p();
    }

    /* renamed from: a */
    public static boolean m100358a(C27338f fVar, C27368t tVar) {
        return fVar != null && fVar.mo97538e() && m100361a(fVar.mo97536c(), tVar);
    }

    /* renamed from: a */
    public static boolean m100359a(C27349o oVar, C27368t tVar) {
        return oVar != null && oVar.mo97580i() && m100361a(oVar.mo97575d(), tVar);
    }

    /* renamed from: a */
    private static boolean m100361a(String str, C27368t tVar) {
        if (C27480i.m100385a(str)) {
            return false;
        }
        String[] strArr = {m100375d(str), m100366b(str)};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
                if (tVar.mo97674h(str)) {
                    return true;
                }
                C27278b.m99171a().mo97297a(str, str2);
                C27319h.m99371a().mo97385a(str, str2);
            }
        }
        tVar.mo97672g(str);
        return false;
    }

    /* renamed from: a */
    public static List<C27331b> m100349a(JSONArray jSONArray, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            JSONObject jSONObject = null;
            if (z) {
                jSONObject = m100380h();
            }
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C27331b bVar = new C27331b();
                    bVar.mo97465a(optJSONObject, j, z);
                    if (z) {
                        if (jSONObject != null) {
                            int optInt = jSONObject.optInt(String.valueOf(bVar.mo97509v()), 0);
                            bVar.mo97461a(optInt);
                            C27471a.m100283a("show times updated, id:" + bVar.mo97509v() + ", current show time: " + optInt);
                        }
                    } else if (m100357a(bVar)) {
                        C27278b.m99171a().mo97295a(bVar, "topview_boarding");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C27331b> m100348a(JSONArray jSONArray, long j) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C27331b bVar = new C27331b();
                    bVar.mo97464a(optJSONObject, j);
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C27331b> m100350a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C27331b bVar = new C27331b();
                    bVar.mo97463a(optJSONObject);
                    if (!z) {
                        arrayList.add(bVar);
                    } else if (System.currentTimeMillis() <= bVar.mo97489e()) {
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, C27331b> m100351a(List<C27331b> list) {
        HashMap hashMap = new HashMap();
        if (C27476f.m100322a(list)) {
            return hashMap;
        }
        for (C27331b bVar : list) {
            if (!TextUtils.isEmpty(bVar.mo97501o())) {
                hashMap.put(bVar.mo97501o(), bVar);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<C27331b> m100345a(List<C27331b> list, List<C27331b> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C27331b bVar = list.get(i);
            if (m100370b(bVar)) {
                arrayList.add(bVar);
                C27471a.m100285b(bVar.mo97509v(), "preload progress: suitable first-show ad");
            } else {
                C27471a.m100285b(bVar.mo97509v(), "preload progress: first-show ad expired");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C27476f.m100322a(list2)) {
            return arrayList;
        }
        for (C27331b bVar2 : list2) {
            if (bVar2.mo97448N() == 1) {
                arrayList2.add(bVar2);
                C27471a.m100285b(bVar2.mo97509v(), "preload progress: get one first-show ad");
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public static <E extends C27343k> List<C27331b> m100346a(Map<String, C27331b> map, List<E> list) {
        ArrayList arrayList = new ArrayList();
        if (!C27476f.m100322a(list) && map != null) {
            for (E e : list) {
                C27331b bVar = map.get(e.aj());
                if (bVar != null) {
                    if (e instanceof C27342j) {
                        bVar.mo97462a(((C27342j) e).mo97554a());
                        bVar.mo97466a(true);
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m100343a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (!C27480i.m100385a(entry.getKey()) && !C27480i.m100385a(entry.getValue())) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m100342a(C27349o oVar, boolean z) {
        if (TextUtils.isEmpty(C27287e.m99215N()) || !z) {
            return m100365b(oVar);
        }
        return m100372c(oVar);
    }

    /* renamed from: b */
    public static boolean m100370b(C27331b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        return bVar.mo97488d() <= instance.getTimeInMillis() && currentTimeMillis < bVar.mo97489e();
    }

    /* renamed from: a */
    public static void m100352a(final View view, final int i, final int i2, final int i3, final int i4) {
        ((View) view.getParent()).post(new Runnable() {
            /* class com.ss.android.ad.splash.utils.C27478h.RunnableC274791 */

            public void run() {
                View view = view;
                if (view != null && view.getParent() != null) {
                    Rect rect = new Rect();
                    view.setEnabled(true);
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i2;
                    rect.left -= i3;
                    rect.right += i4;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (View.class.isInstance(view.getParent())) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m100354a(int r4, boolean r5) {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            if (r4 == 0) goto L_0x0015
            if (r4 == r2) goto L_0x000e
            if (r4 == r1) goto L_0x000e
            r3 = 3
            if (r4 == r3) goto L_0x0015
            r4 = 0
            goto L_0x001a
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            r4 = 8
            goto L_0x001a
        L_0x0013:
            r4 = 4
            goto L_0x001a
        L_0x0015:
            if (r5 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            r4 = r1
        L_0x001a:
            int r5 = com.ss.android.ad.splash.core.C27287e.av()
            r4 = r4 & r5
            if (r4 <= 0) goto L_0x0022
            r0 = 1
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.utils.C27478h.m100354a(int, boolean):boolean");
    }

    /* renamed from: a */
    public static boolean m100356a(Context context) {
        return C0835f.m3981a(context.getResources().getConfiguration().locale) == 1;
    }

    /* renamed from: a */
    public static AbstractC27436f m100339a(BDASplashVideoView bDASplashVideoView) {
        if (C27287e.m99259e().mo97710o()) {
            return new BDASplashVideoAsyncController(bDASplashVideoView);
        }
        return new C27431d(bDASplashVideoView);
    }

    /* renamed from: a */
    public static int m100331a() {
        int k = m100383k();
        if (k <= 0) {
            return m100384l();
        }
        return k;
    }

    /* renamed from: i */
    public static boolean m100381i() {
        AbstractC27469t U = C27287e.m99222U();
        if (U != null) {
            return U.mo98077a();
        }
        return false;
    }

    /* renamed from: k */
    private static int m100383k() {
        return (int) C27484l.m100391a(C27287e.m99221T(), (float) C27287e.m99224W());
    }

    /* renamed from: h */
    public static JSONObject m100380h() {
        try {
            String D = C27368t.m99732a().mo97643D();
            if (!TextUtils.isEmpty(D)) {
                return new JSONObject(D);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static int m100382j() {
        int a = (int) C27484l.m100391a(C27287e.m99221T(), (float) C27287e.af());
        if (a > 0) {
            return a;
        }
        return (m100331a() / 2) - C27287e.m99221T().getResources().getDimensionPixelSize(R.dimen.splash_ad_ab_ignore_height);
    }

    /* renamed from: c */
    public static String m100371c() {
        C27340h f = C27319h.m99371a().mo97397f();
        if (f == null) {
            return null;
        }
        List<C27331b> a = f.mo97543a();
        if (C27476f.m100322a(a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.size(); i++) {
            String n = a.get(i).mo97500n();
            if (!TextUtils.isEmpty(n)) {
                sb.append(n);
                if (i != a.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m100374d() {
        StringBuilder sb = new StringBuilder(5120);
        C27275c i = C27287e.m99267i();
        i.mo97273a(true);
        if (i != null) {
            try {
                String B = C27368t.m99732a().mo97641B();
                sb.append("/api/ad/v3/splash/creatives/");
                sb.append("?_unused=0");
                sb.append((CharSequence) m100378f());
                sb.append(i.toString());
                if (!TextUtils.isEmpty(B)) {
                    sb.append(B);
                }
                if (C27287e.ah() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C27287e.ah());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    /* renamed from: e */
    public static String m100376e() {
        StringBuilder sb = new StringBuilder(5120);
        C27275c i = C27287e.m99267i();
        i.mo97273a(true);
        if (i != null) {
            try {
                String B = C27368t.m99732a().mo97641B();
                sb.append("/api/ad/v2/ack/splash/");
                sb.append("?_unused=0");
                sb.append((CharSequence) m100378f());
                sb.append(i.toString());
                if (!TextUtils.isEmpty(B)) {
                    sb.append(B);
                }
                sb.append("&refresh_num=");
                sb.append(C27368t.m99732a().mo97695z());
                if (C27287e.ah() != -1) {
                    sb.append("&is_cold_start=");
                    sb.append(C27287e.ah());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("getCommonParamsForRealtimeRequest is not allowed to assigned null");
    }

    /* renamed from: l */
    private static int m100384l() {
        int i;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) C27287e.m99221T().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        double d = (double) C27287e.m99221T().getResources().getDisplayMetrics().density;
        if (d <= 1.1d) {
            i = 100;
        } else if (d <= 1.6d) {
            i = 960;
        } else {
            i = 1260;
        }
        return (((point.y - C27484l.m100399b(C27287e.m99221T())) * LocationRequest.PRIORITY_HD_ACCURACY) / i) + ((int) C27484l.m100391a(C27287e.m99221T(), 25.0f));
    }

    /* renamed from: b */
    public static String m100363b() {
        C27275c i = C27287e.m99267i();
        i.mo97273a(true);
        HashMap<String, String> S = C27287e.m99220S();
        if (i == null) {
            C27471a.m100293d("CommonParams is null, please check whether SplashAdSdk is initialized properly!");
            return null;
        }
        String b = i.mo97274b();
        if (C27480i.m100385a(b)) {
            C27471a.m100293d("app_name is null, please check whether SplashAdSdk is initialized properly!");
            return null;
        }
        StringBuilder sb = new StringBuilder(5120);
        try {
            sb.append("/api/ad/splash/");
            sb.append(b);
            if (C27287e.ai()) {
                sb.append("/v14/");
            } else {
                sb.append("/v16/");
            }
            sb.append("?_unused=0");
            sb.append((CharSequence) m100378f());
            sb.append(i.toString());
            sb.append("&app_name=");
            sb.append(b);
            if (S != null) {
                sb.append(m100343a(S));
            }
            sb.append("&refresh_num=");
            sb.append(C27368t.m99732a().mo97695z() + 1);
            if (C27287e.ah() != -1) {
                sb.append("&is_cold_start=");
                sb.append(C27287e.ah());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static long m100379g() {
        if (!C27287e.at()) {
            return System.currentTimeMillis();
        }
        long h = C27375v.m99833a().mo97751h();
        if (h != -1) {
            C27471a.m100283a("time check, remote time back:" + h);
            return h;
        }
        long c = C27368t.m99732a().mo97658c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < c) {
            C27471a.m100283a("time check, device restarted, current time :" + elapsedRealtime + ", last boot time: " + c);
            return -1;
        }
        long b = C27368t.m99732a().mo97654b();
        long j = elapsedRealtime - c;
        StringBuilder sb = new StringBuilder();
        sb.append("time check, last remote time: ");
        sb.append(b);
        sb.append(", time gap between launch: ");
        sb.append(j);
        sb.append(", current time calculated: ");
        long j2 = b + j;
        sb.append(j2);
        C27471a.m100283a(sb.toString());
        return j2;
    }

    static {
        HashMap hashMap = new HashMap();
        f68694a = hashMap;
        HashSet hashSet = new HashSet();
        f68695b = hashSet;
        hashMap.put("1128", "aweme");
        hashMap.put("1180", "trill");
        hashMap.put("1233", "musical");
        hashMap.put("13", "news_article");
        hashMap.put("35", "news_article_lite");
        hashMap.put("32", "video_article");
        hashMap.put("1106", "topbuzz");
        hashMap.put("1116", "topbuzz");
        hashMap.put("1131", "topbuzz");
        hashMap.put("1184", "topbuzz");
        hashMap.put("1104", "topbuzz");
        hashMap.put("1117", "topbuzz");
        hashMap.put("1132", "topbuzz");
        hashMap.put("1185", "topbuzz");
        hashMap.put("1239", "topbuzz");
        hashMap.put("1197", "topbuzz");
        hashMap.put("1193", "topbuzz");
        hashMap.put("1222", "topbuzz");
        hashMap.put("1211", "topbuzz");
        hashMap.put("1194", "topbuzz");
        hashMap.put("1124", "topbuzz");
        hashMap.put("1125", "topbuzz");
        hashMap.put("1245", "topbuzz");
        hashMap.put("1113", "topbuzz");
        hashMap.put("1342", "topbuzz");
        hashMap.put("1346", "topbuzz");
        hashMap.put("1145", "live_i18n");
        hashMap.put("1164", "flipagram");
        hashMap.put("7", "neihan");
        hashMap.put("10001", "faceu");
        hashMap.put("1207", "learning");
        hashMap.put("36", "automobile");
        hashMap.put("150121", "beauty_me");
        hashMap.put("1372", "beauty_me_oversea");
        hashMap.put("1319", "super");
        hashMap.put("1370", "f100");
        hashMap.put("1488", "f101");
        hashMap.put("1353", "hively");
        hashMap.put("1354", "hively");
        hashMap.put("1112", "live_stream");
        hashMap.put("1350", "live_stream_lite");
        hashMap.put("1398", "homed");
        hashMap.put("1967", "novelapp");
        hashMap.put("1840", "xianshijie");
        hashMap.put("3040", "novel_fm");
        hashSet.add("1180");
        hashSet.add("1233");
        hashSet.add("1106");
        hashSet.add("1116");
        hashSet.add("1131");
        hashSet.add("1184");
        hashSet.add("1104");
        hashSet.add("1117");
        hashSet.add("1132");
        hashSet.add("1185");
        hashSet.add("1239");
        hashSet.add("1197");
        hashSet.add("1193");
        hashSet.add("1222");
        hashSet.add("1211");
        hashSet.add("1194");
        hashSet.add("1124");
        hashSet.add("1125");
        hashSet.add("1245");
        hashSet.add("1113");
        hashSet.add("1342");
        hashSet.add("1346");
        hashSet.add("1372");
    }

    /* renamed from: f */
    public static StringBuilder m100378f() {
        StringBuilder sb = new StringBuilder(1024);
        TelephonyManager telephonyManager = (TelephonyManager) C27287e.m99221T().getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!C27480i.m100385a(networkOperatorName)) {
                sb.append("&carrier=");
                sb.append(Uri.encode(networkOperatorName));
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!C27480i.m100385a(networkOperator)) {
                sb.append("&mcc_mnc=");
                sb.append(Uri.encode(networkOperator));
            }
        }
        DisplayMetrics displayMetrics = C27287e.m99221T().getResources().getDisplayMetrics();
        int b = displayMetrics.heightPixels - C27484l.m100399b(C27287e.m99221T());
        sb.append("&ad_area=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(b);
        sb.append("&sdk_version=");
        sb.append(C27287e.aa());
        sb.append("&os_api=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&device_platform=");
        sb.append("android");
        sb.append("&os_version=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("&display_density=");
        sb.append(displayMetrics.widthPixels);
        sb.append("x");
        sb.append(displayMetrics.heightPixels);
        sb.append("&dpi=");
        sb.append(C27484l.m100392a(C27287e.m99221T()));
        sb.append("&device_brand=");
        sb.append(Uri.encode(Build.BRAND));
        sb.append("&device_type=");
        sb.append(Uri.encode(Build.MODEL));
        int a = m100331a();
        if (a > 0) {
            sb.append("&bh=");
            sb.append(a);
        }
        sb.append("&display_dpi=");
        sb.append(displayMetrics.densityDpi);
        sb.append("&density=");
        sb.append(displayMetrics.density);
        String e = NetworkUtils.m100280e(C27287e.m99221T());
        if (!C27480i.m100385a(e)) {
            sb.append("&ac=");
            sb.append(Uri.encode(e));
        }
        return sb;
    }

    /* renamed from: a */
    public static List<C27331b> m100347a(JSONArray jSONArray) {
        return m100350a(jSONArray, false);
    }

    /* renamed from: b */
    public static String m100364b(C27338f fVar) {
        if (fVar == null || !fVar.mo97538e()) {
            return null;
        }
        return m100366b(fVar.mo97536c());
    }

    /* renamed from: c */
    public static String m100372c(C27349o oVar) {
        if (oVar == null || !oVar.mo97580i()) {
            return null;
        }
        return m100375d(oVar.mo97575d());
    }

    /* renamed from: d */
    public static String m100375d(String str) {
        if (C27480i.m100385a(str)) {
            return null;
        }
        String N = C27287e.m99215N();
        if (TextUtils.isEmpty(N)) {
            return null;
        }
        return m100367b(N, str);
    }

    /* renamed from: a */
    public static int m100332a(String str) {
        if (C27480i.m100385a(str)) {
            return 0;
        }
        try {
            if (C27480i.m100385a(Uri.parse(str).getScheme())) {
                return 0;
            }
            if (C27485m.m100401a(str)) {
                return 2;
            }
            if (C27485m.m100403c(str)) {
                return 5;
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static String m100365b(C27349o oVar) {
        if (oVar == null || !oVar.mo97580i()) {
            return null;
        }
        return m100366b(oVar.mo97575d());
    }

    /* renamed from: a */
    public static long m100334a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        m100353a(instance);
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    public static String m100366b(String str) {
        if (C27287e.m99259e().mo97697b()) {
            return m100373c(str);
        }
        if (C27480i.m100385a(str)) {
            return null;
        }
        String L = C27287e.m99213L();
        if (TextUtils.isEmpty(L)) {
            return null;
        }
        return m100367b(L, str);
    }

    /* renamed from: a */
    public static long m100335a(AbstractC27456a aVar) {
        if (aVar instanceof C27331b) {
            return (((C27331b) aVar).mo97489e() - System.currentTimeMillis()) / 1000;
        }
        return 0;
    }

    /* renamed from: c */
    public static String m100373c(String str) {
        String str2;
        String str3 = null;
        if (C27480i.m100385a(str)) {
            return null;
        }
        String L = C27287e.m99213L();
        String M = C27287e.m99214M();
        if (TextUtils.isEmpty(L) && TextUtils.isEmpty(M)) {
            return null;
        }
        if (L != null && L.equals(M)) {
            return m100367b(L, str);
        }
        if (!TextUtils.isEmpty(L)) {
            str2 = m100367b(L, str);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(M)) {
            str3 = m100367b(M, str);
        }
        if (!C27474d.m100321c(str2) && C27474d.m100321c(str3)) {
            return str3;
        }
        return str2;
    }

    /* renamed from: e */
    public static boolean m100377e(String str) {
        if (C27480i.m100385a(str)) {
            return false;
        }
        try {
            int a = m100332a(str);
            if (a == 1) {
                Uri parse = Uri.parse(str);
                if ("sslocal".equalsIgnoreCase(parse.getScheme())) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                return C27482k.m100389a(C27287e.m99221T(), intent);
            } else if (a == 2 || a == 5) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            C27234a.m98988a().mo97120a(e, "key_exception_open_url");
            return false;
        }
    }

    /* renamed from: b */
    public static List<C27343k> m100368b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C27343k(optString));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static JSONArray m100369b(List<C27331b> list) {
        JSONArray jSONArray = new JSONArray();
        if (C27476f.m100322a(list)) {
            return jSONArray;
        }
        try {
            for (C27331b bVar : list) {
                if (bVar.mo97455U() != null) {
                    jSONArray.put(bVar.mo97455U());
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static int m100333a(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    /* renamed from: a */
    public static Pair<Boolean, Integer> m100336a(long j, int[][] iArr) {
        if (iArr != null && iArr.length > 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            m100353a(instance);
            long timeInMillis = j - instance.getTimeInMillis();
            for (int i = 0; i < iArr.length; i++) {
                int[] iArr2 = iArr[i];
                if (iArr2.length >= 2) {
                    long j2 = ((long) iArr2[1]) * 1000;
                    if (((long) iArr2[0]) * 1000 <= timeInMillis && timeInMillis <= j2) {
                        return new Pair<>(true, Integer.valueOf(i));
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m100367b(String str, String str2) {
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            return str + C27472b.m100294a(str2);
        } catch (Exception unused) {
            C27471a.m100287b(" illegal cache path ");
            return null;
        }
    }

    /* renamed from: a */
    public static C27340h m100338a(JSONArray jSONArray, JSONArray jSONArray2, long j) {
        C27340h hVar = new C27340h();
        List<C27331b> a = m100348a(jSONArray2, j);
        if (C27287e.m99269j() != null) {
            C27287e.m99269j().mo97141a(a);
        }
        List<C27331b> a2 = m100350a(jSONArray, true);
        List<C27331b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (C27331b bVar : a2) {
            if (!C27480i.m100385a(bVar.aj())) {
                arrayList.add(bVar);
            }
        }
        for (C27331b bVar2 : a) {
            if (m100357a(bVar2)) {
                C27278b.m99171a().mo97295a(bVar2, "topview_boarding");
            }
            if (!C27480i.m100385a(bVar2.aj())) {
                arrayList2.add(bVar2);
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        Map<String, C27331b> a3 = m100351a(arrayList);
        hVar.mo97544a(arrayList);
        hVar.mo97545a(a3);
        hVar.mo97549c(a);
        return hVar;
    }

    /* renamed from: a */
    public static FrameLayout.LayoutParams m100337a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = f / f2;
        float f4 = (float) i3;
        float f5 = (float) i4;
        float f6 = f4 / f5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (f6 > f3) {
            i6 = (int) ((f4 * f2) / f5);
            i5 = i2;
        } else {
            if (f6 < f3) {
                i5 = (int) ((f * f5) / f4);
                i6 = i;
            }
            return layoutParams;
        }
        int i7 = (-Math.abs(i6 - i)) / 2;
        int i8 = (-Math.abs(i5 - i2)) / 2;
        layoutParams.setMargins(i7, i8, i7, i8);
        return layoutParams;
    }
}
