package com.ss.android.lark.mm.service;

import android.content.Context;
import com.ss.android.lark.mm.C45833a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.push.MmPush;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/service/MmService;", "Lcom/ss/android/lark/mm/service/IMmService;", "()V", "mIsInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mPush", "Lcom/ss/android/lark/mm/push/MmPush;", "getMPush", "()Lcom/ss/android/lark/mm/push/MmPush;", "mPush$delegate", "Lkotlin/Lazy;", "mmInitor", "Lcom/ss/android/lark/mm/service/MmInitor;", "getMmInitor", "()Lcom/ss/android/lark/mm/service/MmInitor;", "mmInitor$delegate", "checkAndInit", "", "getMmPush", "isInit", "", "unInit", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.e.c */
public final class MmService implements IMmService {

    /* renamed from: a */
    public static final Companion f115717a = new Companion(null);

    /* renamed from: b */
    private final AtomicBoolean f115718b = new AtomicBoolean(false);

    /* renamed from: c */
    private final Lazy f115719c = LazyKt.lazy(C45902c.INSTANCE);

    /* renamed from: d */
    private final Lazy f115720d = LazyKt.lazy(C45901b.INSTANCE);

    @JvmStatic
    /* renamed from: c */
    public static final IMmService m181864c() {
        return f115717a.mo161228a();
    }

    /* renamed from: d */
    private final MmInitor m181865d() {
        return (MmInitor) this.f115719c.getValue();
    }

    /* renamed from: e */
    private final MmPush m181866e() {
        return (MmPush) this.f115720d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/service/MmService$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/mm/service/IMmService;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.e.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IMmService mo161228a() {
            IMmService g = C45833a.m181564g();
            Intrinsics.checkExpressionValueIsNotNull(g, "MmModule.getMmService()");
            return g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/push/MmPush;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.e.c$b */
    static final class C45901b extends Lambda implements Function0<MmPush> {
        public static final C45901b INSTANCE = new C45901b();

        C45901b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmPush invoke() {
            return new MmPush();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/service/MmInitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.e.c$c */
    static final class C45902c extends Lambda implements Function0<MmInitor> {
        public static final C45902c INSTANCE = new C45902c();

        C45902c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmInitor invoke() {
            return new MmInitor();
        }
    }

    @Override // com.ss.android.lark.mm.service.IMmService
    /* renamed from: a */
    public MmPush mo161224a() {
        return m181866e();
    }

    /* renamed from: b */
    public void mo161227b() {
        if (this.f115718b.compareAndSet(false, true)) {
            MmInitor d = m181865d();
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            d.mo161225a(a);
        }
    }

    public MmService() {
        mo161227b();
    }
}
