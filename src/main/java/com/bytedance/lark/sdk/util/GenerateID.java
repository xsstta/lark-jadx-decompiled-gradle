package com.bytedance.lark.sdk.util;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/lark/sdk/util/GenerateID;", "", "()V", "Companion", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.a.a */
public final class GenerateID {

    /* renamed from: a */
    public static final AtomicLong f48385a = new AtomicLong(100);

    /* renamed from: b */
    public static final Companion f48386b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/lark/sdk/util/GenerateID$Companion;", "", "()V", "ID_BEGIN", "", "ID_END", "sId", "Ljava/util/concurrent/atomic/AtomicLong;", "getId", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final long mo67172a() {
            long incrementAndGet = GenerateID.f48385a.incrementAndGet();
            if (incrementAndGet >= 9223372036854775707L) {
                synchronized (GenerateID.f48385a) {
                    if (GenerateID.f48385a.get() >= 9223372036854775707L) {
                        GenerateID.f48385a.set(100);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return incrementAndGet;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
