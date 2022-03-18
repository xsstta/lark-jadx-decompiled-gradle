package com.ss.android.lark.feed.app.model.p1862b;

import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.PullType;

/* renamed from: com.ss.android.lark.feed.app.model.b.a */
public class C37682a extends C37702h {

    /* renamed from: a */
    private C38126b f96573a;

    /* renamed from: com.ss.android.lark.feed.app.model.b.a$a */
    public static final class C37683a extends C37728b.AbstractC37729a<C37683a> {

        /* renamed from: a */
        private C38126b f96574a;

        /* renamed from: b */
        private PullType f96575b;

        /* renamed from: c */
        private long f96576c;

        /* renamed from: d */
        private long f96577d;

        /* renamed from: e */
        private int f96578e;

        /* renamed from: f */
        private String f96579f;

        /* renamed from: g */
        private int f96580g;

        /* renamed from: h */
        private FeedFilter f96581h;

        protected C37683a() {
        }

        /* renamed from: b */
        public C37682a mo138131b() {
            C37682a aVar = new C37682a();
            mo138130a(aVar);
            return aVar;
        }

        /* renamed from: a */
        public C37683a mo138125a(int i) {
            this.f96578e = i;
            return this;
        }

        /* renamed from: a */
        public C37683a mo138126a(long j) {
            this.f96577d = j;
            return this;
        }

        /* renamed from: a */
        public C37683a mo138127a(FeedFilter feedFilter) {
            this.f96581h = feedFilter;
            return this;
        }

        /* renamed from: a */
        public C37683a mo138128a(PullType pullType) {
            this.f96575b = pullType;
            return this;
        }

        /* renamed from: a */
        public C37683a mo138129a(C38126b bVar) {
            this.f96574a = bVar;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo138130a(C37682a aVar) {
            super.mo138389a((C37728b) aVar);
            aVar.mo138186a(this.f96575b);
            aVar.mo138182a(this.f96578e);
            aVar.mo138183a(this.f96576c);
            aVar.mo138189b(this.f96577d);
            aVar.mo138188b(this.f96580g);
            aVar.mo138190b(this.f96579f);
            aVar.mo138123a(this.f96574a);
            aVar.mo138185a(this.f96581h);
        }
    }

    protected C37682a() {
    }

    /* renamed from: b */
    public C38126b mo138124b() {
        return this.f96573a;
    }

    /* renamed from: a */
    public void mo138123a(C38126b bVar) {
        this.f96573a = bVar;
    }
}
