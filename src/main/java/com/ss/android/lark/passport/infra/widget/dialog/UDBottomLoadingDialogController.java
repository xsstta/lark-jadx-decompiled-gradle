package com.ss.android.lark.passport.infra.widget.dialog;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/passport/infra/widget/dialog/UDBottomLoadingDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getDefaultRootRes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.widget.a.a */
public final class UDBottomLoadingDialogController extends UDDialogController {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultRootRes() {
        return R.layout.signin_sdk_dialog_bottom_loading;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDBottomLoadingDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback, com.larksuite.component.universe_design.dialog.UDDialogController
    public void onCreate(UDDialog uDDialog, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        super.onCreate(uDDialog, bundle);
        TextView textView = (TextView) uDDialog.findViewById(R.id.ud_dialog_content_message_tv);
        if (textView != null) {
            textView.setText(getMMessage());
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        super.apply(uDBaseDialogBuilder, uDDialog);
        CharSequence mMessage = getMMessage();
        if (mMessage == null || StringsKt.isBlank(mMessage)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setMMessage(getContext().getString(R.string.Lark_Legacy_InLoading));
        }
        setMGravity(80);
        setMAnimStyle(0);
    }
}
