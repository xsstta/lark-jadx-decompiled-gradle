package com.ss.android.lark.dfcore.config;

import java.util.List;

/* renamed from: com.ss.android.lark.dfcore.config.b */
public class C36609b {

    /* renamed from: a */
    private boolean f94190a;

    /* renamed from: b */
    private boolean f94191b;

    /* renamed from: c */
    private boolean f94192c;

    /* renamed from: d */
    private boolean f94193d;

    /* renamed from: e */
    private boolean f94194e;

    /* renamed from: f */
    private boolean f94195f;

    /* renamed from: g */
    private long f94196g;

    /* renamed from: h */
    private ExistingTaskPolicy f94197h;

    /* renamed from: i */
    private List<String> f94198i;

    /* renamed from: j */
    private boolean f94199j;

    /* renamed from: k */
    private boolean f94200k;

    /* renamed from: a */
    public ExistingTaskPolicy mo135036a() {
        return this.f94197h;
    }

    /* renamed from: b */
    public boolean mo135037b() {
        return this.f94200k;
    }

    /* renamed from: com.ss.android.lark.dfcore.config.b$a */
    public static final class C36611a {

        /* renamed from: a */
        public boolean f94201a = true;

        /* renamed from: b */
        public boolean f94202b = C36608a.f94189f;

        /* renamed from: c */
        public boolean f94203c = C36608a.f94189f;

        /* renamed from: d */
        public boolean f94204d = C36608a.f94189f;

        /* renamed from: e */
        public boolean f94205e = true;

        /* renamed from: f */
        public boolean f94206f;

        /* renamed from: g */
        public long f94207g = C36608a.f94187d;

        /* renamed from: h */
        public ExistingTaskPolicy f94208h = ExistingTaskPolicy.KEEP;

        /* renamed from: i */
        public List<String> f94209i;

        /* renamed from: j */
        public boolean f94210j = true;

        /* renamed from: k */
        public boolean f94211k;

        /* renamed from: a */
        public C36609b mo135039a() {
            return new C36609b(this);
        }

        /* renamed from: a */
        public C36611a mo135038a(boolean z) {
            this.f94211k = z;
            return this;
        }
    }

    private C36609b(C36611a aVar) {
        this.f94190a = aVar.f94201a;
        this.f94191b = aVar.f94202b;
        this.f94192c = aVar.f94203c;
        this.f94193d = aVar.f94204d;
        this.f94195f = aVar.f94205e;
        this.f94194e = aVar.f94206f;
        this.f94196g = aVar.f94207g;
        this.f94197h = aVar.f94208h;
        this.f94198i = aVar.f94209i;
        this.f94199j = aVar.f94210j;
        this.f94200k = aVar.f94211k;
    }
}
