package com.ss.android.lark.mm.utils.ktextensions;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¨\u0006\b"}, d2 = {"enlargeClickArea", "", "Landroid/view/View;", "extraSpace", "", "safeClick", "onClick", "Lkotlin/Function1;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.ktextensions.e */
public final class C47110e {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.ktextensions.e$a */
    public static final class RunnableC47111a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f118643a;

        /* renamed from: b */
        final /* synthetic */ int f118644b;

        RunnableC47111a(View view, int i) {
            this.f118643a = view;
            this.f118644b = i;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f118643a.getHitRect(rect);
            rect.top -= this.f118644b;
            rect.bottom += this.f118644b;
            rect.left -= this.f118644b;
            rect.right += this.f118644b;
            ViewParent parent = this.f118643a.getParent();
            if (parent != null) {
                ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f118643a));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/utils/ktextensions/ViewExtenstionKt$safeClick$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.utils.ktextensions.e$b */
    public static final class C47112b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f118645a;

        C47112b(Function1 function1) {
            this.f118645a = function1;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f118645a.invoke(view);
        }
    }

    /* renamed from: a */
    public static final void m186572a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "$this$enlargeClickArea");
        view.post(new RunnableC47111a(view, i));
    }

    /* renamed from: a */
    public static final void m186573a(View view, Function1<? super View, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(view, "$this$safeClick");
        Intrinsics.checkParameterIsNotNull(function1, "onClick");
        view.setOnClickListener(new C47112b(function1));
    }
}
