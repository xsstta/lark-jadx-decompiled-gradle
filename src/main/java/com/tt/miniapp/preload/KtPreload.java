package com.tt.miniapp.preload;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/tt/miniapp/preload/KtPreload;", "", "()V", "preloadLazy", "", "getPreloadLazy", "()I", "preloadLazy$delegate", "Lkotlin/Lazy;", "preload", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.preload.a */
public final class KtPreload {

    /* renamed from: a */
    public static final KtPreload f168162a = new KtPreload();

    /* renamed from: b */
    private static final Lazy f168163b = LazyKt.lazy(C66601a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.preload.a$a */
    static final class C66601a extends Lambda implements Function0<Integer> {
        public static final C66601a INSTANCE = new C66601a();

        C66601a() {
            super(0);
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 1;
        }
    }

    /* renamed from: b */
    private final int m260207b() {
        return ((Number) f168163b.getValue()).intValue();
    }

    private KtPreload() {
    }

    /* renamed from: a */
    public final void mo232224a() {
        m260207b();
    }
}
