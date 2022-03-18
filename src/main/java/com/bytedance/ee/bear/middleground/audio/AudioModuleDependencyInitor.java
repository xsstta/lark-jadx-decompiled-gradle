package com.bytedance.ee.bear.middleground.audio;

import android.content.Context;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.ss.android.lark.C28472a;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/audio/AudioModuleDependencyInitor;", "", "()V", "init", "", "context", "Landroid/content/Context;", "audio-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.a.c */
public final class AudioModuleDependencyInitor {

    /* renamed from: a */
    public static final AudioModuleDependencyInitor f23898a = new AudioModuleDependencyInitor();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/audio/AudioModuleDependencyInitor$init$1", "Lcom/ss/android/lark/AudioModuleDependency$IDependency;", "getContext", "Landroid/content/Context;", "getScheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "audio-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.a.c$a */
    public static final class C8868a implements C28472a.AbstractC28473a {

        /* renamed from: a */
        final /* synthetic */ Context f23899a;

        @Override // com.ss.android.lark.C28472a.AbstractC28473a
        /* renamed from: b */
        public Context mo34074b() {
            return this.f23899a;
        }

        @Override // com.ss.android.lark.C28472a.AbstractC28473a
        /* renamed from: a */
        public ScheduledExecutorService mo34073a() {
            ScheduledExecutorService f = BearExecutors.m48471f();
            Intrinsics.checkExpressionValueIsNotNull(f, "BearExecutors.getScheduledExecutor()");
            return f;
        }

        C8868a(Context context) {
            this.f23899a = context;
        }
    }

    private AudioModuleDependencyInitor() {
    }

    /* renamed from: a */
    public final void mo34072a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C28472a.m104337a(new C8868a(context));
    }
}
