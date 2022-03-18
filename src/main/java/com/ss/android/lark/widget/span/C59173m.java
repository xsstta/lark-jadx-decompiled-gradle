package com.ss.android.lark.widget.span;

import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.span.m */
public class C59173m {

    /* renamed from: a */
    boolean f146865a;

    /* renamed from: b */
    boolean f146866b;

    /* renamed from: c */
    boolean f146867c;

    /* renamed from: d */
    List<SpanInfo> f146868d;

    /* renamed from: com.ss.android.lark.widget.span.m$a */
    public static class C59175a {

        /* renamed from: a */
        boolean f146869a;

        /* renamed from: b */
        boolean f146870b;

        /* renamed from: c */
        boolean f146871c;

        /* renamed from: d */
        List<SpanInfo> f146872d = new ArrayList();

        /* renamed from: a */
        public C59173m mo201122a() {
            return new C59173m(this.f146869a, this.f146870b, this.f146871c, this.f146872d);
        }

        /* renamed from: a */
        public C59175a mo201121a(boolean z) {
            this.f146869a = z;
            return this;
        }

        /* renamed from: b */
        public C59175a mo201123b(boolean z) {
            this.f146870b = z;
            return this;
        }

        /* renamed from: c */
        public C59175a mo201124c(boolean z) {
            this.f146871c = z;
            return this;
        }

        /* renamed from: a */
        public C59175a mo201120a(List<SpanInfo> list) {
            if (CollectionUtils.isNotEmpty(list)) {
                this.f146872d.addAll(list);
            }
            return this;
        }
    }

    private C59173m(boolean z, boolean z2, boolean z3, List<SpanInfo> list) {
        this.f146865a = z;
        this.f146866b = z2;
        this.f146867c = z3;
        this.f146868d = list;
    }
}
