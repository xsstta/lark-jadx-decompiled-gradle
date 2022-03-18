package com.bytedance.ee.bear.rn.middleground.common;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter;", "", "token", "", "(Ljava/lang/String;)V", "decrementAndGet", "", "incrementAndGet", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.common.a */
public final class ReferenceCounter {

    /* renamed from: a */
    public static final Companion f28704a = new Companion(null);

    /* renamed from: c */
    private static final Map<String, AtomicInteger> f28705c = new LinkedHashMap();

    /* renamed from: b */
    private final String f28706b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter$Companion;", "", "()V", "sReferenceCounter", "", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.common.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo40557b() {
        int i;
        Map<String, AtomicInteger> map = f28705c;
        synchronized (map) {
            AtomicInteger atomicInteger = map.get(this.f28706b);
            if (atomicInteger != null) {
                i = atomicInteger.decrementAndGet();
            } else {
                i = -1;
            }
            if (i == 0) {
                map.remove(this.f28706b);
            }
        }
        return i;
    }

    /* renamed from: a */
    public final int mo40556a() {
        int i;
        Map<String, AtomicInteger> map = f28705c;
        synchronized (map) {
            if (!map.containsKey(this.f28706b)) {
                map.put(this.f28706b, new AtomicInteger(0));
            }
            AtomicInteger atomicInteger = map.get(this.f28706b);
            if (atomicInteger != null) {
                i = atomicInteger.incrementAndGet();
            } else {
                i = -1;
            }
        }
        return i;
    }

    public ReferenceCounter(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f28706b = str;
    }
}
