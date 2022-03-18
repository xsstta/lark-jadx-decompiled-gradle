package com.ss.android.lark.feed.app.model.p1862b;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.service.impl.FeedCursor;
import com.ss.android.lark.feed.service.impl.PullType;

/* renamed from: com.ss.android.lark.feed.app.model.b.h */
public class C37702h extends C37728b {

    /* renamed from: a */
    private PullType f96635a;

    /* renamed from: b */
    private long f96636b;

    /* renamed from: c */
    private long f96637c;

    /* renamed from: d */
    private int f96638d;

    /* renamed from: e */
    private int f96639e;

    /* renamed from: f */
    private int f96640f;

    /* renamed from: g */
    private String f96641g;

    /* renamed from: h */
    private FeedCard.FilterType f96642h;

    /* renamed from: i */
    private FeedFilter f96643i;

    /* renamed from: j */
    private FeedCursor f96644j;

    protected C37702h() {
    }

    /* renamed from: c */
    public long mo138191c() {
        return this.f96636b;
    }

    /* renamed from: d */
    public long mo138193d() {
        return this.f96637c;
    }

    /* renamed from: e */
    public int mo138194e() {
        return this.f96638d;
    }

    /* renamed from: f */
    public String mo138195f() {
        return this.f96641g;
    }

    /* renamed from: g */
    public PullType mo138196g() {
        return this.f96635a;
    }

    /* renamed from: h */
    public int mo138197h() {
        return this.f96640f;
    }

    /* renamed from: i */
    public FeedFilter mo138198i() {
        return this.f96643i;
    }

    /* renamed from: j */
    public int mo138199j() {
        return this.f96639e;
    }

    /* renamed from: k */
    public FeedCursor mo138200k() {
        return this.f96644j;
    }

    /* renamed from: com.ss.android.lark.feed.app.model.b.h$a */
    public static class C37703a extends C37728b.AbstractC37729a<C37703a> {

        /* renamed from: a */
        private PullType f96645a;

        /* renamed from: b */
        private FeedCard.FilterType f96646b;

        /* renamed from: c */
        private long f96647c;

        /* renamed from: d */
        private long f96648d;

        /* renamed from: e */
        private int f96649e;

        /* renamed from: f */
        private String f96650f;

        /* renamed from: g */
        private int f96651g;

        /* renamed from: h */
        private int f96652h;

        /* renamed from: i */
        private FeedFilter f96653i;

        /* renamed from: j */
        private FeedCursor f96654j;

        /* renamed from: b */
        public C37702h mo138209b() {
            C37702h hVar = new C37702h();
            mo138205a(hVar);
            return hVar;
        }

        /* renamed from: a */
        public C37703a mo138201a(int i) {
            this.f96651g = i;
            return this;
        }

        /* renamed from: b */
        public C37703a mo138206b(int i) {
            this.f96649e = i;
            return this;
        }

        /* renamed from: c */
        public C37703a mo138210c(int i) {
            this.f96652h = i;
            return this;
        }

        /* renamed from: a */
        public C37703a mo138202a(long j) {
            this.f96647c = j;
            return this;
        }

        /* renamed from: b */
        public C37703a mo138207b(long j) {
            this.f96648d = j;
            return this;
        }

        /* renamed from: a */
        public C37703a mo138203a(FeedFilter feedFilter) {
            this.f96653i = feedFilter;
            return this;
        }

        /* renamed from: b */
        public C37703a mo138208b(String str) {
            this.f96650f = str;
            return this;
        }

        /* renamed from: a */
        public C37703a mo138204a(PullType pullType) {
            this.f96645a = pullType;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo138205a(C37702h hVar) {
            super.mo138389a((C37728b) hVar);
            hVar.mo138186a(this.f96645a);
            hVar.mo138182a(this.f96649e);
            hVar.mo138183a(this.f96647c);
            hVar.mo138189b(this.f96648d);
            hVar.mo138188b(this.f96651g);
            hVar.mo138190b(this.f96650f);
            hVar.mo138184a(this.f96646b);
            hVar.mo138192c(this.f96652h);
            hVar.mo138185a(this.f96653i);
            hVar.mo138187a(this.f96654j);
        }
    }

    /* renamed from: a */
    public void mo138182a(int i) {
        this.f96638d = i;
    }

    /* renamed from: b */
    public void mo138188b(int i) {
        this.f96640f = i;
    }

    /* renamed from: a */
    public void mo138183a(long j) {
        this.f96636b = j;
    }

    /* renamed from: b */
    public void mo138189b(long j) {
        this.f96637c = j;
    }

    /* renamed from: c */
    public void mo138192c(int i) {
        this.f96639e = i;
    }

    /* renamed from: a */
    public void mo138184a(FeedCard.FilterType filterType) {
        this.f96642h = filterType;
    }

    /* renamed from: b */
    public void mo138190b(String str) {
        this.f96641g = str;
    }

    /* renamed from: a */
    public void mo138185a(FeedFilter feedFilter) {
        this.f96643i = feedFilter;
    }

    /* renamed from: a */
    public void mo138186a(PullType pullType) {
        this.f96635a = pullType;
    }

    /* renamed from: a */
    public void mo138187a(FeedCursor dVar) {
        this.f96644j = dVar;
    }
}
