package com.ss.android.lark.widget.photo_picker.statistics;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/PerfVideoViewMonitor;", "", "()V", "TAG", "", "cacheEnabled", "", "isSeek", "playLoadStartTime", "", "getExtraCategory", "Ljava/util/HashMap;", "setCacheEnabled", "", "videoPlayError", "errorCode", "", "videoPlayLoadEnd", "key", "videoPlayLoadStart", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.statistics.e */
public final class PerfVideoViewMonitor {

    /* renamed from: a */
    public static final PerfVideoViewMonitor f145447a = new PerfVideoViewMonitor();

    /* renamed from: b */
    private static boolean f145448b;

    /* renamed from: c */
    private static boolean f145449c;

    /* renamed from: d */
    private static long f145450d;

    private PerfVideoViewMonitor() {
    }

    /* renamed from: a */
    private final HashMap<String, Object> m228163a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap2.put("is_seek", Boolean.valueOf(f145448b));
        hashMap2.put("has_video_cache", Boolean.valueOf(f145449c));
        return hashMap;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m228166b(boolean z) {
        f145449c = z;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m228162a(boolean z) {
        Log.m165389i("PerfVideoViewMonitor", "videoPlayLoadStart, isSeek: " + z);
        f145448b = z;
        f145450d = System.currentTimeMillis();
        return AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Messenger, Scene.Chat, Event.video_play, "", true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m228164a(int i) {
        Log.m165389i("PerfVideoViewMonitor", "videoPlayError, errorCode: " + i);
        HashMap<String, Object> a = f145447a.m228163a();
        a.put("video_engine_error", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("video_play_waiting", Long.valueOf(System.currentTimeMillis() - f145450d));
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.video_play, ErrorType.SDK, ErrorLevel.Fatal, 1, null, "", "", true, null, hashMap, a, 1088, null));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m228165a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Log.m165389i("PerfVideoViewMonitor", "videoPlayLoadEnd, key: " + str);
        AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, null, null, null, f145447a.m228163a(), 14, null);
    }
}
