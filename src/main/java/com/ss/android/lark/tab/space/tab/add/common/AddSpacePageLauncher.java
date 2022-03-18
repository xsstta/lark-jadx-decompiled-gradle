package com.ss.android.lark.tab.space.tab.add.common;

import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.tab.space.tab.add.list.AddSpaceTabListActivity;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import com.ss.android.lark.tab.space.tab.add.modify.AddSpaceTabModifyActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/common/AddSpacePageLauncher;", "", "()V", "startAddSpaceListPage", "", "context", "Landroid/content/Context;", "chatId", "", "startAddSpaceModifyPage", "selectViewData", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.common.a */
public final class AddSpacePageLauncher {

    /* renamed from: a */
    public static final AddSpacePageLauncher f136527a = new AddSpacePageLauncher();

    private AddSpacePageLauncher() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m214564a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intent intent = new Intent(context, AddSpaceTabListActivity.class);
        intent.putExtra("key_chat_id", str);
        context.startActivity(intent);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m214565a(Context context, String str, SpaceSelectViewData spaceSelectViewData) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(spaceSelectViewData, "selectViewData");
        Intent intent = new Intent(context, AddSpaceTabModifyActivity.class);
        intent.putExtra("key_select_doc", spaceSelectViewData);
        intent.putExtra("key_chat_id", str);
        context.startActivity(intent);
    }
}
