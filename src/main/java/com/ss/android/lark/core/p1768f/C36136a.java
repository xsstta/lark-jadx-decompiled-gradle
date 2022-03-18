package com.ss.android.lark.core.p1768f;

import android.content.Context;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamic_so.C36875a;
import com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.core.f.a */
public class C36136a {

    /* renamed from: a */
    public static final Map<String, List<String>> f93326a = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.core.f.a$a */
    public static class C36138a {

        /* renamed from: a */
        public static final AbstractC36878a f93328a = C36136a.m142084a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C36875a m142085a() {
        return new C36875a(C36138a.f93328a);
    }

    static {
        m142086a("ttplayer", "libttmplayer.so", "libavmdl.so");
    }

    /* renamed from: a */
    public static AbstractC36878a m142084a(final Context context) {
        return new AbstractC36878a() {
            /* class com.ss.android.lark.core.p1768f.C36136a.C361371 */

            @Override // com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a
            /* renamed from: c */
            public Map<String, List<String>> mo133158c() {
                return C36136a.f93326a;
            }

            @Override // com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a
            /* renamed from: a */
            public boolean mo133155a() {
                return C36083a.m141487b().isUsPackage();
            }

            @Override // com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a
            /* renamed from: b */
            public boolean mo133157b() {
                if (!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a
            /* renamed from: a */
            public String mo133154a(String str) {
                return MiraModule.m205166f(str);
            }

            @Override // com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a
            /* renamed from: a */
            public boolean mo133156a(String str, String str2) {
                return MiraModule.m205161a(str, str2);
            }
        };
    }

    /* renamed from: b */
    public static void m142087b(Context context) {
        if (!C36083a.m141487b().isUsPackage()) {
            if ((!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) && !C26284k.m95185a(context)) {
                m142085a();
                C36875a.m145539b();
            }
        }
    }

    /* renamed from: a */
    private static void m142086a(String str, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            arrayList.add(str2);
        }
        f93326a.put(str, arrayList);
    }
}
