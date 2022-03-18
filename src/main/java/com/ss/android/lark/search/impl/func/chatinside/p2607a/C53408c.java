package com.ss.android.lark.search.impl.func.chatinside.p2607a;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideFilterData;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchData;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.a.c */
public class C53408c {

    /* renamed from: a */
    private static volatile C53408c f132010a;

    /* renamed from: b */
    private LruCache<String, C53407b> f132011b = new LruCache<>(10);

    /* renamed from: c */
    private SparseArray<String> f132012c = new SparseArray<>();

    /* renamed from: a */
    public void mo182439a(ChatInsideSearchData bVar, ChatInsideFilterData aVar) {
        String a = m206823a(bVar.mo182751f(), m206822a(bVar.mo182752g()));
        if (CollectionUtils.isEmpty(bVar.mo182745b())) {
            this.f132011b.remove(a);
            return;
        }
        ChatInsideFilterCacheBean b = m206827b(a);
        m206825a(b, bVar);
        m206824a(b, aVar);
        this.f132011b.put(a, b);
    }

    /* renamed from: a */
    public void mo182440a(String str, int i) {
        this.f132011b.remove(m206823a(str, m206822a(i)));
    }

    private C53408c() {
        m206828b();
    }

    /* renamed from: a */
    public static C53408c m206821a() {
        if (f132010a == null) {
            synchronized (C53408c.class) {
                if (f132010a == null) {
                    f132010a = new C53408c();
                }
            }
        }
        return f132010a;
    }

    /* renamed from: b */
    private void m206828b() {
        this.f132012c.put(3, "message");
        this.f132012c.put(6, "space");
        this.f132012c.put(10000001, "file");
        this.f132012c.put(13, "link");
    }

    /* renamed from: a */
    private C53407b m206820a(String str) {
        C53407b bVar = this.f132011b.get(str);
        if (bVar == null) {
            bVar = new C53407b();
        }
        bVar.mo182428a(System.currentTimeMillis());
        return bVar;
    }

    /* renamed from: b */
    private ChatInsideFilterCacheBean m206827b(String str) {
        ChatInsideFilterCacheBean aVar = (ChatInsideFilterCacheBean) this.f132011b.get(str);
        if (aVar == null) {
            aVar = new ChatInsideFilterCacheBean();
        }
        aVar.mo182428a(System.currentTimeMillis());
        return aVar;
    }

    /* renamed from: a */
    private String m206822a(int i) {
        String str = this.f132012c.get(i);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.m165383e("LarkSearch.Search.ChatInternalSearchCacheManager", "search result type is unknown");
        return "";
    }

    /* renamed from: a */
    private boolean m206826a(long j) {
        if (System.currentTimeMillis() - j < 300000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo182438a(ChatInsideSearchData bVar) {
        String a = m206823a(bVar.mo182751f(), m206822a(bVar.mo182752g()));
        if (CollectionUtils.isEmpty(bVar.mo182745b())) {
            this.f132011b.remove(a);
            return;
        }
        C53407b a2 = m206820a(a);
        m206825a(a2, bVar);
        this.f132011b.put(a, a2);
    }

    /* renamed from: a */
    private String m206823a(String str, String str2) {
        return str + str2;
    }

    /* renamed from: b */
    public C53407b mo182441b(String str, int i) {
        C53407b bVar = this.f132011b.get(m206823a(str, m206822a(i)));
        if (bVar == null) {
            return null;
        }
        if (m206826a(bVar.mo182433d())) {
            return bVar;
        }
        return null;
    }

    /* renamed from: a */
    private void m206824a(ChatInsideFilterCacheBean aVar, ChatInsideFilterData aVar2) {
        aVar.mo182425a(aVar2.mo182735a());
        aVar.mo182424a(aVar2.mo182739b());
        aVar.mo182423a(aVar2.mo182740c());
    }

    /* renamed from: a */
    private void m206825a(C53407b bVar, ChatInsideSearchData bVar2) {
        boolean z;
        boolean c = bVar2.mo182748c();
        if (bVar2.mo182749d() || !bVar.mo182435f().equals(bVar2.mo182741a())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.mo182434e().addAll(bVar2.mo182745b());
        } else {
            bVar.mo182432b(bVar2.mo182745b());
        }
        bVar.mo182429a(bVar2.mo182741a());
        bVar.mo182430a(c);
        bVar.mo182431b(bVar2.mo182750e());
    }
}
