package com.ss.android.vc.meeting.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a?\u0010\b\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"enlargeClickArea", "", "Landroid/view/View;", "size", "", "safeClick", "onClick", "Lkotlin/Function0;", "updateMargins", "leftMarginInDp", "topMarginInDp", "rightMarginInDp", "bottomMarginInDp", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "lib_vc_suiteRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.q */
public final class C63529q {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.q$a */
    static final class RunnableC63530a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f160522a;

        /* renamed from: b */
        final /* synthetic */ int f160523b;

        /* renamed from: c */
        final /* synthetic */ ViewParent f160524c;

        RunnableC63530a(View view, int i, ViewParent viewParent) {
            this.f160522a = view;
            this.f160523b = i;
            this.f160524c = viewParent;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f160522a.getHitRect(rect);
            rect.top -= this.f160523b;
            rect.bottom += this.f160523b;
            rect.left -= this.f160523b;
            rect.right += this.f160523b;
            ((View) this.f160524c).setTouchDelegate(new TouchDelegate(rect, this.f160522a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/utils/ViewExtentionsKt$safeClick$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.q$b */
    public static final class C63531b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f160525a;

        C63531b(Function0 function0) {
            this.f160525a = function0;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f160525a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m248969a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "$this$enlargeClickArea");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new RunnableC63530a(view, i, parent));
        }
    }

    /* renamed from: a */
    public static final void m248970a(View view, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(view, "$this$safeClick");
        Intrinsics.checkParameterIsNotNull(function0, "onClick");
        view.setOnClickListener(new C63531b(function0));
    }
}
