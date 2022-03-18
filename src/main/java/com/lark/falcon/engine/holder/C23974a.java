package com.lark.falcon.engine.holder;

import com.lark.falcon.engine.common.JSEngineType;

/* renamed from: com.lark.falcon.engine.holder.a */
public class C23974a {

    /* renamed from: a */
    private final JSEngineType f59308a;

    /* renamed from: b */
    private final String f59309b;

    /* renamed from: c */
    private final boolean f59310c;

    /* renamed from: d */
    private final boolean f59311d;

    /* renamed from: e */
    private final boolean f59312e;

    /* renamed from: a */
    public JSEngineType mo86099a() {
        return this.f59308a;
    }

    /* renamed from: b */
    public String mo86100b() {
        return this.f59309b;
    }

    /* renamed from: c */
    public boolean mo86101c() {
        return this.f59310c;
    }

    /* renamed from: d */
    public boolean mo86102d() {
        return this.f59311d;
    }

    /* renamed from: e */
    public boolean mo86103e() {
        return this.f59312e;
    }

    /* renamed from: com.lark.falcon.engine.holder.a$a */
    public static final class C23976a {

        /* renamed from: a */
        public JSEngineType f59313a = JSEngineType.V8;

        /* renamed from: b */
        public String f59314b = "";

        /* renamed from: c */
        public boolean f59315c;

        /* renamed from: d */
        public boolean f59316d;

        /* renamed from: e */
        public boolean f59317e;

        /* renamed from: a */
        public C23974a mo86107a() {
            return new C23974a(this);
        }

        /* renamed from: a */
        public C23976a mo86104a(JSEngineType jSEngineType) {
            this.f59313a = jSEngineType;
            return this;
        }

        /* renamed from: b */
        public C23976a mo86108b(boolean z) {
            this.f59316d = z;
            return this;
        }

        /* renamed from: c */
        public C23976a mo86109c(boolean z) {
            this.f59317e = z;
            return this;
        }

        /* renamed from: a */
        public C23976a mo86105a(String str) {
            this.f59314b = str;
            return this;
        }

        /* renamed from: a */
        public C23976a mo86106a(boolean z) {
            this.f59315c = z;
            return this;
        }
    }

    private C23974a(C23976a aVar) {
        this.f59308a = aVar.f59313a;
        this.f59309b = aVar.f59314b;
        this.f59310c = aVar.f59315c;
        this.f59311d = aVar.f59316d;
        this.f59312e = aVar.f59317e;
    }
}
