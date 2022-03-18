package com.bytedance.ee.bear.wikiv2.common.util;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "T", "", "opt", "(Ljava/lang/Object;)V", "isNone", "", "()Z", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "getIncludeNone", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.common.a.a */
public final class Opt<T> {

    /* renamed from: a */
    public static final Companion f32884a = new Companion(null);

    /* renamed from: b */
    private final T f32885b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/common/util/Opt$Companion;", "", "()V", "none", "Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "T", "some", "option", "(Ljava/lang/Object;)Lcom/bytedance/ee/bear/wikiv2/common/util/Opt;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.common.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T> Opt<T> mo46763a(T t) {
            return new Opt<>(t, null);
        }
    }

    /* renamed from: c */
    public final T mo46762c() {
        return this.f32885b;
    }

    /* renamed from: a */
    public final boolean mo46760a() {
        if (this.f32885b == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final T mo46761b() {
        T t = this.f32885b;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    private Opt(T t) {
        this.f32885b = t;
    }

    public /* synthetic */ Opt(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }
}
