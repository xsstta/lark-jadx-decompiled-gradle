package com.ss.android.vc.statistics.appreciable;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/statistics/appreciable/UssRecvAppreciable;", "", "()V", "ussRevStartTime", "", "getUssRevStartTime", "()J", "setUssRevStartTime", "(J)V", "completeRecordTime", "", "success", "", "sendConsume", "duration", "startRecordTime", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.a.h */
public final class UssRecvAppreciable {

    /* renamed from: a */
    public static final Lazy f160799a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63698b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160800b = new Companion(null);

    /* renamed from: c */
    private long f160801c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/appreciable/UssRecvAppreciable$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/appreciable/UssRecvAppreciable;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/appreciable/UssRecvAppreciable;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.a.h$a */
    public static final class Companion {
        /* renamed from: a */
        public final UssRecvAppreciable mo220220a() {
            Lazy lazy = UssRecvAppreciable.f160799a;
            Companion aVar = UssRecvAppreciable.f160800b;
            return (UssRecvAppreciable) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/appreciable/UssRecvAppreciable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.a.h$b */
    static final class C63698b extends Lambda implements Function0<UssRecvAppreciable> {
        public static final C63698b INSTANCE = new C63698b();

        C63698b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UssRecvAppreciable invoke() {
            return new UssRecvAppreciable();
        }
    }

    /* renamed from: a */
    public final void mo220218a() {
        this.f160801c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo220219a(boolean z) {
        m249710a(System.currentTimeMillis() - this.f160801c, z);
    }

    /* renamed from: a */
    private final void m249710a(long j, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("success", String.valueOf(z));
            C63686a.m249664b("vc_ultrawave_recognize", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("UssRecvAppreciable", "[sendConsume]", "exception: " + e.getMessage());
        }
    }
}
