package com.ss.android.lark.keyboard.plugin.tool.checker;

import android.os.Looper;
import com.huawei.hms.adapter.internal.CommonCode;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ResolutionConfig;
import com.ss.android.lark.utils.VideoSendConfig;
import com.ss.android.lark.utils.VideoSettingUtils;
import com.ss.android.lark.utils.ao;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0003\u0014\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker;", "", "()V", "mCallbackRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Callback;", "checkVideoInternal", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "path", "", "checkVideos", "", "videos", "", "callback", "reportCheckResult", "result", "runInIO", "runnable", "Ljava/lang/Runnable;", "Callback", "Companion", "Result", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoSendChecker {

    /* renamed from: b */
    public static final Companion f103795b = new Companion(null);

    /* renamed from: a */
    public WeakReference<Callback> f103796a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "", "(Ljava/lang/String;I)V", "LIMIT_SIZE", "LIMIT_DURATION", "LIMIT_RESOLUTION", "LIMIT_FPS", "LIMIT_BITRATE", "LIMIT_VE_NO_SUPPORT", "VALID", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Result {
        LIMIT_SIZE,
        LIMIT_DURATION,
        LIMIT_RESOLUTION,
        LIMIT_FPS,
        LIMIT_BITRATE,
        LIMIT_VE_NO_SUPPORT,
        VALID
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Callback;", "", "onResult", "", "result", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "invalidList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker$a */
    public interface Callback {
        /* renamed from: a */
        void mo147418a(Result result, ArrayList<String> arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker$d */
    public static final class RunnableC40822d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f103802a;

        RunnableC40822d(Runnable runnable) {
            this.f103802a = runnable;
        }

        public final void run() {
            this.f103802a.run();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker$c */
    public static final class RunnableC40820c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoSendChecker f103797a;

        /* renamed from: b */
        final /* synthetic */ List f103798b;

        RunnableC40820c(VideoSendChecker videoSendChecker, List list) {
            this.f103797a = videoSendChecker;
            this.f103798b = list;
        }

        public final void run() {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) Result.VALID;
            final ArrayList arrayList = new ArrayList();
            for (String str : this.f103798b) {
                T t = (T) this.f103797a.mo147416a(str);
                if (Result.VALID != t) {
                    if (objectRef.element == Result.VALID) {
                        objectRef.element = t;
                    }
                    arrayList.add(str);
                }
            }
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker.RunnableC40820c.RunnableC408211 */

                /* renamed from: a */
                final /* synthetic */ RunnableC40820c f103799a;

                {
                    this.f103799a = r1;
                }

                public final void run() {
                    Callback aVar;
                    WeakReference<Callback> weakReference = this.f103799a.f103797a.f103796a;
                    if (weakReference != null && (aVar = weakReference.get()) != null) {
                        aVar.mo147418a(objectRef.element, arrayList);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final void m161672a(Runnable runnable) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC40822d(runnable));
            return;
        }
        runnable.run();
    }

    /* renamed from: a */
    private final void m161671a(Result result) {
        int i = 0;
        String str = "";
        switch (C40829h.f103810a[result.ordinal()]) {
            case 1:
                str = "size";
                i = 1;
                break;
            case 2:
                str = "duration";
                i = 1;
                break;
            case 3:
                str = CommonCode.MapKey.HAS_RESOLUTION;
                i = 1;
                break;
            case 4:
                str = "fps";
                i = 1;
                break;
            case 5:
                str = "bitrate";
                i = 1;
                break;
            case 6:
                str = "no_support";
                i = 1;
                break;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("intercept_result", i);
        jSONObject.put("intercept_type", str);
        Statistics.sendEvent("video_intercept_event_dev", jSONObject);
    }

    /* renamed from: a */
    public final Result mo147416a(String str) {
        Result result;
        VideoSendConfig a = VideoSettingUtils.m224293a();
        ResolutionConfig limitVideoResolution = a.getLimitVideoResolution();
        long c = C26311p.m95281c(new File(str));
        VEUtils.VEVideoFileInfo b = ao.m224311b(str);
        Intrinsics.checkExpressionValueIsNotNull(b, "VideoTools.getVideoInfo(path)");
        Log.m165389i("VideoSendChecker", String.valueOf(b));
        if (c > a.getLimitFileSize()) {
            result = Result.LIMIT_SIZE;
        } else if (b.duration > a.getLimitVideoDuration() * 1000) {
            result = Result.LIMIT_DURATION;
        } else if (b.width * b.height > limitVideoResolution.getWidth() * limitVideoResolution.getHeight()) {
            result = Result.LIMIT_RESOLUTION;
        } else if (b.fps > a.getLimitVideoFrameRate()) {
            result = Result.LIMIT_FPS;
        } else if (b.bitrate * 1000 > a.getLimitVideoBitrate()) {
            result = Result.LIMIT_BITRATE;
        } else if (ao.m224307a(str)) {
            result = Result.LIMIT_VE_NO_SUPPORT;
        } else {
            result = Result.VALID;
        }
        Log.m165389i("VideoSendChecker", "check video result: " + result);
        m161671a(result);
        return result;
    }

    /* renamed from: a */
    public final void mo147417a(List<String> list, Callback aVar) {
        Intrinsics.checkParameterIsNotNull(list, "videos");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f103796a = new WeakReference<>(aVar);
        m161672a(new RunnableC40820c(this, list));
    }
}
