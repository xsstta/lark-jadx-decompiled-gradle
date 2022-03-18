package com.ss.android.vc.common.utils;

import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Scheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/common/utils/VCRxSchedulers;", "", "()V", "mComputeScheduler", "Lio/reactivex/Scheduler;", "mIOScheduler", "mUIScheduler", "computation", "io", "mainThread", "lib_vc_base_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.e.z */
public final class VCRxSchedulers {

    /* renamed from: a */
    public static final VCRxSchedulers f151989a = new VCRxSchedulers();

    /* renamed from: b */
    private static Scheduler f151990b;

    /* renamed from: c */
    private static Scheduler f151991c;

    private VCRxSchedulers() {
    }

    /* renamed from: a */
    public final synchronized Scheduler mo208380a() {
        Scheduler scheduler;
        if (f151990b == null) {
            f151990b = LarkRxSchedulers.io();
        }
        scheduler = f151990b;
        if (scheduler == null) {
            Intrinsics.throwNpe();
        }
        return scheduler;
    }

    /* renamed from: b */
    public final synchronized Scheduler mo208381b() {
        Scheduler scheduler;
        if (f151991c == null) {
            f151991c = LarkRxSchedulers.mainThread();
        }
        scheduler = f151991c;
        if (scheduler == null) {
            Intrinsics.throwNpe();
        }
        return scheduler;
    }
}
