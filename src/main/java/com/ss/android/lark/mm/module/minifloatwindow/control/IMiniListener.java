package com.ss.android.lark.mm.module.minifloatwindow.control;

import com.ss.android.lark.mm.module.framework.IMmListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onCover", "", "url", "", "defaultResId", "", "onDuration", "duration", "", "onLoading", "onPause", "isEnabled", "", "onProgress", "progress", "onResume", "onStop", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.c */
public interface IMiniListener extends IMmListener {
    /* renamed from: A */
    void mo163375A();

    /* renamed from: a */
    void mo163376a();

    /* renamed from: a */
    void mo163377a(long j);

    /* renamed from: a */
    void mo163378a(long j, long j2);

    /* renamed from: a */
    void mo163379a(String str, int i);

    /* renamed from: a */
    void mo163380a(boolean z);

    /* renamed from: z */
    void mo163381z();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.c$a */
    public static final class C46491a {
        /* renamed from: a */
        public static void m183877a(IMiniListener cVar) {
        }

        /* renamed from: a */
        public static void m183878a(IMiniListener cVar, long j) {
        }

        /* renamed from: a */
        public static void m183879a(IMiniListener cVar, long j, long j2) {
        }

        /* renamed from: a */
        public static void m183880a(IMiniListener cVar, String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "url");
        }

        /* renamed from: b */
        public static void m183882b(IMiniListener cVar) {
        }

        /* renamed from: a */
        public static /* synthetic */ void m183881a(IMiniListener cVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                cVar.mo163380a(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPause");
        }
    }
}
