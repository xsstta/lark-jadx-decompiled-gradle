package com.ss.android.lark.contact.impl.department.detail.frame.list.p1756a;

import android.view.View;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"onSingleClick", "", "Landroid/view/View;", "action", "Lkotlin/Function1;", "core_contact_contact_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b */
public final class C35858b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/department/detail/frame/list/binder/BinderDSLKt$onSingleClick$singleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b$a */
    public static final class C35859a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f92728a;

        C35859a(Function1 function1) {
            this.f92728a = function1;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f92728a.invoke(view);
        }
    }

    /* renamed from: a */
    public static final void m140466a(View view, Function1<? super View, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(view, "$this$onSingleClick");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        view.setOnClickListener(new C35859a(function1));
    }
}
