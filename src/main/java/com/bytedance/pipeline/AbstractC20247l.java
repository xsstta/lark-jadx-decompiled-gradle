package com.bytedance.pipeline;

import com.bytedance.pipeline.C20240h;
import com.bytedance.pipeline.p859a.AbstractC20231a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.pipeline.l */
public abstract class AbstractC20247l<IN, OUT> extends AbstractC20235d<IN, OUT> {

    /* renamed from: a */
    private Map<String, C20248a> f49525a;

    AbstractC20247l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C20248a> mo52216a() {
        return this.f49525a;
    }

    /* renamed from: com.bytedance.pipeline.l$b */
    public static final class C20249b {

        /* renamed from: a */
        private Map<String, C20248a> f49527a = new HashMap();

        /* renamed from: b */
        private AbstractC20231a f49528b;

        /* renamed from: a */
        public C20249b mo68517a(AbstractC20231a aVar) {
            this.f49528b = aVar;
            return this;
        }

        /* renamed from: a */
        public C20240h mo68515a(Class<? extends AbstractC20247l> cls) {
            return C20240h.C20242a.m73913a().mo68505a(cls).mo68506a(this.f49527a).mo68504a(this.f49528b).mo68507b();
        }

        /* renamed from: a */
        public C20248a mo68516a(String str) {
            if (!this.f49527a.containsKey(str)) {
                C20248a aVar = new C20248a();
                this.f49527a.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }
    }

    /* renamed from: com.bytedance.pipeline.l$a */
    public static final class C20248a {

        /* renamed from: a */
        List<C20240h> f49526a = new ArrayList();

        /* renamed from: a */
        public C20248a mo68513a(C20240h hVar) {
            this.f49526a.add(hVar);
            return this;
        }

        /* renamed from: a */
        public C20248a mo68514a(List<C20240h> list) {
            this.f49526a.addAll(list);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo68512a(List<C20240h> list) {
        if (!list.isEmpty() && list.get(list.size() - 1).f49516a == C20239g.class) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public final void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        if (objArr == null || objArr.length != 1 || objArr[0] == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.f49525a = (Map) objArr[0];
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
