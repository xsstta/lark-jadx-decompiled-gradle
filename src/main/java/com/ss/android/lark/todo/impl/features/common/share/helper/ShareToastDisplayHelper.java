package com.ss.android.lark.todo.impl.features.common.share.helper;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import com.ss.android.lark.todo.impl.features.common.widget.DialogHelper;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.DialogC57586c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/share/helper/ShareToastDisplayHelper;", "", "()V", "generateFailDialog", "", "context", "Landroid/content/Context;", "entity", "Lcom/ss/android/lark/todo/impl/features/common/share/entity/ShareEntity;", "showShareToastByEntity", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.share.a.b */
public final class ShareToastDisplayHelper {

    /* renamed from: a */
    public static final ShareToastDisplayHelper f139408a = new ShareToastDisplayHelper();

    private ShareToastDisplayHelper() {
    }

    /* renamed from: b */
    private final void m219804b(Context context, ShareEntity shareEntity) {
        if (context != null) {
            DialogC57586c a = DialogHelper.f139410a.mo192021a(context, ResUtil.f139261a.mo191781c(R.string.Todo_Common_FailToSend), shareEntity.getErrorStr(), ResUtil.f139261a.mo191781c(R.string.Todo_Task_Confirm), null, null);
            a.mo195558a(1);
            a.mo195562b(14);
            a.mo195568d(ResUtil.f139261a.mo191775a(R.color.lkui_N600));
            a.setCanceledOnTouchOutside(false);
            a.setCancelable(false);
            a.show();
        }
    }

    /* renamed from: a */
    public final void mo192008a(Context context, ShareEntity shareEntity) {
        Intrinsics.checkParameterIsNotNull(shareEntity, "entity");
        int i = C56339c.f139409a[shareEntity.getStatus().ordinal()];
        boolean z = true;
        if (i == 1) {
            OperationToastHelper.f139395a.mo191992a();
        } else if (i == 2) {
            OperationToastHelper.f139395a.mo191991a(context, R.string.Todo_Task_Sharing);
        } else if (i != 3) {
            if (shareEntity.getErrorStr().length() <= 0) {
                z = false;
            }
            if (z) {
                OperationToastHelper.f139395a.mo191992a();
                m219804b(context, shareEntity);
                return;
            }
            OperationToastHelper.m219775a(OperationToastHelper.f139395a, context, R.string.Todo_Task_FailToShare, null, null, null, null, 60, null);
        } else {
            OperationToastHelper.m219774a(OperationToastHelper.f139395a, context, R.string.Todo_Task_ShareSucTip, null, null, null, 28, null);
        }
    }
}
