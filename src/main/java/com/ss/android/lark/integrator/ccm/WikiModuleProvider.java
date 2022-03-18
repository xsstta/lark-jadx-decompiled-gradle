package com.ss.android.lark.integrator.ccm;

import android.content.Context;
import com.bytedance.ee.bear.p391g.C7804b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.ccm.config.p2013g.C39269b;
import com.ss.android.lark.integrator.ccm.p2004a.C39233a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.utils.ApiUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

public class WikiModuleProvider {

    /* renamed from: a */
    private static volatile WikiModule f100539a;

    /* renamed from: com.ss.android.lark.integrator.ccm.WikiModuleProvider$a */
    public static class C39232a {

        /* renamed from: a */
        private static final Map<String, Boolean> f100540a;

        /* renamed from: a */
        public static Map<String, Boolean> m154725a() {
            return f100540a;
        }

        /* renamed from: c */
        public static boolean m154727c() {
            return C37239a.m146648b().mo136952a("spacekit.mobile.wiki2.0_enable", false);
        }

        /* renamed from: d */
        public static boolean m154728d() {
            return C37239a.m146648b().mo136952a("spacekit.mobile.wiki_enable", false);
        }

        static {
            HashMap hashMap = new HashMap();
            f100540a = hashMap;
            hashMap.put("spacekit.mobile.wiki_enable", false);
            hashMap.put("spacekit.mobile.wiki2.0_enable", false);
        }

        /* renamed from: b */
        public static boolean m154726b() {
            if (m154727c() || m154728d()) {
                return true;
            }
            return false;
        }
    }

    public static class WikiModule {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DocSearchType {
        }

        /* renamed from: a */
        public String mo143046a() {
            return "wiki";
        }

        public WikiModule() {
            C39233a.m154730a();
        }

        /* renamed from: b */
        public boolean mo143049b() {
            return C39232a.m154726b();
        }

        /* renamed from: a */
        public void mo143047a(Context context) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstDataLoaded("wiki");
        }

        /* renamed from: a */
        public void mo143048a(String str, String str2) {
            C7804b.m31283a().mo17142i().mo17051b(str, "wiki", str2);
        }

        /* renamed from: a */
        public AbstractC44552i mo143045a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
            return new C39269b(context, eVar, iTitleController);
        }
    }

    /* renamed from: b */
    public static Map<String, Boolean> m154719b() {
        return C39232a.m154725a();
    }

    /* renamed from: a */
    public static WikiModule m154718a() {
        if (f100539a == null) {
            synchronized (C39234b.class) {
                if (f100539a == null) {
                    f100539a = new WikiModule();
                }
            }
        }
        return f100539a;
    }
}
