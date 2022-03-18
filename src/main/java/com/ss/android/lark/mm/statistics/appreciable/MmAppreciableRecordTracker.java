package com.ss.android.lark.mm.statistics.appreciable;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableRecordTracker;", "", "()V", "TAG", "", "TrackAudioTextGenerateTime", "TrackDetailInitTime", "TrackFinishUploadTime", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.a.e */
public final class MmAppreciableRecordTracker {

    /* renamed from: a */
    public static final MmAppreciableRecordTracker f118536a = new MmAppreciableRecordTracker();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableRecordTracker$TrackAudioTextGenerateTime;", "", "()V", "trackId", "", "timeCost", "", "objectToken", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.statistics.a.e$a */
    public static final class TrackAudioTextGenerateTime {

        /* renamed from: a */
        public static final TrackAudioTextGenerateTime f118537a = new TrackAudioTextGenerateTime();

        /* renamed from: b */
        private static String f118538b = "";

        private TrackAudioTextGenerateTime() {
        }

        /* renamed from: a */
        public final synchronized void mo165396a(String str, long j) {
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            C45855f.m181664c("MmAppreciableRecordTracker", "[TrackAudioTextGenerateTime], timeCost: " + j + ", objectToken:" + str);
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            Biz biz = Biz.VideoConference;
            Scene scene = Scene.MinutesRecorder;
            Event event = Event.minutes_audio_text_displayed;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("object_token", str);
            f118538b = AppreciableKit.m107388a(a, biz, scene, event, null, false, null, null, null, linkedHashMap, 240, null);
            AppreciableKit.m107389a(AppreciableKit.f73094h.mo103524a(), f118538b, j, (Map) null, (Map) null, (Map) null, (Map) null, 60, (Object) null);
            f118538b = "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableRecordTracker$TrackDetailInitTime;", "", "()V", "lastTime", "", "latencyDetail", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "startTime", "trackId", "end", "", "putDetailDataProcess", "putDetailNetworkRequest", "putDetailPreProcess", "putDetailRender", "start", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.statistics.a.e$b */
    public static final class TrackDetailInitTime {

        /* renamed from: a */
        public static final TrackDetailInitTime f118539a = new TrackDetailInitTime();

        /* renamed from: b */
        private static String f118540b = "";

        /* renamed from: c */
        private static long f118541c;

        /* renamed from: d */
        private static long f118542d;

        /* renamed from: e */
        private static final HashMap<String, String> f118543e = new HashMap<>();

        private TrackDetailInitTime() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final synchronized void m186407a() {
            synchronized (TrackDetailInitTime.class) {
                C45855f.m181664c("MmAppreciableRecordTracker", "start [TrackDetailInitTime]");
                long currentTimeMillis = System.currentTimeMillis();
                f118542d = currentTimeMillis;
                f118541c = currentTimeMillis;
                f118540b = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.MinutesRecorder, Event.minutes_enter_recorder_time, (String) null, false, 16, (Object) null);
            }
        }

        /* renamed from: b */
        public final void mo165397b() {
            if (StringsKt.isBlank(f118540b)) {
                C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailPreProcess] end failed, because trackId is empty");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - f118541c;
            C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailPreProcess], time: " + currentTimeMillis);
            f118543e.put("pre_process", String.valueOf(currentTimeMillis));
            f118541c = System.currentTimeMillis();
        }

        /* renamed from: c */
        public final void mo165398c() {
            if (StringsKt.isBlank(f118540b)) {
                C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailNetworkRequest] end failed, because trackId is empty");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - f118541c;
            C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailNetworkRequest], time: " + currentTimeMillis);
            f118543e.put("network_request", String.valueOf(currentTimeMillis));
            f118541c = System.currentTimeMillis();
        }

