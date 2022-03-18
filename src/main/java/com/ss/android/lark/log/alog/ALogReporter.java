package com.ss.android.lark.log.alog;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.C41702d;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0015H\u0002J\"\u0010#\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogReporter;", "", "()V", "sHander", "Landroid/os/Handler;", "getSHander", "()Landroid/os/Handler;", "sHander$delegate", "Lkotlin/Lazy;", "sHandlerThread", "Landroid/os/HandlerThread;", "sInited", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sLastReportTime", "", "sLogConfig", "Lcom/ss/android/lark/log/LogConfig;", "sReportConfig", "Lcom/ss/android/lark/log/alog/ReportConfig;", "sTagFCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "monitor", "", "tag", "msg", "needSplit", "", "reportFEvent", "count", "reportOnce", "reportProduceEvent", "processEnum", "reportProduceEventIfNeed", "split", "callback", "Lcom/ss/android/lark/log/alog/ISplitCallback;", "start", "logConfig", "Companion", "SingletonHolder", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.log.alog.c */
public final class ALogReporter {

    /* renamed from: b */
    public static final Companion f105882b = new Companion(null);

    /* renamed from: a */
    public final HandlerThread f105883a = m165442c("alog_report");

    /* renamed from: c */
    private volatile AtomicBoolean f105884c = new AtomicBoolean(false);

    /* renamed from: d */
    private C41702d f105885d;

    /* renamed from: e */
    private ReportConfig f105886e;

    /* renamed from: f */
    private final Lazy f105887f = LazyKt.lazy(new C41695e(this));

    /* renamed from: g */
    private final ConcurrentHashMap<String, Integer> f105888g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private volatile long f105889h;

    /* renamed from: b */
    private final Handler m165441b() {
        return (Handler) this.f105887f.getValue();
    }

    /* renamed from: c */
    public static HandlerThread m165442c(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogReporter$Companion;", "", "()V", "EVENT_F_LOG", "", "EVENT_PRODUCE_LOG", "KEY_SPLIT_TAG", "REPORT_DELAY_TIME", "", "TAG", "getInstance", "Lcom/ss/android/lark/log/alog/ALogReporter;", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ALogReporter mo149948a() {
            return SingletonHolder.f105890a.mo149949a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogReporter$SingletonHolder;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/log/alog/ALogReporter;", "getINSTANCE", "()Lcom/ss/android/lark/log/alog/ALogReporter;", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.c$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f105890a = new SingletonHolder();

        /* renamed from: b */
        private static final ALogReporter f105891b = new ALogReporter();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final ALogReporter mo149949a() {
            return f105891b;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.c$c */
    public static final class RunnableC41693c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ALogReporter f105892a;

        RunnableC41693c(ALogReporter cVar) {
            this.f105892a = cVar;
        }

        public final void run() {
            this.f105892a.mo149942a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.c$d */
    public static final class RunnableC41694d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ALogReporter f105893a;

        /* renamed from: b */
        final /* synthetic */ String f105894b;

        RunnableC41694d(ALogReporter cVar, String str) {
            this.f105893a = cVar;
            this.f105894b = str;
        }

        public final void run() {
            this.f105893a.mo149944a(this.f105894b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.c$e */
    static final class C41695e extends Lambda implements Function0<Handler> {
        final /* synthetic */ ALogReporter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41695e(ALogReporter cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(this.this$0.f105883a.getLooper());
        }
    }

    /* renamed from: a */
    public final void mo149942a() {
        for (Map.Entry<String, Integer> entry : this.f105888g.entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            ReportConfig reportConfig = this.f105886e;
            if (reportConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sReportConfig");
            }
            if (intValue > reportConfig.getMaxTagF()) {
                m165440a(key, intValue);
            }
        }
        this.f105888g.clear();
    }

    /* renamed from: d */
    private final void m165443d(String str) {
        ALogUtils dVar = ALogUtils.f105895a;
        C41702d dVar2 = this.f105885d;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
        }
        if (ALogUtils.f105895a.mo149952a(dVar.mo149958b(dVar2), ALogUtils.f105895a.mo149957b()) == BitmapDescriptorFactory.HUE_RED) {
            m165441b().postDelayed(new RunnableC41694d(this, str), 3000);
        }
    }

    /* renamed from: b */
    public final boolean mo149947b(String str) {
        if (this.f105884c.get() && str != null) {
            int length = str.length();
            ReportConfig reportConfig = this.f105886e;
            if (reportConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sReportConfig");
            }
            if (length > reportConfig.getMaxLogSize()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo149943a(C41702d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
        if (!this.f105884c.get()) {
            this.f105885d = dVar;
            ALogUtils dVar2 = ALogUtils.f105895a;
            C41702d dVar3 = this.f105885d;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
            }
            this.f105886e = dVar2.mo149960d(dVar3);
            this.f105883a.start();
            C41702d dVar4 = this.f105885d;
            if (dVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
            }
            String str = dVar4.f105908e;
            Intrinsics.checkExpressionValueIsNotNull(str, "sLogConfig.processEnum");
            m165443d(str);
            this.f105884c.set(true);
        }
    }

    /* renamed from: a */
    public final void mo149944a(String str) {
        ALogUtils dVar = ALogUtils.f105895a;
        C41702d dVar2 = this.f105885d;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
        }
        String b = dVar.mo149958b(dVar2);
        String a = ALogUtils.f105895a.mo149954a();
        float a2 = ALogUtils.f105895a.mo149952a(b, a);
        if (a2 > BitmapDescriptorFactory.HUE_RED) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_name", str);
            jSONObject.put("log_date", a);
            jSONObject.put("log_size", Float.valueOf(a2));
            Log.m165383e("ALogReporter", "reportProduceEvent: " + jSONObject);
            C41702d dVar3 = this.f105885d;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
            }
            dVar3.f105912i.reportEvent("alog_produce_event", jSONObject);
        }
    }

    /* renamed from: a */
    private final void m165440a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("f_tag", str);
        jSONObject.put("f_count", i);
        Log.m165383e("ALogReporter", "reportFEvent: " + jSONObject);
        C41702d dVar = this.f105885d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sLogConfig");
        }
        dVar.f105912i.reportEvent("alog_f_event", jSONObject);
    }

    /* renamed from: a */
    public final void mo149945a(String str, String str2) {
        if (this.f105884c.get() && str != null && str2 != null) {
            Integer num = this.f105888g.get(str);
            if (num == null) {
                num = 0;
            }
            this.f105888g.put(str, Integer.valueOf(num.intValue() + 1));
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f105889h;
            ReportConfig reportConfig = this.f105886e;
            if (reportConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sReportConfig");
            }
            if (j > reportConfig.getDuration()) {
                m165441b().post(new RunnableC41693c(this));
                this.f105889h = currentTimeMillis;
            }
        }
    }

    /* renamed from: a */
    public final void mo149946a(String str, String str2, ISplitCallback gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        if (!(str == null || str2 == null || !mo149947b(str2))) {
            int length = str2.length();
            ReportConfig reportConfig = this.f105886e;
            if (reportConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sReportConfig");
            }
            int maxLogSize = reportConfig.getMaxLogSize();
            int ceil = (int) Math.ceil(((double) length) / ((double) maxLogSize));
            for (int i = 0; i < ceil; i++) {
                int i2 = maxLogSize * i;
                String substring = str2.substring(i2, RangesKt.coerceAtMost(i2 + maxLogSize, length));
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                gVar.mo149938a(str + "__SPLIT__" + length, substring);
            }
        }
    }
}
