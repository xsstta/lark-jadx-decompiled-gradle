package com.ss.android.lark.todo.impl.features.common.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.DialogC57586c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/widget/DialogHelper;", "", "()V", "DIALOG_CONTENT_TEXT_SIZE_17", "", "generateSingleButtonDialog", "Lcom/ss/android/lark/ui/CommonDialog;", "context", "Landroid/content/Context;", "title", "", "message", "btnText", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "onKeyListener", "Landroid/content/DialogInterface$OnKeyListener;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.widget.a */
public final class DialogHelper {

    /* renamed from: a */
    public static final DialogHelper f139410a = new DialogHelper();

    private DialogHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.widget.a$a */
    static final class View$OnClickListenerC56340a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f139411a;

        /* renamed from: b */
        final /* synthetic */ DialogC57586c f139412b;

        View$OnClickListenerC56340a(DialogInterface.OnClickListener onClickListener, DialogC57586c cVar) {
            this.f139411a = onClickListener;
            this.f139412b = cVar;
        }

        public final void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.f139411a;
            if (onClickListener != null) {
                onClickListener.onClick(this.f139412b, 0);
            }
        }
    }

    /* renamed from: a */
    public final DialogC57586c mo192021a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnKeyListener onKeyListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(str3, "btnText");
        DialogC57586c cVar = new DialogC57586c(context);
        String str4 = str;
        cVar.mo195559a(str4);
        cVar.mo195563b(str2);
        if (TextUtils.isEmpty(str4)) {
            cVar.mo195566c(1);
            cVar.mo195562b(17);
            cVar.mo195568d(UIUtils.getColor(context, R.color.lkui_N900));
        }
        cVar.mo195567c(str3, new View$OnClickListenerC56340a(onClickListener, cVar), true);
        if (onKeyListener != null) {
            cVar.setOnKeyListener(onKeyListener);
        }
        return cVar;
    }
}
