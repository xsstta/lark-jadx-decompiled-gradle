package com.ss.android.lark.keyboard;

import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.keyboard.c */
public interface IKeyBoardDependency {

    /* renamed from: com.ss.android.lark.keyboard.c$a */
    public static final class C40676a {
        /* renamed from: a */
        public static void m160771a(IKeyBoardDependency cVar, NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
        }
    }

    /* renamed from: a */
    void mo122095a(NestScrollFrameLayout nestScrollFrameLayout);

    /* renamed from: a */
    void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z);

    /* renamed from: a */
    void mo122097a(boolean z, IResetDraftCallback bVar);

    /* renamed from: com.ss.android.lark.keyboard.c$b */
    public interface IResetDraftCallback {
        /* renamed from: a */
        void mo146859a(RichText richText, String str, RichText richText2, TransationData jVar);

        /* renamed from: com.ss.android.lark.keyboard.c$b$a */
        public static final class C40677a {
            /* renamed from: a */
            public static /* synthetic */ void m160773a(IResetDraftCallback bVar, RichText richText, String str, RichText richText2, TransationData jVar, int i, Object obj) {
                if (obj == null) {
                    if ((i & 8) != 0) {
                        jVar = null;
                    }
                    bVar.mo146859a(richText, str, richText2, jVar);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResetDraft");
            }
        }
    }
}
