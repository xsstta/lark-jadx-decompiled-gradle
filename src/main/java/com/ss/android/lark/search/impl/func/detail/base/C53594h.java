package com.ss.android.lark.search.impl.func.detail.base;

import com.larksuite.framework.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.detail.base.h */
public class C53594h {

    /* renamed from: a */
    private Map<Integer, AbstractC53593g> f132349a;

    /* renamed from: com.ss.android.lark.search.impl.func.detail.base.h$a */
    public static class C53596a {

        /* renamed from: a */
        public static final C53594h f132350a = new C53594h();
    }

    /* renamed from: a */
    public static C53594h m207520a() {
        return C53596a.f132350a;
    }

    private C53594h() {
        this.f132349a = new HashMap();
    }

    /* renamed from: b */
    public void mo182882b() {
        if (!CollectionUtils.isEmpty(this.f132349a)) {
            this.f132349a.clear();
        }
    }

    /* renamed from: a */
    public AbstractC53593g mo182880a(int i) {
        return this.f132349a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo182881a(int i, AbstractC53593g gVar) {
        if (gVar != null) {
            this.f132349a.put(Integer.valueOf(i), gVar);
        }
    }
}
