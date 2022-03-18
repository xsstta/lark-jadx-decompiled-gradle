package com.larksuite.framework.p1173a.p1174a;

import android.view.View;
import com.larksuite.framework.section.IActionDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0000\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t\u001a \u0010\n\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a \u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u0005\u001a\"\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0015\u001a\"\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011\u001a\"\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\"\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r\u001a$\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u001aG\u0010\u001a\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142.\u0010\u001b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d0\u001c\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001a\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u001b\u001a\u00020\u001f\"\u00020\u0005\u001a\u001e\u0010 \u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\u0010\u001b\u001a\u00020\u001f\"\u00020\u0005\u001a\u0012\u0010!\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0012\u0010\"\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006#"}, d2 = {"action", "", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "lifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "", "extra", "", "bindActions", "Landroid/widget/TextView;", "bindTextChange", "textChange", "Landroidx/lifecycle/LiveData;", "", "bindVisibleOrGone", "Landroid/view/View;", "isVisible", "", "clickAction", "dispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "Lcom/larksuite/framework/section/IActionData;", "clickActionWithDebounce", "Lcom/larksuite/framework/section/utils/DebounceView;", "interval", "", "clickActions", "actions", "", "Lkotlin/Pair;", "(Landroid/view/View;Lcom/larksuite/framework/section/IActionDispatcher;[Lkotlin/Pair;)V", "", "clickActionsWithId", "clickWithId", "visibleOrGone", "todo_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a.a */
public final class C25877a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.a.a$a */
    static final class View$OnClickListenerC25878a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IActionDispatcher f64008a;

        /* renamed from: b */
        final /* synthetic */ int f64009b;

        View$OnClickListenerC25878a(IActionDispatcher cVar, int i) {
            this.f64008a = cVar;
            this.f64009b = i;
        }

        public final void onClick(View view) {
            this.f64008a.mo92064a(this.f64009b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.a.a$c */
    static final class View$OnClickListenerC25880c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int[] f64014a;

        /* renamed from: b */
        final /* synthetic */ IActionDispatcher f64015b;

        View$OnClickListenerC25880c(int[] iArr, IActionDispatcher cVar) {
            this.f64014a = iArr;
            this.f64015b = cVar;
        }

        public final void onClick(View view) {
            for (int i : this.f64014a) {
                this.f64015b.mo92064a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.a.a$b */
    public static final class View$OnClickListenerC25879b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DebounceView f64010a;

        /* renamed from: b */
        final /* synthetic */ long f64011b;

        /* renamed from: c */
        final /* synthetic */ IActionDispatcher f64012c;

        /* renamed from: d */
        final /* synthetic */ int f64013d;

        View$OnClickListenerC25879b(DebounceView cVar, long j, IActionDispatcher cVar2, int i) {
            this.f64010a = cVar;
            this.f64011b = j;
            this.f64012c = cVar2;
            this.f64013d = i;
        }

        public final void onClick(View view) {
            if (System.currentTimeMillis() - this.f64010a.mo92056b() > this.f64011b) {
                this.f64010a.mo92055a(System.currentTimeMillis());
                this.f64012c.mo92064a(this.f64013d);
            }
        }
    }

    /* renamed from: a */
    public static final void m93659a(View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "$this$visibleOrGone");
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static final void m93657a(View view, IActionDispatcher cVar, int i) {
        Intrinsics.checkParameterIsNotNull(view, "$this$clickAction");
        Intrinsics.checkParameterIsNotNull(cVar, "dispatcher");
        view.setOnClickListener(new View$OnClickListenerC25878a(cVar, i));
    }

    /* renamed from: a */
    public static final void m93658a(View view, IActionDispatcher cVar, int... iArr) {
        Intrinsics.checkParameterIsNotNull(view, "$this$clickActions");
        Intrinsics.checkParameterIsNotNull(cVar, "dispatcher");
        Intrinsics.checkParameterIsNotNull(iArr, "actions");
        view.setOnClickListener(new View$OnClickListenerC25880c(iArr, cVar));
    }

    /* renamed from: a */
    public static final void m93660a(DebounceView cVar, IActionDispatcher cVar2, int i, long j) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$clickActionWithDebounce");
        Intrinsics.checkParameterIsNotNull(cVar2, "dispatcher");
        cVar.mo92054a().setOnClickListener(new View$OnClickListenerC25879b(cVar, j, cVar2, i));
    }

    /* renamed from: a */
    public static /* synthetic */ void m93661a(DebounceView cVar, IActionDispatcher cVar2, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 1000;
        }
        m93660a(cVar, cVar2, i, j);
    }
}
