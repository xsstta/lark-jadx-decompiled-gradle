package com.bytedance.ee.bear.lynx.impl.utli;

import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/ServiceDependence;", "", "()V", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.h */
public final class ServiceDependence {

    /* renamed from: a */
    public static final C10917c f23777a = new C10917c(new C10929e());

    /* renamed from: b */
    public static final Companion f23778b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/ServiceDependence$Companion;", "", "()V", "TAG", "", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getService", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.c.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> T mo33929a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "service");
            if (Intrinsics.areEqual(al.class, cls)) {
                return (T) C4511g.m18594d();
            }
            if (Intrinsics.areEqual(AbstractC5233x.class, cls)) {
                return (T) C5234y.m21391b();
            }
            if (Intrinsics.areEqual(NetService.class, cls)) {
                return (T) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
            }
            if (Intrinsics.areEqual(ConnectionService.class, cls)) {
                return (T) C5084ad.m20847d();
            }
            if (!C13616d.m55261a()) {
                C13479a.m54775e("ccm-lynx: ServiceDependence", cls.getSimpleName() + " unknown");
                return (T) ServiceDependence.f23777a.mo41506a(cls);
            }
            throw new IllegalArgumentException(cls.getSimpleName() + " unknown");
        }
    }
}
