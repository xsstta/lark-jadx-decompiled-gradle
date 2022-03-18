package com.ss.android.lark.feed.app.model.p1862b;

import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.service.impl.FeedCursor;

/* renamed from: com.ss.android.lark.feed.app.model.b.e */
public class C37695e extends C37728b {

    /* renamed from: a */
    private FeedPreview f96616a;

    /* renamed from: b */
    private int f96617b;

    /* renamed from: c */
    private FeedFilter f96618c;

    /* renamed from: d */
    private FeedCursor f96619d;

    /* renamed from: com.ss.android.lark.feed.app.model.b.e$a */
    public static final class C37696a extends C37728b.AbstractC37729a<C37696a> {

        /* renamed from: a */
        private FeedPreview f96620a;

        /* renamed from: b */
        private int f96621b;

        /* renamed from: c */
        private FeedFilter f96622c;

        /* renamed from: d */
        private FeedCursor f96623d;

        protected C37696a() {
        }

        /* renamed from: b */
        public C37695e mo138170b() {
            C37695e eVar = new C37695e();
            mo138169a(eVar);
            return eVar;
        }

        /* renamed from: a */
        public C37696a mo138166a(int i) {
            this.f96621b = i;
            return this;
        }

        /* renamed from: a */
        public C37696a mo138167a(FeedFilter feedFilter) {
            this.f96622c = feedFilter;
            return this;
        }

        /* renamed from: a */
        public C37696a mo138168a(FeedPreview feedPreview) {
            this.f96620a = feedPreview;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo138169a(C37695e eVar) {
            super.mo138389a((C37728b) eVar);
            eVar.mo138160a(this.f96620a);
            eVar.mo138158a(this.f96621b);
            eVar.mo138159a(this.f96622c);
            eVar.mo138161a(this.f96623d);
        }
    }

    protected C37695e() {
    }

    /* renamed from: b */
    public FeedPreview mo138162b() {
        return this.f96616a;
    }

    /* renamed from: c */
    public int mo138163c() {
        return this.f96617b;
    }

    /* renamed from: d */
    public FeedFilter mo138164d() {
        return this.f96618c;
    }

    /* renamed from: e */
    public FeedCursor mo138165e() {
        return this.f96619d;
    }

    /* renamed from: a */
    public void mo138158a(int i) {
        this.f96617b = i;
    }

    /* renamed from: a */
    public void mo138159a(FeedFilter feedFilter) {
        this.f96618c = feedFilter;
    }

    /* renamed from: a */
    public void mo138160a(FeedPreview feedPreview) {
        this.f96616a = feedPreview;
    }

    /* renamed from: a */
    public void mo138161a(FeedCursor dVar) {
        this.f96619d = dVar;
    }
}
