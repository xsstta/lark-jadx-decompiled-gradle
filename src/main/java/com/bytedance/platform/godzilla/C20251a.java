package com.bytedance.platform.godzilla;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.common.AbstractC20326f;
import com.bytedance.platform.godzilla.common.AbstractC20327g;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p872b.C20311c;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.platform.godzilla.plugin.AbstractC20330b;
import com.bytedance.platform.godzilla.plugin.StartType;
import java.util.HashMap;

/* renamed from: com.bytedance.platform.godzilla.a */
public final class C20251a {

    /* renamed from: a */
    private static volatile C20251a f49529a;

    /* renamed from: b */
    private final Application f49530b;

    /* renamed from: c */
    private final HashMap<String, AbstractC20329a> f49531c;

    /* renamed from: b */
    public void mo68524b() {
        mo68523a(StartType.IMMEDIATE);
    }

    /* renamed from: a */
    public static C20251a m73934a() {
        if (f49529a != null) {
            return f49529a;
        }
        throw new RuntimeException("Godzilla.init() method must be called first");
    }

    /* renamed from: com.bytedance.platform.godzilla.a$a */
    public static class C20253a {

        /* renamed from: a */
        private final Application f49532a;

        /* renamed from: b */
        private final HashMap<String, AbstractC20329a> f49533b = new HashMap<>();

        /* renamed from: c */
        private AbstractC20326f f49534c;

        /* renamed from: d */
        private Logger.Level f49535d;

        /* renamed from: e */
        private AbstractC20327g f49536e;

        /* renamed from: a */
        public C20251a mo68529a() {
            return new C20251a(this.f49532a, this.f49533b, this.f49534c, this.f49535d, this.f49536e);
        }

        /* renamed from: a */
        public C20253a mo68525a(Logger.Level level) {
            this.f49535d = level;
            return this;
        }

        /* renamed from: a */
        public C20253a mo68526a(AbstractC20326f fVar) {
            this.f49534c = fVar;
            return this;
        }

        /* renamed from: a */
        public C20253a mo68527a(AbstractC20327g gVar) {
            this.f49536e = gVar;
            return this;
        }

        public C20253a(Application application) {
            if (application != null) {
                this.f49532a = application;
                return;
            }
            throw new RuntimeException("Godzilla init, application is null");
        }

        /* renamed from: a */
        public C20253a mo68528a(AbstractC20329a aVar) {
            String b = aVar.mo68532b();
            if (TextUtils.isEmpty(b)) {
                throw new RuntimeException(String.format("%s plugin name is null", aVar.getClass().getName()));
            } else if (this.f49533b.get(b) == null) {
                this.f49533b.put(b, aVar);
                return this;
            } else {
                throw new RuntimeException(String.format("%s plugin is already exist", b));
            }
        }
    }

    /* renamed from: a */
    public static C20251a m73935a(C20251a aVar) {
        if (aVar != null) {
            synchronized (C20251a.class) {
                if (f49529a == null) {
                    f49529a = aVar;
                } else {
                    Logger.m74095a("Godzilla", "Godzilla instance is already set. this invoking will be ignored");
                }
            }
            return f49529a;
        }
        throw new RuntimeException("Godzilla should not be null.");
    }

    /* renamed from: a */
    public void mo68523a(StartType startType) {
        for (AbstractC20329a aVar : this.f49531c.values()) {
            if (aVar instanceof AbstractC20330b) {
                ((AbstractC20330b) aVar).mo68642a(startType);
            } else if (aVar.mo68641d() == startType) {
                aVar.mo68530a();
            }
        }
    }

    private C20251a(Application application, HashMap<String, AbstractC20329a> hashMap, AbstractC20326f fVar, Logger.Level level, AbstractC20327g gVar) {
        this.f49530b = application;
        this.f49531c = hashMap;
        GodzillaCore.INSTANCE.init(application, fVar, level);
        for (AbstractC20329a aVar : hashMap.values()) {
            aVar.mo68531a(this.f49530b);
        }
        C20311c.m74076a(gVar);
    }
}
