package com.ss.android.lark.mine.impl.custom_status;

import android.view.View;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0002\b\u0005J\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0004¢\u0006\u0002\b\nJ\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\bH\u0000¢\u0006\u0002\b\fJ'\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000e0\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/CustomStatusUIUtils;", "", "()V", "dp", "", "dp$core_mine_release", "over", "", "", "limit", "over$core_mine_release", "realLength", "realLength$core_mine_release", "setOnSingleClickListener", "", "Landroid/view/View;", "listener", "Lkotlin/Function1;", "setOnSingleClickListener$core_mine_release", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.b */
public final class CustomStatusUIUtils {

    /* renamed from: a */
    public static final CustomStatusUIUtils f115068a = new CustomStatusUIUtils();

    private CustomStatusUIUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/custom_status/CustomStatusUIUtils$setOnSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.b$a */
    public static final class C45473a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f115069a;

        C45473a(Function1 function1) {
            this.f115069a = function1;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f115069a.invoke(view);
        }
    }

    /* renamed from: a */
    public final int mo160434a(int i) {
        return C57582a.m223600a(i);
    }

    /* renamed from: a */
    public final void mo160435a(View view, Function1<? super View, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(view, "$this$setOnSingleClickListener");
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        view.setOnClickListener(new C45473a(function1));
    }
}
