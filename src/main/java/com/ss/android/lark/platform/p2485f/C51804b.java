package com.ss.android.lark.platform.p2485f;

import android.content.Context;
import com.google.gson.Gson;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.larkconfig.p2098a.C41133c;
import com.ss.android.lark.larkconfig.p2098a.p2100b.AbstractC41132a;
import com.ss.android.lark.money_export.C48199a;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.platform.f.b */
public class C51804b {

    /* renamed from: a */
    public static final AtomicBoolean f128747a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final Map<String, Boolean> f128748b = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.platform.f.b$b */
    public static class C51807b {

        /* renamed from: a */
        public static final C51806a f128749a = new C51806a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.f.b$a */
    public static class C51806a implements AbstractC41132a {
        private C51806a() {
        }

        @Override // com.ss.android.lark.larkconfig.p2098a.p2100b.AbstractC41132a
        /* renamed from: a */
        public Context mo148361a() {
            return LarkContext.getApplication().getApplicationContext();
        }

        @Override // com.ss.android.lark.larkconfig.p2098a.p2100b.AbstractC41132a
        /* renamed from: b */
        public Map<String, Boolean> mo148364b() {
            if (C51804b.f128747a.get()) {
                return C51804b.f128748b;
            }
            synchronized (C41133c.class) {
                if (!C51804b.f128747a.get()) {
                    C51804b.f128748b.putAll(C51803a.m200824a());
                    C51804b.f128748b.putAll(C36083a.m141486a().getIMDependency().mo132963x());
                    C51804b.f128748b.putAll(CreateGroupChatModule.getFeatureConfigMap());
                    C51804b.f128748b.putAll(C35358a.m138144k());
                    C51804b.f128748b.putAll(C52239a.m202618f());
                    C51804b.f128748b.putAll(C53258a.m205944e());
                    C51804b.f128748b.putAll(C48199a.m190219a());
                    C51804b.f128748b.putAll(C36083a.m141486a().getIMDependency().mo132812a());
                    C36083a.m141486a().getOpenFeatureDependency().mo132996a(C51804b.f128748b);
                    C51804b.f128747a.set(true);
                }
            }
            return C51804b.f128748b;
        }

        @Override // com.ss.android.lark.larkconfig.p2098a.p2100b.AbstractC41132a
        /* renamed from: a */
        public void mo148362a(AppConfig appConfig) {
            if (appConfig != null) {
                C36083a.m141486a().getCCMDependency().mo132707a(new Gson().toJson(appConfig));
            }
        }

        @Override // com.ss.android.lark.larkconfig.p2098a.p2100b.AbstractC41132a
        /* renamed from: a */
        public boolean mo148363a(String str) {
            return C37239a.m146648b().mo136951a(str);
        }
    }

    /* renamed from: a */
    public static C41133c m200825a() {
        return new C41133c(C51807b.f128749a);
    }
}
