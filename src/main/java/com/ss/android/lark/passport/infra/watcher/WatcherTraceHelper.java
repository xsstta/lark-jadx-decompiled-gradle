package com.ss.android.lark.passport.infra.watcher;

import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/watcher/WatcherTraceHelper;", "", "()V", "mParentOpTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "getMParentOpTrace", "()Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "mParentOpTrace$delegate", "Lkotlin/Lazy;", "generateSceneOPTrace", "getParentOpTrace", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.d.d */
public final class WatcherTraceHelper {

    /* renamed from: a */
    public static final WatcherTraceHelper f123335a = new WatcherTraceHelper();

    /* renamed from: b */
    private static final Lazy f123336b = LazyKt.lazy(C49116a.INSTANCE);

    /* renamed from: b */
    private final OPTrace m193670b() {
        return (OPTrace) f123336b.getValue();
    }

    private WatcherTraceHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.d.d$a */
    static final class C49116a extends Lambda implements Function0<OPTrace> {
        public static final C49116a INSTANCE = new C49116a();

        C49116a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OPTrace invoke() {
            return OPTraceService.m192757a();
        }
    }

    /* renamed from: a */
    public final OPTrace mo171432a() {
        return m193670b().subTrace();
    }
}
