package com.larksuite.component.ui.dialog;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0002¨\u0006\b"}, d2 = {"traverseViewChangeId", "", "view", "Landroid/view/View;", "foreach", "Landroid/view/ViewGroup;", "action", "Lkotlin/Function1;", "suite-ui_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.r */
public final class C25645r {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.dialog.r$a */
    public static final class C25646a extends Lambda implements Function1<View, Unit> {
        public static final C25646a INSTANCE = new C25646a();

        C25646a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C25645r.m91841a(view);
        }
    }

    /* renamed from: a */
    public static final void m91841a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        int f = C25639g.m91766f(view.getId());
        if (f != 0) {
            view.setId(f);
        }
        if (view instanceof ViewGroup) {
            m91842a((ViewGroup) view, C25646a.INSTANCE);
        }
    }

    /* renamed from: a */
    private static final void m91842a(ViewGroup viewGroup, Function1<? super View, Unit> function1) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(i)");
            function1.invoke(childAt);
        }
    }
}
