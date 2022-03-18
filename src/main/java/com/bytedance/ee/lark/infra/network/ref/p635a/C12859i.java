package com.bytedance.ee.lark.infra.network.ref.p635a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.a.i */
public class C12859i {

    /* renamed from: a */
    private static boolean f34333a;

    /* renamed from: b */
    private static Map<String, AbstractC12853e> f34334b = new HashMap();

    /* renamed from: b */
    public static boolean m53079b() {
        return f34333a;
    }

    /* renamed from: a */
    public static void m53077a() {
        f34334b.put(C12854f.f34315a.mo48489a(), new C12862l());
        f34334b.put(C12854f.f34316b.mo48489a(), new C12863m());
        AppBrandLogger.m52830i("NetworkClientManager", " init network client");
    }

    /* renamed from: a */
    public static void m53078a(boolean z) {
        f34333a = z;
    }

    /* renamed from: a */
    public static AbstractC12855g m53076a(C12854f fVar, C12856h hVar, boolean z) {
        AbstractC12855g gVar;
        AbstractC12853e eVar = f34334b.get(fVar.mo48489a());
        if (eVar == null) {
            AppBrandLogger.m52829e("NetworkClientManager", " get networkClient creator is null, channel " + fVar.mo48489a());
            gVar = null;
        } else {
            gVar = eVar.mo48488a(hVar);
        }
        if (gVar != null) {
            return gVar;
        }
        C12847a.m53056a(fVar.mo48489a(), m53079b());
        if (!z) {
            return gVar;
        }
        C12861k kVar = new C12861k();
        AppBrandLogger.m52830i("NetworkClientManager", "client is null , use okhttp client");
        return kVar;
    }
}
