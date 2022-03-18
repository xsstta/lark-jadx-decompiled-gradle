package com.tt.miniapphost.process.p3375a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.p3319d.C66623a;
import com.tt.miniapp.process.p3322g.AbstractC66642a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.data.C67575a;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3377c.AbstractC67569a;

/* renamed from: com.tt.miniapphost.process.a.a */
public class C67560a {

    /* renamed from: com.tt.miniapphost.process.a.a$a */
    public static class C67561a {

        /* renamed from: a */
        public AbstractC67569a f170376a;
    }

    /* renamed from: a */
    private static C67561a m262953a() {
        return ContextSingletonInstance.getInstance().processBridgeDataInstance;
    }

    /* renamed from: b */
    private static boolean m262961b() {
        C67561a a = m262953a();
        if (a.f170376a != null) {
            return true;
        }
        synchronized (C67560a.class) {
            if (a.f170376a == null) {
                a.f170376a = new C66623a();
            }
        }
        return true;
    }

    /* renamed from: a */
    public static CrossProcessDataEntity m262954a(CrossProcessCallEntity crossProcessCallEntity) {
        if (!m262961b()) {
            return null;
        }
        return m262953a().f170376a.mo232264b(crossProcessCallEntity);
    }

    /* renamed from: a */
    public static void m262956a(AbstractC66642a aVar) {
        if (m262961b()) {
            m262953a().f170376a.mo232260a(aVar);
        }
    }

    /* renamed from: a */
    public static CrossProcessDataEntity m262955a(String str, CrossProcessDataEntity crossProcessDataEntity) {
        if (!m262961b()) {
            return null;
        }
        return m262953a().f170376a.mo232259a(new CrossProcessCallEntity("hostProcess", str, crossProcessDataEntity));
    }

    /* renamed from: a */
    public static void m262957a(CrossProcessCallEntity crossProcessCallEntity, int i) {
        if (m262961b()) {
            m262953a().f170376a.mo232261a(crossProcessCallEntity, i);
        }
    }

    /* renamed from: a */
    public static void m262958a(C67575a.C67576a aVar, CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        if (m262961b()) {
            m262953a().f170376a.mo232263a(aVar, crossProcessDataEntity, z);
        }
    }

    /* renamed from: a */
    public static void m262959a(String str, CrossProcessDataEntity crossProcessDataEntity, AbstractC67565b bVar) {
        if (!m262961b()) {
            AppBrandLogger.m52829e("ProcessCallControlBridge", "callHostProcessAsync, checkInvalid return false");
            return;
        }
        m262953a().f170376a.mo232262a(new CrossProcessCallEntity("hostProcess", str, crossProcessDataEntity), bVar);
    }

    /* renamed from: a */
    public static void m262960a(String str, String str2, CrossProcessDataEntity crossProcessDataEntity, AbstractC67565b bVar) {
        if (m262961b()) {
            m262953a().f170376a.mo232262a(new CrossProcessCallEntity(str, str2, crossProcessDataEntity), bVar);
        }
    }
}
