package com.ss.android.lark.mm.statistics.appreciable;

import android.os.SystemClock;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010\u0015\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableDetailTracker;", "", "()V", "IS_FIRST_OPEN", "", "TAG", "isFirstOpen", "", "lastTime", "", "latencyDetail", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startTime", "trackId", "endLoadingDetailPage", "", "putDetailDataProcess", "putDetailNetworkRequest", "putDetailPreProcess", "putDetailRender", "startEnterDetail", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.a.a */
public final class MmAppreciableDetailTracker {

    /* renamed from: a */
    public static final MmAppreciableDetailTracker f118515a = new MmAppreciableDetailTracker();

    /* renamed from: b */
    private static String f118516b = "";

    /* renamed from: c */
    private static long f118517c;

    /* renamed from: d */
    private static long f118518d;

    /* renamed from: e */
    private static final HashMap<String, String> f118519e = new HashMap<>();

    /* renamed from: f */
    private static boolean f118520f = true;

    private MmAppreciableDetailTracker() {
    }

    /* renamed from: b */
    public final void mo165378b() {
        if (StringsKt.isBlank(f118516b)) {
            C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailPreProcess] failed, because trackId is empty");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - f118517c;
        C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailPreProcess], time: " + elapsedRealtime);
        f118519e.put("pre_process", String.valueOf(elapsedRealtime));
        f118517c = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo165379c() {
        if (StringsKt.isBlank(f118516b)) {
            C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailNetworkRequest] failed, because trackId is empty");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - f118517c;
        C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailNetworkRequest], time: " + elapsedRealtime);
        f118519e.put("network_request", String.valueOf(elapsedRealtime));
        f118517c = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final void mo165380d() {
        if (StringsKt.isBlank(f118516b)) {
            C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailDataProcess] failed, because trackId is empty");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - f118517c;
        C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailDataProcess], time: " + elapsedRealtime);
        f118519e.put("data_process", String.valueOf(elapsedRealtime));
        f118517c = SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    public final void mo165381e() {
        if (StringsKt.isBlank(f118516b)) {
            C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailRender] failed, because trackId is empty");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - f118517c;
        C45855f.m181664c("MmAppreciableDetailTracker", "[putDetailRender], time: " + elapsedRealtime);
        f118519e.put("render", String.valueOf(elapsedRealtime));
        f118517c = SystemClock.elapsedRealtime();
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m186381a() {
        synchronized (MmAppreciableDetailTracker.class) {
            C45855f.m181664c("MmAppreciableDetailTracker", "[startEnterDetail]");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f118518d = elapsedRealtime;
            f118517c = elapsedRealtime;
            f118516b = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_enter_detail_time, (String) null, false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) MapsKt.hashMapOf(TuplesKt.to("is_first_open", Boolean.valueOf(f118520f))), (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
            f118520f = false;
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final synchronized void m186382f() {
        synchronized (MmAppreciableDetailTracker.class) {
            if (StringsKt.isBlank(f118516b)) {
                C45855f.m181664c("MmAppreciableDetailTracker", "[endLoadingDetailPage] failed, because trackId is empty");
                return;
            }
            C45855f.m181664c("MmAppreciableDetailTracker", "[endLoadingDetailPage], time: " + (SystemClock.elapsedRealtime() - f118518d));
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            String str = f118516b;
            HashMap<String, String> hashMap = f118519e;
            AppreciableKit.m107396c(a, str, hashMap, null, null, null, 28, null);
            f118516b = "";
            hashMap.clear();
        }
    }
}
