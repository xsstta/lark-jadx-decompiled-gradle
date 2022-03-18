package com.ss.android.lark.mm.statistics.appreciable;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciablePodcastDetailTracker;", "", "()V", "TAG", "", "lastTime", "", "latencyDetail", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startTime", "trackId", "endLoadingPodcastDetailPage", "", "putPodcastDetailDataProcess", "putPodcastDetailNetworkRequest", "putPodcastDetailPreProcess", "putPodcastDetailRender", "startEnterPodcastDetail", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.a.d */
public final class MmAppreciablePodcastDetailTracker {

    /* renamed from: a */
    public static final MmAppreciablePodcastDetailTracker f118531a = new MmAppreciablePodcastDetailTracker();

    /* renamed from: b */
    private static String f118532b = "";

    /* renamed from: c */
    private static long f118533c;

    /* renamed from: d */
    private static long f118534d;

    /* renamed from: e */
    private static final HashMap<String, String> f118535e = new HashMap<>();

    private MmAppreciablePodcastDetailTracker() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m186400a() {
        synchronized (MmAppreciablePodcastDetailTracker.class) {
            C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[startEnterPodcastDetail]");
            long currentTimeMillis = System.currentTimeMillis();
            f118533c = currentTimeMillis;
            f118534d = currentTimeMillis;
            f118532b = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.VideoConference, Scene.MinutesPodcast, Event.minutes_enter_podcast_time, (String) null, false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }
    }

    /* renamed from: b */
    public final void mo165392b() {
        if (StringsKt.isBlank(f118532b)) {
            C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailPreProcess] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118534d;
        C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailPreProcess], time: " + currentTimeMillis);
        f118535e.put("pre_process", String.valueOf(currentTimeMillis));
        f118534d = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final void mo165393c() {
        if (StringsKt.isBlank(f118532b)) {
            C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailNetworkRequest] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118534d;
        C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailNetworkRequest], time: " + currentTimeMillis);
        f118535e.put("network_request", String.valueOf(currentTimeMillis));
        f118534d = System.currentTimeMillis();
    }

    /* renamed from: d */
    public final void mo165394d() {
        if (StringsKt.isBlank(f118532b)) {
            C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailDataProcess] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118534d;
        C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailDataProcess], time: " + currentTimeMillis);
        f118535e.put("data_process", String.valueOf(currentTimeMillis));
        f118534d = System.currentTimeMillis();
    }

    /* renamed from: e */
    public final void mo165395e() {
        if (StringsKt.isBlank(f118532b)) {
            C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailRender] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118534d;
        C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[putPodcastDetailRender], time: " + currentTimeMillis);
        f118535e.put("render", String.valueOf(currentTimeMillis));
        f118534d = System.currentTimeMillis();
    }

    @JvmStatic
    /* renamed from: f */
    public static final synchronized void m186401f() {
        synchronized (MmAppreciablePodcastDetailTracker.class) {
            if (StringsKt.isBlank(f118532b)) {
                C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[endLoadingPodcastDetailPage] failed, because trackId is empty");
                return;
            }
            C45855f.m181664c("MmAppreciablePodcastDetailTracker", "[endLoadingPodcastDetailPage], time: " + (System.currentTimeMillis() - f118533c));
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            String str = f118532b;
            HashMap<String, String> hashMap = f118535e;
            AppreciableKit.m107396c(a, str, hashMap, null, null, null, 28, null);
            f118532b = "";
            hashMap.clear();
        }
    }
}
