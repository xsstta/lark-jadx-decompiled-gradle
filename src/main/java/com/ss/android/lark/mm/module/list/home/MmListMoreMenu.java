package com.ss.android.lark.mm.module.list.home;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/list/home/MmListMoreMenu;", "", "()V", "show", "", "anchorView", "Landroid/view/View;", "onItemClick", "Lkotlin/Function0;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.a.e */
public final class MmListMoreMenu {

    /* renamed from: a */
    public static final MmListMoreMenu f116723a = new MmListMoreMenu();

    private MmListMoreMenu() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.e$a */
    static final class C46342a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Dialog $dialog;
        final /* synthetic */ Function0 $onItemClick;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46342a(Dialog dialog, Function0 function0) {
            super(1);
            this.$dialog = dialog;
            this.$onItemClick = function0;
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
            C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("trash_box").mo165423e("vc_minutes_list_view").mo165421c());
            this.$dialog.dismiss();
            this.$onItemClick.invoke();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m183478a(View view, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(function0, "onItemClick");
        C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("more").mo165423e("vc_minutes_list_view").mo165421c());
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.mm_tab_more_dialog, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(anch…alog, null as ViewGroup?)");
        Dialog a = C57811b.m224342a(view.getContext(), inflate, (int) R.style.customDialog, true);
        C57810a.m224337a(view.getContext(), a, new float[]{12.0f, 49.0f});
        View findViewById = inflate.findViewById(R.id.trashMenu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "trashMenu");
        C47110e.m186573a(findViewById, new C46342a(a, function0));
    }
}
