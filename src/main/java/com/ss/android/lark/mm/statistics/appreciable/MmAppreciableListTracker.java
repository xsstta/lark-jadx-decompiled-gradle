package com.ss.android.lark.mm.statistics.appreciable;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableListTracker;", "", "()V", "TAG", "", "lastTime", "", "latencyDetail", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startTime", "trackId", "endLoadingListPage", "", "getListType", "targetTab", "putListDataProcess", "putListNetworkRequest", "putListPreProcess", "putListRender", "startEnterList", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.a.c */
public final class MmAppreciableListTracker {

    /* renamed from: a */
    public static final MmAppreciableListTracker f118526a = new MmAppreciableListTracker();

    /* renamed from: b */
    private static String f118527b = "";

    /* renamed from: c */
    private static long f118528c;

    /* renamed from: d */
    private static long f118529d;

    /* renamed from: e */
    private static final HashMap<String, String> f118530e = new HashMap<>();

    private MmAppreciableListTracker() {
    }

    /* renamed from: a */
    public final void mo165386a() {
        if (StringsKt.isBlank(f118527b)) {
            C45855f.m181664c("MmAppreciableListTracker", "[putListPreProcess] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118528c;
        C45855f.m181664c("MmAppreciableListTracker", "[putListPreProcess], time: " + currentTimeMillis);
        f118530e.put("pre_process", String.valueOf(currentTimeMillis));
        f118528c = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo165388b() {
        if (StringsKt.isBlank(f118527b)) {
            C45855f.m181664c("MmAppreciableListTracker", "[putListNetworkRequest] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118528c;
        C45855f.m181664c("MmAppreciableListTracker", "[putListNetworkRequest], time: " + currentTimeMillis);
        f118530e.put("network_request", String.valueOf(currentTimeMillis));
        f118528c = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final void mo165389c() {
        if (StringsKt.isBlank(f118527b)) {
            C45855f.m181664c("MmAppreciableListTracker", "[putListDataProcess] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118528c;
        C45855f.m181664c("MmAppreciableListTracker", "[putListDataProcess], time: " + currentTimeMillis);
        f118530e.put("data_process", String.valueOf(currentTimeMillis));
        f118528c = System.currentTimeMillis();
    }

    /* renamed from: d */
    public final void mo165390d() {
        if (StringsKt.isBlank(f118527b)) {
            C45855f.m181664c("MmAppreciableListTracker", "[putListRender] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118528c;
        C45855f.m181664c("MmAppreciableListTracker", "[putListRender], time: " + currentTimeMillis);
        f118530e.put("render", String.valueOf(currentTimeMillis));
        f118528c = System.currentTimeMillis();
    }

    /* renamed from: e */
    public final synchronized void mo165391e() {
        if (StringsKt.isBlank(f118527b)) {
            C45855f.m181664c("MmAppreciableListTracker", "[endLoadingListPage] failed, because trackId is empty");
            return;
        }
        C45855f.m181664c("MmAppreciableListTracker", "[endEnterList], time: " + (System.currentTimeMillis() - f118529d));
        AppreciableKit a = AppreciableKit.f73094h.mo103524a();
        String str = f118527b;
        HashMap<String, String> hashMap = f118530e;
        AppreciableKit.m107396c(a, str, hashMap, null, null, null, 28, null);
        f118527b = "";
        hashMap.clear();
    }

    /* renamed from: b */
    private final String m186393b(String str) {
        if (str == null) {
            return "0";
        }
        int hashCode = str.hashCode();
        if (hashCode == 3500) {
            str.equals("my");
            return "0";
        } else if (hashCode != 3208415) {
            if (hashCode != 109400031) {
                if (hashCode == 110621496 && str.equals("trash")) {
                    return "3";
                }
                return "0";
            } else if (str.equals("share")) {
                return "1";
            } else {
                return "0";
            }
        } else if (str.equals("home")) {
            return "2";
        } else {
            return "0";
        }
    }

    /* renamed from: a */
    public final synchronized void mo165387a(String str) {
        C45855f.m181664c("MmAppreciableListTracker", "[startEnterList] targetTab:" + str);
        long currentTimeMillis = System.currentTimeMillis();
        f118529d = currentTimeMillis;
        f118528c = currentTimeMillis;
        AppreciableKit a = AppreciableKit.f73094h.mo103524a();
        Biz biz = Biz.VideoConference;
        Scene scene = Scene.MinutesList;
        Event event = Event.minutes_enter_list_time;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("listtype", f118526a.m186393b(str));
        f118527b = a.mo103510a(biz, scene, event, (String) null, false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) linkedHashMap);
    }
}
