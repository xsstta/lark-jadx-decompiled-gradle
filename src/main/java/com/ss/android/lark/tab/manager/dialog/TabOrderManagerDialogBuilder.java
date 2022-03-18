package com.ss.android.lark.tab.manager.dialog;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "viewModel", "Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;", "getViewModel", "()Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;", "setViewModel", "(Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.manager.dialog.a */
public final class TabOrderManagerDialogBuilder extends UDBaseDialogBuilder<TabOrderManagerDialogBuilder> {

    /* renamed from: a */
    private ChatTabOrderManagerViewModel f136384a;

    /* renamed from: a */
    public final ChatTabOrderManagerViewModel mo188333a() {
        return this.f136384a;
    }

    /* renamed from: a */
    public final TabOrderManagerDialogBuilder mo188334a(ChatTabOrderManagerViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        TabOrderManagerDialogBuilder aVar = this;
        aVar.f136384a = bVar;
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabOrderManagerDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        width(1.0f);
        gravity(80);
        marginInDp(0);
        cancelOnTouchOutside(true);
    }
}
