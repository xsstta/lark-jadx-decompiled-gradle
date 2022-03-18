package com.ss.android.lark.search.impl.p2604d.p2605a;

import android.content.Context;
import android.util.SparseArray;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;

/* renamed from: com.ss.android.lark.search.impl.d.a.d */
public class C53369d {

    /* renamed from: a */
    private static SparseArray<AbstractC53366a> f131906a = new SparseArray<>();

    /* renamed from: b */
    private static ISearchModuleDependency f131907b = C53258a.m205939a();

    static {
        m206593a();
    }

    /* renamed from: a */
    private static void m206593a() {
        f131906a.put(1, new C53368c());
        f131906a.put(8, new C53370e());
        f131906a.put(100000011, new C53370e());
        f131906a.put(10000004, new C53367b());
        f131906a.put(100000010, new C53368c());
    }

    /* renamed from: a */
    public static void m206594a(int i, Context context, SearchDetailInitData searchDetailInitData) {
        AbstractC53366a aVar = f131906a.get(i);
        if (aVar == null) {
            Log.m165383e("LarkSearch.Search.SearchDetailLauncherManager", "openSearchDetailPage failed: scene type is unknown");
            return;
        }
        try {
            aVar.mo182050a(context, searchDetailInitData);
        } catch (Exception e) {
            Log.m165385e("LarkSearch.Search.SearchDetailLauncherManager", "start search detail failed", e, true);
        }
    }
}
