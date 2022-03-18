package com.ss.android.lark.mm.service;

import android.content.Context;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/service/MmInitor;", "", "()V", "init", "", "context", "Landroid/content/Context;", "registerPush", "statisticMmAudioDiskCacheUsage", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.e.b */
public final class MmInitor {
    /* renamed from: b */
    private final void m181862b() {
        C45857i.m181676a(RunnableC45900a.f115716a);
    }

    /* renamed from: a */
    private final void m181861a() {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        a.getPushDependency().mo144667a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.e.b$a */
    public static final class RunnableC45900a implements Runnable {

        /* renamed from: a */
        public static final RunnableC45900a f115716a = new RunnableC45900a();

        RunnableC45900a() {
        }

        public final void run() {
            long c = MmAudioFileHelper.f117976a.mo164605c();
            C45855f.m181663b("MmInitor", "mm audio disk space, " + c + " byte");
            if (c >= ((long) 1073741824)) {
                C47083e.m186426a("vc_mm_audio_disk_cache_beyond_threshold");
            }
        }
    }

    /* renamed from: a */
    public final void mo161225a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C45855f.m181664c("MmInitor", "init");
        m181861a();
        MmRecordManager.f117918g.mo164552c();
        m181862b();
    }
}
