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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableEditSpeakerTracker;", "", "()V", "TAG", "", "lastTime", "", "latencyDetail", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startTime", "trackId", "endLoadingEditSpeakerPage", "", "putEditSpeakerDataProcess", "putEditSpeakerNetworkRequest", "putEditSpeakerPreProcess", "putEditSpeakerRender", "startEnterEditSpeaker", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.a.b */
public final class MmAppreciableEditSpeakerTracker {

    /* renamed from: a */
    public static final MmAppreciableEditSpeakerTracker f118521a = new MmAppreciableEditSpeakerTracker();

    /* renamed from: b */
    private static String f118522b = "";

    /* renamed from: c */
    private static long f118523c;

    /* renamed from: d */
    private static long f118524d;

    /* renamed from: e */
    private static final HashMap<String, String> f118525e = new HashMap<>();

    private MmAppreciableEditSpeakerTracker() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m186387a() {
        C45855f.m181664c("MmAppreciableEditSpeaker", "[startEnterEditSpeaker]");
        long currentTimeMillis = System.currentTimeMillis();
        f118524d = currentTimeMillis;
        f118523c = currentTimeMillis;
        f118522b = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_enter_edit_mode_time, (String) null, false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
    }

    /* renamed from: b */
    public final void mo165382b() {
        if (StringsKt.isBlank(f118522b)) {
            C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerPreProcess] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118523c;
        C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerPreProcess], time: " + currentTimeMillis);
        f118525e.put("pre_process", String.valueOf(currentTimeMillis));
        f118523c = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final void mo165383c() {
        if (StringsKt.isBlank(f118522b)) {
            C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerNetworkRequest] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118523c;
        C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerNetworkRequest], time: " + currentTimeMillis);
        f118525e.put("network_request", String.valueOf(currentTimeMillis));
        f118523c = System.currentTimeMillis();
    }

    /* renamed from: d */
    public final void mo165384d() {
        if (StringsKt.isBlank(f118522b)) {
            C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerDataProcess] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118523c;
        C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerDataProcess], time: " + currentTimeMillis);
        f118525e.put("data_process", String.valueOf(currentTimeMillis));
        f118523c = System.currentTimeMillis();
    }

    /* renamed from: e */
    public final void mo165385e() {
        if (StringsKt.isBlank(f118522b)) {
            C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerRender] failed, because trackId is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f118523c;
        C45855f.m181664c("MmAppreciableEditSpeaker", "[putEditSpeakerRender], time: " + currentTimeMillis);
        f118525e.put("render", String.valueOf(currentTimeMillis));
        f118523c = System.currentTimeMillis();
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m186388f() {
        if (StringsKt.isBlank(f118522b)) {
            C45855f.m181664c("MmAppreciableEditSpeaker", "[endLoadingEditSpeakerPage] failed, because trackId is empty");
            return;
        }
        C45855f.m181664c("MmAppreciableEditSpeaker", "[endLoadingEditSpeakerPage], time: " + (System.currentTimeMillis() - f118524d));
        AppreciableKit a = AppreciableKit.f73094h.mo103524a();
        String str = f118522b;
        HashMap<String, String> hashMap = f118525e;
        AppreciableKit.m107396c(a, str, hashMap, null, null, null, 28, null);
        f118522b = "";
        hashMap.clear();
    }
}
