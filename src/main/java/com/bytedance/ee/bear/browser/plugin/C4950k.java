package com.bytedance.ee.bear.browser.plugin;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.browser.plugin.k */
public class C4950k {
    /* renamed from: a */
    public static <T extends AbstractC1142af> T m20474a(Fragment fragment, Class<T> cls) {
        return (T) m20475a(fragment, cls, (C1144ai.AbstractC1146b) null);
    }

    /* renamed from: a */
    public static <T extends AbstractC1142af> T m20476a(AbstractC4941c cVar, Class<T> cls) {
        return (T) m20477a(cVar, cls, (C1144ai.AbstractC1146b) null);
    }

    /* renamed from: a */
    public static <T extends AbstractC1142af> T m20478a(C4943e eVar, Class<T> cls) {
        return (T) m20479a(eVar, cls, (C1144ai.AbstractC1146b) null);
    }

    /* renamed from: a */
    public static <T extends AbstractC1142af> T m20475a(Fragment fragment, Class<T> cls, C1144ai.AbstractC1146b bVar) {
        try {
            return (T) m20479a(C4943e.m20402a(fragment), cls, bVar);
        } catch (PluginInfoExtractException e) {
            C13479a.m54761a("PluginViewModelProviders", e);
            try {
                return cls.newInstance();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC1142af> T m20477a(AbstractC4941c cVar, Class<T> cls, C1144ai.AbstractC1146b bVar) {
        return (T) m20479a(cVar.getHost(), cls, bVar);
    }

    /* renamed from: a */
    public static <T extends AbstractC1142af> T m20479a(C4943e eVar, Class<T> cls, C1144ai.AbstractC1146b bVar) {
        if (bVar == null) {
            bVar = new C1144ai.C1148d();
        }
        return (T) new C1144ai(eVar, bVar).mo6005a(cls);
    }
}