        /* renamed from: d */
        public final void mo165399d() {
            if (StringsKt.isBlank(f118540b)) {
                C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailDataProcess] end failed, because trackId is empty");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - f118541c;
            C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailDataProcess], time: " + currentTimeMillis);
            f118543e.put("data_process", String.valueOf(currentTimeMillis));
            f118541c = System.currentTimeMillis();
        }

        /* renamed from: e */
        public final void mo165400e() {
            if (StringsKt.isBlank(f118540b)) {
                C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailRender] end failed, because trackId is empty");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - f118541c;
            C45855f.m181664c("MmAppreciableRecordTracker", "[putDetailRender], time: " + currentTimeMillis);
            f118543e.put("render", String.valueOf(currentTimeMillis));
            f118541c = System.currentTimeMillis();
        }

        @JvmStatic
        /* renamed from: f */
        public static final synchronized void m186408f() {
            synchronized (TrackDetailInitTime.class) {
                if (StringsKt.isBlank(f118540b)) {
                    C45855f.m181664c("MmAppreciableRecordTracker", "[TrackDetailInitTime] end failed, because trackId is empty");
                    return;
                }
                C45855f.m181664c("MmAppreciableRecordTracker", "[TrackDetailInitTime] end, time: " + (System.currentTimeMillis() - f118542d));
                AppreciableKit a = AppreciableKit.f73094h.mo103524a();
                String str = f118540b;
                HashMap<String, String> hashMap = f118543e;
                AppreciableKit.m107396c(a, str, hashMap, null, null, null, 28, null);
                f118540b = "";
                hashMap.clear();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/statistics/appreciable/MmAppreciableRecordTracker$TrackFinishUploadTime;", "", "()V", "activeTime", "", "isStart", "", "trackId", "", "appendActiveTime", "", "time", "end", "start", "toUploadBytes", "objectToken", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.statistics.a.e$c */
    public static final class TrackFinishUploadTime {

        /* renamed from: a */
        public static final TrackFinishUploadTime f118544a = new TrackFinishUploadTime();

        /* renamed from: b */
        private static String f118545b = "";

        /* renamed from: c */
        private static long f118546c;

        /* renamed from: d */
        private static boolean f118547d;

        private TrackFinishUploadTime() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final synchronized void m186413a() {
            synchronized (TrackFinishUploadTime.class) {
                f118547d = false;
                if (StringsKt.isBlank(f118545b)) {
                    C45855f.m181666e("MmAppreciableRecordTracker", "[TrackFinishUploadTime] end failed, because trackId is empty");
                    return;
                }
                C45855f.m181664c("MmAppreciableRecordTracker", "[TrackFinishUploadTime] end, activeTime: " + f118546c);
                AppreciableKit a = AppreciableKit.f73094h.mo103524a();
                String str = f118545b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("active_time", String.valueOf(f118546c));
                AppreciableKit.m107396c(a, str, null, null, linkedHashMap, null, 22, null);
                f118545b = "";
            }
        }

        @JvmStatic
        /* renamed from: a */
        public static final synchronized void m186414a(long j) {
            synchronized (TrackFinishUploadTime.class) {
                if (f118547d) {
                    f118546c += j;
                }
            }
        }

        @JvmStatic
        /* renamed from: a */
        public static final synchronized void m186415a(long j, String str) {
            synchronized (TrackFinishUploadTime.class) {
                Intrinsics.checkParameterIsNotNull(str, "objectToken");
                f118547d = true;
                C45855f.m181664c("MmAppreciableRecordTracker", "[TrackFinishUploadTime] start, size: " + j + ", objectToken:" + str);
                AppreciableKit a = AppreciableKit.f73094h.mo103524a();
                Biz biz = Biz.VideoConference;
                Scene scene = Scene.MinutesRecorder;
                Event event = Event.minutes_audio_finish_upload_time;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("size", String.valueOf(j));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("object_token", str);
                f118545b = AppreciableKit.m107388a(a, biz, scene, event, null, false, null, null, linkedHashMap, linkedHashMap2, SmEvents.EVENT_NE_RR, null);
            }
        }
    }

    private MmAppreciableRecordTracker() {
    }
}
