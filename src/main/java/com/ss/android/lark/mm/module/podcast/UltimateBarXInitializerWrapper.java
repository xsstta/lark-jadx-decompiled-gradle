package com.ss.android.lark.mm.module.podcast;

import android.content.Context;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarXInitializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/UltimateBarXInitializerWrapper;", "", "()V", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.a */
public final class UltimateBarXInitializerWrapper {

    /* renamed from: a */
    public static UltimateBarXInitializerWrapper f117658a;

    /* renamed from: b */
    public static final Companion f117659b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/UltimateBarXInitializerWrapper$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/mm/module/podcast/UltimateBarXInitializerWrapper;", "init", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo164306a() {
            if (UltimateBarXInitializerWrapper.f117658a == null) {
                UltimateBarXInitializerWrapper.f117658a = new UltimateBarXInitializerWrapper(null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private UltimateBarXInitializerWrapper() {
        UltimateBarXInitializer ultimateBarXInitializer = new UltimateBarXInitializer();
        Context a = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
        ultimateBarXInitializer.mo236946b(a);
    }

    public /* synthetic */ UltimateBarXInitializerWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
